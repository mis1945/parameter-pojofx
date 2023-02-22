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
@Table(name="Term")

public class UnitTerm implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sTermCode")
    private String sTermCode;
    @Column(name = "sDescript")
    private String sDescript;
    @Column(name = "cCoverage")
    private String cCoverage;
    @Column(name = "nTermValx")
    private Number nTermValx;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitTerm(){
        this.sTermCode = "";
        this.cCoverage = "0";
        this.nTermValx = 0;
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sTermCode");
        laColumns.add("sDescript");
        laColumns.add("cCoverage");
        laColumns.add("nTermValx");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setTermID(String sTermCode){
        this.sTermCode = sTermCode;
    }
    public String getTermID(){
        return sTermCode;
    }
    
    public void setTermName(String sDescript){
        this.sDescript = sDescript;
    }
    public String getTermName(){
        return sDescript;
    }
    
    public void setCoverage(String cCoverage){
        this.cCoverage = cCoverage;
    }
    public String getCoverage(){
        return cCoverage;
    }
    
    public void setTermValue(Number nTermValx){
        this.nTermValx = nTermValx;
    }
    public Number getTermValue(){
        return nTermValx;
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
        hash += (sTermCode != null ? sTermCode.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitTerm)) {
            return false;
        }
        UnitTerm other = (UnitTerm) object;
        if ((this.sTermCode == null && other.sTermCode != null) || (this.sTermCode != null && !this.sTermCode.equals(other.sTermCode))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitColor[sTermCode=" + sTermCode + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sTermCode;
            case 2: return sDescript;
            case 3: return cCoverage;
            case 4: return nTermValx;
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
        return "Term";
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
                sTermCode = (String) foValue;
                break;
            case 2:
                sDescript = (String) foValue;
                break;
            case 3:
                cCoverage = (String) foValue;
                break;
            case 4:
                nTermValx = (Number) foValue;
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
