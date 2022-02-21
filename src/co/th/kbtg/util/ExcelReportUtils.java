package co.th.kbtg.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;

import org.apache.poi.ss.usermodel.Workbook;
import org.jxls.common.Context;
import org.jxls.formula.StandardFormulaProcessor;
import org.jxls.transform.Transformer;
import org.jxls.transform.poi.PoiTransformer;
import org.jxls.util.JxlsHelper;

//import th.co.kbtg.rpt.persistence.domain.TestReport;

public class ExcelReportUtils {
	private static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private static final SimpleDateFormat outf = new SimpleDateFormat("yyyy-MM-dd_HHmmss");
	private static final Locale thaiLocale = new Locale("th","TH");
	private static final Locale engLocale = new Locale("en","EN");
	
	public static String genControlResult(int count){
		StringBuffer sf = new StringBuffer();
		Calendar txnDate = Calendar.getInstance(engLocale);
		Calendar bfDate = Calendar.getInstance(engLocale);
		String createDate = null;
		String startDate = null;
		
		createDate =  sdf.format(txnDate.getTime());
		sf.append(createDate);
		sf.append(".000000");
		bfDate.set(Calendar.DATE, -1);
		// start date
		startDate =  sdf.format(bfDate.getTime());
		sf.append(startDate);
		sf.append(".000000");
		//end date
		sf.append(createDate);
		sf.append(".000000");
		// seq
		sf.append("0000000001");
		//count record
		sf.append(StringUtils.padZeroLeft(count+"", 10));
		
		return sf.toString();
	}
	
	public boolean exportReportWithTemplate(String inPath, String outPath, String tempName, String rptName, Map<String, Object> params){
//		logger.info("Running Object Collection demo");
	    System.out.println("Start export Excl File:"+outPath+rptName);
//		List<Employee> employees = generateSampleEmployeeData();
	    if(tempName != null && inPath != null && outPath != null && rptName != null) {
		    try {
		    	File reportFile = new File(inPath+""+tempName);
		    	InputStream is = new FileInputStream(reportFile);
//		    	InputStream is = ObjectCollectionDemo.class.getResourceAsStream("object_collection_template.xls")) {
		        try (
		        	OutputStream os = new FileOutputStream(outPath+rptName)) {
		        	Context context = new Context();
		        	if(params != null && !params.isEmpty()) {
		        		 // add parameter to report.
		        		 for (Map.Entry<String, Object> param : params.entrySet()) {
				        	 context.putVar(param.getKey(), param.getValue());
				         } 
		        	}
		        	
//		        	Transformer transformer = JxlsHelper.getInstance().createTransformer(is, os);
//		        	((PoiTransformer)transformer).setIgnoreColumnProps(false);
//		        	((PoiTransformer)transformer).setIgnoreRowProps(false);
//		        	((PoiTransformer)transformer).setEvaluateFormulas(true);
		        	
//		        	CellRef cr = new CellRef(0,0);
//		        	CellStyle style = ((PoiTransformer)transformer).getCellStyle(cr);
//		        	System.out.println("Dataformat:"+style.getDataFormatString());
//		        	Workbook work = ((PoiTransformer)transformer).getWorkbook();
//		        	JxlsHelper.getInstance().setEvaluateFormulas(true).setProcessFormulas(true).setUseFastFormulaProcessor(true) .processTemplate(context, transformer);
		        	JxlsHelper.getInstance().setFormulaProcessor(new StandardFormulaProcessor()).setProcessFormulas(true).processTemplate(is, os, context);
		        	
//		            JxlsHelper.getInstance().processTemplate(is, os, context);
		            System.out.println("Success export Excl File:"+outPath+rptName);
		            return true;
		        }catch(Exception e) {
		        	e.printStackTrace();
		        }
		    }catch(Exception e) {
		    	e.printStackTrace();
		    }
	    
	    }
	    System.out.println("Error export Excl File:"+outPath+rptName);
		return false;
	}
//	
//	public static void main(String[] arg) {
//		Map<String,Object> pa = new HashMap<String, Object>();
//		List<TestReport> list = new ArrayList<TestReport>();
//		TestReport rp = new TestReport();
//		rp.setId("This ID");
//		rp.setName("12345");
//		rp.setId("=SUM(A1:A3)");
//		list.add(rp);
//		pa.put("test", list);
//		pa.put("name", "Hello");
//		Calendar currDate = Calendar.getInstance();
//		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyy");
//		pa.put("asOfDate", format.format(currDate.getTime()));
//		ExcelReportUtils ex = new ExcelReportUtils();
//		ex.exportReportWithTemplate("E://", "E://excel/", "test2.xlsx", "result3.xlsx", pa);
//	}
	
}
