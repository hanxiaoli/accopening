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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author base
 */
@Entity
@Table(name = "regulation_master")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RegulationMaster.findAll", query = "SELECT r FROM RegulationMaster r")
    , @NamedQuery(name = "RegulationMaster.findByRegulationId", query = "SELECT r FROM RegulationMaster r WHERE r.regulationMasterPK.regulationId = :regulationId")
    , @NamedQuery(name = "RegulationMaster.findByRegulationName", query = "SELECT r FROM RegulationMaster r WHERE r.regulationName = :regulationName")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel1No", query = "SELECT r FROM RegulationMaster r WHERE r.regulationMasterPK.itemLevel1No = :itemLevel1No")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel1Label", query = "SELECT r FROM RegulationMaster r WHERE r.itemLevel1Label = :itemLevel1Label")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel2No", query = "SELECT r FROM RegulationMaster r WHERE r.regulationMasterPK.itemLevel2No = :itemLevel2No")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel2Label", query = "SELECT r FROM RegulationMaster r WHERE r.itemLevel2Label = :itemLevel2Label")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel3No", query = "SELECT r FROM RegulationMaster r WHERE r.regulationMasterPK.itemLevel3No = :itemLevel3No")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel3Label", query = "SELECT r FROM RegulationMaster r WHERE r.itemLevel3Label = :itemLevel3Label")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel4No", query = "SELECT r FROM RegulationMaster r WHERE r.regulationMasterPK.itemLevel4No = :itemLevel4No")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel4Label", query = "SELECT r FROM RegulationMaster r WHERE r.itemLevel4Label = :itemLevel4Label")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel5No", query = "SELECT r FROM RegulationMaster r WHERE r.regulationMasterPK.itemLevel5No = :itemLevel5No")
    , @NamedQuery(name = "RegulationMaster.findByItem5Label", query = "SELECT r FROM RegulationMaster r WHERE r.item5Label = :item5Label")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel6No", query = "SELECT r FROM RegulationMaster r WHERE r.regulationMasterPK.itemLevel6No = :itemLevel6No")
    , @NamedQuery(name = "RegulationMaster.findByItemLevel6Label", query = "SELECT r FROM RegulationMaster r WHERE r.itemLevel6Label = :itemLevel6Label")
    , @NamedQuery(name = "RegulationMaster.findByRegulationCreateDate", query = "SELECT r FROM RegulationMaster r WHERE r.regulationCreateDate = :regulationCreateDate")
    , @NamedQuery(name = "RegulationMaster.findByRegulationUpdateDate", query = "SELECT r FROM RegulationMaster r WHERE r.regulationUpdateDate = :regulationUpdateDate")
    , @NamedQuery(name = "RegulationMaster.findByCreateTime", query = "SELECT r FROM RegulationMaster r WHERE r.createTime = :createTime")
    , @NamedQuery(name = "RegulationMaster.findByUpdateTime", query = "SELECT r FROM RegulationMaster r WHERE r.updateTime = :updateTime")})
