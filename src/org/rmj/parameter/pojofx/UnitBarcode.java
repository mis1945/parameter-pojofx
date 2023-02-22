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
@Table(name="EdocSys_File")

public class UnitBarcode implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sFileCode")
    private String sFileCode;
    @Column(name = "sBarrcode")
    private String sBarrcode;
    @Column(name = "sBriefDsc")
    private String sBriefDsc;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitBarcode(){
        this.sFileCode = "";
        this.sBarrcode = "";
        this.sBriefDsc = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sFileCode");
        laColumns.add("sBarrcode");
        laColumns.add("sBriefDsc");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setFileCode(String sFileCode){
        this.sFileCode = sFileCode;
    }
    public String getFileCode(){
        return sFileCode;
    }
    
    public void setBarcode(String sBarrcode){
        this.sBarrcode = sBarrcode;
    }
    public String getBarcode(){
        return sBarrcode;
    }
    
    public void setDescription(String sBriefDsc){
        this.sBriefDsc = sBriefDsc;
    }
    public String getDescription(){
        return sBriefDsc;
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
        hash += (sFileCode != null ? sFileCode.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitBarcode)) {
            return false;
        }
        UnitBarcode other = (UnitBarcode) object;
        if ((this.sFileCode == null && other.sFileCode != null) || (this.sFileCode != null && !this.sFileCode.equals(other.sFileCode))) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitBarcode[sFileCode=" + sFileCode + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sFileCode;
            case 2: return sBarrcode;
            case 3: return sBriefDsc;
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
        return "EdocSys_File";
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
                sFileCode = (String) foValue;
                break;
            case 2:
                sBarrcode = (String) foValue;
                break;
            case 3:
                sBriefDsc = (String) foValue;
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
