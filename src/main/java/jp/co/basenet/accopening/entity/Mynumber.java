/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.basenet.accopening.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author base
 */
@Entity
@Table(name = "mynumber")
// @XmlRootElement
// @NamedQueries({
// @NamedQuery(name = "Mynumber.findAll", query = "SELECT m FROM Mynumber m")
// , @NamedQuery(name = "Mynumber.findByIdentityNumber", query = "SELECT m FROM
// Mynumber m WHERE m.identityNumber = :identityNumber")
// , @NamedQuery(name = "Mynumber.findByName", query = "SELECT m FROM Mynumber m
// WHERE m.name = :name")
// , @NamedQuery(name = "Mynumber.findByAddress", query = "SELECT m FROM
// Mynumber m WHERE m.address = :address")
// , @NamedQuery(name = "Mynumber.findBySex", query = "SELECT m FROM Mynumber m
// WHERE m.sex = :sex")
// , @NamedQuery(name = "Mynumber.findByBirthday", query = "SELECT m FROM
// Mynumber m WHERE m.birthday = :birthday")
// , @NamedQuery(name = "Mynumber.findByExpiryDate", query = "SELECT m FROM
// Mynumber m WHERE m.expiryDate = :expiryDate")
// , @NamedQuery(name = "Mynumber.findByIdentityType", query = "SELECT m FROM
// Mynumber m WHERE m.identityType = :identityType")
// , @NamedQuery(name = "Mynumber.findBySerialNumber1", query = "SELECT m FROM
// Mynumber m WHERE m.serialNumber1 = :serialNumber1")
// , @NamedQuery(name = "Mynumber.findBySerialNumber2", query = "SELECT m FROM
// Mynumber m WHERE m.serialNumber2 = :serialNumber2")})
public class Mynumber implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "identity_number")
    private String identityNumber;
    
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "name")
    private String name;
    
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "address")
    private String address;
    
    @NotNull
    @Column(name = "sex")
    private Character sex;
    
    @NotNull
    @Column(name = "birthday")
    @Temporal(TemporalType.DATE)
    private Date birthday;
    
    @NotNull
    @Column(name = "expiry_date")
    @Temporal(TemporalType.DATE)
    private Date expiryDate;
    @Column(name = "identity_type")
    private Character identityType;
    @Size(max = 16)
    @Column(name = "serial_number1")
    private String serialNumber1;
    @Size(max = 4)
    @Column(name = "serial_number2")
    private String serialNumber2;

    public Mynumber() {
    }

    public Mynumber(String identityNumber) {
        this.identityNumber = identityNumber;
    }

    public Mynumber(String identityNumber, String name, String address, Character sex, Date birthday, Date expiryDate) {
        this.identityNumber = identityNumber;
        this.name = name;
        this.address = address;
        this.sex = sex;
        this.birthday = birthday;
        this.expiryDate = expiryDate;
    }

    public String getIdentityNumber() {
        return identityNumber;
    }

    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
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

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
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

    public Character getIdentityType() {
        return identityType;
    }

    public void setIdentityType(Character identityType) {
        this.identityType = identityType;
    }

    public String getSerialNumber1() {
        return serialNumber1;
    }

    public void setSerialNumber1(String serialNumber1) {
        this.serialNumber1 = serialNumber1;
    }

    public String getSerialNumber2() {
        return serialNumber2;
    }

    public void setSerialNumber2(String serialNumber2) {
        this.serialNumber2 = serialNumber2;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (identityNumber != null ? identityNumber.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mynumber)) {
            return false;
        }
        Mynumber other = (Mynumber) object;
        if ((this.identityNumber == null && other.identityNumber != null) || (this.identityNumber != null && !this.identityNumber.equals(other.identityNumber))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jp.co.basenet.accopening.entity.Mynumber[ identityNumber=" + identityNumber + " ]";
    }
    
}
