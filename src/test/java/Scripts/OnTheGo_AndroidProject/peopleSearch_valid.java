package Scripts.OnTheGo_AndroidProject;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import Generic.OnTheGo_AndroidProject.Base_test;
//import Generic.OnTheGo_AndroidProject.Excelsheet;
import Generic.OnTheGo_AndroidProject.Property;
import POM.OnTheGo_AndroidProject.peopleSearch;
 

public class peopleSearch_valid extends Base_test{

 @Test(priority= 6)
	 
	 public void validpeopleSearch() throws InterruptedException
		{
	 peopleSearch ps=new peopleSearch(driver);
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	Skip_Vaild.validskip();
	
	String name = Property.getproperty(propertypath,"peoplesearch");
	//String name = Excelsheet.getexceldata(excelpath,"Sheet1",3,2);
	ps.searchpeople(name);
}
}
