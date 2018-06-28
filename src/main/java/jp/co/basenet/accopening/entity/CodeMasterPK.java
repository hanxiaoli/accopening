/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.basenet.accopening.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author base
 */
@Embeddable
public class CodeMasterPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Size(min = 1, max = 8)
	@Column(name = "code_id")
	private String codeId;

	@NotNull
	@Size(min = 1, max = 8)
	@Column(name = "item_id")
	private String itemId;

	public CodeMasterPK() {
	}

	public CodeMasterPK(String codeId, String itemId) {
		this.codeId = codeId;
		this.itemId = itemId;
	}

	public String getCodeId() {
		return codeId;
	}

	public void setCodeId(String codeId) {
		this.codeId = codeId;
	}

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (codeId != null ? codeId.hashCode() : 0);
		hash += (itemId != null ? itemId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof CodeMasterPK)) {
			return false;
		}
		CodeMasterPK other = (CodeMasterPK) object;
		if ((this.codeId == null && other.codeId != null)
				|| (this.codeId != null && !this.codeId.equals(other.codeId))) {
			return false;
		}
		if ((this.itemId == null && other.itemId != null)
				|| (this.itemId != null && !this.itemId.equals(other.itemId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "jp.co.basenet.accopening.entity.CodeMasterPK[ codeId=" + codeId + ", itemId=" + itemId + " ]";
	}

}
