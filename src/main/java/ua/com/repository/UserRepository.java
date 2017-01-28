package ua.com.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import ua.com.model.User;

/**
 * Created by Oleksii on 28.01.2017.
 * oleksii.holyk@outlook.com
 */
@RepositoryRestResource(collectionResourceRel = "users", path = "users")
public interface UserRepository extends MongoRepository<User, String> {

    public User findByUsername(String username);
}