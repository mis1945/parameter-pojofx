/**
 * @author  Michael Cuison
 */
package org.rmj.parameter.pojofx;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.stream.Stream;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.rmj.appdriver.constants.RecordStatus;;
import org.rmj.appdriver.iface.GEntity;

@Entity
@Table(name="EDocSys_Module")

public class UnitModel implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sModelCde")
    private String sModelCde;
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
    @Column(name = "sBriefDsc")
    private String sBriefDsc;
    @Column(name = "sModelNme")
    private String sModelNme;
    @Column(name = "sDescript")
    private String sDescript;
    @Column(name = "sBrandCde")
    private String sBrandCde;
    @Column(name = "sCategrCd")
    private String sCategrCd;
    @Column(name = "cEndOfLfe")
    private String cEndOfLfe;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitModel(){
        this.sModelCde = "";
        this.sInvTypCd = "";
        this.sBriefDsc = "";
        this.sModelNme = "";
        this.sDescript = "";
        this.sBrandCde = "";
        this.sCategrCd = "";
        this.cEndOfLfe = "0";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sModelCde");
        laColumns.add("sInvTypCd");
        laColumns.add("sBriefDsc");
        laColumns.add("sModelNme");
        laColumns.add("sDescript");
        laColumns.add("sBrandCde");
        laColumns.add("sCategrCd");
        laColumns.add("cEndOfLfe");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setModelCode(String sModelCde){
        this.sModelCde = sModelCde;
    }
    public String getModelCode(){
        return sModelCde;
    }
    
    public void setInvTypeCode(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypeCode(){
        return sInvTypCd;
    }
    
    public void setBriefDescript(String sBriefDsc){
        this.sBriefDsc = sBriefDsc;
    }
    public String getBriefDescript(){
        return sBriefDsc;
    }
    
    public void setModelName(String sModelNme){
        this.sModelNme = sModelNme;
    }
    public String getModelName(){
        return sModelNme;
    }
    
    public void setDescription(String sDescript){
        this.sDescript = sDescript;
    }
    public String getDescription(){
        return sDescript;
    }
    
    public void setBrandCode(String sBrandCde){
        this.sBrandCde = sBrandCde;
    }
    public String getBrandCode(){
        return sBrandCde;
    }
    
    public void setCategoryCode(String sCategrCd){
        this.sCategrCd = sCategrCd;
    }
    public String getCategoryCode(){
        return sCategrCd;
    }
    
    public void setIsEndofLife(String cEndOfLfe){
        this.cEndOfLfe = cEndOfLfe;
    }
    public String getIsEndofLife(){
        return cEndOfLfe;
    }
    public void setRecordStat(String cRecdStat){
        this.cRecdStat = cRecdStat;
    }
    public String getRecordStat(){
        return cRecdStat;
    }
    
    public void setModifiedBy(String sModified){
        this.sModified = sModified;
    }
    public String getModifiedBy(){
        return sModified;
    }
    
    public void setDateModified(Date dModified){
        this.dModified = dModified;
    }
    public Date getDateModified(){
        return dModified;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (sModelCde != null ? sModelCde.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitModel)) {
            return false;
        }
        UnitModel other = (UnitModel) object;
        if ((this.sModelCde == null && other.sModelCde != null) || (this.sModelCde != null && !this.sModelCde.equals(other.sModelCde))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitModel[sModelCde=" + sModelCde + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sModelCde;
            case 2: return sInvTypCd;
            case 3: return sBriefDsc;
            case 4: return sModelNme;
            case 5: return sDescript;
            case 6: return sBrandCde;
            case 7: return sCategrCd;
            case 8: return cEndOfLfe;
            case 9: return cRecdStat;
            case 10: return sModified;
            case 11: return dModified;
            default: return null;
        }
    }

    @Override
    public Object getValue(String fsColumn) {
        int lnCol = getColumn(fsColumn);
        
        if (lnCol > 0){
            return getValue(lnCol);
        } else
            return null;
    }

    @Override
    public String getTable() {
        return "Model";
    }

    @Override
    public String getColumn(int fnCol) {
        if (laColumns.size() < fnCol){
            return "";
        } else 
            return (String) laColumns.get(fnCol - 1);
    }

    @Override
    public int getColumn(String fsCol) {
        return laColumns.indexOf(fsCol) + 1;
    }

    @Override
    public void setValue(int fnColumn, Object foValue) {
        switch(fnColumn){
            case 1:
                sModelCde = (String) foValue;
                break;
            case 2:
                sInvTypCd = (String) foValue;
                break;
            case 3:
                sBriefDsc = (String) foValue;
                break;
            case 4:
                sModelNme = (String) foValue;
                break;
            case 5:
                sDescript = (String) foValue;
                break;
            case 6:
                sBrandCde = (String) foValue;
                break;
            case 7:
                sCategrCd = (String) foValue;
                break;
            case 8:
                cEndOfLfe = (String) foValue;
                break;
            case 9:
                cRecdStat = (String) foValue;
                break;
            case 10:
                sModified = (String) foValue;
                break;
            case 11:
                dModified = (Date) foValue;
                break;
        }    
    }

    @Override
    public void setValue(String fsColumn, Object foValue) {
        int lnCol = getColumn(fsColumn);
        if (lnCol > 0){
            setValue(lnCol, foValue);
        }
    }

    @Override
    public int getColumnCount() {
        return laColumns.size();
    }

    public void list(){
        Stream.of(laColumns).forEach(System.out::println);        
    }
    
}
