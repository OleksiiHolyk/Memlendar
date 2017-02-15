package ua.com.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import ua.com.model.Mem;

import java.util.Collection;

/**
 * Created by oleksii.holyk on 15.02.2017.
 */

@Repository
public class MemSearchRepository {
    @Autowired
    MongoTemplate mongoTemplate;


    public Collection<Mem> searchMemes(String text) {
        return mongoTemplate.find(Query.query(new Criteria()
                .orOperator(Criteria.where("description").regex(text, "i"),
                        Criteria.where("shortDescription").regex(text, "i"),
                        Criteria.where("date").regex(text, "i"),
                        Criteria.where("fullDescription").regex(text, "i"))
        ), Mem.class);
    }

}
