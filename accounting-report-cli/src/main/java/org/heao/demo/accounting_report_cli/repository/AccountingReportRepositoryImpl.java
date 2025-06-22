package org.heao.demo.accounting_report_cli.repository;

import jakarta.transaction.Transactional;
import org.heao.demo.accounting_report_cli.model.AccountingEntryModel;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

@Repository
public class AccountingReportRepositoryImpl implements AccountingReportRepository{

    private final JdbcTemplate jdbcTemplate;

    public AccountingReportRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Transactional
    @Override
    public void saveAll(List<AccountingEntryModel> models) {
        String sql = "INSERT INTO accounting_entries (" +
                "customer_name, customer_tax_id, document_code, document_type, entry_date, amount, currency, " +
                "account_code, account_name) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.batchUpdate(sql,
                new BatchPreparedStatementSetter() {
                    @Override
                    public void setValues(PreparedStatement ps, int i) throws SQLException {
                        AccountingEntryModel model = models.get(i);
                        ps.setString(1, model.customerName);
                        ps.setString(2, model.customerTaxId);
                        ps.setString(3, model.documentCode);
                        ps.setString(4, model.documentType);
                        ps.setDate(5, Date.valueOf(model.entryDate));
                        ps.setBigDecimal(6, model.amount);
                        ps.setString(7, model.currency);
                        ps.setString(8, model.accountCode);
                        ps.setString(9, model.accountName);
                    }

                    @Override
                    public int getBatchSize() {
                        return models.size();
                    }
                }
        );
    }
}
