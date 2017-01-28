package ua.com.model;

import org.springframework.security.core.authority.AuthorityUtils;

/**
 * Created by Oleksii on 28.01.2017.
 * oleksii.holyk@outlook.com
 */
public class UserSecurity extends
        org.springframework.security.core.userdetails.User {
    private User user;

    public UserSecurity(User user) {
        super(user.getUsername(), user.getPassword(), AuthorityUtils
                .createAuthorityList(user.getRole().toString()));
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public String getId() {
        return user.getId();
    }

    public UserRole getRole() {
        return user.getRole();
    }
}
