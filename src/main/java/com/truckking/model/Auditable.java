package com.truckking.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

@Getter(AccessLevel.PUBLIC)
@Setter(AccessLevel.PUBLIC)
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class Auditable {

	@JsonFormat(pattern = "yyyy-MM-dd")
	@CreatedDate
	@Column(name = "created_dt")
	private Date created_dt;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@LastModifiedDate
	@Column(name = "updated_dt")
	private Date updated_dt;
	
}