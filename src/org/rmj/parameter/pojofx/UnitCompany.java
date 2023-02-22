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
@Table(name="Company")

public class UnitCompany implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sCompnyID")
    private String sCompnyID;
    @Column(name = "sCompnyNm")
    private String sCompnyNm;
    @Column(name = "sCompnyCd")
    private String sCompnyCd;
    @Column(name = "sEmplyrNo")
    private String sEmplyrNo;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitCompany(){
        this.sCompnyID = "";
        this.sCompnyNm = "";
        this.sCompnyCd = "";
        this.sEmplyrNo = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sCompnyID");
        laColumns.add("sCompnyNm");
        laColumns.add("sCompnyCd");
        laColumns.add("sEmplyrNo");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setCompanyID(String sCompnyID){
        this.sCompnyID = sCompnyID;
    }
    public String getCompanyID(){
        return sCompnyID;
    }
    
    public void setCompanyName(String sCompnyNm){
        this.sCompnyNm = sCompnyNm;
    }
    public String getCompanyName(){
        return sCompnyNm;
    }
    
    public void setCompanyCode(String sCompnyCd){
        this.sCompnyCd = sCompnyCd;
    }
    public String getCompanyCode(){
        return sCompnyCd;
    }
    
    
    public void setEmployerNo(String sEmplyrNo){
        this.sEmplyrNo = sEmplyrNo;
    }
    public String getEmployerNo(){
        return sEmplyrNo;
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
        hash += (sCompnyID != null ? sCompnyID.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitCompany)) {
            return false;
        }
        UnitCompany other = (UnitCompany) object;
        if ((this.sCompnyID == null && other.sCompnyID != null) || (this.sCompnyID != null && !this.sCompnyID.equals(other.sCompnyID))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitCompany[sCompnyID=" + sCompnyID + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sCompnyID;
            case 2: return sCompnyNm;
            case 3: return sCompnyCd;
            case 4: return sEmplyrNo;
            case 5: return cRecdStat;
            case 6: return sModified;
            case 7: return dModified;
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
        return "Company";
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
                sCompnyID = (String) foValue;
                break;
            case 2:
                sCompnyNm = (String) foValue;
                break;
            case 3:
                sCompnyCd = (String) foValue;
                break;
            case 4:
                sEmplyrNo = (String) foValue;
                break;
            case 5:
                cRecdStat = (String) foValue;
                break;
            case 6:
                sModified = (String) foValue;
                break;
            case 7:
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
