package org.heao.demo.accounting_report_service.v2.resource;

import org.heao.demo.accounting_report_service.v2.config.CustomerEnum;
import org.heao.demo.accounting_report_service.v2.dto.AccountingReport;
import org.heao.demo.accounting_report_service.v2.service.AccountingReportService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/report")
public class AccountingReportResource {

    private final AccountingReportService service;

    public AccountingReportResource(AccountingReportService service) {
        this.service = service;
    }

    @GetMapping("/accounting-entries")
    public ResponseEntity<List<AccountingReport>> findAll () {
        return ResponseEntity.ok(
                service.getReportSummarize(List.of(CustomerEnum.MONTECELLO, CustomerEnum.AZURRY, CustomerEnum.CASTLE))
        );
    }

}
