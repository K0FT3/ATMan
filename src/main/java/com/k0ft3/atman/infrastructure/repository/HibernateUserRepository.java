package com.k0ft3.atman.infrastructure.repository;

import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;

import com.k0ft3.atman.domain.model.user.User;
import com.k0ft3.atman.domain.model.user.UserId;
import com.k0ft3.atman.domain.model.user.UserRepository;

@Repository
public class HibernateUserRepository extends HibernateSupport<User> implements UserRepository {

    public HibernateUserRepository(EntityManager entityManager) {
        super(entityManager);
    }

    @Override
    public User findByUsername(String username) {
        Query<User> query = getSession().createQuery("from User where username = :username", User.class);
        query.setParameter("username", username);
        return query.uniqueResult();
    }

    @Override
    public User findByEmailAddress(String emailAddress) {
        Query<User> query = getSession().createQuery("from User where emailAddress = :emailAddress", User.class);
        query.setParameter("emailAddress", emailAddress);
        return query.uniqueResult();
    }

    @Override
    public User findById(UserId userId) {
        Query<User> query = getSession().createQuery("from User where id = :id", User.class);
        query.setParameter("id", userId.value());
        return query.uniqueResult();
    }
}