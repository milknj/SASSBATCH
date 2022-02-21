package co.th.gsb.domain;

import java.math.BigDecimal;
import java.sql.Date;

public class CommonDomain {
	
	private String userName;
	private String appUser;
	private String appName;
	private String strModule;
	private Date dateRunning;
	private String ResultStatus;
	private String ResultMSG;
	private String ResultMSGDesc;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAppUser() {
		return appUser;
	}
	public void setAppUser(String appUser) {
		this.appUser = appUser;
	}
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getStrModule() {
		return strModule;
	}
	public void setStrModule(String strModule) {
		this.strModule = strModule;
	}
	public Date getDateRunning() {
		return dateRunning;
	}
	public void setDateRunning(Date dateRunning) {
		this.dateRunning = dateRunning;
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
	
	
}