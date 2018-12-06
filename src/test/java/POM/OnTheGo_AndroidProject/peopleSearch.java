package POM.OnTheGo_AndroidProject;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import Generic.OnTheGo_AndroidProject.Base_page;
import Generic.OnTheGo_AndroidProject.Base_test;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class peopleSearch extends Base_page{

	public peopleSearch(AndroidDriver<MobileElement> driver) {
		super();
		Base_test.driver1 = driver;
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		PropertyConfigurator.configure("Log4j.properties");		 
	}
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='6']")
	private WebElement Name1;
	
	@AndroidFindBy(id= "com.brillio.onthego:id/bottom_navigation_small_item_icon")
	private WebElement peopleicon;
	 
	@AndroidFindBy(xpath= "//android.widget.FrameLayout[@index='2']")
	private WebElement frame;
	
	@AndroidFindBy(xpath= "//android.widget.FrameLayout[@index='3']")
	private WebElement frame1;
	
	@AndroidFindBy(xpath= "//android.widget.EditText[@text='Search People']")
	private WebElement searchfield;
	
	@AndroidFindBy(xpath= "//android.widget.LinearLayout[@index='0']")
	public WebElement searchname;
	//public List<WebElement> searchname;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='6']")
	public WebElement conctact;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='11']")
	public WebElement fusionID;
	
	@AndroidFindBy(xpath= "//android.widget.TextView[@index='12']")
	public WebElement fusion;
	
		public void searchpeople(String name) throws InterruptedException 
		{		
			String Name= Name1.getText();
			//String Date= Date1.getText();
			Base_test.Log.info("Happy Birthday" + " "+ Name);
			
		Thread.sleep(1000);
		int m=Base_page.gotoframe(driver, frame);
	    driver.switchTo().frame(m);
	    int n=Base_page.gotoframe(driver, frame1);
	    driver.switchTo().frame(n);
		peopleicon.click();
		driver.switchTo().defaultContent();
	 	searchfield.sendKeys(name);
		
	        if( this.searchfield.getText().equalsIgnoreCase("name"))
	        		{
	        	
	        	Base_page.scrollToElement(searchname); 
	              searchname.click();
	        	Base_test.Log.info("Searched for Name" + name);	
	        	String ContactNo= conctact.getText();
	        	Base_test.Log.info("Contact no" +" " +ContactNo);	
	        	Base_page.scrollToElement(fusionID); 
	        	String Empno= fusion.getText();
	        	Base_test.Log.info("Fusion ID" + " " +Empno);	
	        		}
	        
	        else
	        {
	        	Base_test.Log.info("Searched" + " " +name +" " + "not in the list");
	        }
	    }

	 

	
}
