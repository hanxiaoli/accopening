package jp.co.basenet.accopening.entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 * The primary key class for the access_info database table.
 * 
 */
@Embeddable
public class AccessInfoPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Basic(optional = false)
	@NotNull
	@Column(name = "session_id")
	private String sessionId;

	@Basic(optional = false)
	@NotNull
	@Column(name = "session_create_time")
	private long sessionCreateTime;

	public AccessInfoPK() {
	}

	public String getSessionId() {
		return this.sessionId;
	}

	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}

	public long getSessionCreateTime() {
		return this.sessionCreateTime;
	}

	public void setSessionCreateTime(long sessionCreateTime) {
		this.sessionCreateTime = sessionCreateTime;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof AccessInfoPK)) {
			return false;
		}
		AccessInfoPK castOther = (AccessInfoPK) other;
		return this.sessionId.equals(castOther.sessionId) && (this.sessionCreateTime == castOther.sessionCreateTime);
	}

}