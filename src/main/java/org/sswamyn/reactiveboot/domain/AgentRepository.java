package org.sswamyn.reactiveboot.domain;

import org.springframework.data.repository.CrudRepository;

/*
    Method in CrudRepository
        long count() Returns the number of entities
        Iterable<T> findAll() Returns all items of given type
        Optional<T> findById(ID Id) Returns one item by id
        void delete(T entity) Deletes an entity
        void deleteAll() Deletes all entities of the repository
        <S extends T> save(S entity) Saves an entity
 */
public interface AgentRepository extends CrudRepository<Agent, Long> {
}
