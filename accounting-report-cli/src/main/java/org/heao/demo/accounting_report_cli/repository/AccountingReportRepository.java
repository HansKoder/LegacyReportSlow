package org.heao.demo.accounting_report_cli.repository;

import org.heao.demo.accounting_report_cli.model.AccountingEntryModel;

import java.util.List;

public interface AccountingReportRepository {
    void saveAll (List<AccountingEntryModel> list);
}
