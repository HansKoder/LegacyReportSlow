package org.heao.demo.accounting_report_service.v2.dto;

import java.util.List;

public record AccountingReport (
        String customer,
        List<CustomerCurrencySummarize> subCustomers
) { }
