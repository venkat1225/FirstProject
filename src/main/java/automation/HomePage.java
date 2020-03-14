package automation;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{


		@FindBy(xpath="//a[@title='Women']")
		private WebElement women;
		
		@FindBy(xpath="(//*[@title='Dresses'])[2]")
		WebElement dresses;
		
		@FindBy(xpath="(//*[@title='T-shirts'])[2]")
		WebElement tshirts;
		
		@FindBy(xpath="//input[@name='email']")
		private WebElement mailid;
		
		@FindBy(xpath="//button[@name='submitNewsletter']")
		private WebElement go;
		
		public HomePage() {
			PageFactory.initElements(driver, this);
		}
		
		public WebElement women() {
			return women;
		}
		
		public WebElement dresses() {
			return dresses;
		}
		
		public WebElement tshirts() {
			return tshirts;
		}
		
		public WebElement mailid() {
			return mailid;
		}
		
		public WebElement go() {
			return go;
		}
}


