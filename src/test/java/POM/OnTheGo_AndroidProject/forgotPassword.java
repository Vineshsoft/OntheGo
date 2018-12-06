package POM.OnTheGo_AndroidProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Generic.OnTheGo_AndroidProject.Base_page;
import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class forgotPassword extends Base_page {
	
	public forgotPassword(AppiumDriver<MobileElement> driver) {
		super();
		Base_test.driver1 = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PropertyConfigurator.configure("Log4j.properties");
	}
	
	@FindBy(id="forgotPassword")
	private WebElement forgotPassword;
 	
		
	public void forgotPasswordbtn()
	{
		forgotPassword.click();
	}
	
}
