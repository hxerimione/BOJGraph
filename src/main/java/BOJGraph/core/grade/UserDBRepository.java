package BOJGraph.core.grade;


import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public class UserDBRepository {
//
//    private MongoOperations operations;
//    @Autowired
//    public UserDBRepository(MongoTemplate mongoTemplate){
//        System.out.println("happyhappy");
//        Assert.notNull(mongoTemplate,"is null");
//        this.operations = mongoTemplate;
//    }
//    public Long[] findLevelByName(String name) {
//        Query query = new Query(Criteria.where("name").is(name));
//        UserEntity findUser = operations.findOne(query, UserEntity.class, "TestCollection");
//        Long[] level = findUser.getLevel();
//        Long[] result = {0L,0L,0L,0L,0L,0L};
//        for (int i = 1; i < 31; i++) {
//            result[(i-1)/5] += level[i];
//        }
//        return result;
//    }
//
//
//    public Long[] findExpByName(String name) {
//        Query query = new Query(Criteria.where("name").is(name));
//        UserEntity findUser = operations.findOne(query, UserEntity.class, "TestCollection");
//
//        return findUser.getExp();
//    }

}
