package com.zipcoder.cryptonator_api;

/**
 * Created by leon on 1/22/18.
 */
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FooRepository extends CrudRepository<Foo, String> {
}
