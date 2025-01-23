package basic_program;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DDT{

	public static void main(String[] args) throws Exception, IOException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\yasho\\eclipse-workspace\\Selenium\\Excel\\yashoda.xlsx");
	Workbook w1=	WorkbookFactory.create(f1);
	     Sheet s1=   w1.getSheet("logindetails");
	 Row r1=    s1.getRow(1);
	// System.out.println(r1);
	           Cell c1 = r1.getCell(0);
	           System.out.println(c1);
	 String s2= c1.getStringCellValue();
	 String pwd=w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
	 System.out.println(pwd);
	 
	}

}
