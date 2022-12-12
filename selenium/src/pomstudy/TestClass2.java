package pomstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass2 {

	public static void seconduser() throws EncryptedDocumentException, IOException, InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://login-v2.upstox.com/");
		
		File myfile=new File("C:\\selenium\\practise excel.xlsx");
		Sheet mysheet = WorkbookFactory.create(myfile).getSheet("Sheet3");
		LoginPage ls=new LoginPage(driver);
		ls.useriduse(mysheet.getRow(1).getCell(0).getStringCellValue());
		Thread.sleep(500);
		ls.passworduse(mysheet.getRow(1).getCell(1).getStringCellValue());
		Thread.sleep(500);
		ls.sign();
		Thread.sleep(3000);

		PassCode ps=new PassCode(driver);
		Thread.sleep(2000);
		ps.passcode1(mysheet.getRow(1).getCell(2).getStringCellValue());
		Thread.sleep(15000);

		WelcomePage wc=new WelcomePage(driver);
		wc.wel();
		Thread.sleep(5000);
		
	    Homepage h1=new Homepage(driver);
	    h1.validateuserid(driver,mysheet.getRow(1).getCell(3).getStringCellValue());
		Thread.sleep(500);
		
		h1.validatefunds();
		Thread.sleep(500);
	    
		Fundspage f1=new Fundspage(driver);
		f1.fundsvalidate(driver);
		Thread.sleep(2000);
		h1.logout();
	}
	
	
	
}
