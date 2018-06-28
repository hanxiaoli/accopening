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
@Table(name = "user_session")
// @XmlRootElement
// @NamedQueries({
// @NamedQuery(name = "UserSession.findAll", query = "SELECT u FROM UserSession
// u")
// , @NamedQuery(name = "UserSession.findById", query = "SELECT u FROM
// UserSession u WHERE u.id = :id")
// , @NamedQuery(name = "UserSession.findByCreationTime", query = "SELECT u FROM
// UserSession u WHERE u.creationTime = :creationTime")
// , @NamedQuery(name = "UserSession.findByUserAgent", query = "SELECT u FROM
// UserSession u WHERE u.userAgent = :userAgent")
// , @NamedQuery(name = "UserSession.findByRemoteAddr", query = "SELECT u FROM
// UserSession u WHERE u.remoteAddr = :remoteAddr")
// , @NamedQuery(name = "UserSession.findByLocale", query = "SELECT u FROM
// UserSession u WHERE u.locale = :locale")})
public class UserSession implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	@NotNull
	@Column(name = "id")
	private String id;

	@NotNull
	@Column(name = "creation_time")
	private long creationTime;

	@NotNull
	@Column(name = "user_agent")
	private String userAgent;

	@NotNull
	@Column(name = "remote_addr")
	private String remoteAddr;

	@NotNull
	@Column(name = "locale")
	private String locale;

	public UserSession() {
	}

	public UserSession(String id) {
		this.id = id;
	}

	public UserSession(String id, long creationTime, String userAgent, String remoteAddr, String locale) {
		this.id = id;
		this.creationTime = creationTime;
		this.userAgent = userAgent;
		this.remoteAddr = remoteAddr;
		this.locale = locale;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(long creationTime) {
		this.creationTime = creationTime;
	}

	public String getUserAgent() {
		return userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public String getRemoteAddr() {
		return remoteAddr;
	}

	public void setRemoteAddr(String remoteAddr) {
		this.remoteAddr = remoteAddr;
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
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof UserSession)) {
			return false;
		}
		UserSession other = (UserSession) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "jp.co.basenet.accopening.entity.UserSession[ id=" + id + " ]";
	}

}
