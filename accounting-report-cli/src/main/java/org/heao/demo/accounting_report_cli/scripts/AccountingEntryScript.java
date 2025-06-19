package org.heao.demo.accounting_report_cli.scripts;

import org.heao.demo.accounting_report_cli.repository.AccountEntryRepository;
import org.heao.demo.accounting_report_cli.util.GeneratorAccountingReportData;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountingEntryScript implements CommandLineRunner {

    private final AccountEntryRepository repository;

    public AccountingEntryScript(AccountEntryRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("CLI generator account report");
        repository.saveAll(GeneratorAccountingReportData.generateRandomData(500000));
        System.out.println("Date upload successfully");
    }
}
