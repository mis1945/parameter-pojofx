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
@Table(name="Supplier")

public class UnitSupplier implements Serializable, GEntity {
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @Column(name = "sClientID")
    private String sClientID;
    @Basic(optional = false)
    @Column(name = "sBranchCd")
    private String sBranchCd;
    @Column(name = "sCPerson1")
    private String sCPerson1;
    @Column(name = "sCPerson2")
    private String sCPerson2;
    @Column(name = "sCPerson3")
    private String sCPerson3;
    @Column(name = "sCPPosit1")
    private String sCPPosit1;
    @Column(name = "sCPPosit2")
    private String sCPPosit2;
    @Column(name = "sCPPosit3")
    private String sCPPosit3;
    @Column(name = "sTelNoxxx")
    private String sTelNoxxx;
    @Column(name = "sFaxNoxxx")
    private String sFaxNoxxx;
    @Column(name = "sRemarksx")
    private String sRemarksx;
    @Column(name = "sTermIDxx")
    private String sTermIDxx;
    @Column(name = "nDiscount")
    private Number nDiscount;
    @Column(name = "nCredLimt")
    private Number nCredLimt;
    @Column(name = "nABalance")
    private Number nABalance;
    @Column(name = "dCltSince")
    @Temporal(TemporalType.DATE)
    private Date dCltSince;
    @Column(name = "nLedgerNo")
    private String nLedgerNo;
    @Column(name = "cRecdStat")
    private String cRecdStat;
    @Column(name = "sModified")
    private String sModified;
    @Basic(optional = false)
    @Column(name = "dModified")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dModified;

    LinkedList laColumns = null;
    
    public UnitSupplier(){
        this.sClientID = "";
        this.sBranchCd = "";
        this.sCPerson1 = "";
        this.sCPerson2 = "";
        this.sCPerson3 = "";
        this.sCPPosit1 = "";
        this.sCPPosit2 = "";
        this.sCPPosit3 = "";
        this.sTelNoxxx = "";
        this.sFaxNoxxx = "";
        this.sRemarksx = "";
        this.sTermIDxx = "";
        this.nDiscount = 0.00;
        this.nCredLimt = 0.00;
        this.nABalance = 0.00;
        this.dCltSince = null;
        this.nLedgerNo = "";
        this.cRecdStat = RecordStatus.ACTIVE;
        
        laColumns = new LinkedList();
        laColumns.add("sClientID");
        laColumns.add("sBranchCd");
        laColumns.add("sCPerson1");
        laColumns.add("sCPerson2");
        laColumns.add("sCPerson3");
        laColumns.add("sCPPosit1");
        laColumns.add("sCPPosit2");
        laColumns.add("sCPPosit3");
        laColumns.add("sTelNoxxx");
        laColumns.add("sFaxNoxxx");
        laColumns.add("sRemarksx");
        laColumns.add("sTermIDxx");
        laColumns.add("nDiscount");
        laColumns.add("nCredLimt");
        laColumns.add("nABalance");
        laColumns.add("dCltSince");
        laColumns.add("nLedgerNo");
        laColumns.add("cRecdStat");
        laColumns.add("sModified");
        laColumns.add("dModified");
    }
    
    public void setClientID(String sClientID){
        this.sClientID = sClientID;
    }
    public String getClientID(){
        return sClientID;
    }
    
    public void setBranchCode(String sBranchCd){
        this.sBranchCd = sBranchCd;
    }
    public String getBranchCode(){
        return sBranchCd;
    }
    
    public void setContactPerson1(String sCPerson1){
        this.sCPerson1 = sCPerson1;
    }
    public String getContactPerson1(){
        return sCPerson1;
    }
    
    public void setContactPerson2(String sCPerson2){
        this.sCPerson2 = sCPerson2;
    }
    public String setContactPerson2(){
        return sCPerson2;
    }
    
    public void setContactPerson3(String sCPerson3){
        this.sCPerson3 = sCPerson3;
    }
    public String setContactPerson3(){
        return sCPerson3;
    }
    
    public void setContactPosition1(String sCPPosit1){
        this.sCPPosit1 = sCPPosit1;
    }
    public String getContactPosition1(){
        return sCPPosit1;
    }
    
    public void setContactPosition2(String sCPPosit2){
        this.sCPPosit2 = sCPPosit2;
    }
    public String getContactPosition2(){
        return sCPPosit2;
    }
    
