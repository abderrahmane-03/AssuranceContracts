package com.controller;

import com.entity.Client;
import com.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Optional;

@Controller
@RequestMapping("/users")
public class RegistrationController {

    @Autowired
    private ClientService clientService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @PostMapping("/registered")
    public ModelAndView register(@RequestParam String name,
                                 @RequestParam String email,
                                 @RequestParam String phone,
                                 @RequestParam String password) {


        Client client = new Client();
        client.setName(name);
        client.setEmail(email);
        client.setPhone(phone);
        client.setPassword(passwordEncoder.encode(password));
        clientService.save(client);

        // Redirect to login with success message (optional)
        return new ModelAndView("redirect:/login");
    }

    @PostMapping("/logged")
    public ModelAndView login(@RequestParam String email,
                              @RequestParam String password) {

        // Find the client by email
        UserDetails optionalClient = clientService.loadUserByUsername(email);

        // If the client is found

        // Verify the password
        if (passwordEncoder.matches(password, optionalClient.getPassword())) {
            // Redirect to the main page (e.g., insurance dashboard) on successful login
            return new ModelAndView("redirect:/");
        } else {
            // If the password is incorrect, show an error message
            return new ModelAndView("login", "error", "Invalid password");
        }
    }

    @GetMapping
    public ModelAndView showRegistrationForm() {
        return new ModelAndView("register");
    }
}
