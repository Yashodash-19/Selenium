package selenium_assignments;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_171 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		FileInputStream f1=new FileInputStream("C:\\Users\\yasho\\eclipse-workspace\\Selenium\\Excel\\yashoda.xlsx");
		 Workbook w1=            WorkbookFactory.create(f1);
      Sheet s1=    w1.getSheet("logindetails");
        Row r1=      s1.getRow(1);
           //Cell c1     =     r1.getCell(0);
         
           //System.out.println(c1);
          // String s2= c1.getStringCellValue();
           //System.out.println(s2);
           String usrname=w1.getSheet("logindetails").getRow(1).getCell(0).getStringCellValue();
           String pwd=w1.getSheet("logindetails").getRow(1).getCell(1).getStringCellValue();
      	 //System.out.println(pwd);
      	ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2Fb%2Fref%3Dnav_ya_signin%3F_encoding%3DUTF8%26node%3D21557580031%26pd_rd_w%3DtmZUQ%26content-id%3Damzn1.sym.5c831595-5864-4beb-9eaf-f060ccbfa7c4%26pf_rd_p%3D5c831595-5864-4beb-9eaf-f060ccbfa7c4%26pf_rd_r%3D9QC8ZZQYVBRM4DT7VX73%26pd_rd_wg%3DHcVWW%26pd_rd_r%3D46f6b273-b9ee-4f0b-8521-6fea9781b6b3%26ref_%3Dpd_hp_d_hero_unk&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		driver.manage().window().maximize();
		
		
		WebElement email=	driver.findElement(By.xpath("//input[@name='email']"));
		email.sendKeys(usrname);
		
		WebElement continue1=driver.findElement(By.xpath("//input[@id='continue']"));
		 continue1.sendKeys(Keys.ENTER);
		 
		 WebElement pwd1=driver.findElement(By.xpath("//input[@name='password']"));
		 pwd1.sendKeys(pwd);
	}

}
