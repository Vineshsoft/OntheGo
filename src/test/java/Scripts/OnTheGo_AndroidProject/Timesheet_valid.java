package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.timesheet;

public class Timesheet_valid extends Base_test {

 @Test(priority= 5)
	 
	 public void validBirthday() throws InterruptedException
		{
	timesheet tm=new timesheet(driver);
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Skip_Vaild.validskip();
	tm.myrequest();
    
     
		}
 
}
