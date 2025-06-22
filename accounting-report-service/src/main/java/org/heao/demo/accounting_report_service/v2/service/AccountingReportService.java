package org.heao.demo.accounting_report_service.v2.service;

import org.heao.demo.accounting_report_service.v2.config.CustomerEnum;
import org.heao.demo.accounting_report_service.v2.dto.AccountingReport;
import org.heao.demo.accounting_report_service.v2.dto.CustomerCurrencySummarize;

import java.util.List;

public interface AccountingReportService {
    List<AccountingReport> getReportSummarize (List<CustomerEnum> customers);
}
