package automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest {
	
	HomePage hp;
	
	public HomePageTest() {
		hp=new HomePage();
	}

	@Test
	public void verifyTabs() {
		
		Assert.assertTrue(hp.elementfound(hp.women()));
		Assert.assertTrue(hp.tshirts().isDisplayed());
		Assert.assertTrue(hp.dresses().isDisplayed());
		System.out.println(hp.women().getText());
	}
	
	@Test
	public void pagenavigation() {
		hp.women().click();
		Assert.assertTrue(hp.gettitle().contains("Women"));
		System.out.println(hp.gettitle());
		hp.backpage();
		
		hp.dresses().click();
		Assert.assertTrue(hp.gettitle().contains("Dresses"));
		System.out.println(hp.gettitle());
		hp.backpage();
		
		hp.tshirts().click();
		Assert.assertTrue(hp.gettitle().contains("T-Shirts"));
		System.out.println(hp.gettitle());
		hp.backpage();
	}
	@Test
	public void verifymessage() {
		hp.sentTxt(hp.mailid(), "vengi.1225@gmail.com");
		hp.go().click();
		Assert.assertTrue(hp.getAttTxt(hp.mailid()).contains("You have Successfully Subscribed"));
	}
	
}
