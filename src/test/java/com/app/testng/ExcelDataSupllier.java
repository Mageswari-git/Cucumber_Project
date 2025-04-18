package com.app.testng;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class ExcelDataSupllier {

	@DataProvider(name="loginData")
	public String[][] getData() throws Exception {
//	public static void main(String[] args) throws IOException {
		
	
		File excelFile = new File("C:\\Users\\RaviMagi\\Eclipse latest\\TestNGSampleProject\\src\\test\\resources\\TestData\\datas.xlsx");
		FileInputStream fis = new FileInputStream(excelFile);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfColumns = sheet.getRow(0).getLastCellNum();
	
		String[][] data = new String[noOfRows-1][noOfColumns];
		for (int i = 0; i < noOfRows-1; i++) {
			for (int j = 0; j < noOfColumns; j++) {
				//System.out.println(sheet.getRow(i).getCell(j));
				DataFormatter df = new DataFormatter();
				data[i][j] =  df.formatCellValue(sheet.getRow(i+1).getCell(j));
			}
			
		}
		//workbook.close();
		//fis.close();
		
 	//	for (String[] dataArr : data) {
 	//	System.out.println(Arrays.toString(dataArr));
 	//	}
		return data; 
		
	}
}
	
	//}

