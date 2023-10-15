package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.FormPage;
import testBase.BaseClass;

public class TS_003_FormDemo extends BaseClass{

	@Test
	void formDemo() {
		logger.info("*** Starting TS_003_FormDemo ***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickInputForm();
		logger.info("Clicked on Input Form Submit");
		
		FormPage fp=new FormPage(driver);
		fp.clickSubmit();
		logger.info("Clicked on Submit button");
		
		String msg=fp.errmsg();
		System.out.println(msg);
		Assert.assertEquals(msg, "Please fill out this field.");
		
		fp.setName("sara");
		fp.setEmail("abc123@gmail.com");
		fp.setPswd("sara@12");
		fp.setCompany("Softura");
		fp.setWebsite("zzz");
		fp.drpCountry();
		fp.setCity("Chennai");
		fp.setAddress1("Nehru Street");
		fp.setAddress2("Kalyan Road");
		fp.setState("TamilNadu");
		fp.setZip("607001");
		fp.clickSubmit();
		String finalmsg=fp.msgdisplay();
		Assert.assertEquals(finalmsg, "Thanks for contacting us, we will get back to you shortly.");
		}
		catch(Exception e) {
			logger.error("test failed");
			Assert.fail();
			e.getMessage();
		}
		logger.info("*** Finished TS_003_FormDemo ***");
	}
}
