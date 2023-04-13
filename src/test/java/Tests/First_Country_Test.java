package Tests;

import org.testng.annotations.Test;

import Pages.First_Country_Page;

public class First_Country_Test extends TestBase{

	
	
	First_Country_Page TrialObject;
	
	
	
	@Test
	public void UserCanChooseTheClassicTrial()
	
	{
		TrialObject = new First_Country_Page(driver);
		TrialObject.userClickOnTrial();
		
	}
	
	
}
