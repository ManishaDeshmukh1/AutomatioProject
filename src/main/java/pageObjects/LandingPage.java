package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPage {
	
	public WebDriver driver;
	By annualIncome=By.xpath("//input[contains(@aria-describedby,'q2q1i1 q2q1i2')]");
	By otherIncome=By.xpath("//input[contains(@aria-describedby,'q2q2')]");
	By livingExpenses=By.xpath("//input[contains(@aria-describedby,'q3q1')]");
	By monthlyRepayments=By.xpath("//input[contains(@aria-describedby,'q3q3')]");
	By homeLoanRepayments=By.xpath("//input[contains(@aria-describedby,'q3q2')]");
	By otherCommitments=By.xpath("//input[contains(@aria-describedby,'q3q4')]");
	By creditCardLimit=By.xpath("//input[contains(@aria-describedby,'q3q5')]");
	By startOver=By.xpath("//button[@aria-label='Start over']");
	By howMuchICouldBorow=By.xpath("//button[@class='btn btn--action btn--borrow__calculate']");
	By borrowError=By.xpath("//div[@class='borrow__error__text']");
	By borrowResult=By.xpath("//span[@id='borrowResultTextAmount']");
	By applicationType=By.xpath("//label[@for='application_type_single']");
	By PropertyType=By.xpath("//label[@for='borrow_type_home']");
	By Dependant=By.xpath("//select[@title='Number of dependants']");
	
	
	/*
	 * 

	 * //div[@class='borrow__error__text']
	//button[@class='btn btn--action btn--borrow__calculate']
	 * 
	 * //span[@id='borrowResultTextAmount']--borrow result test amount
	*/
	
	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;     //to give life to driver this step is written
	}
	
	
	
	 

	public WebElement getAnnualIncome() {
		
		return driver.findElement(annualIncome);
		
		
		
		
	}
	
public WebElement getOtherIncome() {
		
		return driver.findElement(otherIncome);
		
		
	}


public WebElement getLlivingExpenses() {
	
	return driver.findElement(livingExpenses);
	
	
}
public WebElement getmonthlyRepayments() {
	
	return driver.findElement(monthlyRepayments);
	
	
}
public WebElement getotherCommitments() {
	
	return driver.findElement(otherCommitments);
	
	
}
public WebElement getcreditCardLimit() {
	
	return driver.findElement(creditCardLimit);
	
	
}
public WebElement getstartOver() {
	
	return driver.findElement(startOver);
	
	
}
public WebElement gethowMuchICouldBorow() {
	
	return driver.findElement(howMuchICouldBorow);
	
	
}
public WebElement getborrowError() {
	
	return driver.findElement(borrowError);
	
	
}
public WebElement gethomeLoanRepayments() {
	
	return driver.findElement(homeLoanRepayments);
	
	
}
public WebElement getborrowResult() {
	
	return driver.findElement(borrowResult);
	
	
}



public WebElement getapplicationType() {
	
	return driver.findElement(applicationType);
	
	
}


public WebElement getPropertyType() {
	
	return driver.findElement(PropertyType);
	
	
}


public WebElement getDependant() {
	
	return driver.findElement(Dependant);
	
	
}
}
