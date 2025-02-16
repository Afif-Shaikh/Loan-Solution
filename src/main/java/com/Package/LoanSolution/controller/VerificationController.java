package com.Package.LoanSolution.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/verify")
public class VerificationController {

    // Mock Aadhaar Verification API
    @PostMapping("/aadhaar")
    public Map<String, Boolean> verifyAadhaar(@RequestBody Map<String, String> request) {
        String aadhaar = request.get("aadhaar");
        Map<String, Boolean> response = new HashMap<>();

        if (aadhaar.equals("123456789012")) { // Mock valid Aadhaar
            response.put("verified", true);
        } else {
            response.put("verified", false);
        }
        return response;
    }

    // Mock CIBIL Score API
    @PostMapping("/cibil")
    public Map<String, Integer> checkCibil(@RequestBody Map<String, String> request) {
        String pan = request.get("pan");
        Map<String, Integer> response = new HashMap<>();

        if (pan.equals("ABCDE1234F")) { // Mock PAN with high CIBIL score
            response.put("cibilScore", 750);
        } else {
            response.put("cibilScore", 600);
        }
        return response;
    }
}
