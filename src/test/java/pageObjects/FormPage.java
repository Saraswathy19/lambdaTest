package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class FormPage extends BasePage {

	public FormPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath="//div[@class='text-right mt-20']/button[@type='submit']")WebElement btnsubmit;
	@FindBy(id="name")WebElement txtname;
	@FindBy(id="inputEmail4")WebElement txtemail;
	@FindBy(id="inputPassword4")WebElement txtPswd;
	@FindBy(xpath="//input[@placeholder='Company']")WebElement txtCompany;
	@FindBy(id="websitename")WebElement txtwebsite;
	@FindBy(name="country")WebElement drpcountry;
	@FindBy(id="inputCity")WebElement txtCity;
	@FindBy(id="inputAddress1")WebElement txtaddress1;
	@FindBy(id="inputAddress2")WebElement txtaddress2;
	@FindBy(id="inputState")WebElement txtState;
	@FindBy(id="inputZip")WebElement txtZip;
	@FindBy(xpath="//p[@class='success-msg hidden']")WebElement confmsg;
	
	public void clickSubmit() {
		btnsubmit.click();
	}
	
	public String errmsg() {
		try {
		return txtname.getAttribute("validationMessage");
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
	
	public void setName(String name) {
		txtname.sendKeys(name);
	}
	public void setEmail(String email) {
		txtemail.sendKeys(email);
	}
	public void setPswd(String password) {
		txtPswd.sendKeys(password);
	}
	public void setCompany(String company) {
		txtCompany.sendKeys(company);
	}
	public void setWebsite(String website) {
		txtwebsite.sendKeys(website);
	}
	public void drpCountry() {
		Select myCountry=new Select(drpcountry);
		myCountry.selectByVisibleText("India");
	}
	public void setCity(String city) {
		txtCity.sendKeys(city);
	}
	public void setAddress1(String address1) {
		txtaddress1.sendKeys(address1);
	}
	public void setAddress2(String address2) {
		txtaddress2.sendKeys(address2);
	}
	public void setState(String state) {
		txtState.sendKeys(state);
	}
	public void setZip(String zip) {
		txtZip.sendKeys(zip);
	}
	
	public String msgdisplay() {
		try {
			return confmsg.getText();
		}
		catch(Exception e)
		{
			return e.getMessage();
		}
	}
}
