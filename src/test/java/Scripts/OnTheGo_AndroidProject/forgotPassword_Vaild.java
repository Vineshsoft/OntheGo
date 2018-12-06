package Scripts.OnTheGo_AndroidProject;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.forgotPassword;

public class forgotPassword_Vaild extends Base_test {
	@Test
	public void validforgotpassword() throws InterruptedException
	{
		forgotPassword s=new forgotPassword(driver);
		s.forgotPasswordbtn();
	}
}
