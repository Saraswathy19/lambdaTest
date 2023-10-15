package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.SliderPage;
import testBase.BaseClass;

public class TS_002_SliderDemo extends BaseClass{

	@Test
	void sliderdemo() throws InterruptedException {
		logger.info("*** Starting TS_002_SliderDemo ***");
		try {
		HomePage hp=new HomePage(driver);
		hp.clickSliders();
		logger.info("Clicked on Drag & Drop Sliders");
		
		SliderPage sp=new SliderPage(driver);
		sp.moveSlider();
		String finalvalue=sp.getOutputRange();
		System.out.println(finalvalue);
		Assert.assertEquals(finalvalue, "95", "The Range value is not 95");		
		}
		catch(Exception e) {
			logger.error("test failed");
			Assert.fail();
			e.getMessage();
		}
		logger.info("*** Finished TS_002_SliderDemo ***");
	}
}
