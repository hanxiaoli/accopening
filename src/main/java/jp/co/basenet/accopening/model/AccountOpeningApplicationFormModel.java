package jp.co.basenet.accopening.model;

import java.util.Date;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

@Component
@SessionScope
public class AccountOpeningApplicationFormModel {

	private boolean regulationsAgreed;

	// used by system developer
	private String sessionId;

	private String personalIdentityNumber;

	private String name;

	private String sex;

	private String address;

	private Date birthday;

	private Date expiryDate;

	private String personalIdentityType;

	private String accountType;

	/**
	 * @return the regulationsAgreed
	 */
	public boolean isRegulationsAgreed() {
		return regulationsAgreed;
	}

	/**
	 * @param regulationsAgreed
	 *            the regulationsAgreed to set
	 */
	public void setRegulationsAgreed(boolean regulationsAgreed) {
		this.regulationsAgreed = regulationsAgreed;
	}

	/**
	 * @return the sessionId
	 */
	public String getSessionId() {
		return sessionId;
	}

	/**
	 * @param sessionId
	 *            the sessionId to set
	 */
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	/**
	 * @return the personalIdentityNumber
	 */
	public String getPersonalIdentityNumber() {
		return personalIdentityNumber;
	}

	/**
	 * @param personalIdentityNumber
	 *            the personalIdentityNumber to set
	 */
	public void setPersonalIdentityNumber(String personalIdentityNumber) {
		this.personalIdentityNumber = personalIdentityNumber;
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
	 * @return the personalIdentityType
	 */
	public String getPersonalIdentityType() {
		return personalIdentityType;
	}

	/**
	 * @param personalIdentityType
	 *            the personalIdentityType to set
	 */
	public void setPersonalIdentityType(String personalIdentityType) {
		this.personalIdentityType = personalIdentityType;
	}

	/**
	 * @return the accountType
	 */
	public String getAccountType() {
		return accountType;
	}

	/**
	 * @param accountType
	 *            the accountType to set
	 */
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

}
