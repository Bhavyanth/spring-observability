package com.phoenix.java.loans.controller;

import com.phoenix.java.loans.dto.LoanDto;
import com.phoenix.java.loans.service.LoanService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loan")
@RequiredArgsConstructor
public class LoanController {

    private final LoanService loanService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<LoanDto> listAllLoans() {
        return loanService.listAllLoans();
    }

    @PostMapping
    public String applyLoan(@RequestBody LoanDto loanDto) {
        return loanService.applyLoan(loanDto);
    }
}
