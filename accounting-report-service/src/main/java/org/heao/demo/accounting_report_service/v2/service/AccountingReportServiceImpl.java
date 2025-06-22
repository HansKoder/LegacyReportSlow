package org.heao.demo.accounting_report_service.v2.service;

import org.heao.demo.accounting_report_service.v2.config.CustomerEnum;
import org.heao.demo.accounting_report_service.v2.config.CustomerJdbcRegistry;
import org.heao.demo.accounting_report_service.v2.dto.AccountingReport;
import org.heao.demo.accounting_report_service.v2.repository.AccountingReportRepository;
import org.heao.demo.accounting_report_service.v2.repository.AccountingReportRepositoryImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AccountingReportServiceImpl implements AccountingReportService {

    private final CustomerJdbcRegistry jdbcRegistry;

    public AccountingReportServiceImpl(CustomerJdbcRegistry jdbcRegistry) {
        this.jdbcRegistry = jdbcRegistry;
    }

    @Override
    public List<AccountingReport> getReportSummarize(List<CustomerEnum> customers) {
        AccountingReportRepository repository;
        List<AccountingReport> report = new ArrayList<>();

        for (CustomerEnum customer: customers) {
             repository = new AccountingReportRepositoryImpl(jdbcRegistry.connectionPerCustomer(customer));
             report.add(new AccountingReport(customer.name(), repository.getReportCustomer()));
        }

        return report;
    }
}
