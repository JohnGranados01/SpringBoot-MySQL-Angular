package com.pruebatecnica.Dao;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.pruebatecnica.model.Detalle;

public interface DetalleDao extends CrudRepository<Detalle, Integer>{

    @Override
    default long count() {
         
        return 0;
    }

    @Override
    default void delete(Detalle entity) {
         
        
    }

    @Override
    default void deleteAll() {
         
        
    }

    @Override
    default void deleteAll(Iterable<? extends Detalle> entities) {
         
        
    }

    @Override
    default void deleteAllById(Iterable<? extends Integer> ids) {
         
        
    }

    @Override
    default void deleteById(Integer id) {
         
        
    }

    @Override
    default boolean existsById(Integer id) {
         
        return false;
    }

    @Override
    default Iterable<Detalle> findAll() {
         
        return null;
    }

    @Override
    default Iterable<Detalle> findAllById(Iterable<Integer> ids) {
         
        return null;
    }

    @Override
    default Optional<Detalle> findById(Integer id) {
         
        return null;
    }

    @Override
    default <S extends Detalle> S save(S entity) {
         
        return null;
    }

    @Override
    default <S extends Detalle> Iterable<S> saveAll(Iterable<S> entities) {
         
        return null;
    }


    
}
