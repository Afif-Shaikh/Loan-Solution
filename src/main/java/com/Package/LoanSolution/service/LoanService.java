package com.Package.LoanSolution.service;

import com.Package.LoanSolution.model.Loan;
import com.Package.LoanSolution.repository.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    private LoanRepository loanRepository;

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }
}
