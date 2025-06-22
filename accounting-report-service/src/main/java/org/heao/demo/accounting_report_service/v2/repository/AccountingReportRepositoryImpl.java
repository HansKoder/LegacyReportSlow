package org.heao.demo.accounting_report_service.v2.repository;

import org.heao.demo.accounting_report_service.v2.dto.CustomerCurrencySummarize;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AccountingReportRepositoryImpl implements AccountingReportRepository{

    private final JdbcTemplate jdbcTemplate;

    public AccountingReportRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public List<CustomerCurrencySummarize> getReportCustomer() {
        String sql = """
            SELECT customer_name AS customer, currency, SUM(amount::numeric) AS total, entry_date::date AS date
            FROM accounting_entries
            GROUP BY customer_name, entry_date::date, currency
        """;

        return jdbcTemplate.query(sql, (rs, rowNum) -> new CustomerCurrencySummarize(
                rs.getString("customer"),
                rs.getString("currency"),
                rs.getBigDecimal("total"),
                rs.getDate("date").toLocalDate()
        ));
    }
}
