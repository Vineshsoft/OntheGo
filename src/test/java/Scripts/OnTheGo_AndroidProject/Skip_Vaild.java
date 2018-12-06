package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.Skip;

public class Skip_Vaild extends Base_test{
	 @Test(priority= 3, groups="Smoke Test")
	 
public static void validskip() throws InterruptedException
		{		
	    Skip sk=new Skip(driver);
	    login_valid.validlogin();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	// sk.ScrollandFinish();
	sk.Skipbutton();
}
}
