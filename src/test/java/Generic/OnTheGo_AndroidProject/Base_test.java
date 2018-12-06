package Generic.OnTheGo_AndroidProject;

import java.io.File;
import java.net.MalformedURLException;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.ITestResult;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterSuite;
/*import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;*/
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Base_test implements Constant {
	public static AndroidDriver<MobileElement> driver;
	public AppiumDriverLocalService service;
	public static AppiumDriver<MobileElement> driver1;
	public static Logger Log = Logger.getLogger(Logger.class.getName());
	
	@BeforeSuite
	public void serveron()
	{
		PropertyConfigurator.configure("Log4j.properties");
		Log.info("***************************************************************");
		Log.info("Executing Before Suite");
		 service = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
				.usingDriverExecutable(new File("C:\\Program Files (x86)\\nodejs\\node.exe"))
				.withAppiumJS(new File("C:\\\\Users\\\\vinesh.c\\\\AppData\\\\Local\\\\Programs\\\\appium\\\\resources\\\\app\\\\node_modules\\\\appium\\\\build\\\\lib\\\\main.js"))
				.withIPAddress("0.0.0.0").usingPort(4723));
				System.out.println("server started");
				service.start();
	}
	
	@BeforeMethod
	public void openapp() throws MalformedURLException
	{
		Log.info("Executing Before Method ");
		DesiredCapabilities d=new DesiredCapabilities();
		d.setCapability("deviceName","Moto G4 Plus");
		d.setCapability("platformName","android");
		d.setCapability("platformVersion","7.0");
		d.setCapability("appPackage", "com.brillio.onthego");
		d.setCapability("appActivity","com.brillio.onthego.MainActivity");
		//URL u=new URL("http://localhost:4723/wd/hub");
		 driver=new  AndroidDriver<MobileElement>(d);
		
	}
	
	
	@AfterMethod 
	public void closeappp(ITestResult r)
	{
		Log.info("Executing After Method");
		int status = r.getStatus();
		String name = r.getName();
		if(status==2)
		{
			Photo.getphoto(driver,name,photopath);
		}
		Log.info("Quit from driver.");
		driver.closeApp();
	
	}
	
	@AfterSuite
	public void turnoff()
	{
		Log.info("Executing After Suite");
		service.stop();
		Log.info("***************************************************************");
	}
}



