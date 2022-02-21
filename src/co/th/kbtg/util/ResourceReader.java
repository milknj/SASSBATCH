package co.th.kbtg.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;

public class ResourceReader {

	private InputStream inputStream = null;
	private Properties dbProp = null;
	private Properties configProp = null;
	private Properties logProp = null;
	
	public ResourceReader() {}
	
	public void setLogPath(String module, String fileName) throws IOException {
		String logPath =  this.getDBProperties(module);
		if(logProp == null) {
			readResource();
		}
			
		if(fileName == null) {fileName = "";}
		System.out.println("path:"+logPath+fileName);
		logProp.setProperty("log4j.appender.FILE.File", logPath+fileName);

		LogManager.resetConfiguration();
		PropertyConfigurator.configure(logProp);
		
		Path pathlog = Paths.get(logPath);
		// check exist path
		if (!Files.exists(pathlog)) {
		    try {
			//java.nio.file.Files;
			Files.createDirectories(pathlog);
			
			System.out.println("path::" + pathlog);
			} catch (IOException e) {
				
			} 
		}	
	}
	
	
	
	public void readResource() throws IOException {
		try {
			configProp = new Properties();
			dbProp = new Properties();
			logProp = new Properties();

			String propFileName = "co/th/gsb/resource/datasource.properties";
			
			System.out.println("load config Properties.");
			inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);
			
			if (inputStream != null) {
				configProp.load(inputStream);
				
				String path = (String)configProp.get("CONFIG_PATH");
				System.out.println("ConfigPath->"+path);
				inputStream = new FileInputStream(path);
				dbProp.load(inputStream);
				
			} else {
				throw new FileNotFoundException("property file '" + propFileName + "' not found in the classpath");
			}
			

			String logFileName =  (String)dbProp.get("LOG4J_PATH");
			inputStream = new FileInputStream(logFileName);
			if (inputStream != null) {
				logProp.load(inputStream);
			} else {
				throw new FileNotFoundException("property file '" + logFileName + "' not found in the classpath");
			}
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Exception: " + e);
		} finally {
			inputStream.close();
		}
	}
	
	public String getConfigProperties(String propName) {
		if(configProp == null) {
			try {
				readResource();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		if(configProp != null) {
			Object val = configProp.get(propName);
			if(val != null) {
				return val.toString();
			}
		}
		return null;
	}
	
	public String getDBProperties(String propName) {
		if(dbProp == null) {
			try {
				readResource();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(dbProp != null) {
			Object val = dbProp.get(propName);
			if(val != null) {
				return val.toString();
			}
		}
		return null;
	}
	
	public String getLogProperties(String propName) {
		if(logProp == null) {
			try {
				readResource();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		if(logProp != null) {
			Object val = logProp.get(propName);
			if(val != null) {
				return val.toString();
			}
		}
		return null;
	}
}
	
//	public static void main(String[] arg) {
//		ResourceReader r = new ResourceReader();
//		System.out.println(r.getProperties("DB_JDBC_DRIVER"));
//	}
//	

