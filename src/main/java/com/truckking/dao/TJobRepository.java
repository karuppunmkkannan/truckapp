package com.truckking.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.truckking.model.TJob;

@Repository
public interface TJobRepository extends CrudRepository<TJob, Long> {

	@Query("SELECT TJ FROM TJob TJ WHERE TJ.status.status = :status ")
	public List<TJob> getAllPendingJobs(@Param("status") String status) throws Exception;

	@Query("SELECT TJ FROM TJob TJ WHERE TJ.status.status = :status AND TJ.user.userName = :userName ")
	public List<TJob> getAllPendingJobs(@Param("userName") String userName, @Param("status") String status)
			throws Exception;

}
