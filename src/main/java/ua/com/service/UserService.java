package ua.com.service;

import ua.com.model.User;

/**
 * Created by Oleksii on 28.01.2017.
 * oleksii.holyk@outlook.com
 */

public interface UserService {
    public User findByUsername(String username);

}
