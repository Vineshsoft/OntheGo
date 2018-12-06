package Generic.OnTheGo_AndroidProject;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.Reporter;

public class Excelsheet {
	public static String getexceldata(String file,String sheet,int row,int cell)
	{
		String s="";
		try
		{
			
		FileInputStream f=new FileInputStream(file);
		Workbook wb = WorkbookFactory.create(f);
		s = wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			Reporter.log(s);
		}
		return s;
	}

}