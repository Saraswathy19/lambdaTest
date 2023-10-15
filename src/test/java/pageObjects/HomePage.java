package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//a[normalize-space()='Simple Form Demo']")WebElement lnksimpleForm;
	@FindBy(xpath="//a[text()='Drag & Drop Sliders']")WebElement lnkDragAndDrop;
	@FindBy(xpath="//a[normalize-space()='Input Form Submit']")WebElement lnkinputForm;
	
	public void clickSimpleForm()
	{
		lnksimpleForm.click();
	}
	
	public void clickSliders() 
	{
		lnkDragAndDrop.click();
	}
	
	public void clickInputForm()
	{
		lnkinputForm.click();
	}
}
