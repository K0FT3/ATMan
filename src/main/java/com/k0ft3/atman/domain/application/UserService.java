package com.k0ft3.atman.domain.application;

import com.k0ft3.atman.domain.application.commands.RegisterCommand;
import com.k0ft3.atman.domain.model.user.RegistrationException;
import com.k0ft3.atman.domain.model.user.User;
import com.k0ft3.atman.domain.model.user.UserId;

import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    /**
     * Find user by id
     *
     * @param userId the id of the user
     * @return a user instance or null if not found
     */
    User findById(UserId userId);

    /**
     * Register a new user with username, email address, and password.
     *
     * @param command instance of <code>RegisterCommand</code>
     * @throws RegistrationException when registration failed. Possible reasons are:
     *                               1) Username already exists 2) Email address
     *                               already exists.
     */
    void register(RegisterCommand command) throws RegistrationException;
}