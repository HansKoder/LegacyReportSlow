package org.heao.demo.accounting_report_service.v2.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

public record CustomerCurrencySummarize(
    String customer,
    String currency,
    BigDecimal amount,
    LocalDate date
) { }
