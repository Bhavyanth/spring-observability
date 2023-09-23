package com.phoenix.java.fraudetect.service;

import com.phoenix.java.fraudetect.entity.LoanStatus;
import com.phoenix.java.fraudetect.repository.FraudRecordRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class FraudDetectionService {

    private final FraudRecordRepository fraudRecordRepository;

    public LoanStatus checkForFraud(int customerId) {
        return fraudRecordRepository.existsByCustomerId(customerId) ? LoanStatus.REJECTED : LoanStatus.APPROVED;
    }
}
