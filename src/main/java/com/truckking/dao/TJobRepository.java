package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.truckking.model.TJob;

@Repository
public interface TJobRepository extends CrudRepository<TJob, Long> {

}
