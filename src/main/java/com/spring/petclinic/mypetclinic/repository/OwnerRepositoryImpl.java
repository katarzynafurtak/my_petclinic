package com.spring.petclinic.mypetclinic.repository;

import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spring.petclinic.mypetclinic.entity.OwnerEntity;
import com.spring.petclinic.mypetclinic.entity.QOwnerEntity;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class OwnerRepositoryImpl implements OwnerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Collection<OwnerEntity> findByLastName(String lastName) {

        QOwnerEntity owner = QOwnerEntity.ownerEntity;

        JPAQueryFactory queryFactory = new JPAQueryFactory(em);

        return queryFactory
                .selectFrom(owner)
                .distinct()
                .leftJoin(owner.pets)
                .where(owner.lastName.like(lastName))
                .fetch();
    }

    @Override
    public <S extends OwnerEntity> S save(S s) {
        return null;
    }

    @Override
    public <S extends OwnerEntity> Iterable<S> save(Iterable<S> iterable) {
        return null;
    }

    @Override
    public OwnerEntity findOne(Integer integer) {
        return null;
    }

    @Override
    public boolean exists(Integer integer) {
        return false;
    }

    @Override
    public Iterable<OwnerEntity> findAll() {
        return null;
    }

    @Override
    public Iterable<OwnerEntity> findAll(Iterable<Integer> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void delete(OwnerEntity ownerEntity) {

    }

    @Override
    public void delete(Iterable<? extends OwnerEntity> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
