package org.heao.demo.accounting_report_service.v1.repository;

import org.heao.demo.accounting_report_service.v1.entity.AccountingEntry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountingEntryRepository extends JpaRepository<AccountingEntry, Long> {
    List<AccountingEntry> findByCustomerName (String customerName);
}
