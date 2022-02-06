package Academy.E2EProject;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
//this is for login code and hitting url

import junit.framework.Assert;
import pageObjects.LandingPage;
import resources.base;

public class HomePage extends base {
	
	@BeforeTest
	
	public void initialize() throws IOException
	{
		driver=initializeDriver();

	}
	
	@Test
	
	public void basePageNavigation() throws IOException, InterruptedException
	{
//		driver.get(prop.getProperty("url")); // this step is expected to be written but not working for me

		driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
		//as locatores are in pageobject classes we need to create object of that pertcular page for accessing it
		LandingPage l=new LandingPage(driver);  //this does not expect argument so need to create constructor
		l.getAnnualIncome().sendKeys("80000");
		l.getOtherIncome().sendKeys("10000");
		l.getLlivingExpenses().sendKeys("500");
		l.getmonthlyRepayments().sendKeys("100");
		l.gethomeLoanRepayments().sendKeys("0");
		l.getotherCommitments().sendKeys("0");
		l.getcreditCardLimit().sendKeys("10000");
		
		l.gethowMuchICouldBorow().click();
		Thread.sleep(20000);
		//to compare text
		System.out.println(l.getborrowResult().getText());
		
	
		
		
	}
	
	////example to understand dataprovider
	//@Test(dataPrvider="getData")
//	public void basePageNavigation(String Username,String Password,String text)
	
//	{
		
		//l.getAnnualIncome().sendKeys("Username");
	//l.getmonthlyRepayments().sendKeys("Password");
	//l.getcreditCardLimit().sendKeys("text");
		
		
	//}//
		
	
	@DataProvider
	public Object[][] getData()
	
	
	{
		Object[][]data=new Object[2][3];
		
		//0th row
		data[0][0]="abc@qw.com";
		data[0][1]="123";
		data[0][2]="nonrestricteduser";
		
		//1st row
		
		data[1][0]="def@qw.com";
		data[1][1]="3569";
		data[1][2]="restricteduser";
		
		return data;
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
