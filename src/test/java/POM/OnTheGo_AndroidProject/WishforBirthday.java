package POM.OnTheGo_AndroidProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class WishforBirthday {

	public WishforBirthday(AndroidDriver<MobileElement> driver) 
		{
			super();
			Base_test.driver1 = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			PropertyConfigurator.configure("Log4j.properties");
		}
	
	@AndroidFindBy(xpath= "//android.view.ViewGroup[@index='3']")
	private WebElement BName;
	
	@AndroidFindBy(xpath= "//android.widget.ImageView[@index='4']")
	private WebElement msg;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Messages']")
	private WebElement Message;
	
	@AndroidFindBy(xpath= "//android.widget.Button[@text='JUST ONCE']")
	private WebElement Once;

	@AndroidFindBy(xpath= "//android.widget.TextView[@index='0']")
	private WebElement MobileNo;
	
	@AndroidFindBy(xpath= "//android.widget.ImageButton[@index='0']")
	private WebElement Back;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='0']")
	private WebElement close;
	
	public void BirthdayWish()
	{
		
		BName.click();
		msg.click();
		Message.click();
		Once.click();
		MobileNo.click();
		Back.click();
		close.click();
		
		Base_test.Log.info("Mobile Number" + MobileNo);
		
		
}
	

}
