/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.basenet.accopening.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "code_master")
// @XmlRootElement
// @NamedQueries({
// @NamedQuery(name = "CodeMaster.findAll", query = "SELECT c FROM CodeMaster
// c")
// , @NamedQuery(name = "CodeMaster.findByCodeId", query = "SELECT c FROM
// CodeMaster c WHERE c.codeMasterPK.codeId = :codeId")
// , @NamedQuery(name = "CodeMaster.findByCodeLabel", query = "SELECT c FROM
// CodeMaster c WHERE c.codeLabel = :codeLabel")
// , @NamedQuery(name = "CodeMaster.findByItemId", query = "SELECT c FROM
// CodeMaster c WHERE c.codeMasterPK.itemId = :itemId")
// , @NamedQuery(name = "CodeMaster.findByItemLabel", query = "SELECT c FROM
// CodeMaster c WHERE c.itemLabel = :itemLabel")
// , @NamedQuery(name = "CodeMaster.findByUpdateTime", query = "SELECT c FROM
// CodeMaster c WHERE c.updateTime = :updateTime")
// , @NamedQuery(name = "CodeMaster.findByUpdateUser", query = "SELECT c FROM
// CodeMaster c WHERE c.updateUser = :updateUser")
// , @NamedQuery(name = "CodeMaster.findByCreationTime", query = "SELECT c FROM
// CodeMaster c WHERE c.creationTime = :creationTime")
// , @NamedQuery(name = "CodeMaster.findByCreationUser", query = "SELECT c FROM
// CodeMaster c WHERE c.creationUser = :creationUser")})
public class CodeMaster implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected CodeMasterPK codeMasterPK;
	@Size(max = 45)
	@Column(name = "code_label")
	private String codeLabel;
	@Size(max = 45)
	@Column(name = "item_label")
	private String itemLabel;

	@NotNull
	@Column(name = "update_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;

	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "update_user")
	private String updateUser;

	@NotNull
	@Column(name = "creation_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date creationTime;

	@NotNull
	@Size(min = 1, max = 45)
	@Column(name = "creation_user")
	private String creationUser;

	public CodeMaster() {
	}

	public CodeMaster(CodeMasterPK codeMasterPK) {
		this.codeMasterPK = codeMasterPK;
	}

	public CodeMaster(CodeMasterPK codeMasterPK, Date updateTime, String updateUser, Date creationTime,
			String creationUser) {
		this.codeMasterPK = codeMasterPK;
		this.updateTime = updateTime;
		this.updateUser = updateUser;
		this.creationTime = creationTime;
		this.creationUser = creationUser;
	}

	public CodeMaster(String codeId, String itemId) {
		this.codeMasterPK = new CodeMasterPK(codeId, itemId);
	}

	public CodeMasterPK getCodeMasterPK() {
		return codeMasterPK;
	}

	public void setCodeMasterPK(CodeMasterPK codeMasterPK) {
		this.codeMasterPK = codeMasterPK;
	}

	public String getCodeLabel() {
		return codeLabel;
	}

	public void setCodeLabel(String codeLabel) {
		this.codeLabel = codeLabel;
	}

	public String getItemLabel() {
		return itemLabel;
	}

	public void setItemLabel(String itemLabel) {
		this.itemLabel = itemLabel;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdateUser() {
		return updateUser;
	}

	public void setUpdateUser(String updateUser) {
		this.updateUser = updateUser;
	}

	public Date getCreationTime() {
		return creationTime;
	}

	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}

	public String getCreationUser() {
		return creationUser;
	}

	public void setCreationUser(String creationUser) {
		this.creationUser = creationUser;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codeMasterPK != null ? codeMasterPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CodeMaster)) {
			return false;
		}
		CodeMaster other = (CodeMaster) object;
		if ((this.codeMasterPK == null && other.codeMasterPK != null)
				|| (this.codeMasterPK != null && !this.codeMasterPK.equals(other.codeMasterPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "jp.co.basenet.accopening.entity.CodeMaster[ codeMasterPK=" + codeMasterPK + " ]";
	}

}
