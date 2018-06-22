/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.basenet.accopening.entity;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

/**
 *
 * @author base
 */
@Entity
@Table(name = "mynumber")
// @XmlRootElement
@NamedQueries({ @NamedQuery(name = "Mynumber.findAll", query = "SELECT m FROM Mynumber m"),
//		@NamedQuery(name = "Mynumber.findByNumber", query = "SELECT m FROM Mynumber m WHERE m.number = :number"),
//		@NamedQuery(name = "Mynumber.findByName", query = "SELECT m FROM Mynumber m WHERE m.name = :name"),
//		@NamedQuery(name = "Mynumber.findByAddress", query = "SELECT m FROM Mynumber m WHERE m.address = :address"),
//		@NamedQuery(name = "Mynumber.findBySex", query = "SELECT m FROM Mynumber m WHERE m.sex = :sex"),
//		@NamedQuery(name = "Mynumber.findByBirthday", query = "SELECT m FROM Mynumber m WHERE m.birthday = :birthday"),
//		@NamedQuery(name = "Mynumber.findByExpiryDate", query = "SELECT m FROM Mynumber m WHERE m.expiryDate = :expiryDate"),
//		@NamedQuery(name = "Mynumber.findBySerialNumber1", query = "SELECT m FROM Mynumber m WHERE m.serialNumber1 = :serialNumber1"),
//		@NamedQuery(name = "Mynumber.findBySerialNumber2", query = "SELECT m FROM Mynumber m WHERE m.serialNumber2 = :serialNumber2") 
})
public class Mynumber implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@Column(name = "number")
	private Long number;
	@NotNull
	@Column(name = "name")
	private String name;
	@NotNull
	@Column(name = "address")
	private String address;
	@NotNull
	@Column(name = "sex")
	private short sex;
	@NotNull
	@Column(name = "birthday")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	@NotNull
	@Column(name = "expiry_date")
	@Temporal(TemporalType.DATE)
	private Date expiryDate;
	@Column(name = "serial_number_1")
	private BigInteger serialNumber1;
	@Column(name = "serial_number_2")
	private Short serialNumber2;

	public Mynumber() {
	}

	public Mynumber(Long number) {
		this.number = number;
	}

	public Mynumber(Long number, String name, String address, short sex, Date birthday, Date expiryDate) {
		this.number = number;
		this.name = name;
		this.address = address;
		this.sex = sex;
		this.birthday = birthday;
		this.expiryDate = expiryDate;
	}

	public Long getNumber() {
		return number;
	}

	public void setNumber(Long number) {
		this.number = number;
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

	public short getSex() {
		return sex;
	}

	public void setSex(short sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public BigInteger getSerialNumber1() {
		return serialNumber1;
	}

	public void setSerialNumber1(BigInteger serialNumber1) {
		this.serialNumber1 = serialNumber1;
	}

	public Short getSerialNumber2() {
		return serialNumber2;
	}

	public void setSerialNumber2(Short serialNumber2) {
		this.serialNumber2 = serialNumber2;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (number != null ? number.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Mynumber)) {
			return false;
		}
		Mynumber other = (Mynumber) object;
		if ((this.number == null && other.number != null)
				|| (this.number != null && !this.number.equals(other.number))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "jp.co.basenet.accopening.entity.Mynumber[ number=" + number + " ]";
	}

}
