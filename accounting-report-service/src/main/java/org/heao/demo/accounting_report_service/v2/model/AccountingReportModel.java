package org.heao.demo.accounting_report_service.v2.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class AccountingReportModel {
    public String customerName;
    public String customerTaxId;
    public String documentCode;
    public String documentType;
    public LocalDate entryDate;
    public BigDecimal amount;
    public String currency;
    public String accountCode;
    public String accountName;
    public LocalDateTime createdAt;

    public static final class Builder {
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

        private Builder() {
        }

        public static Builder any() {
            return new Builder();
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Builder customerTaxId(String customerTaxId) {
            this.customerTaxId = customerTaxId;
            return this;
        }

        public Builder documentCode(String documentCode) {
            this.documentCode = documentCode;
            return this;
        }

        public Builder documentType(String documentType) {
            this.documentType = documentType;
            return this;
        }

        public Builder entryDate(LocalDate entryDate) {
            this.entryDate = entryDate;
            return this;
        }

        public Builder amount(BigDecimal amount) {
            this.amount = amount;
            return this;
        }

        public Builder currency(String currency) {
            this.currency = currency;
            return this;
        }

        public Builder accountCode(String accountCode) {
            this.accountCode = accountCode;
            return this;
        }

        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        public Builder createdAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public AccountingReportModel build() {
            AccountingReportModel accountingEntryModel = new AccountingReportModel();
            accountingEntryModel.customerTaxId = this.customerTaxId;
            accountingEntryModel.customerName = this.customerName;
            accountingEntryModel.documentType = this.documentType;
            accountingEntryModel.documentCode = this.documentCode;
            accountingEntryModel.entryDate = this.entryDate;
            accountingEntryModel.amount = this.amount;
            accountingEntryModel.currency = this.currency;
            accountingEntryModel.accountCode = this.accountCode;
            accountingEntryModel.accountName = this.accountName;
            accountingEntryModel.createdAt = this.createdAt;
            return accountingEntryModel;
        }
    }

    @Override
    public String toString() {
        return "AccountingEntryModel{" +
                "customerName='" + customerName + '\'' +
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
