package org.heao.demo.accounting_report_service.repository;

import org.heao.demo.accounting_report_service.entity.AccountingEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountingEntryRepository extends JpaRepository<AccountingEntry, Long> {
}
