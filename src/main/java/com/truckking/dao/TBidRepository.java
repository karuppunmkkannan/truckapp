package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.truckking.model.TBid;

@Repository
public interface TBidRepository extends CrudRepository<TBid, Long> {

}
