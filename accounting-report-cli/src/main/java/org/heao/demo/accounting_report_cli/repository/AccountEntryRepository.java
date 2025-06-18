package org.heao.demo.accounting_report_cli.repository;

import org.heao.demo.accounting_report_cli.entity.AccountingEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountEntryRepository extends JpaRepository<AccountingEntry, Long> {
}
