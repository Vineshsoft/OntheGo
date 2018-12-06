package POM.OnTheGo_AndroidProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class Skip {
	
	public Skip(AppiumDriver<MobileElement> driver)
	{
		super();
		Base_test.driver1 = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PropertyConfigurator.configure("Log4j.properties");
	}

	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Skip']")
	private WebElement skipbtn;
	
	@AndroidFindBy(xpath= "//android.view.ViewGroup[@index='2']")
	private WebElement scroll;
	
	@AndroidFindBy(xpath= "//android.view.ViewGroup[@index='4']")
	private WebElement scroll1;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Done']")
	private WebElement done;
	
	public void ScrollandFinish() throws InterruptedException
	{
		scroll.click();
		Thread.sleep(1000);
		scroll1.click();
		done.click();
		Base_test.Log.info("Tapped on Done button");
	}
	
	public void Skipbutton()
	{
		skipbtn.click();
		Base_test.Log.info("Tapped on skip button");
	}
}
