package com.truckking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Document implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1438697315091367547L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JsonProperty(value = "id")
	private String id;

	@Column(name = "name")
	@JsonProperty(value = "name")
	private String name;

	@Column(name = "reg_num")
	@JsonProperty(value = "reg_num")
	private String reg_num;

	@Column(name = "image")
	@JsonProperty(value = "image")
	private String image;

	@Column(name = "other_details")
	@JsonProperty(value = "other_details")
	private String other_details;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "expiry_dt")
	@JsonProperty(value = "expiry_dt")
	private Date expiry_dt;

}
