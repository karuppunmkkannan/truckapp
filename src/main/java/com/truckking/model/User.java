/**
 * 
 */
package com.truckking.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Karuppusamy
 * @version 1.0
 *
 */

@Table(name = "User")
@Entity // This tells Hibernate to make a table out of this class
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1425383660285233845L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	@JsonProperty(value = "id")
	private Long id;

	@Column(name = "name")
	@JsonProperty(value = "name")
	private String name;

	@Column(name = "userName")
	@JsonProperty(value = "userName")
	private String userName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

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

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "created_dt")
	@JsonProperty(value = "created_dt")
	private Date created_dt;

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", address=" + address + ", password=" + password
				+ ", mobileNumer=" + mobileNumer + ", email_id=" + email_id + ", gstn_no=" + gstn_no + ", approved_by="
				+ approved_by + ", created_dt=" + created_dt + ", updated_dt=" + updated_dt + ", userType=" + userType
				+ "]";
	}

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "updated_dt")
	@JsonProperty(value = "updated_dt")
	private Date updated_dt;

	@OneToOne(targetEntity = UserType.class)
	@JoinColumn(name = "type")
	@JsonProperty(value = "type")
	private UserType userType;

	public UserType getUserType() {
		return userType;
	}

	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public Date getCreated_dt() {
		return created_dt;
	}

	public void setCreated_dt(Date created_dt) {
		this.created_dt = created_dt;
	}

	public Date getUpdated_dt() {
		return updated_dt;
	}

	public void setUpdated_dt(Date updated_dt) {
		this.updated_dt = updated_dt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMobileNumer() {
		return mobileNumer;
	}

	public void setMobileNumer(String mobileNumer) {
		this.mobileNumer = mobileNumer;
	}

	public String getEmail_id() {
		return email_id;
	}

	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}

	public String getGstn_no() {
		return gstn_no;
	}

	public void setGstn_no(String gstn_no) {
		this.gstn_no = gstn_no;
	}

	public String getApproved_by() {
		return approved_by;
	}

	public void setApproved_by(String approved_by) {
		this.approved_by = approved_by;
	}

}