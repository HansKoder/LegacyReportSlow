package org.heao.demo.accounting_report_cli.scripts;

import org.heao.demo.accounting_report_cli.config.CustomerEnum;
import org.heao.demo.accounting_report_cli.service.CustomerDataLoaderService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AccountingEntryScript implements CommandLineRunner {

    private final CustomerDataLoaderService customerDataLoaderService;

    public AccountingEntryScript(CustomerDataLoaderService customerDataLoaderService) {
        this.customerDataLoaderService = customerDataLoaderService;
    }

    @Override
    public void run(String... args) {
        System.out.println("CLI generator account report");
        customerDataLoaderService.loadData(CustomerEnum.MONTECELLO, 1_000_000);
        customerDataLoaderService.loadData(CustomerEnum.AZURRY, 1_000_000);
        customerDataLoaderService.loadData(CustomerEnum.CASTLE, 1_000_000);
    }
}
