package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SimpleFormPage;
import testBase.BaseClass;

public class TS_001_SimpleForm extends BaseClass{
	
	@Test
	void simpleForm() throws InterruptedException {
		logger.info("*** Starting TS_001_SimpleForm ***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickSimpleForm();
		logger.info("Clicked on Simple Form Demo");
		String simpleFormUrl=driver.getCurrentUrl();
		if(simpleFormUrl.contains("simple-form-demo"))
		{
			Assert.assertTrue(true);
			System.out.println("URL validation passed");
		}
		else
		{
			Assert.fail();
			System.out.println("URL validation failed");
		}
		Thread.sleep(4000);
		String msg="Welcome to LambdaTest";
		
		SimpleFormPage sp = new SimpleFormPage(driver);
		sp.setmsg(msg);
		sp.clickChecked();
		Thread.sleep(7000);
		logger.info("Clicked Get Checked Value");
		String finalmsg=sp.validateMsg();
		Assert.assertEquals("Welcome to LambdaTest", finalmsg, "Both the msg are not the same");
	}
		
	catch(Exception e) {
		logger.error("test failed");
		Assert.fail();
		e.getMessage();
	}
		logger.info("*** Finished TS_001_SimpleForm ***");
}

}
