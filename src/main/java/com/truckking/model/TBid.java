package com.truckking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TBid implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7957549655270656587L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JsonProperty(value = "id")
	private String id;

	@Column(name = "bid_amount")
	@JsonProperty(value = "bid_amount")
	private String bid_amount;

}
