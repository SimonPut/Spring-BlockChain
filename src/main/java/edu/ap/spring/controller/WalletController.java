package edu.ap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WalletController {
    @GetMapping("/")
    public String wallet() {
        return "redirect:/wallet";
    }

    @GetMapping("/walletA")
    public String walletA() {
        return "amount";
    }

    @GetMapping("/walletB")
    public String walletB() {
        return "amount";
    }
}