package org.heao.demo.accounting_report_service.v2.config;

public record ConnectionDetail(
        String driver,
        String url,
        String user,
        String pass
) { }
