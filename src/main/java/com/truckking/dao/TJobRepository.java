package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TJobRepository extends CrudRepository<TJobRepository, String> {

}
