package com.service;

import com.entity.Client;
import com.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Service;

import java.util.Collections;

@Service
public class ClientService implements UserDetailsService {

    @Autowired
    private ClientRepository clientRepository;

    public void save(Client client) {
        clientRepository.save(client);
    }
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        Client client = clientRepository.findByEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Client not found with email: " + email));

        return new User(client.getEmail(), client.getPassword(), Collections.singletonList(new SimpleGrantedAuthority("ROLE_USER")));
    }
}
