package com.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import java.util.Optional;

@Transactional
public class GenericRepository<T, ID> {

    @PersistenceContext
    protected EntityManager entityManager;

    // Save entity
    public void save(T entity) {
        entityManager.persist(entity);
    }

    // Update entity
    public void update(T entity) {
        entityManager.merge(entity);
    }

    // Find entity by ID
    public Optional<T> findById(Class<T> clazz, ID id) {
        return Optional.ofNullable(entityManager.find(clazz, id));
    }

    // Delete entity
    public void delete(T entity) {
        if (entityManager.contains(entity)) {
            entityManager.remove(entity);
        } else {
            entityManager.remove(entityManager.merge(entity));
        }
    }
}
