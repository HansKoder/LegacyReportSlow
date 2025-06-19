package org.heao.demo.accounting_report_service.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public record AccountingEntryResponse (
        String customerName,
        String customerTaxId,
        String documentCode,
        String documentType,
        String entryDate,
        BigDecimal amount,
        String currency,
        String accountCode,
        String accountName,
        LocalDateTime createdAt
) { }
