package com.truckking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Table(name = "tjob")
@Entity
public class TJob implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6032731482267381984L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JsonProperty(value = "id")
	private String id;

	@Column(name = "type_ofmaterial")
	@JsonProperty(value = "type_ofmaterial")
	private String type_ofmaterial;

	@Column(name = "expected_delivery_date")
	@JsonProperty(value = "expected_delivery_date")
	private String expected_delivery_date;

	@Column(name = "weight")
	@JsonProperty(value = "weight")
	private String weight;

	@Column(name = "price")
	@JsonProperty(value = "price")
	private String price;

	@Column(name = "pickup_location")
	@JsonProperty(value = "pickup_location")
	private String pickup_location;

	@Column(name = "destination")
	@JsonProperty(value = "destination")
	private String destination;

}
