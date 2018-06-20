package jp.co.basenet.accopening.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * The persistent class for the access_Info database table.
 * 
 */
@Entity
@Table(name = "access_info")
// @NamedQueries({ @NamedQuery(name = "AccessInfo.findAll", query = "SELECT a
// FROM AccessInfo a"),
// @NamedQuery(name = "AccessInfo.findBySessionId", query = "SELECT a FROM
// AccessInfo a WHERE a.id.sessionId = :sessionId"),
// @NamedQuery(name = "AccessInfo.findBySessionCreateTime", query = "SELECT a
// FROM AccessInfo a WHERE a.id.sessionCreateTime = :sessionCreateTime"),
// @NamedQuery(name = "AccessInfo.findByUserAgent", query = "SELECT a FROM
// AccessInfo a WHERE a.userAgent = :userAgent"),
// @NamedQuery(name = "AccessInfo.findByIpAddress", query = "SELECT a FROM
// AccessInfo a WHERE a.ipAddress = :ipAddress"),
// @NamedQuery(name = "AccessInfo.findByLocale", query = "SELECT a FROM
// AccessInfo a WHERE a.locale = :locale") })
public class AccessInfo implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private AccessInfoPK id;

	@Basic(optional = false)
	@NotNull
	@Column(name = "ip_address")
	private String ipAddress;

	@Basic(optional = false)
	@NotNull
	private String locale;

	@Basic(optional = false)
	@NotNull
	@Column(name = "user_agent")
	private String userAgent;

	public AccessInfo() {
	}

	public AccessInfoPK getId() {
		return this.id;
	}

	public void setId(AccessInfoPK id) {
		this.id = id;
	}

	public String getIpAddress() {
		return this.ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getLocale() {
		return this.locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getUserAgent() {
		return this.userAgent;
	}

	public void setUserAgent(String userAgent) {
		this.userAgent = userAgent;
	}

	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof AccessInfo)) {
			return false;
		}
		AccessInfo other = (AccessInfo) object;
		if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

}