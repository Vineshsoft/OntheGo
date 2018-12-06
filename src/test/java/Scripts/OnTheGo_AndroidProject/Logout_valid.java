package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.Logout;

 

public class Logout_valid extends Base_test{
	
	 @Test(priority= 5, groups="Smoke Test")
	 
	 public static void logout() throws InterruptedException
	 		{		
	 	    Logout lg=new Logout(driver);
	 	   Skip_Vaild.validskip();
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	
	 	lg.logoutbutton();
	 	
	 	driver.findElementByXPath("//android.widget.TextView[@text='LOGOUT']");
	 	driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"LOGOUT\"));").click();
	 	
	 }

}
