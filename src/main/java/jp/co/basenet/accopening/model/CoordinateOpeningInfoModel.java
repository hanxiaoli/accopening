package jp.co.basenet.accopening.model;

import java.math.BigInteger;
import java.util.Date;

public class CoordinateOpeningInfoModel {
	
	private long number;

	private String name;

	private String address;

	private String sex;

	private Date birthday;

	private Date expiryDate;

	private BigInteger serialNumber1;

	private Short serialNumber2;

	/**
	 * @return the number
	 */
	public long getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(long number) {
		this.number = number;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex
	 *            the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @return the birthday
	 */
	public Date getBirthday() {
		return birthday;
	}

	/**
	 * @param birthday
	 *            the birthday to set
	 */
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	/**
	 * @return the expiryDate
	 */
	public Date getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate
	 *            the expiryDate to set
	 */
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the serialNumber1
	 */
	public BigInteger getSerialNumber1() {
		return serialNumber1;
	}

	/**
	 * @param serialNumber1
	 *            the serialNumber1 to set
	 */
	public void setSerialNumber1(BigInteger serialNumber1) {
		this.serialNumber1 = serialNumber1;
	}

	/**
	 * @return the serialNumber2
	 */
	public Short getSerialNumber2() {
		return serialNumber2;
	}

	/**
	 * @param serialNumber2
	 *            the serialNumber2 to set
	 */
	public void setSerialNumber2(Short serialNumber2) {
		this.serialNumber2 = serialNumber2;
	}

}
