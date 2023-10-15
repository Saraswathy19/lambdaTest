package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SimpleFormPage extends BasePage{

	public SimpleFormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(id="user-message") WebElement msgbox;
	@FindBy(id="showInput") WebElement btnCheckedValue;
	@FindBy(xpath="//p[@id='message']") WebElement msgvalidation;
	
	public void setmsg(String message)
	{
		msgbox.sendKeys(message);
	}
	
	public void clickChecked() {
		btnCheckedValue.click();
	}
	
	public String validateMsg() {
		try {
		return msgvalidation.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
		
	}

	
}
