package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * This class contains elements and respective business libraries of Testing page
 * @author jsp
 *
 */
public class TestingPage {

	//Declaration
	@FindBy(xpath = "//h1[@class='page-header']")
	private WebElement pageHeader;
	
	@FindBy(id = "Python")
	private WebElement pythonImage;
	
	@FindBy(xpath = "//fieldset/div[@id='cartArea']")
	private WebElement myCart;
	
	@FindBy(xpath = "//ul/descendant::i[@class='fa fa-facebook']")
	private WebElement facebookIcon;
	
	//Initialization
	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Utilization
	/**
	 * This method returns page header of Selenium Training page
	 * @return
	 */
	public String getPageHeader() {
		return pageHeader.getText();
	}
	
	/**
	 * This method is used to get Python image
	 * @return
	 */
	public WebElement getPythonImage() {
		return pythonImage;
	}
	
	/**
	 * This method is used to get MyCart area
	 * @return
	 */
	public WebElement getMyCart() {
		return myCart;
	}
	
	/**
	 * This method is used to get facebook icon
	 * @return
	 */
	public WebElement getFacebookIcon() {
		return facebookIcon;
	}
	
	/**
	 * This method is used to click on facebook icon
	 */
	public void clickFacebook() {
		facebookIcon.click();
	}
}
