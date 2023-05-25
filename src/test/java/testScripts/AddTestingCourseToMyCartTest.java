package testScripts;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericLibraries.BaseClass;

public class AddTestingCourseToMyCartTest extends BaseClass {
	
	@Test
	public void addPythonToMyCart() throws InterruptedException {
		SoftAssert soft = new SoftAssert();
		
		home.clickGearsTab();
		home.clickSkillraryDemoApp();
		web.handleChildBrowser();
		
		soft.assertTrue(demoApp.getLogoText().contains("ECommerce"));
		
		demoApp.selectCategory(web, 1);
		soft.assertEquals(testing.getPageHeader(), "Testing");
		
		web.scrollToElement(testing.getPythonImage());
		Thread.sleep(2000);
		web.dragAndDropElement(testing.getPythonImage(), testing.getMyCart());
		
		web.scrollToElement(testing.getFacebookIcon());
		testing.clickFacebook();
		
		soft.assertAll();
	}

}
