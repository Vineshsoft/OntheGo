package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
import POM.OnTheGo_AndroidProject.WishforBirthday;

public class Wish_valid extends Base_test{
 @Test(priority= 5)
	 
	 public void validWish() throws InterruptedException
		{
	WishforBirthday wb= new WishforBirthday(driver);
	Skip_Vaild.validskip();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    wb.BirthdayWish(); 
	 
}

}
