package com.truckking.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.truckking.model.Document;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {

}
