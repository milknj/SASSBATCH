package co.th.gsb.domain;

import java.util.Date;
import java.util.List;

import co.th.kbtg.util.StringUtils;

public class KbankCSA8RptExcelDomain {

	private String cId;
	private String cName;
	private String contact;
	private String phone;
	private String fax;
	private String email1;
	private String email2;
	private String emailStr;
	private String baseCcy;
	private Date rcd;
	private String rcdStr;
	private String cpsName;
	private String cNo;
	private String cmName;
	private String cpGroup;
	private Integer grandCCy;
	private Double grandmarketVal;
	private String flagSumGradTotal;
	private String flagSumGradMarkVal;

	private List<KbankCSA8RptDetailDomain> dataList;
	
	public KbankCSA8RptExcelDomain() {}

	public String getcId() {
		return cId;
	}

	public void setcId(String cId) {
		this.cId = cId;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getEmail1() {
		return email1;
	}

	public void setEmail1(String email1) {
		this.email1 = email1;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getEmailStr() {
		return emailStr;
	}

	public void setEmailStr(String emailStr) {
		this.emailStr = emailStr;
	}

	public String getBaseCcy() {
		return baseCcy;
	}

	public void setBaseCcy(String baseCcy) {
		this.baseCcy = baseCcy;
	}

	public Date getRcd() {
		return rcd;
	}

	public void setRcd(Date rcd) {
		this.rcd = rcd;
	}

	public String getCpsName() {
		return cpsName;
	}

	public void setCpsName(String cpsName) {
		this.cpsName = cpsName;
	}

	public String getcNo() {
		return cNo;
	}

	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	public String getCmName() {
		return cmName;
	}

	public void setCmName(String cmName) {
		this.cmName = cmName;
	}

	public List<KbankCSA8RptDetailDomain> getDataList() {
		return dataList;
	}

	public void setDataList(List<KbankCSA8RptDetailDomain> dataList) {
		this.dataList = dataList;
	}

	public String getRcdStr() {
		return rcdStr;
	}

	public void setRcdStr(String rcdStr) {
		this.rcdStr = rcdStr;
	}

	public String getCpGroup() {
		return cpGroup;
	}

	public void setCpGroup(String cpGroup) {
		this.cpGroup = cpGroup;
	}

	public Integer getGrandCCy() {
		return grandCCy;
	}

	public void setGrandCCy(Integer grandCCy) {
		this.grandCCy = grandCCy;
	}

	public Double getGrandmarketVal() {
		return grandmarketVal;
	}

	public void setGrandmarketVal(Double grandmarketVal) {
		this.grandmarketVal = grandmarketVal;
	}

	public String getFlagSumGradTotal() {
		return flagSumGradTotal;
	}

	public void setFlagSumGradTotal(String flagSumGradTotal) {
		this.flagSumGradTotal = flagSumGradTotal;
	}

	public String getFlagSumGradMarkVal() {
		return flagSumGradMarkVal;
	}

	public void setFlagSumGradMarkVal(String flagSumGradMarkVal) {
		this.flagSumGradMarkVal = flagSumGradMarkVal;
	}

}
