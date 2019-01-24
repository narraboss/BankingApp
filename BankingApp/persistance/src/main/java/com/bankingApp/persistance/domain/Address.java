/**
 * 
 */
package com.bankingApp.persistance.domain;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.bankingApp.persistance.domain.constants.AddressType;

import lombok.Data;

/**
 * @author vijayendrakantipudi
 *
 */
@EntityListeners(AuditingEntityListener.class)
@Entity(name = "address")
@Data
public class Address extends Auditable implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5191001425670396020L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id")
	private String id;

	@Column(name = "building_num", nullable = false)
	private String buildingNum;

	@Column(name = "street", nullable = false)
	private String street;

	@Column(name = "city", nullable = false)
	private String city;

	@Column(name = "state", nullable = false)
	private String state;

	@Column(name = "country", nullable = false)
	private String Country;

	@Column(name = "zipcode", nullable = false, length = 5)
	private String zipCode; // todo restrict to 5 digits

	@Enumerated(EnumType.STRING)
	@Column(name = "address_type", nullable = false)
	private AddressType addressType;

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the buildingNum
	 */
	public String getBuildingNum() {
		return buildingNum;
	}

	/**
	 * @param buildingNum
	 *            the buildingNum to set
	 */
	public void setBuildingNum(String buildingNum) {
		this.buildingNum = buildingNum;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street
	 *            the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city
	 *            the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return Country;
	}

	/**
	 * @param country
	 *            the country to set
	 */
	public void setCountry(String country) {
		Country = country;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the addressType
	 */
	public AddressType getAddressType() {
		return addressType;
	}

	/**
	 * @param addressType
	 *            the addressType to set
	 */
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

}
