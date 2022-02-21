package co.th.gsb.domain;

import java.util.Date;

public class KbankCSA8RptDetailDomain {

	//param
	
		private String rptDate;
		private String runMode;
		private String valType;
		
		private Integer totalTransaction;
		private String cName;
		private String contact;
		private String phone;
		private String fax;
		private String email1;
		private String email2;
		private String baseCcy;
		private Date rcd;
		private String br;
		private String srSystem;
		private String datasource;
		private String cId;
		private String cpsName;
		private String cNo;
		private String cmName;
		private String dealNo;
		private String dealNo_seq1;
		private String dealNo_seq2;
		private String product;
		private String prodType;
		private Date startDate;
		private Date matDate;
		private String pexchCcy;
		private Double pexchRate;
		private Double pnotAmt;
		private String sexchCcy;
		private Double sexchRate;
		private Double snotAmt;
		private Double mtmTHB;
		private Double exchRate;
		private String baseCcy_deal;
		private Double mtmCcy;
		private String module;
		private String cpGroup;
		private String bs;
		private String dataFlag;
		private String nb;
		private String contract;
		private String trn_fmly;
		private String trn_grp;
		private String trn_type;
		private String trn_typology;
		private String portmix;
		private String gid;
		private String tradeNo;
		private Double cntFxRate;
		private Double mktFwdRate;
		private Double mktSptRate;
		private Double pTHBSpotRate;
		private Double sTHBSpotRate;
		private String pCcyIntDesc;
		private String sCcyIntDesc;
		private Double pDisFactor;
		private Double sDisFactor;
		private Double mtmBaseCcy;
		
		// cal column
		private String ccy1;
		private Double notional1;
		private String ccy2;
		private Double notional2;
		private Double mktValue;
		private Double mktValueforMTM;
		private Double conFxRate;
		private Double mkFxRate;
		private Double rateCcy1;
		private Double rateCcy2;
		private Double mktFxRate;
		private String upper_cpGroup;
		private Double CRate;
		private Double PRate;
		private String CSAccy1;
		private String CSAccy2;
		private String MTMccy1;
		private String MTMccy2;
		private Double CSAamt1;
		private Double CSAamt2;
		private Double MTMamt1;
		private Double MTMamt2;
		private String MTMbs;
		private Double MTMcfxrate;
		
		
		

		public KbankCSA8RptDetailDomain() {
		}

		public Integer getTotalTransaction() {
			return totalTransaction;
		}

		public void setTotalTransaction(Integer totalTransaction) {
			this.totalTransaction = totalTransaction;
		}



		public Double getMktValueforMTM() {
			return mktValueforMTM;
		}

		public void setMktValueforMTM(Double mktValueforMTM) {
			this.mktValueforMTM = mktValueforMTM;
		}

		public String getValType() {
			return valType;
		}


