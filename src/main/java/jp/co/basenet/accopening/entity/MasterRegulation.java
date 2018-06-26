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
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author base
 */
@Entity
@Table(name = "master_regulation")
// @XmlRootElement
// @NamedQueries({
// @NamedQuery(name = "MasterRegulation.findAll", query = "SELECT m FROM
// MasterRegulation m")
// , @NamedQuery(name = "MasterRegulation.findByRegulationId", query = "SELECT m
// FROM MasterRegulation m WHERE m.masterRegulationPK.regulationId =
// :regulationId")
// , @NamedQuery(name = "MasterRegulation.findByRegulationName", query = "SELECT
// m FROM MasterRegulation m WHERE m.regulationName = :regulationName")
// , @NamedQuery(name = "MasterRegulation.findByHasItem1", query = "SELECT m
// FROM MasterRegulation m WHERE m.masterRegulationPK.hasItem1 = :hasItem1")
// , @NamedQuery(name = "MasterRegulation.findByItem1Label", query = "SELECT m
// FROM MasterRegulation m WHERE m.item1Label = :item1Label")
// , @NamedQuery(name = "MasterRegulation.findByHasItem2", query = "SELECT m
// FROM MasterRegulation m WHERE m.masterRegulationPK.hasItem2 = :hasItem2")
// , @NamedQuery(name = "MasterRegulation.findByItem2Label", query = "SELECT m
// FROM MasterRegulation m WHERE m.item2Label = :item2Label")
// , @NamedQuery(name = "MasterRegulation.findByHasItem3", query = "SELECT m
// FROM MasterRegulation m WHERE m.masterRegulationPK.hasItem3 = :hasItem3")
// , @NamedQuery(name = "MasterRegulation.findByItem3Label", query = "SELECT m
// FROM MasterRegulation m WHERE m.item3Label = :item3Label")
// , @NamedQuery(name = "MasterRegulation.findByHasItem4", query = "SELECT m
// FROM MasterRegulation m WHERE m.masterRegulationPK.hasItem4 = :hasItem4")
// , @NamedQuery(name = "MasterRegulation.findByItem4Label", query = "SELECT m
// FROM MasterRegulation m WHERE m.item4Label = :item4Label")
// , @NamedQuery(name = "MasterRegulation.findByHasItem5", query = "SELECT m
// FROM MasterRegulation m WHERE m.masterRegulationPK.hasItem5 = :hasItem5")
// , @NamedQuery(name = "MasterRegulation.findByItem5Label", query = "SELECT m
// FROM MasterRegulation m WHERE m.item5Label = :item5Label")
// , @NamedQuery(name = "MasterRegulation.findByHasItem6", query = "SELECT m
// FROM MasterRegulation m WHERE m.masterRegulationPK.hasItem6 = :hasItem6")
// , @NamedQuery(name = "MasterRegulation.findByItem6Label", query = "SELECT m
// FROM MasterRegulation m WHERE m.item6Label = :item6Label")
// , @NamedQuery(name = "MasterRegulation.findByHasSupplementary1", query =
// "SELECT m FROM MasterRegulation m WHERE m.hasSupplementary1 =
// :hasSupplementary1")
// , @NamedQuery(name = "MasterRegulation.findByHasSupplementary2", query =
// "SELECT m FROM MasterRegulation m WHERE m.hasSupplementary2 =
// :hasSupplementary2")
// , @NamedQuery(name = "MasterRegulation.findByHasSupplementary3", query =
// "SELECT m FROM MasterRegulation m WHERE m.hasSupplementary3 =
// :hasSupplementary3")
// , @NamedQuery(name = "MasterRegulation.findByHasSupplementary4", query =
// "SELECT m FROM MasterRegulation m WHERE m.hasSupplementary4 =
// :hasSupplementary4")
// , @NamedQuery(name = "MasterRegulation.findByHasSupplementary5", query =
// "SELECT m FROM MasterRegulation m WHERE m.hasSupplementary5 =
// :hasSupplementary5")
// , @NamedQuery(name = "MasterRegulation.findByRegulationCreateDate", query =
// "SELECT m FROM MasterRegulation m WHERE m.regulationCreateDate =
// :regulationCreateDate")
// , @NamedQuery(name = "MasterRegulation.findByRegulationPreviousUpdateDate",
// query = "SELECT m FROM MasterRegulation m WHERE
// m.regulationPreviousUpdateDate = :regulationPreviousUpdateDate")
// , @NamedQuery(name = "MasterRegulation.findByCreateTime", query = "SELECT m
// FROM MasterRegulation m WHERE m.createTime = :createTime")
// , @NamedQuery(name = "MasterRegulation.findByUpdateTime", query = "SELECT m
// FROM MasterRegulation m WHERE m.updateTime = :updateTime")})
public class MasterRegulation implements Serializable {

