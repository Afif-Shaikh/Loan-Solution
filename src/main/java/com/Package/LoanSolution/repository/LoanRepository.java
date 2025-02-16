package com.Package.LoanSolution.repository;

import com.Package.LoanSolution.model.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
