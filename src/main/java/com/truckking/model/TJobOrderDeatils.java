package com.truckking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

public class TJobOrderDeatils implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6142610110492608047L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JsonProperty(value = "id")
	private String id;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "trip_starting_time")
	@JsonProperty(value = "trip_starting_time")
	private Date trip_starting_time;

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "trip_ending_time")
	@JsonProperty(value = "trip_ending_time")
	private Date trip_ending_time;

}
