package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Third_Country_Page extends PageBase{

	public Third_Country_Page(WebDriver driver) {
		super(driver);
	
	}

	
	
	// User change country to Jordan with English language
	
		@FindBy(className = "country-current")
		WebElement Country;
		@FindBy(id = "jo")
		WebElement Jordan;
		@FindBy(id = "translation-btn")
		WebElement English;
		
		
		// Jordan - Start Your Trial (Classic)
		
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
		
		
		
		public void UserChooseJordan()
		{
			
			Country.click();
			Jordan.click();
			English.click();
			
			// Jordan - Start Your Trial (Classic)
			StartYourTrialButton.click();
			NextButton1.click();
			NextButton2.click();
			// User Information
			Email.sendKeys("Jewwy@Test12.com");
			Password.sendKeys("!A224Dgfdg");
			NextButton3.click();
			CancelButton.click();
			
			
		}
	
	
	
	
}
