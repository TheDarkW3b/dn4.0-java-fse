package com.cognizant.microservices.controller;

import com.cognizant.microservices.entity.Loan;
import com.cognizant.microservices.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanRepository loanRepository;

    @GetMapping("/account/{accountNumber}")
    public ResponseEntity<List<Loan>> getLoansByAccountNumber(@PathVariable Long accountNumber) {
        List<Loan> loans = loanRepository.findByAccountNumber(accountNumber);
        if (loans.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(loans);
    }
}
