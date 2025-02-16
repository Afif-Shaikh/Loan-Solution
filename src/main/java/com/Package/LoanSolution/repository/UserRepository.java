package com.Package.LoanSolution.repository;

import com.Package.LoanSolution.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