		public void setValType(String valType) {
			this.valType = valType;
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

		public String getSrSystem() {
			return srSystem;
		}

		public void setSrSystem(String srSystem) {
			this.srSystem = srSystem;
		}

		public String getDatasource() {
			return datasource;
		}

		public void setDatasource(String datasource) {
			this.datasource = datasource;
		}

		public String getcId() {
			return cId;
		}

		public void setcId(String cId) {
			this.cId = cId;
		}

		public String getEmail2() {
			return email2;
		}

		public void setEmail2(String email2) {
			this.email2 = email2;
		}

		public String getBr() {
			return br;
		}

		public void setBr(String br) {
			this.br = br;
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

		public String getDealNo() {
			return dealNo;
		}

		public void setDealNo(String dealNo) {
			this.dealNo = dealNo;
		}

		public String getDealNo_seq1() {
			return dealNo_seq1;
		}

		public void setDealNo_seq1(String dealNo_seq1) {
			this.dealNo_seq1 = dealNo_seq1;
		}

		public String getDealNo_seq2() {
			return dealNo_seq2;
		}

		public void setDealNo_seq2(String dealNo_seq2) {
			this.dealNo_seq2 = dealNo_seq2;
		}

		public String getProduct() {
			return product;
		}

		public void setProduct(String product) {
			this.product = product;
		}

		public String getProdType() {
			return prodType;
		}

		public void setProdType(String prodType) {
			this.prodType = prodType;
		}

		public Date getStartDate() {
			return startDate;
		}

		public void setStartDate(Date startDate) {
			this.startDate = startDate;
		}

		public Date getMatDate() {
			return matDate;
		}

		public void setMatDate(Date matDate) {
			this.matDate = matDate;
		}

		public String getPexchCcy() {
			return pexchCcy;
		}

		public void setPexchCcy(String pexchCcy) {
			this.pexchCcy = pexchCcy;
		}

		public Double getPexchRate() {
			return pexchRate;
		}

		public void setPexchRate(Double pexchRate) {
			this.pexchRate = pexchRate;
		}

		public String getSexchCcy() {
			return sexchCcy;
		}

		public void setSexchCcy(String sexchCcy) {
			this.sexchCcy = sexchCcy;
		}

		public Double getSexchRate() {
			return sexchRate;
		}

		public void setSexchRate(Double sexchRate) {
			this.sexchRate = sexchRate;
		}

		public Double getSnotAmt() {
			return snotAmt;
		}

		public void setSnotAmt(Double snotAmt) {
			this.snotAmt = snotAmt;
		}

		public Double getMtmTHB() {
			return mtmTHB;
		}

		public void setMtmTHB(Double mtmTHB) {
			this.mtmTHB = mtmTHB;
		}

		public Double getExchRate() {
			return exchRate;
		}

		public void setExchRate(Double exchRate) {
			this.exchRate = exchRate;
		}

		public String getBaseCcy_deal() {
			return baseCcy_deal;
		}

		public void setBaseCcy_deal(String baseCcy_deal) {
			this.baseCcy_deal = baseCcy_deal;
		}

		public Double getMtmCcy() {
			return mtmCcy;
		}

		public void setMtmCcy(Double mtmCcy) {
			this.mtmCcy = mtmCcy;
		}

		public String getModule() {
			return module;
		}

		public void setModule(String module) {
			this.module = module;
		}

		public String getCpGroup() {
			return cpGroup;
		}

		public void setCpGroup(String cpGroup) {
			this.cpGroup = cpGroup;
		}

		public String getBs() {
			return bs;
		}

		public void setBs(String bs) {
			this.bs = bs;
		}

		public String getDataFlag() {
			return dataFlag;
		}

		public void setDataFlag(String dataFlag) {
			this.dataFlag = dataFlag;
		}

		public String getNb() {
			return nb;
		}

		public void setNb(String nb) {
			this.nb = nb;
		}

		public String getContract() {
			return contract;
		}

		public void setContract(String contract) {
			this.contract = contract;
		}

		public String getTrn_fmly() {
			return trn_fmly;
		}

		public void setTrn_fmly(String trn_fmly) {
			this.trn_fmly = trn_fmly;
		}

		public String getTrn_grp() {
			return trn_grp;
		}

		public void setTrn_grp(String trn_grp) {
			this.trn_grp = trn_grp;
		}

		public String getTrn_type() {
			return trn_type;
		}

		public void setTrn_type(String trn_type) {
			this.trn_type = trn_type;
		}

		public String getTrn_typology() {
			return trn_typology;
		}

		public void setTrn_typology(String trn_typology) {
			this.trn_typology = trn_typology;
		}

		public String getPortmix() {
			return portmix;
		}

		public void setPortmix(String portmix) {
			this.portmix = portmix;
		}

		public String getGid() {
			return gid;
		}

		public void setGid(String gid) {
			this.gid = gid;
		}

		public String getTradeNo() {
			return tradeNo;
		}

		public void setTradeNo(String tradeNo) {
			this.tradeNo = tradeNo;
		}

		public Double getCntFxRate() {
			return cntFxRate;
		}

		public void setCntFxRate(Double cntFxRate) {
			this.cntFxRate = cntFxRate;
		}

		public Double getMktFwdRate() {
			return mktFwdRate;
		}

		public void setMktFwdRate(Double mktFwdRate) {
			this.mktFwdRate = mktFwdRate;
		}

		public Double getMktSptRate() {
			return mktSptRate;
		}

		public void setMktSptRate(Double mktSptRate) {
			this.mktSptRate = mktSptRate;
		}

		public Double getpTHBSpotRate() {
			return pTHBSpotRate;
		}

		public void setpTHBSpotRate(Double pTHBSpotRate) {
			this.pTHBSpotRate = pTHBSpotRate;
		}

		public Double getsTHBSpotRate() {
			return sTHBSpotRate;
		}

		public void setsTHBSpotRate(Double sTHBSpotRate) {
			this.sTHBSpotRate = sTHBSpotRate;
		}

		public String getpCcyIntDesc() {
			return pCcyIntDesc;
		}

		public void setpCcyIntDesc(String pCcyIntDesc) {
			this.pCcyIntDesc = pCcyIntDesc;
		}

		public String getsCcyIntDesc() {
			return sCcyIntDesc;
		}

		public void setsCcyIntDesc(String sCcyIntDesc) {
			this.sCcyIntDesc = sCcyIntDesc;
		}

		public Double getpDisFactor() {
			return pDisFactor;
		}

		public void setpDisFactor(Double pDisFactor) {
			this.pDisFactor = pDisFactor;
		}

		public Double getsDisFactor() {
			return sDisFactor;
		}

		public void setsDisFactor(Double sDisFactor) {
			this.sDisFactor = sDisFactor;
		}

		public Double getMtmBaseCcy() {
			return mtmBaseCcy;
		}

		public void setMtmBaseCcy(Double mtmBaseCcy) {
			this.mtmBaseCcy = mtmBaseCcy;
		}

		public Double getPnotAmt() {
			return pnotAmt;
		}

		public void setPnotAmt(Double pnotAmt) {
			this.pnotAmt = pnotAmt;
		}

		public String getRptDate() {
			return rptDate;
		}

		public void setRptDate(String rptDate) {
			this.rptDate = rptDate;
		}

		public String getRunMode() {
			return runMode;
		}

		public void setRunMode(String runMode) {
			this.runMode = runMode;
		}

		public String getCcy1() {
			return ccy1;
		}

		public void setCcy1(String ccy1) {
			this.ccy1 = ccy1;
		}

		public Double getNotional1() {
			return notional1;
		}

		public void setNotional1(Double notional1) {
			this.notional1 = notional1;
		}

		public Double getNotional2() {
			return notional2;
		}

		public void setNotional2(Double notional2) {
			this.notional2 = notional2;
		}

		public String getCcy2() {
			return ccy2;
		}

		public void setCcy2(String ccy2) {
			this.ccy2 = ccy2;
		}

		public Double getMktValue() {
			return mktValue;
		}

		public void setMktValue(Double mktValue) {
			this.mktValue = mktValue;
		}

		public Double getConFxRate() {
			return conFxRate;
		}

		public void setConFxRate(Double conFxRate) {
			this.conFxRate = conFxRate;
		}

		public Double getMkFxRate() {
			return mkFxRate;
		}

		public void setMkFxRate(Double mkFxRate) {
			this.mkFxRate = mkFxRate;
		}

		public Double getRateCcy1() {
			return rateCcy1;
		}

		public void setRateCcy1(Double rateCcy1) {
			this.rateCcy1 = rateCcy1;
		}

		public Double getRateCcy2() {
			return rateCcy2;
		}

		public void setRateCcy2(Double rateCcy2) {
			this.rateCcy2 = rateCcy2;
		}
		
		public Double getMktFxRate() {
			return mktFxRate;
		}

		public void setMktFxRate(Double mktFxRate) {
			this.mktFxRate = mktFxRate;
		}
		
		public String getupper_cpGroup() {
			return upper_cpGroup;
		}

		public void setupper_cpGroup(String upper_cpGroup) {
			this.upper_cpGroup = upper_cpGroup;
		}

		public void setMTMbs(String MTMbs) {
			this.MTMbs = MTMbs;
		}
		public String getMTMbs() {
			return MTMbs;
		}

		public Double getCRate() {
			return CRate;
		}

		public void setCRate(Double CRate) {
			this.CRate = CRate;
		}

		public Double getPRate() {
			return PRate;
		}

		public void setPRate(Double PRate) {
			this.PRate = PRate;
		}

		public String getCSAccy1() {
			return CSAccy1;
		}

		public void setCSAccy1(String CSAccy1) {
			this.CSAccy1 = CSAccy1;
		}

		public String getCSAccy2() {
			return CSAccy2;
		}

		public void setCSAccy2(String CSAccy2) {
			this.CSAccy2 = CSAccy2;
		}

		public String getMTMccy1() {
			return MTMccy1;
		}

		public void setMTMccy1(String MTMccy1) {
			this.MTMccy1 = MTMccy1;
		}

		public String getMTMccy2() {
			return MTMccy2;
		}

		public void setMTMccy2(String MTMccy2) {
			this.MTMccy2 = MTMccy2;
		}

		public Double getCSAamt1() {
			return CSAamt1;
		}

		public void setCSAamt1(Double CSAamt1) {
			this.CSAamt1 = CSAamt1;
		}

		public Double getCSAamt2() {
			return CSAamt2;
		}

		public void setCSAamt2(Double CSAamt2) {
			this.CSAamt2 = CSAamt2;
		}

		public Double getMTMamt1() {
			return MTMamt1;
		}

		public void setMTMamt1(Double MTMamt1) {
			this.MTMamt1 = MTMamt1;
		}

		public Double getMTMamt2() {
			return MTMamt2;
		}

		public void setMTMamt2(Double MTMamt2) {
			this.MTMamt2 = MTMamt2;
		}
		public Double getMTMcfxrate() {
			return MTMcfxrate;
		}

		public void setMTMcfxrate(Double MTMcfxrate) {
			this.MTMcfxrate = MTMcfxrate;
		}
		
}
