package org.heao.demo.accounting_report_service.v1.mapper;

import org.heao.demo.accounting_report_service.v1.dto.AccountingEntryResponse;
import org.heao.demo.accounting_report_service.v1.entity.AccountingEntry;

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
