package co.th.gsb.bu;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import co.th.gsb.dao.CommonDAO;
import co.th.kbtg.util.ResourceReader;


public class DemoBatch {
	
	private static final Logger logger = LogManager.getLogger(DemoBatch.class);
	private static final String APPNAME = "DemoBatch";
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");  
	
	private CommonDAO commonDAO;
	
	public DemoBatch() {}
	
	public boolean execute() {
		
		boolean succFlag = false;
		ResourceReader resource = new ResourceReader();
		
		//Log file , Log path
		try {
			resource.setLogPath("DEMO_BATCH_LOG_PATH","SASSBatchLog.log");
			
		} catch (IOException e1) {
			e1.printStackTrace();
			logger.info("Exception: " + e1);
		}
		
		LocalDateTime start = LocalDateTime.now(); 
		logger.info("BEGIN: "+dtf.format(start)+" :["+APPNAME+"]");
		
		Connection conn = null;
		
		try {
			
			// read properties
			String driver = resource.getDBProperties("DB_JDBC_DRIVER");
			String url = resource.getDBProperties("DB_END_POINT");
			String username = resource.getDBProperties("DB_USER_NAME");
			String password = resource.getDBProperties("DB_PASSWORD");
			
			logger.info("driver: "+ driver);
			logger.info("url: "+ url);
			logger.info("username: "+ username);
			logger.info("password: "+ password);
			
			Class.forName(driver);  
			  
			//create connection object  
			conn = DriverManager.getConnection(url, username, password);  
			logger.info("Create the connection object: "+ conn);
			
			
			// call Store					
			commonDAO = new CommonDAO();
			List<String> strList = commonDAO.testGetData(conn);
			
			if(strList != null) {
				logger.debug("strList size >>>> " + strList.size());
				for(String str : strList) {
					logger.debug("str >>>> " + str);
				}
			}
			
			succFlag = true;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if (conn != null)
				try {
					if(conn != null) {
						conn.close();
					}
				} catch (SQLException e) {
					e.printStackTrace();
					succFlag = false;
					logger.info("succFlag: " + succFlag);
				}
			LocalDateTime end = LocalDateTime.now();
			logger.info("END: " + dtf.format(end) + " :[" + APPNAME + "]");
		}
		
		return succFlag;
		
	}

}
