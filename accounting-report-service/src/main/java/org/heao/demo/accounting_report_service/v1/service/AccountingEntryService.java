package org.heao.demo.accounting_report_service.v1.service;

import org.heao.demo.accounting_report_service.v1.entity.AccountingEntry;

import java.util.List;

public interface AccountingEntryService {
    List<AccountingEntry> findAll ();
    List<AccountingEntry> getCustomerName (String customerName);
}
