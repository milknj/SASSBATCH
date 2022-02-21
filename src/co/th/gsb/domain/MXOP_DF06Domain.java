package co.th.gsb.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class MXOP_DF06Domain extends CommonDomain {

	String rcdyy;
	String rcdmm;
	String rcddd;
	String brnmne;
	String dealtp;
	String dealrf;
	String matdte;
	Date entdte;
	String sccymn;
	BigDecimal sleamt;
	String pccymn;
	BigDecimal puramt;
	String chkflag;

	public MXOP_DF06Domain() {
	}
	
	public Date getEntdte() {
		return entdte;
	}

	public String getMatdte() {
		return matdte;
	}
	
	public void setMatdte(String matdte) {
		this.matdte = matdte;
	}

	public String getRcdyy() {
		return rcdyy;
	}
	public void setRcdyy(String rcdyy) {
		this.rcdyy = rcdyy;
	}
	public String getRcdmm() {
		return rcdmm;
	}
	public void setRcdmm(String rcdmm) {
		this.rcdmm = rcdmm;
	}
	public String getRcddd() {
		return rcddd;
	}
	public void setRcddd(String rcddd) {
		this.rcddd = rcddd;
	}
	public String getBrnmne() {
		return brnmne;
	}
	public void setBrnmne(String brnmne) {
		this.brnmne = brnmne;
	}
	public String getDealtp() {
		return dealtp;
	}
	public void setDealtp(String dealtp) {
		this.dealtp = dealtp;
	}
	public String getDealrf() {
		return dealrf;
	}
	public void setDealrf(String dealrf) {
		this.dealrf = dealrf;
	}
	public void setEntdte(Date entdte) {
		this.entdte = entdte;
	}
	public String getSccymn() {
		return sccymn;
	}
	public void setSccymn(String sccymn) {
		this.sccymn = sccymn;
	}
	public BigDecimal getSleamt() {
		return sleamt;
	}
	public void setSleamt(BigDecimal sleamt) {
		this.sleamt = sleamt;
	}
	public String getPccymn() {
		return pccymn;
	}
	public void setPccymn(String pccymn) {
		this.pccymn = pccymn;
	}
	public BigDecimal getPuramt() {
		return puramt;
	}
	public void setPuramt(BigDecimal puramt) {
		this.puramt = puramt;
	}
	public String getChkflag() {
		return chkflag;
	}
	public void setChkflag(String chkflag) {
		this.chkflag = chkflag;
	}

}
