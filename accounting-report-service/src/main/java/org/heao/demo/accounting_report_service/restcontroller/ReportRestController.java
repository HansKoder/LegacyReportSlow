package org.heao.demo.accounting_report_service.restcontroller;

import org.heao.demo.accounting_report_service.entity.AccountingEntry;
import org.heao.demo.accounting_report_service.service.AccountingEntryService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/report")
public class ReportRestController {

    private final AccountingEntryService service;

    public ReportRestController(AccountingEntryService service) {
        this.service = service;
    }

    @GetMapping("/")
    public ResponseEntity<String> helloWorld () {
        return ResponseEntity.ok("Hello World");
    }

    @GetMapping("/accounting-entries")
    public ResponseEntity<List<AccountingEntry>> getAllReport () {
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/accounting-entries/{customer}")
    public ResponseEntity<List<AccountingEntry>> getCustomerName (@PathVariable("customer") String customer) {
        return ResponseEntity.ok(service.getCustomerName(customer));
    }
}
