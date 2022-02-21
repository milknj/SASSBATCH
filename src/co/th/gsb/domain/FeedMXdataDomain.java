package co.th.gsb.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class FeedMXdataDomain extends CommonDomain {

	String M_OGL_COA;
	String M_ENTITY;
	String M_RC;
	String M_ACCOUNT;
	String M_FUNCTION;
	String M_LOB;
	String M_PRODUCT_CODE;
	String M_PRODUCT_FEATURE;
	String M_INTER_COM;
	String M_INTRA_COM;
	String M_PROJECT;
	String M_FUTURE1;
	String M_FUTURE2;
	String M_EN_AMTC;
	String M_EN_AMTD;
	String M_BEGIN_BALANCE;
	String M_END_BALANCE;
	String M_EN_AMTC_THB;
	String M_EN_AMTD_THB;
	String M_BEGIN_BALANCE_THB;
	String M_END_BALANCE_THB;
	String M_REVALUE_THB;
	String M_REVALUE_C_THB;
	String M_REVALUE_D_THB;
	String M_BEGIN_REVALUE_THB;
	String M_END_REVALUE_THB;
	String M_FINAL_BALANCE_THB;
	String M_EN_CUR;
	String M_EN_DATE;
	int M_USD_EQU;
	String M_PORTFOLIO;
	String M_MID_RATE;
	String M_ACCOUNT_TYPE;
	String M_TRN_FMLY;
	String M_TRN_GRP;
	String M_TRN_TYPE;
	String M_TRN_TYPO;
	String M_ORGSYS;
	String M_CNT_SRCMOD;
	String RCD;
	String CCY;
	String PORTMX;
	String OGLLE;
	String OGLRC;
	String OGLAN;
	String OGLFN;
	String OGLLB;
	String OGLPD;
	String OGLPF;
	String OGLIC;
	String OGLIT;
	String OGLPJ;
	String FUTURE_USED1;
	String FUTURE_USED2;
	String SPORT_RATE_8;
	String BEGBAL;
	String DRBAL;
	String CRBAL;
	String ENDBAL;
	int P_dblEN_AMT;
	BigDecimal M_EN_AMT;
	String ResultStatus;
	String ResultMSG;
	String ResultMSGDesc;
	String pstrPortfolio;

	public String getPstrPortfolio() {
		return pstrPortfolio;
	}

	public void setPstrPortfolio(String pstrPortfolio) {
		this.pstrPortfolio = pstrPortfolio;
	}

	public String getResultStatus() {
		return ResultStatus;
	}

	public void setResultStatus(String resultStatus) {
		ResultStatus = resultStatus;
	}

	public String getResultMSG() {
		return ResultMSG;
	}

	public void setResultMSG(String resultMSG) {
		ResultMSG = resultMSG;
	}

	public String getResultMSGDesc() {
		return ResultMSGDesc;
	}

	public void setResultMSGDesc(String resultMSGDesc) {
		ResultMSGDesc = resultMSGDesc;
	}

	public int getP_dblEN_AMT() {
		return P_dblEN_AMT;
	}

	public void setP_dblEN_AMT(int p_dblEN_AMT) {
		P_dblEN_AMT = p_dblEN_AMT;
	}

	public BigDecimal getM_EN_AMT() {
		return M_EN_AMT;
	}

	public void setM_EN_AMT(BigDecimal m_EN_AMT) {
		M_EN_AMT = m_EN_AMT;
	}

	public String getRCD() {
		return RCD;
	}

	public void setRCD(String rCD) {
		RCD = rCD;
	}

	public String getCCY() {
		return CCY;
	}

	public void setCCY(String cCY) {
		CCY = cCY;
	}

	public String getPORTMX() {
		return PORTMX;
	}

	public void setPORTMX(String pORTMX) {
		PORTMX = pORTMX;
	}

	public String getOGLLE() {
		return OGLLE;
	}

	public void setOGLLE(String oGLLE) {
		OGLLE = oGLLE;
	}

	public String getOGLRC() {
		return OGLRC;
	}

	public void setOGLRC(String oGLRC) {
		OGLRC = oGLRC;
	}

	public String getOGLAN() {
		return OGLAN;
	}

	public void setOGLAN(String oGLAN) {
		OGLAN = oGLAN;
	}

	public String getOGLFN() {
		return OGLFN;
	}

	public void setOGLFN(String oGLFN) {
		OGLFN = oGLFN;
	}

	public String getOGLLB() {
		return OGLLB;
	}

	public void setOGLLB(String oGLLB) {
		OGLLB = oGLLB;
	}

	public String getOGLPD() {
		return OGLPD;
	}

	public void setOGLPD(String oGLPD) {
		OGLPD = oGLPD;
	}

	public String getOGLPF() {
		return OGLPF;
	}

	public void setOGLPF(String oGLPF) {
		OGLPF = oGLPF;
	}

	public String getOGLIC() {
		return OGLIC;
	}

	public void setOGLIC(String oGLIC) {
		OGLIC = oGLIC;
	}

	public String getOGLIT() {
		return OGLIT;
	}

	public void setOGLIT(String oGLIT) {
		OGLIT = oGLIT;
	}

	public String getOGLPJ() {
		return OGLPJ;
	}

	public void setOGLPJ(String oGLPJ) {
		OGLPJ = oGLPJ;
	}

	public String getFUTURE_USED1() {
		return FUTURE_USED1;
	}

	public void setFUTURE_USED1(String fUTURE_USED1) {
		FUTURE_USED1 = fUTURE_USED1;
	}

	public String getFUTURE_USED2() {
		return FUTURE_USED2;
	}

	public void setFUTURE_USED2(String fUTURE_USED2) {
		FUTURE_USED2 = fUTURE_USED2;
	}

	public String getSPORT_RATE_8() {
		return SPORT_RATE_8;
	}

	public void setSPORT_RATE_8(String sPORT_RATE_8) {
		SPORT_RATE_8 = sPORT_RATE_8;
	}

	public String getBEGBAL() {
		return BEGBAL;
	}

	public void setBEGBAL(String bEGBAL) {
		BEGBAL = bEGBAL;
	}

	public String getDRBAL() {
		return DRBAL;
	}

	public void setDRBAL(String dRBAL) {
		DRBAL = dRBAL;
	}

	public String getCRBAL() {
		return CRBAL;
	}

	public void setCRBAL(String cRBAL) {
		CRBAL = cRBAL;
	}

	public String getENDBAL() {
		return ENDBAL;
	}

	public void setENDBAL(String eNDBAL) {
		ENDBAL = eNDBAL;
	}

	public FeedMXdataDomain() {
	}

	public String getM_OGL_COA() {
		return M_OGL_COA;
	}

	public void setM_OGL_COA(String m_OGL_COA) {
		M_OGL_COA = m_OGL_COA;
	}

	public String getM_ENTITY() {
		return M_ENTITY;
	}

	public void setM_ENTITY(String m_ENTITY) {
		M_ENTITY = m_ENTITY;
	}

	public String getM_RC() {
		return M_RC;
	}

	public void setM_RC(String m_RC) {
		M_RC = m_RC;
	}

	public String getM_ACCOUNT() {
		return M_ACCOUNT;
	}

	public void setM_ACCOUNT(String m_ACCOUNT) {
		M_ACCOUNT = m_ACCOUNT;
	}

	public String getM_FUNCTION() {
		return M_FUNCTION;
	}

	public void setM_FUNCTION(String m_FUNCTION) {
		M_FUNCTION = m_FUNCTION;
	}

	public String getM_LOB() {
		return M_LOB;
	}

	public void setM_LOB(String m_LOB) {
		M_LOB = m_LOB;
	}

	public String getM_PRODUCT_CODE() {
		return M_PRODUCT_CODE;
	}

	public void setM_PRODUCT_CODE(String m_PRODUCT_CODE) {
		M_PRODUCT_CODE = m_PRODUCT_CODE;
	}

	public String getM_PRODUCT_FEATURE() {
		return M_PRODUCT_FEATURE;
	}

	public void setM_PRODUCT_FEATURE(String m_PRODUCT_FEATURE) {
		M_PRODUCT_FEATURE = m_PRODUCT_FEATURE;
	}

	public String getM_INTER_COM() {
		return M_INTER_COM;
	}

	public void setM_INTER_COM(String m_INTER_COM) {
		M_INTER_COM = m_INTER_COM;
	}

	public String getM_INTRA_COM() {
		return M_INTRA_COM;
	}

	public void setM_INTRA_COM(String m_INTRA_COM) {
		M_INTRA_COM = m_INTRA_COM;
	}

	public String getM_PROJECT() {
		return M_PROJECT;
	}

	public void setM_PROJECT(String m_PROJECT) {
		M_PROJECT = m_PROJECT;
	}

	public String getM_FUTURE1() {
		return M_FUTURE1;
	}

	public void setM_FUTURE1(String m_FUTURE1) {
		M_FUTURE1 = m_FUTURE1;
	}

	public String getM_FUTURE2() {
		return M_FUTURE2;
	}

	public void setM_FUTURE2(String m_FUTURE2) {
		M_FUTURE2 = m_FUTURE2;
	}

	public String getM_EN_AMTC() {
		return M_EN_AMTC;
	}

	public void setM_EN_AMTC(String m_EN_AMTC) {
		M_EN_AMTC = m_EN_AMTC;
	}

	public String getM_EN_AMTD() {
		return M_EN_AMTD;
	}

	public void setM_EN_AMTD(String m_EN_AMTD) {
		M_EN_AMTD = m_EN_AMTD;
	}

	public String getM_BEGIN_BALANCE() {
		return M_BEGIN_BALANCE;
	}

	public void setM_BEGIN_BALANCE(String m_BEGIN_BALANCE) {
		M_BEGIN_BALANCE = m_BEGIN_BALANCE;
	}

	public String getM_END_BALANCE() {
		return M_END_BALANCE;
	}

	public void setM_END_BALANCE(String m_END_BALANCE) {
		M_END_BALANCE = m_END_BALANCE;
	}

	public String getM_EN_AMTC_THB() {
		return M_EN_AMTC_THB;
	}

	public void setM_EN_AMTC_THB(String m_EN_AMTC_THB) {
		M_EN_AMTC_THB = m_EN_AMTC_THB;
	}

	public String getM_EN_AMTD_THB() {
		return M_EN_AMTD_THB;
	}

	public void setM_EN_AMTD_THB(String m_EN_AMTD_THB) {
		M_EN_AMTD_THB = m_EN_AMTD_THB;
	}

	public String getM_BEGIN_BALANCE_THB() {
		return M_BEGIN_BALANCE_THB;
	}

	public void setM_BEGIN_BALANCE_THB(String m_BEGIN_BALANCE_THB) {
		M_BEGIN_BALANCE_THB = m_BEGIN_BALANCE_THB;
	}

	public String getM_END_BALANCE_THB() {
		return M_END_BALANCE_THB;
	}

	public void setM_END_BALANCE_THB(String m_END_BALANCE_THB) {
		M_END_BALANCE_THB = m_END_BALANCE_THB;
	}

	public String getM_REVALUE_THB() {
		return M_REVALUE_THB;
	}

	public void setM_REVALUE_THB(String m_REVALUE_THB) {
		M_REVALUE_THB = m_REVALUE_THB;
	}

	public String getM_REVALUE_C_THB() {
		return M_REVALUE_C_THB;
	}

	public void setM_REVALUE_C_THB(String m_REVALUE_C_THB) {
		M_REVALUE_C_THB = m_REVALUE_C_THB;
	}

	public String getM_REVALUE_D_THB() {
		return M_REVALUE_D_THB;
	}

	public void setM_REVALUE_D_THB(String m_REVALUE_D_THB) {
		M_REVALUE_D_THB = m_REVALUE_D_THB;
	}

	public String getM_BEGIN_REVALUE_THB() {
		return M_BEGIN_REVALUE_THB;
	}

	public void setM_BEGIN_REVALUE_THB(String m_BEGIN_REVALUE_THB) {
		M_BEGIN_REVALUE_THB = m_BEGIN_REVALUE_THB;
	}

	public String getM_END_REVALUE_THB() {
		return M_END_REVALUE_THB;
	}

	public void setM_END_REVALUE_THB(String m_END_REVALUE_THB) {
		M_END_REVALUE_THB = m_END_REVALUE_THB;
	}

	public String getM_FINAL_BALANCE_THB() {
		return M_FINAL_BALANCE_THB;
	}

	public void setM_FINAL_BALANCE_THB(String m_FINAL_BALANCE_THB) {
		M_FINAL_BALANCE_THB = m_FINAL_BALANCE_THB;
	}

	public String getM_EN_CUR() {
		return M_EN_CUR;
	}

	public void setM_EN_CUR(String m_EN_CUR) {
		M_EN_CUR = m_EN_CUR;
	}

	public String getM_EN_DATE() {
		return M_EN_DATE;
	}

	public void setM_EN_DATE(String m_EN_DATE) {
		M_EN_DATE = m_EN_DATE;
	}

	public int getM_USD_EQU() {
		return M_USD_EQU;
	}

	public void setM_USD_EQU(int m_USD_EQU) {
		M_USD_EQU = m_USD_EQU;
	}

	public String getM_PORTFOLIO() {
		return M_PORTFOLIO;
	}

	public void setM_PORTFOLIO(String m_PORTFOLIO) {
		M_PORTFOLIO = m_PORTFOLIO;
	}

	public String getM_MID_RATE() {
		return M_MID_RATE;
	}

	public void setM_MID_RATE(String m_MID_RATE) {
		M_MID_RATE = m_MID_RATE;
	}

	public String getM_ACCOUNT_TYPE() {
		return M_ACCOUNT_TYPE;
	}

	public void setM_ACCOUNT_TYPE(String m_ACCOUNT_TYPE) {
		M_ACCOUNT_TYPE = m_ACCOUNT_TYPE;
	}

	public String getM_TRN_FMLY() {
		return M_TRN_FMLY;
	}

	public void setM_TRN_FMLY(String m_TRN_FMLY) {
		M_TRN_FMLY = m_TRN_FMLY;
	}

	public String getM_TRN_GRP() {
		return M_TRN_GRP;
	}

	public void setM_TRN_GRP(String m_TRN_GRP) {
		M_TRN_GRP = m_TRN_GRP;
	}

	public String getM_TRN_TYPE() {
		return M_TRN_TYPE;
	}

	public void setM_TRN_TYPE(String m_TRN_TYPE) {
		M_TRN_TYPE = m_TRN_TYPE;
	}

	public String getM_TRN_TYPO() {
		return M_TRN_TYPO;
	}

	public void setM_TRN_TYPO(String m_TRN_TYPO) {
		M_TRN_TYPO = m_TRN_TYPO;
	}

	public String getM_ORGSYS() {
		return M_ORGSYS;
	}

	public void setM_ORGSYS(String m_ORGSYS) {
		M_ORGSYS = m_ORGSYS;
	}

	public String getM_CNT_SRCMOD() {
		return M_CNT_SRCMOD;
	}

	public void setM_CNT_SRCMOD(String m_CNT_SRCMOD) {
		M_CNT_SRCMOD = m_CNT_SRCMOD;
	}
	

}
