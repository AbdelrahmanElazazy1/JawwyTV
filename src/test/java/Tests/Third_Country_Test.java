package Tests;

import org.testng.annotations.Test;

import Pages.Second_Country_Page;
import Pages.Third_Country_Page;

public class Third_Country_Test extends TestBase{


	Third_Country_Page ThirdObject;



	@Test
	public void UserCanChangeTheCountry()
	{
		ThirdObject = new Third_Country_Page (driver);
		ThirdObject.UserChooseJordan();

	}

}
