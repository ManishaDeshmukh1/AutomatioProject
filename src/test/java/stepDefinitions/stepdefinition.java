package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObjects.LandingPage;
import resources.base;

public class stepdefinition extends base {
	
//	private LandingPage l=new LandingPage(driver);
	
	
		@Given("^User is on homeloan borrow calculator page$")
		public void user_is_on_homeloan_borrow_calculator_page() throws Throwable {
		    
			driver=initializeDriver();
			driver.get("https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/");
			String Title=driver.getTitle();
			Assert.assertEquals(Title, "Home loan borrowing power calculator | ANZ");
			System.out.println("user has successfully landed on banking page of borrow calculator");
			
		    
		}

		@Then("^User provides details as below to calculate borrow amount$")
		public void user_provides_details_as_below_to_calculate_borrow_amount(DataTable testData) throws Throwable {
			List<String> details = testData.asList(String.class);
			
			LandingPage l=new LandingPage(driver);
			
			if(l.getapplicationType().getText().equalsIgnoreCase(details.get(0)))
			{
			l.getapplicationType().click();
			}
			
			if(l.getPropertyType().getText().equalsIgnoreCase(details.get(1)))
			{
				l.getPropertyType().click();
			}
			Select s=new Select(l.getDependant());
			s.selectByVisibleText(details.get(2));
			
			
			
			l.getAnnualIncome().sendKeys(details.get(3));
			l.getOtherIncome().sendKeys(details.get(4));
			l.getLlivingExpenses().sendKeys(details.get(5));
			l.getmonthlyRepayments().sendKeys(details.get(6));
			l.gethomeLoanRepayments().sendKeys(details.get(8));
			l.getotherCommitments().sendKeys(details.get(7));
			l.getcreditCardLimit().sendKeys(details.get(9));
			
		
			
		    
			
			
			
			
	
		}

		@Then("^clicks on calculator button to check how much he could borrow$")
		public void clicks_on_calculator_button_to_check_how_much_he_could_borrow() throws Throwable {
		    
			LandingPage l=new LandingPage(driver);
			l.gethowMuchICouldBorow().click();
			Thread.sleep(2000);
			
			}
			
		

		

		@Then("^estimates for borrow amount are displayed$")
		public void estimates_for_borrow_amount_are_displayed() throws Throwable {
			
			LandingPage l=new LandingPage(driver);
			
			String borrowResult=l.getborrowResult().getText();
			Assert.assertEquals(borrowResult, "$479,000");
			System.out.println("checking if estimates showing $479,000");
			System.out.println("Testcase1 passed with borrow estimate of $479,000");
			driver.close();
		}
		
		@And("^clicks on start over button$")
	    public void clicks_on_start_over_button() throws Throwable {
			LandingPage l=new LandingPage(driver);
			l.getstartOver().click();
			
			Select s=new Select(l.getDependant());
			if(s.getFirstSelectedOption().getText().equalsIgnoreCase("0"));
			{
				System.out.println("form is cleared and testcase2 passed");
			}
			
			driver.close();
	    }
		
		@And("^clicks on calculator button$")
	    public void clicks_on_calculator_button() throws Throwable {
			LandingPage l=new LandingPage(driver);
			l.gethowMuchICouldBorow().click();
			Thread.sleep(2000);	
			System.out.println("clicked on calculate button");
			
		}
	    
	        
		@Then("^error message is dislayed over page$")
	    public void error_message_is_dislayed_over_page() throws Throwable {
			LandingPage l=new LandingPage(driver);
	         String borrowError=l.getborrowError().getText();
	         System.out.println(borrowError);
	         Assert.assertEquals(borrowError, "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.");
	        System.out.println("Testcase3 passed successfully");
	        driver.close();
			}
		}

						


