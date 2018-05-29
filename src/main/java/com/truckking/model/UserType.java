package com.truckking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "UserType")
public class UserType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5564482785569624030L;

	@Override
	public String toString() {
		return "UserType [id=" + id + ", type=" + type + ", created_dt=" + created_dt + ", updated_dt=" + updated_dt
				+ "]";
	}

	@Id
	@Column(name = "id")
	@JsonProperty(value = "id")
	private Long id;

	@Column(name = "type", nullable = false, unique = true, updatable = false, insertable = false)
	@JsonProperty(value = "type")
	private String type;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "created_dt")
	@JsonProperty(value = "created_dt")
	private Date created_dt;

	public Date getCreated_dt() {
		return created_dt;
	}

	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "updated_dt")
	@JsonProperty(value = "updated_dt")
	private Date updated_dt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdated_dt() {
		return updated_dt;
	}

	public void setUpdated_dt(Date updated_dt) {
		this.updated_dt = updated_dt;
	}

}
