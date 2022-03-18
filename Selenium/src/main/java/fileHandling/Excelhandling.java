package fileHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelhandling {

	public static void main(String[] args) throws IOException {
		/*
		 * workbook-xssfworkbook
		 * sheet-xssfsheet
		 * row=xssfrow
		 * cell-xssfcell
		 */
       String path="/home/kkirubakaran/Downloads/testdata.xlsx";
       File f=new File(path);
       FileInputStream fis=new FileInputStream(f);
       XSSFWorkbook wb=new XSSFWorkbook(fis);
       XSSFSheet sheet =wb.getSheetAt(0);
//       String data1=sheet.getRow(0).getCell(0).getStringCellValue();
//       System.out.println(data1);
       //traversing over each row
       Iterator<Row> rowIterator=sheet.iterator();
       while(rowIterator.hasNext()) {
    	   Row row=rowIterator.next();
    	   Iterator<Cell> cellIterator=row.cellIterator();
           while(cellIterator.hasNext()) {
        	   Cell cell=cellIterator.next();
        	   
        	   
        	   switch(cell.getCellType()) {
        	   case STRING:
        		   System.out.print(cell.getStringCellValue()+"\t");
        		   break;
        	   case NUMERIC:
        		   System.out.println(cell.getNumericCellValue()+"\t");
        		   break;
        	   }
       }
	}
       Map<String, Object[]> data = new HashMap<String, Object[]>();
       data.put("7", new Object[] {7d,"usha","java","US"});
       data.put("8", new Object[] {7d,"jovita","selenium","US"});
       data.put("9", new Object[] {7d,"sree","java","US"});
        
       Set<String> nr=data.keySet();
       int ronum=sheet.getLastRowNum();//eg 15 
       
       for(String key: nr) {
    	   Row row=sheet.createRow(ronum++);
    	   Object[] objarr=data.get(key);
    	   int cellnum=0;
    	   for(Object obj: objarr) {
    		   Cell cell=row.createCell(cellnum++);
    		   if(obj instanceof String) {
    			   cell.setCellValue((String)obj);
    		   }else if(obj instanceof Double) {
    			   cell.setCellValue((Double)obj);

    		   }
    		   
    	   }
    	   
       }
       FileOutputStream fos=new FileOutputStream(f);
       wb.write(fos);
System.out.println("writing process is completed");
}}
