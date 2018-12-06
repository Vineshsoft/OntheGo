package Scripts.OnTheGo_AndroidProject;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.forgotPassword;

public class forgotPassword_Invalid extends Base_test {
	@Test
	public void invalid()
	{
		forgotPassword fp=new forgotPassword(driver);
		fp.forgotPasswordbtn();
	}

}
