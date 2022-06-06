package BOJGraph.core.grade;

import org.apache.catalina.User;
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
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Repository;
import org.springframework.util.Assert;

import javax.sql.DataSource;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;


public class MongoDBRepository {
//
//        MongoOperations operations;
//        MongoTemplate mongoTemplate;
//
//        public MongoDBRepository() {
//        }
//
//        @Override
//        public Long[] findLevelByName(String name) {
//                System.out.println("hllo");
//                Query query = new Query(Criteria.where("name").is(name));
//                UserEntity findUser = operations.findOne(query, UserEntity.class, "TestCollection");
//                Long[] level = findUser.getLevel();
//                Long[] result = {0L,0L,0L,0L,0L,0L};
//                for (int i = 1; i < 31; i++) {
//                        result[(i-1)/5] += level[i];
//                }
//                return result;
//        }
//
//        @Override
//        public Long[] findExpByName(String name) {
//                Query query = new Query(Criteria.where("name").is(name));
//                UserEntity findUser = operations.findOne(query, UserEntity.class, "TestCollection");
//
//                return findUser.getExp();
//        }
//
//        @Override
//        public <S extends UserEntity> S save(S entity) {
//                return null;
//        }
//
//        @Override
//        public <S extends UserEntity> List<S> saveAll(Iterable<S> entities) {
//                return null;
//        }
//
//        @Override
//        public Optional<UserEntity> findById(ObjectId objectId) {
//                return Optional.empty();
//        }
//
//        @Override
//        public boolean existsById(ObjectId objectId) {
//                return false;
//        }
//
//        @Override
//        public List<UserEntity> findAll() {
//                return null;
//        }
//
//        @Override
//        public Iterable<UserEntity> findAllById(Iterable<ObjectId> objectIds) {
//                return null;
//        }
//
//        @Override
//        public long count() {
//                return 0;
//        }
//
//        @Override
//        public void deleteById(ObjectId objectId) {
//
//        }
//
//        @Override
//        public void delete(UserEntity entity) {
//
//        }
//
//        @Override
//        public void deleteAllById(Iterable<? extends ObjectId> objectIds) {
//
//        }
//
//        @Override
//        public void deleteAll(Iterable<? extends UserEntity> entities) {
//
//        }
//
//        @Override
//        public void deleteAll() {
//
//        }
//
//        @Override
//        public List<UserEntity> findAll(Sort sort) {
//                return null;
//        }
//
//        @Override
//        public Page<UserEntity> findAll(Pageable pageable) {
//                return null;
//        }
//
//        @Override
//        public <S extends UserEntity> S insert(S entity) {
//                return null;
//        }
//
//        @Override
//        public <S extends UserEntity> List<S> insert(Iterable<S> entities) {
//                return null;
//        }
//
//        @Override
//        public <S extends UserEntity> Optional<S> findOne(Example<S> example) {
//                return Optional.empty();
//        }
//
//        @Override
//        public <S extends UserEntity> List<S> findAll(Example<S> example) {
//                return null;
//        }
//
//        @Override
//        public <S extends UserEntity> List<S> findAll(Example<S> example, Sort sort) {
//                return null;
//        }
//
//        @Override
//        public <S extends UserEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
//                return null;
//        }
//
//        @Override
//        public <S extends UserEntity> long count(Example<S> example) {
//                return 0;
//        }
//
//        @Override
//        public <S extends UserEntity> boolean exists(Example<S> example) {
//                return false;
//        }
//
//        @Override
//        public <S extends UserEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
//                return null;
//        }
}
