package com.pruebatecnica.Dao;


import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import com.pruebatecnica.model.Factura;

public interface FacturaDao extends CrudRepository<Factura, Integer>{

    @Override
    default long count() {
        return 0;
    }

    @Override
    default void delete(Factura entity) {
        
    }

    @Override
    default void deleteAll() {
        
    }

    @Override
    default void deleteAll(Iterable<? extends Factura> entities) {
        
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
    default Iterable<Factura> findAll() {
        return null;
    }

    @Override
    default Iterable<Factura> findAllById(Iterable<Integer> ids) {
         
        return null;
    }

    @Override
    default Optional<Factura> findById(Integer id) {
         
        return null;
    }

    @Override
    default <S extends Factura> S save(S entity) {
         
        return null;
    }

    @Override
    default <S extends Factura> Iterable<S> saveAll(Iterable<S> entities) {
         
        return null;
    }
    
}
