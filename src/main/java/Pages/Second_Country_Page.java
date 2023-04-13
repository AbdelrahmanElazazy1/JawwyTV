package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Second_Country_Page extends PageBase{

	public Second_Country_Page(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	
	// USer change country to UAE with English language
	
	@FindBy(className = "country-current")
	WebElement Country;
	@FindBy(id = "ae")
	WebElement UAE;
	
	@FindBy(id = "translation-btn")
	WebElement English;
	
	
	// UAE - Start Your Trial (Classic)
	
	@FindBy(id = "classic-selection")
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
	
	@FindBy(partialLinkText = "Cancel")
	WebElement CancelButton;
	
	
	
	public void UserChooseUAE()
	{
		
		Country.click();
		UAE.click();
		English.click();
		
		// UAE - Start Your Trial (Classic)
		StartYourTrialButton.click();
		NextButton1.click();
		NextButton2.click();
		// User Information
		Email.sendKeys("Azazy@Test.com");
		Password.sendKeys("123456");
		NextButton3.click();
		CancelButton.click();
		
		
	}
	
	
	
	
	
}
