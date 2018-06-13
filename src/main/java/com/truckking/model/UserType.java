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
@Entity
@Table(name = "UserType")
public class UserType extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5564482785569624030L;

	@Id
	@Column(name = "type", nullable = false, unique = true, updatable = false, insertable = false)
	@JsonProperty(value = "type")
	private String type;

}
