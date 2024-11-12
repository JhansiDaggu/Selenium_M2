package dataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class WritetoExcel {

	public static void main(String[] args) {
		FileInputStream fis=new FileInputStream("./src/test/resources/testData.xlsx");
		Workbook wb=WorkbookFactory.create(fis);
		Sheet sheet=wb.getSheet("Sheet1");
		
		
		sheet.createRow(5).createCell(0).setCellValue("subject");
		sheet.getRow(5).createCell(0).setCellvalue("selenium");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resource/testData.xlsx");
		wb.write(fos);
		
		wb.close();
		
		
				
			}

}
