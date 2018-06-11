/**
 * 
 */
package com.truckking.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Karuppusamy
 * @version 1.0
 *
 */

@Setter(AccessLevel.PUBLIC)
@Getter(AccessLevel.PUBLIC)
@ToString
@Table(name = "User")
@Entity // This tells Hibernate to make a table out of this class
public class User extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1425383660285233845L;

	@Column(name = "name")
	@JsonProperty(value = "name")
	private String name;

	@Id
	@Column(name = "userName", nullable = false, unique = true, updatable = false)
	@JsonProperty(value = "userName")
	private String userName;

	@Column(name = "address")
	@JsonProperty(value = "address")
	private String address;

	@Column(name = "password")
	@JsonProperty(value = "password")
	private String password;

	@Column(name = "mobileNumer")
	@JsonProperty(value = "mobileNumer")
	private String mobileNumer;

	@Column(name = "email_id")
	@JsonProperty(value = "email_id")
	private String email_id;

	@Column(name = "gstn_no")
	@JsonProperty(value = "gstn_no")
	private String gstn_no;

	@Column(name = "approved_by")
	@JsonProperty(value = "approved_by")
	private String approved_by;

	@OneToOne(targetEntity = UserType.class)
	@JoinColumn(name = "type")
	@JsonProperty(value = "type")
	private UserType userType;

	@OneToOne(targetEntity = Document.class, cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name = "documentid")
	@JsonProperty(value = "documentid")
	private Document document;

	@OneToOne(targetEntity = TStatus.class)
	@JoinColumn(name = "status")
	@JsonProperty(value = "status")
	private TStatus status;

}