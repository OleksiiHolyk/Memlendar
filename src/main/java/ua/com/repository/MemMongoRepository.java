package ua.com.repository;

import ua.com.model.Mem;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by oleksii.holyk on 15.02.2017.
 */
public interface MemMongoRepository  extends CrudRepository<Mem, String> {}