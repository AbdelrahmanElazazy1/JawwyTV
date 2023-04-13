package Tests;

import org.testng.annotations.Test;

import Pages.Second_Country_Page;

public class Second_Country_Test extends TestBase{

	
	
	Second_Country_Page CountryObject;
	
	
	
	@Test
	public void UserCanChangeTheCountry()
	{
		CountryObject = new Second_Country_Page(driver);
		CountryObject.UserChooseUAE();
		
	}
	
	
	
}
