package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.Birthday;

public class Birthday_Valid extends Base_test {
 @Test(priority= 4)
	 
	 public void validBirthday() throws InterruptedException
		{
	Birthday bd=new Birthday(driver);
	Skip_Vaild.validskip();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    bd.UpcomingBirthday();
	//sk.Skipbutton();
}

}