	private static final long serialVersionUID = 1L;
	@EmbeddedId
	protected MasterRegulationPK masterRegulationPK;
	@Column(name = "regulation_name")
	private String regulationName;
	@Lob
	@Column(name = "summary")
	private String summary;
	@Column(name = "item_1_label")
	private String item1Label;
	@Lob
	@Column(name = "item_1_text")
	private String item1Text;
	@Column(name = "item_2_label")
	private String item2Label;
	@Lob
	@Column(name = "item_2_text")
	private String item2Text;
	@Column(name = "item_3_label")
	private String item3Label;
	@Lob
	@Column(name = "item_3_text")
	private String item3Text;
	@Column(name = "item_4_label")
	private String item4Label;
	@Lob
	@Column(name = "item_4_text")
	private String item4Text;
	@Column(name = "item_5_label")
	private String item5Label;
	@Lob
	@Column(name = "item_5_text")
	private String item5Text;
	@Column(name = "item_6_label")
	private String item6Label;
	@Lob
	@Column(name = "item_6_text")
	private String item6Text;
	@Column(name = "has_supplementary_1")
	private String hasSupplementary1;
	@Lob
	@Column(name = "supplementary_1_text")
	private String supplementary1Text;
	@Column(name = "has_supplementary_2")
	private String hasSupplementary2;
	@Lob
	@Column(name = "supplementary_2_text")
	private String supplementary2Text;
	@Column(name = "has_supplementary_3")
	private String hasSupplementary3;
	@Lob
	@Column(name = "supplementary_3_text")
	private String supplementary3Text;
	@Column(name = "has_supplementary_4")
	private String hasSupplementary4;
	@Lob
	@Column(name = "supplementary_4_text")
	private String supplementary4Text;
	@Column(name = "has_supplementary_5")
	private String hasSupplementary5;
	@Lob
	@Column(name = "supplementary_5_text")
	private String supplementary5Text;
	@Column(name = "regulation_create_date")
	@Temporal(TemporalType.DATE)
	private Date regulationCreateDate;
	@Column(name = "regulation_previous_update_date")
	@Temporal(TemporalType.DATE)
	private Date regulationPreviousUpdateDate;
	@Column(name = "create_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;
	@Column(name = "update_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;

	public MasterRegulation() {
	}

	public MasterRegulation(MasterRegulationPK masterRegulationPK) {
		this.masterRegulationPK = masterRegulationPK;
	}

	public MasterRegulation(String regulationId, short hasItem1, short hasItem2, short hasItem3, short hasItem4,
			short hasItem5, short hasItem6) {
		this.masterRegulationPK = new MasterRegulationPK(regulationId, hasItem1, hasItem2, hasItem3, hasItem4, hasItem5,
				hasItem6);
	}

	public MasterRegulationPK getMasterRegulationPK() {
		return masterRegulationPK;
	}

	public void setMasterRegulationPK(MasterRegulationPK masterRegulationPK) {
		this.masterRegulationPK = masterRegulationPK;
	}

	public String getRegulationName() {
		return regulationName;
	}

	public void setRegulationName(String regulationName) {
		this.regulationName = regulationName;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getItem1Label() {
		return item1Label;
	}

	public void setItem1Label(String item1Label) {
		this.item1Label = item1Label;
	}

	public String getItem1Text() {
		return item1Text;
	}

	public void setItem1Text(String item1Text) {
		this.item1Text = item1Text;
	}

	public String getItem2Label() {
		return item2Label;
	}

	public void setItem2Label(String item2Label) {
		this.item2Label = item2Label;
	}

	public String getItem2Text() {
		return item2Text;
	}

	public void setItem2Text(String item2Text) {
		this.item2Text = item2Text;
	}

	public String getItem3Label() {
		return item3Label;
	}

	public void setItem3Label(String item3Label) {
		this.item3Label = item3Label;
	}

	public String getItem3Text() {
		return item3Text;
	}

	public void setItem3Text(String item3Text) {
		this.item3Text = item3Text;
	}

	public String getItem4Label() {
		return item4Label;
	}

	public void setItem4Label(String item4Label) {
		this.item4Label = item4Label;
	}

	public String getItem4Text() {
		return item4Text;
	}

	public void setItem4Text(String item4Text) {
		this.item4Text = item4Text;
	}

	public String getItem5Label() {
		return item5Label;
	}

	public void setItem5Label(String item5Label) {
		this.item5Label = item5Label;
	}

	public String getItem5Text() {
		return item5Text;
	}

	public void setItem5Text(String item5Text) {
		this.item5Text = item5Text;
	}

	public String getItem6Label() {
		return item6Label;
	}

	public void setItem6Label(String item6Label) {
		this.item6Label = item6Label;
	}

	public String getItem6Text() {
		return item6Text;
	}

	public void setItem6Text(String item6Text) {
		this.item6Text = item6Text;
	}

	public String getHasSupplementary1() {
		return hasSupplementary1;
	}

	public void setHasSupplementary1(String hasSupplementary1) {
		this.hasSupplementary1 = hasSupplementary1;
	}

	public String getSupplementary1Text() {
		return supplementary1Text;
	}

	public void setSupplementary1Text(String supplementary1Text) {
		this.supplementary1Text = supplementary1Text;
	}

	public String getHasSupplementary2() {
		return hasSupplementary2;
	}

	public void setHasSupplementary2(String hasSupplementary2) {
		this.hasSupplementary2 = hasSupplementary2;
	}

	public String getSupplementary2Text() {
		return supplementary2Text;
	}

	public void setSupplementary2Text(String supplementary2Text) {
		this.supplementary2Text = supplementary2Text;
	}

	public String getHasSupplementary3() {
		return hasSupplementary3;
	}

	public void setHasSupplementary3(String hasSupplementary3) {
		this.hasSupplementary3 = hasSupplementary3;
	}

	public String getSupplementary3Text() {
		return supplementary3Text;
	}

	public void setSupplementary3Text(String supplementary3Text) {
		this.supplementary3Text = supplementary3Text;
	}

	public String getHasSupplementary4() {
		return hasSupplementary4;
	}

	public void setHasSupplementary4(String hasSupplementary4) {
		this.hasSupplementary4 = hasSupplementary4;
	}

	public String getSupplementary4Text() {
		return supplementary4Text;
	}

	public void setSupplementary4Text(String supplementary4Text) {
		this.supplementary4Text = supplementary4Text;
	}

	public String getHasSupplementary5() {
		return hasSupplementary5;
	}

	public void setHasSupplementary5(String hasSupplementary5) {
		this.hasSupplementary5 = hasSupplementary5;
	}

	public String getSupplementary5Text() {
		return supplementary5Text;
	}

	public void setSupplementary5Text(String supplementary5Text) {
		this.supplementary5Text = supplementary5Text;
	}

	public Date getRegulationCreateDate() {
		return regulationCreateDate;
	}

	public void setRegulationCreateDate(Date regulationCreateDate) {
		this.regulationCreateDate = regulationCreateDate;
	}

	public Date getRegulationPreviousUpdateDate() {
		return regulationPreviousUpdateDate;
	}

	public void setRegulationPreviousUpdateDate(Date regulationPreviousUpdateDate) {
		this.regulationPreviousUpdateDate = regulationPreviousUpdateDate;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (masterRegulationPK != null ? masterRegulationPK.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof MasterRegulation)) {
			return false;
		}
		MasterRegulation other = (MasterRegulation) object;
		if ((this.masterRegulationPK == null && other.masterRegulationPK != null)
				|| (this.masterRegulationPK != null && !this.masterRegulationPK.equals(other.masterRegulationPK))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "jp.co.basenet.accopening.entity.MasterRegulation[ masterRegulationPK=" + masterRegulationPK + " ]";
	}

}
