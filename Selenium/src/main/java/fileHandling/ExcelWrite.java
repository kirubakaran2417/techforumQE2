package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWrite {

	public static void main(String[] args) throws IOException {
		String filepath= ("/home/kkirubakaran/Downloads/testdata.xlsx");
		File file= new File(filepath);
		FileOutputStream fos=new FileOutputStream(file);
	        //create the blank workbook
		Workbook wb= new XSSFWorkbook();
	        //create the blank excel sheet
		Sheet sh= wb.createSheet("directWriting");
		//define the position in the excel sheet where write operation needs to perform
	        Row rw= sh.createRow(4);
		Cell cl=rw.createCell(1);
	        //define input type
		cl.setCellType(CellType.STRING);
	        //define the data value
		cl.setCellValue("java Software");
	        //write the workbook
		wb.write(fos);
	}

}
