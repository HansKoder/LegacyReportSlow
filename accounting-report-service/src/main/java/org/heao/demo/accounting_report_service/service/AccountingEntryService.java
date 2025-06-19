package org.heao.demo.accounting_report_service.service;

import org.heao.demo.accounting_report_service.dto.AccountingEntryResponse;

import java.util.List;

public interface AccountingEntryService {
    List<AccountingEntryResponse> findAll ();
}
