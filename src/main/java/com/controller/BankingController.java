package com.securebank.bankingapp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class BankingController {

    @GetMapping("/status")
    public Map<String, String> getStatus() {
        return Map.of(
            "application", "SecureBank",
            "status", "Running",
            "security", "Private Azure deployment ready"
        );
    }

    @GetMapping("/accounts")
    public List<Map<String, Object>> getAccounts() {
        return List.of(
            Map.of(
                "type", "Chequing",
                "accountNumber", "4582",
                "balance", 8450.75
            ),
            Map.of(
                "type", "Savings",
                "accountNumber", "7921",
                "balance", 12300.00
            )
        );
    }
}