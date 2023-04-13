package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class First_Country_Page extends PageBase{

	public First_Country_Page(WebDriver driver) {
		super(driver);
	}

	
	// Egypt - Start Your Trial (Classic)
	
	@FindBy(id = "الأساسية-selection")
	WebElement StartYourTrialButton;
	@FindBy (id = "btnChoosePaymentMethod")
	WebElement NextButton1;
	@FindBy(id = "btnChooseAddons")
	WebElement NextButton2;
	
	// User Information
	@FindBy(xpath = "//*[@id=\"readonlyEmail\"]")
	WebElement Email;
	@FindBy(id = "readonlyPassword")
	WebElement Password;
	@FindBy(xpath = "//*[@id = \"btnFinalStepSubscribe\"]")
	WebElement NextButton3;
	
	@FindBy(partialLinkText = "إلغاء")
	WebElement CancelButton;
	
	
	
	public void userClickOnTrial()
	
	{
		StartYourTrialButton.click();
		NextButton1.click();
		NextButton2.click();
		
		// User Information
		Email.sendKeys("Abdelrahman.elazazy@outlook.com");
		Password.sendKeys("12345678");
		NextButton3.click();
		CancelButton.click();
		
	}
	
	
}
