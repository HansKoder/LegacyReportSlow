package org.heao.demo.accounting_report_service.v2.repository;

import org.heao.demo.accounting_report_service.v2.dto.CustomerCurrencySummarize;

import java.util.List;

public interface AccountingReportRepository {
    List<CustomerCurrencySummarize> getReportCustomer ();
}
