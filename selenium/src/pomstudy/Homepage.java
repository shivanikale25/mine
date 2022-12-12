package pomstudy;

import java.io.File;
import java.io.IOException;

import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generalisation.Screenshotex;
import generalisation.intoview;
import scrolllingstudy.ScrollingUp;

public class Homepage{
	
	
	@FindBy(xpath ="(//span[@class='_3YI_lRyLDAFhz2WE-6yGuX'])[2]") private WebElement userid;
	
	 @FindBy(id ="funds") private WebElement fund;
	 
	 @FindBy(xpath ="//div[text()='Logout']") private WebElement logout;
	 

	public Homepage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
  
	public void validateuserid(WebDriver driver, String value) throws InterruptedException, IOException
	{
	Thread.sleep(1000);
    intoview.scrollIntoView(driver, userid);
    Thread.sleep(1000);
	String actualuserid = userid.getText();
	File myfile=new File("C:\\selenium\\practise excel.xlsx");
	String expecteduserid=WorkbookFactory.create(myfile).getSheet("Sheet3").getRow(0).getCell(3).getStringCellValue();
	//String expecteduserid=value;

	Thread.sleep(1000);
    Screenshotex.ss(driver, actualuserid);
     
	 if(actualuserid.equals(expecteduserid))
	 {
		 System.out.println("tc pass");
	 }
	 else {
		 System.out.println("tc failed");
	 } 
	 
	}
	public void validatefunds() throws InterruptedException
	{Thread.sleep(500);
		fund.click();
	}
	
   public void logout() throws InterruptedException
   {Thread.sleep(500);
	  userid.click(); 
	  Thread.sleep(1500);
	  logout.click();
   }

}
