/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jp.co.basenet.accopening.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author base
 */
@Embeddable
public class RegulationMasterPK implements Serializable {

    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(name = "regulation_id")
    private String regulationId;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_level1_no")
    private int itemLevel1No;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_level2_no")
    private int itemLevel2No;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_level3_no")
    private int itemLevel3No;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_level4_no")
    private int itemLevel4No;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_level5_no")
    private int itemLevel5No;
    @Basic(optional = false)
    @NotNull
    @Column(name = "item_level6_no")
    private int itemLevel6No;

    public RegulationMasterPK() {
    }

    public RegulationMasterPK(String regulationId, int itemLevel1No, int itemLevel2No, int itemLevel3No, int itemLevel4No, int itemLevel5No, int itemLevel6No) {
        this.regulationId = regulationId;
        this.itemLevel1No = itemLevel1No;
        this.itemLevel2No = itemLevel2No;
        this.itemLevel3No = itemLevel3No;
        this.itemLevel4No = itemLevel4No;
        this.itemLevel5No = itemLevel5No;
        this.itemLevel6No = itemLevel6No;
    }

    public String getRegulationId() {
        return regulationId;
    }

    public void setRegulationId(String regulationId) {
        this.regulationId = regulationId;
    }

    public int getItemLevel1No() {
        return itemLevel1No;
    }

    public void setItemLevel1No(int itemLevel1No) {
        this.itemLevel1No = itemLevel1No;
    }

    public int getItemLevel2No() {
        return itemLevel2No;
    }

    public void setItemLevel2No(int itemLevel2No) {
        this.itemLevel2No = itemLevel2No;
    }

    public int getItemLevel3No() {
        return itemLevel3No;
    }

    public void setItemLevel3No(int itemLevel3No) {
        this.itemLevel3No = itemLevel3No;
    }

    public int getItemLevel4No() {
        return itemLevel4No;
    }

    public void setItemLevel4No(int itemLevel4No) {
        this.itemLevel4No = itemLevel4No;
    }

    public int getItemLevel5No() {
        return itemLevel5No;
    }

    public void setItemLevel5No(int itemLevel5No) {
        this.itemLevel5No = itemLevel5No;
    }

    public int getItemLevel6No() {
        return itemLevel6No;
    }

    public void setItemLevel6No(int itemLevel6No) {
        this.itemLevel6No = itemLevel6No;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (regulationId != null ? regulationId.hashCode() : 0);
        hash += (int) itemLevel1No;
        hash += (int) itemLevel2No;
        hash += (int) itemLevel3No;
        hash += (int) itemLevel4No;
        hash += (int) itemLevel5No;
        hash += (int) itemLevel6No;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RegulationMasterPK)) {
            return false;
        }
        RegulationMasterPK other = (RegulationMasterPK) object;
        if ((this.regulationId == null && other.regulationId != null) || (this.regulationId != null && !this.regulationId.equals(other.regulationId))) {
            return false;
        }
        if (this.itemLevel1No != other.itemLevel1No) {
            return false;
        }
        if (this.itemLevel2No != other.itemLevel2No) {
            return false;
        }
        if (this.itemLevel3No != other.itemLevel3No) {
            return false;
        }
        if (this.itemLevel4No != other.itemLevel4No) {
            return false;
        }
        if (this.itemLevel5No != other.itemLevel5No) {
            return false;
        }
        if (this.itemLevel6No != other.itemLevel6No) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jp.co.basenet.accopening.entity.RegulationMasterPK[ regulationId=" + regulationId + ", itemLevel1No=" + itemLevel1No + ", itemLevel2No=" + itemLevel2No + ", itemLevel3No=" + itemLevel3No + ", itemLevel4No=" + itemLevel4No + ", itemLevel5No=" + itemLevel5No + ", itemLevel6No=" + itemLevel6No + " ]";
    }
    
}
