package com.truckking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.truckking.model.TBidDetails;

@Repository
public interface TBidDetailsRepository extends CrudRepository<TBidDetails, Long> {

	@Query("SELECT TJ FROM TBidDetails TJ WHERE TJ.status.status = :status AND TJ.transporter.userName = :userName ")
	public List<TBidDetails> getTBidDetailsByUser(@Param("userName") String userName, @Param("status") String status)
			throws Exception;

}
