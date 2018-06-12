package com.truckking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@ToString
@Table(name = "TStatus")
@Entity
public class TStatus extends Auditable implements Serializable {
	/**
	* 
	*/
	private static final long serialVersionUID = -6762646645708146578L;

	@Id
	@Column(name = "status", nullable = false, unique = true, updatable = false, insertable = false)
	@JsonProperty(value = "status")
	private String status;

}
