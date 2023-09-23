package com.phoenix.java.fraudetect.controller;

import com.phoenix.java.fraudetect.entity.LoanStatus;
import com.phoenix.java.fraudetect.service.FraudDetectionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/fraud")
@RequiredArgsConstructor
public class FraudDetectionController {

    private final FraudDetectionService fraudDetectionService;
    @GetMapping("/check")
    public LoanStatus checkForFraud(@RequestParam int customerId) {
        return fraudDetectionService.checkForFraud(customerId);
    }
}
