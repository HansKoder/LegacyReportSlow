package org.heao.demo.accounting_report_cli.repository;

import org.heao.demo.accounting_report_cli.model.AccountingEntryModel;

public interface AccountingReportRepository {
    void save (AccountingEntryModel model);
}
