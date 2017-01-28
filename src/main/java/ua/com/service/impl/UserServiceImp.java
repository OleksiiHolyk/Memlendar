package ua.com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.com.model.User;
import ua.com.repository.UserRepository;
import ua.com.service.UserService;

/**
 * Created by Oleksii on 28.01.2017.
 * oleksii.holyk@outlook.com
 */
@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserRepository repository;

    public User findByUsername(String username){
        return repository.findByUsername(username);
    }
}
