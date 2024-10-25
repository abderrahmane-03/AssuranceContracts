package com.repository;

import com.entity.Client;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.NoResultException;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.Optional;

@Repository
@Transactional
public class ClientRepository extends GenericRepository<Client,Long> {

    @PersistenceContext
    private EntityManager entityManager;

    public Optional<Client> findByEmail(String email) {
        try {
            Client client = entityManager.createQuery("SELECT c FROM Client c WHERE c.email = :email", Client.class)
                    .setParameter("email", email)
                    .getSingleResult();
            return Optional.of(client);
        } catch (NoResultException e) {
            return Optional.empty();
        }
    }
}
