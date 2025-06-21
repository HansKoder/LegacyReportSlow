package org.heao.demo.accounting_report_cli.repository;

import org.heao.demo.accounting_report_cli.model.AccountingEntryModel;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class AccountingReportRepositoryImpl implements AccountingReportRepository{

    private final JdbcTemplate jdbcTemplate;

    public AccountingReportRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void save(AccountingEntryModel model) {
        String sql = "INSERT INTO accounting_entries (" +
                "customer_name, customer_tax_id, document_code, document_type, entry_date, amount, currency, " +
                "account_code, account_name) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";

        jdbcTemplate.update(sql,
                model.customerName,
                model.customerTaxId,
                model.documentCode,
                model.documentType,
                model.entryDate,
                model.amount,
                model.currency,
                model.accountCode,
                model.accountName
        );
    }
}
