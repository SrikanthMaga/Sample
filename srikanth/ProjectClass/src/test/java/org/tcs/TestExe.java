package org.tcs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.xmlbeans.impl.tool.XMLBeanXSTCHarness;

import com.microsoft.schemas.office.visio.x2012.main.CellType;

public class TestExe {
public static String dataRead(int a,int b) {
	String temp =null;
	try {
		File fi = new File("C:\\Users\\ctc\\eclipse-workspace\\srikanth\\ProjectClass\\src\\test\\resources\\Book1.xlsx");
		FileInputStream fis = new FileInputStream(fi);
		Workbook wb = new XSSFWorkbook();
		Sheet sh = wb.getSheet("Sheet1");
		Row ro = sh.getRow(a);
		Cell ce = ro.getCell(b);
	    int cellType = ce.getCellType();
	    if(cellType==1){
	    temp =ce.getStringCellValue();
	    } else if (cellType==0){
		if(DateUtil.isCellDateFormatted(ce)) {
		Date date = ce.getDateCellValue();
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yy"); 
		temp = format.format(date);
		}else {
		long longNumeric = (long) ce.getNumericCellValue();
		temp =String.valueOf(longNumeric);
			
		}
		
	}
		
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return temp;
	
}
}
