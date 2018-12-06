package POM.OnTheGo_AndroidProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
 
import org.openqa.selenium.support.PageFactory;

import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Logout {

	public Logout(AndroidDriver<MobileElement> driver) {
		super();
		Base_test.driver1 = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PropertyConfigurator.configure("Log4j.properties");
	}
	 
	@AndroidFindBy(xpath= "//android.widget.ImageView[@index='0']")
	private WebElement Profilename;

	/*@AndroidFindBy(xpath= "//android.widget.TextView[@text='LOGOUT']")
	private WebElement loggingout;*/
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Hi Vinesh!']")
	private WebElement userlogged;
	
	
	public boolean logoutbutton() throws InterruptedException {
		boolean loginStatus = false;
		if(this.userlogged.isDisplayed())
		{
			if(this.Profilename.isDisplayed())
			{
            loginStatus = true;
            Profilename.click();
            Base_test.Log.info("Tapped on Profilename");
        }
		}		 
		return loginStatus;
		}
	//@findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));");
}
