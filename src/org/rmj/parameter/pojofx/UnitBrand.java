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
@Table(name="Brand")

public class UnitBrand implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sBrandCde")
    private String sBrandCde;
    @Column(name = "sInvTypCd")
    private String sInvTypCd;
    @Column(name = "sDescript")
    private String sDescript;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitBrand(){
        this.sBrandCde = "";
        this.sInvTypCd = "";
        this.sDescript = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sBrandCde");
        laColumns.add("sInvTypCd");
        laColumns.add("sDescript");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setBrandCode(String sBrandCde){
        this.sBrandCde = sBrandCde;
    }
    public String getBrandCode(){
        return sBrandCde;
    }
    
    public void setInvTypeCode(String sInvTypCd){
        this.sInvTypCd = sInvTypCd;
    }
    public String getInvTypeCode(){
        return sInvTypCd;
    }
    
    public void setBrandName(String sDescript){
        this.sDescript = sDescript;
    }
    public String getBrandName(){
        return sDescript;
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
        hash += (sBrandCde != null ? sBrandCde.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitBrand)) {
            return false;
        }
        UnitBrand other = (UnitBrand) object;
        if ((this.sBrandCde == null && other.sBrandCde != null) || (this.sBrandCde != null && !this.sBrandCde.equals(other.sBrandCde))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitBrand[sBrandCde=" + sBrandCde + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sBrandCde;
            case 2: return sInvTypCd;
            case 3: return sDescript;
            case 4: return cRecdStat;
            case 5: return sModified;
            case 6: return dModified;
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
        return "Brand";
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
                sBrandCde = (String) foValue;
                break;
            case 2:
                sInvTypCd = (String) foValue;
                break;
            case 3:
                sDescript = (String) foValue;
                break;
            case 4:
                cRecdStat = (String) foValue;
                break;
            case 5:
                sModified = (String) foValue;
                break;
            case 6:
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
