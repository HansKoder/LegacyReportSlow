package org.heao.demo.accounting_report_cli;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AccountingReportCliApplication {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(AccountingReportCliApplication.class);
		app.setWebApplicationType(WebApplicationType.NONE);
		app.run(args);
	}

}
