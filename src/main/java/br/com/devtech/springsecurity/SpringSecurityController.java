package br.com.devtech.springsecurity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityController {
    
    @GetMapping("/")
    String Route() {
        return "<h1>API - Spring security</h1>";
    }
    @GetMapping("/public")
    String publicRoute() {
        return "<h1>Public route, feel free to look around! 🔓 </h1>";
    }

    @GetMapping("/private")
    String privateRoute() {
        return "<h1>Private route, only authorized personnel! 🔐  </h1>";
    }
}
