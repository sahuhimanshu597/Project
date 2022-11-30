package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "addresses")
@Getter
@Setter
@NoArgsConstructor
public class Address extends BaseEntity{
	@Column(name="address_line_1",length = 45)
	private String addressLine1;
	@Column(name="address_line_2",length = 45)
	private String addressLine2;
	@Column(length = 30)
	private String city;
	@Column(length = 10)
	private String pinCode;
	@Column(length = 30)
	private String state;
	@Column(length = 30)
	private String country;
	
	// Bidirectional Association
	@ManyToOne(fetch = FetchType.LAZY)		
	@JoinColumn(name = "user_id",nullable = false)	
	@JsonIgnore
	private User selectedUser;
	
	@Override
	public String toString() {
		return "Address [ID=" + getId() + ",addressLine1=" + addressLine1 + ", addressLine2=" + addressLine2 + ", city=" + city
				+ ", pinCode=" + pinCode + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
