package tests;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import dataprovider.ExcelData;
import helper.AlertHelper;
import helper.DropDownHelper;
import helper.GenericHelper;
import resources.BaseClass;

public class helpercheck extends BaseClass { 
		
	WebDriver driver;
	DropDownHelper dropDownHelper= new DropDownHelper(driver);
	GenericHelper genericHelper=new GenericHelper();
	AlertHelper alertHelper=new AlertHelper(driver);
	
	public static void main(String[] args) {
		String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
		ExcelData excelData = new ExcelData(path,"ChequebookRequest","DataSet ID");
		ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
		 Map<String, String> testExecutiondata = testExecution.getTestdata("CHB_002");
    	Map<String, String> testdata = excelData.getTestdata(testExecutiondata.get("Data Set ID"));
    	System.out.println(testdata.get("Created Cheque Book Code"));
	}
}

