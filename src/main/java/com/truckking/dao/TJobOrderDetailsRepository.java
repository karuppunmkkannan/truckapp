package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.truckking.model.TJobOrderDeatils;

@Repository
public interface TJobOrderDetailsRepository extends CrudRepository<TJobOrderDeatils, String> {

}
