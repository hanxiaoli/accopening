/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.basenet.accopening.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 *
 * @author base
 */
@Entity
@Table(name = "access_info")
// @XmlRootElement
// @NamedQueries({
// @NamedQuery(name = "AccessInfo.findAll", query = "SELECT a FROM AccessInfo
// a")
// , @NamedQuery(name = "AccessInfo.findBySessionId", query = "SELECT a FROM
// AccessInfo a WHERE a.sessionId = :sessionId")
// , @NamedQuery(name = "AccessInfo.findBySessionCreateTime", query = "SELECT a
// FROM AccessInfo a WHERE a.sessionCreateTime = :sessionCreateTime")
// , @NamedQuery(name = "AccessInfo.findByUserAgent", query = "SELECT a FROM
// AccessInfo a WHERE a.userAgent = :userAgent")
// , @NamedQuery(name = "AccessInfo.findByIpAddress", query = "SELECT a FROM
// AccessInfo a WHERE a.ipAddress = :ipAddress")
// , @NamedQuery(name = "AccessInfo.findByLocale", query = "SELECT a FROM
// AccessInfo a WHERE a.locale = :locale")})
public class AccessInfo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@Column(name = "session_id")
	private String sessionId;
	@NotNull
	@Column(name = "session_create_time")
	private long sessionCreateTime;
	@NotNull
	@Column(name = "user_agent")
	private String userAgent;
	@NotNull
	@Column(name = "ip_address")
	private String ipAddress;
	@NotNull
	@Column(name = "locale")
	private String locale;

	public AccessInfo() {
	}

	public AccessInfo(String sessionId) {
		this.sessionId = sessionId;
	}

	public AccessInfo(String sessionId, long sessionCreateTime, String userAgent, String ipAddress, String locale) {
		this.sessionId = sessionId;
		this.sessionCreateTime = sessionCreateTime;
		this.userAgent = userAgent;
		this.ipAddress = ipAddress;
		this.locale = locale;
	}

	public String getSessionId() {
		return sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public long getSessionCreateTime() {
		return sessionCreateTime;
	}

	public void setSessionCreateTime(long sessionCreateTime) {
		this.sessionCreateTime = sessionCreateTime;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (sessionId != null ? sessionId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof AccessInfo)) {
			return false;
		}
		AccessInfo other = (AccessInfo) object;
		if ((this.sessionId == null && other.sessionId != null)
				|| (this.sessionId != null && !this.sessionId.equals(other.sessionId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "jp.co.basenet.accopening.entity.AccessInfo[ sessionId=" + sessionId + " ]";
	}

}
