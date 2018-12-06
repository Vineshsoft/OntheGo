package POM.OnTheGo_AndroidProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Birthday {

	public Birthday(AppiumDriver<MobileElement> driver)
	{
		super();
		Base_test.driver1 = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[@index='6']")
	private WebElement Name1;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='9']")
	private WebElement Date1;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='7']")
	private WebElement Name2;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='10']")
	private WebElement Date2;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='8']")
	private WebElement Name3;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='11']")
	private WebElement Date3;
	
	public void UpcomingBirthday()
	{
		
		String Name= Name1.getText();
		String Date= Date1.getText();
		Base_test.Log.info("Happy Birthday" + Name + Date);
		
		
		String Bname= Name2.getText();
		String Bdate= Date2.getText();
		Base_test.Log.info("Happy Birthday" + Bname + Bdate);
		
		String BName= Name3.getText();
		String BDate= Date3.getText();
		Base_test.Log.info("Happy Birthday" + BName + BDate);
		
		
	}
	
	
}