    public void setContactPosition3(String sCPPosit3){
        this.sCPPosit3 = sCPPosit3;
    }
    public String getContactPosition3(){
        return sCPPosit3;
    }
    
    public void setLandline(String sTelNoxxx){
        this.sTelNoxxx = sTelNoxxx;
    }
    public String getLandline(){
        return sTelNoxxx;
    }
    
    public void setFaxNumber(String sFaxNoxxx){
        this.sFaxNoxxx = sFaxNoxxx;
    }
    public String getFaxNumber(){
        return sFaxNoxxx;
    }
    
    public void setRemarks(String sRemarksx){
        this.sRemarksx = sRemarksx;
    }
    public String getRemarks(){
        return sRemarksx;
    }
    
    public void setTermID(String sTermIDxx){
        this.sTermIDxx = sTermIDxx;
    }
    public String getTermID(){
        return sTermIDxx;
    }
    public void setDiscount(Number nDiscount){
        this.nDiscount = nDiscount;
    }
    public Number getDiscount(){
        return nDiscount;
    }
    public void setCreditLimit(Number nCredLimt){
        this.nCredLimt = nCredLimt;
    }
    public Number getCreditLimit(){
        return nCredLimt;
    }
    public void setAccountBalance(Number nABalance){
        this.nABalance = nABalance;
    }
    public Number getAccountBalance(){
        return nABalance;
    }
    
    public void setClientSince(Date dCltSince){
        this.dCltSince = dCltSince;
    }
    public Date getClientSince(){
        return dCltSince;
    }
    public void setLedgerNo(String nLedgerNo){
        this.nLedgerNo = nLedgerNo;
    }
    public String getLedgerNo(){
        return nLedgerNo;
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
        hash += (sClientID != null ? sClientID.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UnitSupplier)) {
            return false;
        }
        UnitSupplier other = (UnitSupplier) object;
        if ((this.sClientID == null && other.sClientID != null) || (this.sClientID != null && !this.sClientID.equals(other.sClientID)) ||
            (this.sBranchCd == null && other.sBranchCd != null) || (this.sBranchCd != null && !this.sBranchCd.equals(other.sBranchCd))
                ) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "org.rmj.parameter.pojo.UnitSupplier[sClientID=" + sClientID + "sBranchCd=" + sBranchCd + "]";
    }
    
    @Override
    public Object getValue(int fnColumn) {
        switch(fnColumn){
            case 1: return sClientID;
            case 2: return sBranchCd;
            case 3: return sCPerson1;
            case 4: return sCPerson2;
            case 5: return sCPerson3;
            case 6: return sCPPosit1;
            case 7: return sCPPosit2;
            case 8: return sCPPosit3;
            case 9: return sTelNoxxx;
            case 10: return sFaxNoxxx;
            case 11: return sRemarksx;
            case 12: return sTermIDxx;
            case 13: return nDiscount;
            case 14: return nCredLimt;
            case 15: return nABalance;
            case 16: return dCltSince;
            case 17: return nLedgerNo;
            case 18: return cRecdStat;
            case 19: return sModified;
            case 20: return dModified;
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
        return "Supplier";
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
            case 1: sClientID = (String) foValue; break;
            case 2: sBranchCd = (String) foValue; break;
            case 3: sCPerson1 = (String) foValue; break;
            case 4: sCPerson2 = (String) foValue; break;
            case 5: sCPerson3 = (String) foValue; break;
            case 6: sCPPosit1 = (String) foValue; break;
            case 7: sCPPosit2 = (String) foValue; break;
            case 8: sCPPosit3 = (String) foValue; break;
            case 9: sTelNoxxx = (String) foValue; break;
            case 10: sFaxNoxxx = (String) foValue; break;
            case 11: sRemarksx = (String) foValue; break;
            case 12: sTermIDxx = (String) foValue; break;
            case 13: nDiscount = (Number) foValue; break;
            case 14: nCredLimt = (Number) foValue; break;
            case 15: nABalance = (Number) foValue; break;
            case 16: dCltSince = (Date) foValue; break;
            case 17: nLedgerNo = (String) foValue; break;
            case 18: cRecdStat = (String) foValue; break;
            case 19: sModified = (String) foValue; break;
            case 20: dModified = (Date) foValue; break;
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
