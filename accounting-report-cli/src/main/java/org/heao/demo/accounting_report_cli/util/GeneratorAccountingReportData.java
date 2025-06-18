package org.heao.demo.accounting_report_cli.util;

import org.heao.demo.accounting_report_cli.entity.AccountingEntry;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GeneratorAccountingReportData {

    public static List<AccountingEntry> generateRandomData (int cant) {
        if (cant < 1) throw new IllegalArgumentException("Cant must be greater then zero");

        CircularLinkedList<String> customerCycled = new CircularLinkedList<>(
                List.of("Disney", "Warner Bros", "Adidas", "Hbo Max", "Nissan","Seven", "Suzuki"));

        List<AccountingEntry> entries = new ArrayList<>();

        for (int i = 0; i < cant; i++) {
            entries.add(
                    AccountingEntry.AccountingEntryBuilder.anAccountingEntry()
                            .customerName(customerCycled.next())
                            .customerTaxId("800." + i + "-9")
                            .documentCode("INV-2025-" + String.format("%05d", i))
                            .documentType("INVOICE")
                            .entryDate("2025-06-18")
                            .amount(BigDecimal.valueOf(Math.random() * 10000))
                            .currency("USD")
                            .accountCode("110505")
                            .accountName("Caja general")
                            .createdAt(LocalDateTime.now())
                            .build()
            );
        }

        return entries;
    }

}
