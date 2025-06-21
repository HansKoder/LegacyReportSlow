package org.heao.demo.accounting_report_cli.config;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

@Component
public class CustomerJdbcRegistry {
    private final Map<CustomerEnum, ConnectionDetail> customerDetailsDB = new HashMap<>();
    private final Map<CustomerEnum, JdbcTemplate> connections = new HashMap<>();

    public CustomerJdbcRegistry() {
        injectDetailConnectionPerCustomer();
        buildCustomConnection();
    }

    private void injectDetailConnectionPerCustomer () {
        System.out.println("Inject each detail connection Customer");
        customerDetailsDB.put(CustomerEnum.MONTECELLO,
                new ConnectionDetail(
                        "org.postgresql.Driver",
                        "jdbc:postgresql://localhost:5432/montecello",
                        "montecello_user",
                        "montecello_pass"));

        customerDetailsDB.put(CustomerEnum.AZURRY,
                new ConnectionDetail(
                        "org.postgresql.Driver",
                        "jdbc:postgresql://localhost:5432/azurry",
                        "azurry_user",
                        "azurry_pass"));

        customerDetailsDB.put(CustomerEnum.CASTLE,
                new ConnectionDetail(
                        "org.postgresql.Driver",
                        "jdbc:postgresql://localhost:5432/castle",
                        "castle_user",
                        "castle_pass"));
    }

    private JdbcTemplate buildJdbc (ConnectionDetail connectionDetail) {
        System.out.println(">> Build JDBC " + connectionDetail);
        if (Objects.isNull(connectionDetail))
            throw new IllegalArgumentException("Customer Detail DB Must be initialized");

        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName(connectionDetail.driver());
        ds.setUrl(connectionDetail.url());
        ds.setUsername(connectionDetail.user());
        ds.setPassword(connectionDetail.pass());

        return new JdbcTemplate(ds);
    }

    private void buildCustomConnection () {
        System.out.println("Builds Customer Connections");
        for (CustomerEnum customerEnum : List.of(CustomerEnum.MONTECELLO, CustomerEnum.AZURRY, CustomerEnum.CASTLE))
            connections.put(customerEnum, buildJdbc(customerDetailsDB.get(customerEnum)));
    }

    public JdbcTemplate connectionPerCustomer (CustomerEnum customerEnum) {
        return connections.get(customerEnum);
    }

}
