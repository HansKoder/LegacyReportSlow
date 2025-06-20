package org.heao.demo.accounting_report_cli.util;

import org.heao.demo.accounting_report_cli.entity.AccountingEntry;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class GeneratorAccountingReportData {

    public static List<AccountingEntry> generateRandomData (int cant) {
        if (cant < 1) throw new IllegalArgumentException("Cant must be greater then zero");

        CircularLinkedList<String> customerCycled = new CircularLinkedList<>(
                List.of("Disney", "Warner Bros", "Adidas", "Hbo Max", "Nissan","Seven", "Suzuki"));

        CircularLinkedList<String> concurrencyCycled = new CircularLinkedList<>(
                List.of("USD", "COP", "EUR"));

        CircularLinkedList<String> documentTypeCycled = new CircularLinkedList<>(
                List.of("INVOICE", "RECEIPT"));

        CircularLinkedList<LocalDate> fakeDateCycled = RandomDate.loadFakePastDates();

        List<AccountingEntry> entries = new ArrayList<>();

        for (int i = 0; i < cant; i++) {
            entries.add(
                    AccountingEntry.AccountingEntryBuilder.anAccountingEntry()
                            .customerName(customerCycled.next())
                            .customerTaxId("800." + i + "-9")
                            .documentCode("DOC-2025-" + String.format("%05d", i))
                            .documentType(documentTypeCycled.next())
                            .entryDate(fakeDateCycled.next())
                            .amount(BigDecimal.valueOf(Math.random() * 10000))
                            .currency(concurrencyCycled.next())
                            .accountCode("110505")
                            .accountName("Caja general")
                            .createdAt(LocalDateTime.now())
                            .build()
            );
        }

        return entries;
    }

}
