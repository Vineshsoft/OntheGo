package POM.OnTheGo_AndroidProject;

import java.util.Base64;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;	
import org.openqa.selenium.support.PageFactory;
import Generic.OnTheGo_AndroidProject.Base_page;
import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
 
 
public class Logintodetails extends Base_page {
	
	public Logintodetails(AppiumDriver<MobileElement> driver) {
		super();
		Base_test.driver1 = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PropertyConfigurator.configure("Log4j.properties");
		}
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@text='Email']")
	private WebElement email;
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@index='3']")
	private WebElement email1;
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@text='Password']")
	private WebElement password;
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@index='6']")
	private WebElement password1;
	
	@AndroidFindBy(xpath= "//android.view.ViewGroup[@index='10']")
	private WebElement loginbtn;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@text='Please check your username and password']")
	private WebElement inputError;
	
	@AndroidFindBy(xpath= "//android.view.ViewGroup[@index='3']")
	private WebElement clickok;
	
	public void emailtxtbox(String emailaddress) throws InterruptedException
	{
		
		email.clear();
		email1.sendKeys(emailaddress);
		Base_test.Log.info("Email id provided as "+ emailaddress);
		Base_test.Log.debug(emailaddress);
	}
	


	public void passwordtxtbox(String pass)
	{
		password.clear();
		password1.sendKeys(pass);
		byte[] encryptedPassword = Base64.getEncoder().encode(pass.getBytes());
		Base_test.Log.info("Encrypted Password provided as "+ new String(encryptedPassword));
		Base_test.Log.debug(encryptedPassword);
	}
	
	public void loginbutton()
	{
		loginbtn.click();
		Base_test.Log.info("Tapped on login button");
	}

	public boolean validateLoginpage() 
	{		
	        boolean elements = false;
	        if(this.email.isDisplayed())
	        {
	            if(this.password.isDisplayed())
	            {
	                if(this.loginbtn.isDisplayed())
	                    {
	                        elements = true;
	                    }
	                }
	            }
	        else
	        {
	            elements = false;
	        }
	        return elements;
	    }
	
	public boolean testLoginWithoutCredentials() {
        boolean loginStatus = false;
        this.loginbtn.click();
        if (this.inputError.getText().equalsIgnoreCase("Please check your username and password")) 
        {
            loginStatus = true;
        }
        clickok.click();
        return loginStatus;
        

    }
}



//@FindBy(xpath="//android.widget.Button[@text='LOGIN']")
/*public Logintodetails(AndroidDriver<MobileElement> driver)
{
	PageFactory.initElements(driver,this);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	waitForPresence(driver, 20 ,email);
	textbox(password, driver);
	button(loginbtn, driver);		
}*/