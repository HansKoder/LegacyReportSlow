package org.heao.demo.accounting_report_service.service;

import org.heao.demo.accounting_report_service.entity.AccountingEntry;
import org.heao.demo.accounting_report_service.repository.AccountingEntryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountingEntryServiceImpl implements AccountingEntryService {

    private final AccountingEntryRepository repository;

    public AccountingEntryServiceImpl(AccountingEntryRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<AccountingEntry> findAll() {
        return repository.findAll();
    }

    @Override
    public List<AccountingEntry> getCustomerName(String customerName) {
        return repository.findByCustomerName(customerName);
    }
}
