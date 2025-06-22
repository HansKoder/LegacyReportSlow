package org.heao.demo.accounting_report_cli.service;

import org.heao.demo.accounting_report_cli.config.CustomerEnum;
import org.heao.demo.accounting_report_cli.config.CustomerJdbcRegistry;
import org.heao.demo.accounting_report_cli.model.AccountingEntryModel;
import org.heao.demo.accounting_report_cli.repository.AccountingReportRepository;
import org.heao.demo.accounting_report_cli.repository.AccountingReportRepositoryImpl;
import org.heao.demo.accounting_report_cli.util.GeneratorAccountingReportData;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerDataLoaderService {

    private final CustomerJdbcRegistry jdbcRegistry;

    public CustomerDataLoaderService(CustomerJdbcRegistry jdbcRegistry) {
        this.jdbcRegistry = jdbcRegistry;
    }

    public void loadData(CustomerEnum customer, int count) {
        System.out.printf("▶ Loading %d records to %s%n", count, customer);

        AccountingReportRepository repository = new AccountingReportRepositoryImpl(jdbcRegistry.connectionPerCustomer(customer));
        repository.saveAll(GeneratorAccountingReportData.generatorRandomData(customer, count));

        System.out.println("✅ Records are saved successfully.");
    }

}
