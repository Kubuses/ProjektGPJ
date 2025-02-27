package pl.games.lotek.repository;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

@Component
public class LotekRepositoryInMemoryDb implements LotekRepository {

    static Map<String, LotekEntity> db = new HashMap<>();

    public LotekRepositoryInMemoryDb() {
    }

//    @Override
//    public Object save(LotekEntity lotekEntity) {
//        db.put(lotekEntity.getId(), lotekEntity);
//        return null;
//    }

    @Override
    public LotekEntity save(LotekEntity lotekEntity) {
        return null;
    }

//    @Override
//    public Map<String, LotekEntity> fetchAll() {
//        return db;
//    }

    @Override
    public <S extends LotekEntity> S insert(S entity) {
        return null;
    }

    @Override
    public <S extends LotekEntity> List<S> insert(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public <S extends LotekEntity> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends LotekEntity> List<S> findAll(Example<S> example) {
        return List.of();
    }

    @Override
    public <S extends LotekEntity> List<S> findAll(Example<S> example, Sort sort) {
        return List.of();
    }

    @Override
    public <S extends LotekEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends LotekEntity> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends LotekEntity> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends LotekEntity, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends LotekEntity> List<S> saveAll(Iterable<S> entities) {
        return List.of();
    }

    @Override
    public Optional<LotekEntity> findById(String s) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(String s) {
        return false;
    }

    @Override
    public List<LotekEntity> findAll() {
        return List.of();
    }

    @Override
    public List<LotekEntity> findAllById(Iterable<String> strings) {
        return List.of();
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(String s) {

    }

    @Override
    public void delete(LotekEntity entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends String> strings) {

    }

    @Override
    public void deleteAll(Iterable<? extends LotekEntity> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<LotekEntity> findAll(Sort sort) {
        return List.of();
    }

    @Override
    public Page<LotekEntity> findAll(Pageable pageable) {
        return null;
    }
}