public class RegulationMaster implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected RegulationMasterPK regulationMasterPK;
    @Size(max = 50)
    @Column(name = "regulation_name")
    private String regulationName;
    @Lob
    @Size(max = 65535)
    @Column(name = "summary")
    private String summary;
    @Size(max = 45)
    @Column(name = "item_level1_label")
    private String itemLevel1Label;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level1_text")
    private String itemLevel1Text;
    @Size(max = 45)
    @Column(name = "item_level2_label")
    private String itemLevel2Label;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level2_text")
    private String itemLevel2Text;
    @Size(max = 45)
    @Column(name = "item_level3_label")
    private String itemLevel3Label;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level3_text")
    private String itemLevel3Text;
    @Size(max = 45)
    @Column(name = "item_level4_label")
    private String itemLevel4Label;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level4_text")
    private String itemLevel4Text;
    @Size(max = 45)
    @Column(name = "item_5_label")
    private String item5Label;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_5_text")
    private String item5Text;
    @Size(max = 45)
    @Column(name = "item_level6_label")
    private String itemLevel6Label;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level6_text")
    private String itemLevel6Text;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level1_supplementary")
    private String itemLevel1Supplementary;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level2_supplementary")
    private String itemLevel2Supplementary;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level3_supplementary")
    private String itemLevel3Supplementary;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level4_supplementary")
    private String itemLevel4Supplementary;
    @Lob
    @Size(max = 65535)
    @Column(name = "item_level5_supplementary")
    private String itemLevel5Supplementary;
    @Column(name = "regulation_create_date")
    @Temporal(TemporalType.DATE)
    private Date regulationCreateDate;
    @Column(name = "regulation_update_date")
    @Temporal(TemporalType.DATE)
    private Date regulationUpdateDate;
    @Column(name = "create_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;
    @Column(name = "update_time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date updateTime;

    public RegulationMaster() {
    }

    public RegulationMaster(RegulationMasterPK regulationMasterPK) {
        this.regulationMasterPK = regulationMasterPK;
    }

    public RegulationMaster(String regulationId, int itemLevel1No, int itemLevel2No, int itemLevel3No, int itemLevel4No, int itemLevel5No, int itemLevel6No) {
        this.regulationMasterPK = new RegulationMasterPK(regulationId, itemLevel1No, itemLevel2No, itemLevel3No, itemLevel4No, itemLevel5No, itemLevel6No);
    }

    public RegulationMasterPK getRegulationMasterPK() {
        return regulationMasterPK;
    }

    public void setRegulationMasterPK(RegulationMasterPK regulationMasterPK) {
        this.regulationMasterPK = regulationMasterPK;
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

    public String getItemLevel1Label() {
        return itemLevel1Label;
    }

    public void setItemLevel1Label(String itemLevel1Label) {
        this.itemLevel1Label = itemLevel1Label;
    }

    public String getItemLevel1Text() {
        return itemLevel1Text;
    }

    public void setItemLevel1Text(String itemLevel1Text) {
        this.itemLevel1Text = itemLevel1Text;
    }

    public String getItemLevel2Label() {
        return itemLevel2Label;
    }

    public void setItemLevel2Label(String itemLevel2Label) {
        this.itemLevel2Label = itemLevel2Label;
    }

    public String getItemLevel2Text() {
        return itemLevel2Text;
    }

    public void setItemLevel2Text(String itemLevel2Text) {
        this.itemLevel2Text = itemLevel2Text;
    }

    public String getItemLevel3Label() {
        return itemLevel3Label;
    }

    public void setItemLevel3Label(String itemLevel3Label) {
        this.itemLevel3Label = itemLevel3Label;
    }

    public String getItemLevel3Text() {
        return itemLevel3Text;
    }

    public void setItemLevel3Text(String itemLevel3Text) {
        this.itemLevel3Text = itemLevel3Text;
    }

    public String getItemLevel4Label() {
        return itemLevel4Label;
    }

    public void setItemLevel4Label(String itemLevel4Label) {
        this.itemLevel4Label = itemLevel4Label;
    }

    public String getItemLevel4Text() {
        return itemLevel4Text;
    }

    public void setItemLevel4Text(String itemLevel4Text) {
        this.itemLevel4Text = itemLevel4Text;
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

    public String getItemLevel6Label() {
        return itemLevel6Label;
    }

    public void setItemLevel6Label(String itemLevel6Label) {
        this.itemLevel6Label = itemLevel6Label;
    }

    public String getItemLevel6Text() {
        return itemLevel6Text;
    }

    public void setItemLevel6Text(String itemLevel6Text) {
        this.itemLevel6Text = itemLevel6Text;
    }

    public String getItemLevel1Supplementary() {
        return itemLevel1Supplementary;
    }

    public void setItemLevel1Supplementary(String itemLevel1Supplementary) {
        this.itemLevel1Supplementary = itemLevel1Supplementary;
    }

    public String getItemLevel2Supplementary() {
        return itemLevel2Supplementary;
    }

    public void setItemLevel2Supplementary(String itemLevel2Supplementary) {
        this.itemLevel2Supplementary = itemLevel2Supplementary;
    }

    public String getItemLevel3Supplementary() {
        return itemLevel3Supplementary;
    }

    public void setItemLevel3Supplementary(String itemLevel3Supplementary) {
        this.itemLevel3Supplementary = itemLevel3Supplementary;
    }

    public String getItemLevel4Supplementary() {
        return itemLevel4Supplementary;
    }

    public void setItemLevel4Supplementary(String itemLevel4Supplementary) {
        this.itemLevel4Supplementary = itemLevel4Supplementary;
    }

    public String getItemLevel5Supplementary() {
        return itemLevel5Supplementary;
    }

    public void setItemLevel5Supplementary(String itemLevel5Supplementary) {
        this.itemLevel5Supplementary = itemLevel5Supplementary;
    }

    public Date getRegulationCreateDate() {
        return regulationCreateDate;
    }

    public void setRegulationCreateDate(Date regulationCreateDate) {
        this.regulationCreateDate = regulationCreateDate;
    }

    public Date getRegulationUpdateDate() {
        return regulationUpdateDate;
    }

    public void setRegulationUpdateDate(Date regulationUpdateDate) {
        this.regulationUpdateDate = regulationUpdateDate;
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
        hash += (regulationMasterPK != null ? regulationMasterPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegulationMaster)) {
            return false;
        }
        RegulationMaster other = (RegulationMaster) object;
        if ((this.regulationMasterPK == null && other.regulationMasterPK != null) || (this.regulationMasterPK != null && !this.regulationMasterPK.equals(other.regulationMasterPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jp.co.basenet.accopening.entity.RegulationMaster[ regulationMasterPK=" + regulationMasterPK + " ]";
    }
    
}
