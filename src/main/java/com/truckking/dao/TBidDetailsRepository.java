package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.truckking.model.TBidDetails;

@Repository
public interface TBidDetailsRepository extends CrudRepository<TBidDetails, Long> {

}
