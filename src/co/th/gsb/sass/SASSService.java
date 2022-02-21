package co.th.gsb.sass;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import co.th.gsb.bu.DemoBatch;
//import co.th.kbtg.bu.HolidayExportBU;
//import co.th.kbtg.bu.IR_BASISBU;
//import co.th.kbtg.bu.MIRC29BU;
//import co.th.kbtg.bu.MLTV2BU;
//import co.th.kbtg.bu.MMV29BU;
//import co.th.kbtg.bu.MRC21BU;
//import co.th.kbtg.bu.MRC22BU;
//import co.th.kbtg.bu.MRC28BU;
//import co.th.kbtg.bu.MRCCFBU;
//import co.th.kbtg.bu.MRC_Adjust_tempBU;
//import co.th.kbtg.bu.SPOTBU;
//import co.th.kbtg.bu.VARBU;
//import co.th.kbtg.bu.VaR_IntModelBU;
//import co.th.kbtg.bu.VaR_Liquid_LimitBU;
//import co.th.kbtg.bu.VaR_Liquid_MLCBU;
import co.th.kbtg.util.ResourceReader;

public class SASSService {

	public SASSService() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		boolean result = false;
		try {
			
			DemoBatch demo = new DemoBatch();
			result = demo.execute();
			
		} catch(Exception e) { 
			e.printStackTrace();
			System.out.println(e);
		}finally {
			// Write Result File
			try {
				ResourceReader resource = new ResourceReader();
				System.out.println(resource.getDBProperties("OUTPUT_BATCH_PATH"));
				Path path = Paths.get(resource.getDBProperties("OUTPUT_BATCH_PATH"));
				
				System.out.println("path::"+path);
				
				// check exist path
				if (!Files.exists(path)) {
				    try {
					//java.nio.file.Files;
					Files.createDirectories(path);
					
					System.out.println("path::" + path);
					} catch (IOException e) {
					}
				}
				
//				 File f = new File(path +"\\RESULT_BATCH.out");
				 File f = new File(resource.getDBProperties("OUTPUT_BATCH_PATH") +resource.getDBProperties("OUTPUT_BATCH_FILE"));
				 System.out.println("f::" +f);
			      if (!f.exists()) {
			     // create file.
			    	  f.createNewFile();
			    	  //System.out.println("Create file success");
			      } else {
			        // "File already exists.
			    	  f.delete();
			    	  f.createNewFile();
			    	  //System.out.println("File already exists");
			      }
			      
			      FileWriter writer = new FileWriter(f, true); 
				  writer.write(result?"Return Code: Success":"Return Code: Fail");
			      writer.close();
		     }catch(IOException io) {
		    	 io.printStackTrace();
		     }
		}
	}

}
