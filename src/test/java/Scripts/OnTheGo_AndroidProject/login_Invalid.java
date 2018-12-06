package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.Logintodetails;



public class login_Invalid extends Base_test {
	@Test(priority=1,groups="Smoke Test")
	public void invalid()
	{
		Logintodetails inv=new Logintodetails(driver);
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	
	 	if( inv.testLoginWithoutCredentials() == true)
        {
         Base_test.Log.info("Invalid Credentials");
        }
         else 
         {
        	 Base_test.Log.info("Login Credentials Passed");
         }
    }
}
           
     	
        
	


