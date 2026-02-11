package com.sandesh.cruddemo.dao;

import com.sandesh.cruddemo.entity.Student;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class StudentDAOImpl implements StudentDAO {
    // define field for entitymanager
    private EntityManager entityManager;

    // inject entitymanager using constructor injection
    @Autowired
    public StudentDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    // implement save method
    @Override
    @Transactional
    public void save(Student student) {
        entityManager.persist(student);
    }
}
