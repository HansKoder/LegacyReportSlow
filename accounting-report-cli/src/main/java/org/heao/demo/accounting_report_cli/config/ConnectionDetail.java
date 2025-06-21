package org.heao.demo.accounting_report_cli.config;

public record ConnectionDetail(
        String driver,
        String url,
        String user,
        String pass
) {
    @Override
    public String toString() {
        return "ConnectionDetail{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", pass='" + pass + '\'' +
                '}';
    }
}
