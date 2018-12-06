package Generic.OnTheGo_AndroidProject;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
 
 

public class Base_page {
	public static AndroidDriver<MobileElement> driver;

public void button(WebElement element,WebDriver driver)
	{
		try {
		WebDriverWait w=new WebDriverWait(driver,100);
		w.until(ExpectedConditions.elementToBeClickable(element));
		}	
		catch(Exception e)
		{
			
		}
	}

public static int gotoframe(WebDriver driver,WebElement frame)

{

int i;

int num = -1;

int a=driver.findElements(By.tagName("iframe")).size();

for(i=0;i<a;i++)

{

driver.switchTo().defaultContent();

driver.switchTo().frame(i);

int b=driver.findElements((By) frame).size();

if(b>0)

{

num=i;

break;

}

}

driver.switchTo().defaultContent();

return num;

}

	public void waitForPresence(AndroidDriver<MobileElement> driver, int timeLimitInSeconds, WebElement element){
		
	try{
		MobileElement mobileElement =  (MobileElement) driver.findElementByAndroidUIAutomator("UiSelector().resourceId(\""+element+"\")");
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOf(mobileElement));
				
		}
	catch(Exception e){
			
		}
		
	}
	
	
	public static void scrollToElement(WebElement searchname) {
		
		((AndroidDriver<MobileElement>) driver).findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"" + searchname
				+ "\").instance(0))");
	}
	
	public void textbox(WebElement element,WebDriver driver)
	
	{
		try {
			WebDriverWait w=new WebDriverWait(driver,100);
			w.until(ExpectedConditions.visibilityOf(element));
			}
			catch(Exception e)
			{
				
			}
	}
		
	
	}



 
		
	 
	

