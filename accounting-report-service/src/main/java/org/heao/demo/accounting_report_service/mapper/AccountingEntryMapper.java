package org.heao.demo.accounting_report_service.mapper;

import org.heao.demo.accounting_report_service.dto.AccountingEntryResponse;
import org.heao.demo.accounting_report_service.entity.AccountingEntry;

public class AccountingEntryMapper {

    public static AccountingEntryResponse toResponse (AccountingEntry entity) {
        return new AccountingEntryResponse(
                entity.getCustomerName(),
                entity.getCustomerTaxId(),
                entity.getDocumentCode(),
                entity.getDocumentType(),
                entity.getEntryDate(),
                entity.getAmount(),
                entity.getCurrency(),
                entity.getAccountCode(),
                entity.getAccountName(),
                entity.getCreatedAt()
        );
    }

}
