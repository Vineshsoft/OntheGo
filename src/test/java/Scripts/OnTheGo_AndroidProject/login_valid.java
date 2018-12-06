package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;
import org.testng.annotations.Test;
import Generic.OnTheGo_AndroidProject.Base_test;
import Generic.OnTheGo_AndroidProject.Property;
import POM.OnTheGo_AndroidProject.Logintodetails;


public class login_valid extends Base_test {
  @Test(priority=2, groups="Smoke Test")
  public static void validlogin() throws InterruptedException
	{
	 	Logintodetails dl=new Logintodetails(driver);
	 	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 	
	 	
	 	 if(dl.validateLoginpage() == true){
	          Base_test.Log.info("Login Credentials Passed");
	                      
	 	 }
	        else{
	        	Base_test.Log.info("Login Credentials Failed");
	        }
	 
		String emailaddress = Property.getproperty(propertypath,"username");
		Thread.sleep(2000);
		dl.emailtxtbox(emailaddress);
		
		//String pass = Excelsheet.getexceldata(excelpath,"Sheet1",2,2);
		String pass = Property.getproperty(propertypath,"password");
	 	Thread.sleep(1000);
		dl.passwordtxtbox(pass);
	
		dl.loginbutton();
	//	Excelsheet.getexceldata(excelpath, "sheet1", 2, 2);
		 
	 	 }	
}
