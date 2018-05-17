/**
 * 
 */
package com.truckking.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Karuppusamy
 * @version 1.0
 *
 */

@Entity // This tells Hibernate to make a table out of this class
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1425383660285233845L;

	@Column(name = "id")
	@JsonProperty(value = "id")
	private Long userName;

	@Column(name = "password")
	@JsonProperty(value = "password")
	private String password;

	@Column(name = "name")
	@JsonProperty(value = "name")
	private String name;

	@Column(name = "mobileNumer")
	@JsonProperty(value = "mobileNumer")
	private String mobileNumer;

	@Column(name = "email_id")
	@JsonProperty(value = "email_id")
	private String email_id;

	@Column(name = "gstn_no")
	@JsonProperty(value = "gstn_no")
	private String gstn_no;

	public Long getUserName() {
		return userName;
	}

	public void setUserName(Long userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + ", name=" + name + ", mobileNumer="
				+ mobileNumer + ", email_id=" + email_id + ", gstn_no=" + gstn_no + ", approved_by=" + approved_by
				+ "]";
	}

	@Column(name = "approved_by")
	@JsonProperty(value = "approved_by")
	private String approved_by;

}