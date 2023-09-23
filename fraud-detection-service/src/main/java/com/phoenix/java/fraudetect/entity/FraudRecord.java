package com.phoenix.java.fraudetect.entity;

public record FraudRecord(Long id, String fraudRecordId, int customerId, LoanStatus loanStatus) {
}
