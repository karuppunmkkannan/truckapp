package com.truckking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@ToString
@Table(name = "TBidDetails")
@Entity
public class TBidDetails extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7957549655270656587L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JsonProperty(value = "id")
	private Long id;

	@Column(name = "bid_amount")
	@JsonProperty(value = "bid_amount")
	private String bid_amount;

	@Column(name = "type")
	@JsonProperty(value = "type")
	private String type;

	@OneToOne(targetEntity = TStatus.class)
	@JoinColumn(name = "status")
	@JsonProperty(value = "status")
	private TStatus status;

	@ManyToOne(targetEntity = TJob.class)
	@JoinColumn(name = "tJobid", nullable = false)
	@JsonProperty(value = "tJobid")
	private TJob tJobid;

	@ManyToOne(targetEntity = User.class)
	@JoinColumn(name = "transporter", nullable = false)
	@JsonProperty(value = "transporter")
	private User transporter;

}
