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

/**
 *
 * @author base
 */
@Embeddable
public class MasterRegulationPK implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@NotNull
	@Column(name = "regulation_id")
	private String regulationId;
	@NotNull
	@Column(name = "has_item_1")
	private short hasItem1;
	@NotNull
	@Column(name = "has_item_2")
	private short hasItem2;
	@NotNull
	@Column(name = "has_item_3")
	private short hasItem3;
	@NotNull
	@Column(name = "has_item_4")
	private short hasItem4;
	@NotNull
	@Column(name = "has_item_5")
	private short hasItem5;
	@NotNull
	@Column(name = "has_item_6")
	private short hasItem6;

	public MasterRegulationPK() {
	}

	public MasterRegulationPK(String regulationId, short hasItem1, short hasItem2, short hasItem3, short hasItem4,
			short hasItem5, short hasItem6) {
		this.regulationId = regulationId;
		this.hasItem1 = hasItem1;
		this.hasItem2 = hasItem2;
		this.hasItem3 = hasItem3;
		this.hasItem4 = hasItem4;
		this.hasItem5 = hasItem5;
		this.hasItem6 = hasItem6;
	}

	public String getRegulationId() {
		return regulationId;
	}

	public void setRegulationId(String regulationId) {
		this.regulationId = regulationId;
	}

	public short getHasItem1() {
		return hasItem1;
	}

	public void setHasItem1(short hasItem1) {
		this.hasItem1 = hasItem1;
	}

	public short getHasItem2() {
		return hasItem2;
	}

	public void setHasItem2(short hasItem2) {
		this.hasItem2 = hasItem2;
	}

	public short getHasItem3() {
		return hasItem3;
	}

	public void setHasItem3(short hasItem3) {
		this.hasItem3 = hasItem3;
	}

	public short getHasItem4() {
		return hasItem4;
	}

	public void setHasItem4(short hasItem4) {
		this.hasItem4 = hasItem4;
	}

	public short getHasItem5() {
		return hasItem5;
	}

	public void setHasItem5(short hasItem5) {
		this.hasItem5 = hasItem5;
	}

	public short getHasItem6() {
		return hasItem6;
	}

	public void setHasItem6(short hasItem6) {
		this.hasItem6 = hasItem6;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (regulationId != null ? regulationId.hashCode() : 0);
		hash += (int) hasItem1;
		hash += (int) hasItem2;
		hash += (int) hasItem3;
		hash += (int) hasItem4;
		hash += (int) hasItem5;
		hash += (int) hasItem6;
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof MasterRegulationPK)) {
			return false;
		}
		MasterRegulationPK other = (MasterRegulationPK) object;
		if ((this.regulationId == null && other.regulationId != null)
				|| (this.regulationId != null && !this.regulationId.equals(other.regulationId))) {
			return false;
		}
		if (this.hasItem1 != other.hasItem1) {
			return false;
		}
		if (this.hasItem2 != other.hasItem2) {
			return false;
		}
		if (this.hasItem3 != other.hasItem3) {
			return false;
		}
		if (this.hasItem4 != other.hasItem4) {
			return false;
		}
		if (this.hasItem5 != other.hasItem5) {
			return false;
		}
		if (this.hasItem6 != other.hasItem6) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "jp.co.basenet.accopening.entity.MasterRegulationPK[ regulationId=" + regulationId + ", hasItem1="
				+ hasItem1 + ", hasItem2=" + hasItem2 + ", hasItem3=" + hasItem3 + ", hasItem4=" + hasItem4
				+ ", hasItem5=" + hasItem5 + ", hasItem6=" + hasItem6 + " ]";
	}

}
