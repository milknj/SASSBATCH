package co.th.gsb.dao;

import java.math.BigDecimal;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.xmlbeans.impl.tool.Extension.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.FileWriter;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.sql.DataSource;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import co.th.gsb.domain.CommonDomain;
import co.th.gsb.domain.FeedMXdataDomain;
import co.th.gsb.domain.KbankCSA8RptCustomerDomain;
import co.th.gsb.domain.KbankCSA8RptDetailDomain;
import co.th.gsb.domain.MXOP_DF04Domain;
import co.th.gsb.domain.MXOP_DF06Domain;
import co.th.gsb.domain.MXOP_DF90Domain;
import co.th.gsb.domain.MXOP_DF91Domain;
import co.th.kbtg.util.ResourceReader;
import co.th.kbtg.util.StringUtils;
import imencryptor.co.th.kbtg.im.IMEncryptor;

public class CommonDAO {
	private static final Logger logger = LogManager.getLogger(CommonDAO.class);
	private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	private DataSource dataSource;
	
	
	public List<String> testGetData(Connection conn) throws SQLException{
		
		PreparedStatement stmt = null;
		ResultSet rs = null;
		List<String> rt = new ArrayList<String>();
		try {
			
			logger.debug("--->Call testGetData<---");
			
			StringBuffer sql = new StringBuffer();
			sql.append("SELECT * FROM MAS_USER");
			stmt = conn.prepareStatement(sql.toString());
			rs = stmt.executeQuery();
					
			
			while(rs.next()) {
				String str = "";
				str = rs.getString("User_ID");
				rt.add(str);
			}
			
			return rt;
			
		}catch (Exception e) {
			e.printStackTrace();
			logger.error(e.getMessage());
			return null;
			
		}finally {
			if(rs != null) {
				rs.close();	
			}
			if(stmt != null) {
				stmt.close();
			}
		}
		
	}

	
	
	
}

