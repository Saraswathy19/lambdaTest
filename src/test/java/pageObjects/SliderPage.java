package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class SliderPage extends BasePage{

	public SliderPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//input[@value='15']")WebElement max_slider;
	@FindBy(id="rangeSuccess")WebElement outputRange;
	
	public void moveSlider() {
		Actions act=new Actions(driver);
		act.dragAndDropBy(max_slider, 214, 0).perform();
	}
	
	public String getOutputRange() {
		try {
		return outputRange.getText();
		}
		catch(Exception e) {
			return e.getMessage();
		}
	}
	
	
}
