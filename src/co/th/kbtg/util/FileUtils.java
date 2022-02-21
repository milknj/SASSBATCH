package co.th.kbtg.util;

import java.io.File;
import java.util.Date;

public class FileUtils {

	public static boolean deleteFilesOlderThanDate(Date date, String dirPath) {
		 
	    File directory = new File(dirPath);
	    if(directory.exists() && date != null){
	        File[] listFiles = directory.listFiles();            
	        for(File listFile : listFiles) {
	            if(listFile.lastModified() < date.getTime()) {
	                if(!listFile.delete()) {
	                   // System.err.println("Unable to delete file: " + listFile);
	                }
	            }
	        }
	        return true;
	    } else {
	        return false;
	    }
	}
}	
