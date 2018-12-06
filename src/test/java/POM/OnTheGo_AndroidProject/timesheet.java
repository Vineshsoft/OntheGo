package POM.OnTheGo_AndroidProject;

import java.util.List;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Generic.OnTheGo_AndroidProject.Base_page;
import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class timesheet extends Base_page {

	public timesheet(AndroidDriver<MobileElement> driver) 
	{		super();
			Base_test.driver1 = driver;
			PageFactory.initElements(new AppiumFieldDecorator(driver), this);
			PropertyConfigurator.configure("Log4j.properties");
	}
	
	@AndroidFindBy(xpath= "//android.widget.ImageView[@index='2']")
	private WebElement myrequest;
	
	
	@AndroidFindBy(xpath= "//android.widget.ImageView[@index='0']")
	private WebElement entertime;
	
	@AndroidFindBy(uiAutomator = "new UiScrollable(new UiSelector()).scrollIntoView.text(\"Timesheet\")")
	public List<WebElement> timesheet;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='40 Hrs']")
	private WebElement totalhrs;
	
	public void myrequest()
	{
		((WebElement) timesheet).click();
		totalhrs.click();
	}
}

