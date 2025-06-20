package org.heao.demo.accounting_report_cli.entity;

import jakarta.persistence.*;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "accounting_entries")
public class AccountingEntry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Must be another table
    @Column(name = "customer_name")
    private String customerName;

    @Column(name = "customer_tax_id")
    private String customerTaxId;

    @Column(name = "document_code")
    private String documentCode;

    @Column(name = "document_type")
    private String documentType;

    // must be LocalDate
    @Column(name = "entry_date")
    private LocalDate entryDate;

    @Column(name = "amount")
    private BigDecimal amount;

    @Column(name = "currency")
    private String currency;

    @Column(name = "account_code")
    private String accountCode;

    @Column(name = "account_name")
    private String accountName;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    public AccountingEntry() {
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerTaxId() {
        return customerTaxId;
    }

    public void setCustomerTaxId(String customerTaxId) {
        this.customerTaxId = customerTaxId;
    }

    public String getDocumentCode() {
        return documentCode;
    }

    public void setDocumentCode(String documentCode) {
        this.documentCode = documentCode;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public LocalDate getEntryDate() {
        return entryDate;
    }

    public void setEntryDate(LocalDate entryDate) {
        this.entryDate = entryDate;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAccountCode() {
        return accountCode;
    }

    public void setAccountCode(String accountCode) {
        this.accountCode = accountCode;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }


    public static final class AccountingEntryBuilder {
        private String customerName;
        private String customerTaxId;
        private String documentCode;
        private String documentType;
        private LocalDate entryDate;
        private BigDecimal amount;
        private String currency;
        private String accountCode;
        private String accountName;
        private LocalDateTime createdAt;

        private AccountingEntryBuilder() {
        }

        public static AccountingEntryBuilder anAccountingEntry() {
            return new AccountingEntryBuilder();
        }

        public AccountingEntryBuilder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public AccountingEntryBuilder customerTaxId(String customerTaxId) {
            this.customerTaxId = customerTaxId;
            return this;
        }

        public AccountingEntryBuilder documentCode(String documentCode) {
            this.documentCode = documentCode;
            return this;
        }

        public AccountingEntryBuilder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        public AccountingEntryBuilder entryDate(LocalDate entryDate) {
            this.entryDate = entryDate;
            return this;
        }

        public AccountingEntryBuilder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public AccountingEntryBuilder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public AccountingEntryBuilder accountCode(String accountCode) {
            this.accountCode = accountCode;
            return this;
        }

        public AccountingEntryBuilder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public AccountingEntryBuilder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public AccountingEntry build() {
            AccountingEntry accountingEntry = new AccountingEntry();
            accountingEntry.setCustomerName(customerName);
            accountingEntry.setCustomerTaxId(customerTaxId);
            accountingEntry.setDocumentCode(documentCode);
            accountingEntry.setDocumentType(documentType);
            accountingEntry.setEntryDate(entryDate);
            accountingEntry.setAmount(amount);
            accountingEntry.setCurrency(currency);
            accountingEntry.setAccountCode(accountCode);
            accountingEntry.setAccountName(accountName);
            accountingEntry.setCreatedAt(createdAt);
            return accountingEntry;
        }
    }

    @Override
    public String toString() {
        return "AccountingEntry{" +
                "id=" + id +
                ", customerName='" + customerName + '\'' +
                ", customerTaxId='" + customerTaxId + '\'' +
                ", documentCode='" + documentCode + '\'' +
                ", documentType='" + documentType + '\'' +
                ", entryDate=" + entryDate +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", accountCode='" + accountCode + '\'' +
                ", accountName='" + accountName + '\'' +
                ", createdAt=" + createdAt +
                '}';
    }
}
