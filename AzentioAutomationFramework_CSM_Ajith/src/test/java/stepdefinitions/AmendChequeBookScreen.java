package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataprovider.ConfigFileReader;
import dataprovider.ExcelData;
import helper.Selenium_Actions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import pageobjects.csm.AmendChequebookOBJ;
import pageobjects.csm.ChequeBookRequestObj;
import resources.BaseClass;

public class AmendChequeBookScreen extends BaseClass {
	WebDriver driver = BaseClass.driver;
	AmendChequebookOBJ amendChequeBookObj = new AmendChequebookOBJ(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	CSMLogin login = new CSMLogin(driver);
	ConfigFileReader configFileReader = new ConfigFileReader();
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	String path = System.getProperty("user.dir") +"\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"AmendChequeCardStatus","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;
	@Given("^User Launch CSM Core Application$")
    public void user_launch_csm_core_application() throws Throwable {
		driver.get(configFileReader.getCSMApplicationUrl());
		login.loginIntoCSMApplication("CSMUser2");
		
    }
	@And("User_482 update test data set id for ACSD_001")
	public void user_482_update_test_data_set_id_for_acsd_482() {
		testData = excelData.getTestdata("ACSD_001_D1");
	}
	@Given("User_482 update test data set id for ACSD_005")
    public void user_482_update_test_data_set_id_for_acsd_005() {
    	testData = excelData.getTestdata("ACSD_005_D1");
    }
	@And("User_482 update test data set id for ACSD_006")
    public void user_482_update_test_data_set_id_for_acsd_006() {
		testData = excelData.getTestdata("ACSD_006_D1");
    }
	
    @Then("^User Verify the system is changing the chequebook status from submitted to apply to submit$")
    public void user_verify_the_system_is_changing_the_chequebook_status_from_submitted_to_apply_to_submit() throws Throwable {
    	String xpath ="//table[@id='chequeBookQueryTbl_Id_Q000QR']//td[text()='"+805+"']/parent::tr//td[text()='Apply To Submit']";
    	for (int i = 0; i <200; i++) {
			try {
				Assert.assertTrue(driver.findElement(By.xpath(xpath)).isDisplayed());
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^User Click Amend Cheque book Menu$")
    public void user_click_amend_cheque_book_menu() throws Throwable {
        seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.AmendChequeCardMenu());
        seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.AmendChequeCardMenu());
        seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.AmendChequeCardMenu());
    }

    @And("^User Click Maintanence sub menu$")
    public void user_click_maintanence_sub_menu() throws Throwable {
    	 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.MaintenanceIcon());
    	 seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.MaintenanceIcon());
         seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.MaintenanceIcon());
    }

    @And("^User Select the Product type$")
    public void user_select_the_product_type() throws Throwable {
    	 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.productType());
         seleniumActions.getDropDownHelper().SelectUsingVisibleText(amendChequeBookObj.productType(),testData.get("ProductType"));
    }

    @And("^User Enter the Request Number in Amend Cheque Maintanence screen$")
    public void user_enter_the_request_number_in_amend_cheque_maintanence_screen() throws Throwable {
    	 seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.chequeRequestNo());
    	 seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeRequestNo());
         seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeRequestNo());
         amendChequeBookObj.chequeRequestNo().sendKeys(testData.get("ChequeBookCode"));
    }

    @And("^User Click Retrieve button$")
    public void user_click_retrieve_button() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.retrieve());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.retrieve());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.retrieve());
    }

    @And("^User Click the Checkbox for retrieved record$")
    public void user_click_the_checkbox_for_retrieved_record() throws Throwable {
        String xpath = "//td[text()='"+testData.get("ChequeBookCode")+"']/parent::tr//input";
        for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
			} catch (Exception e) {
				if (i==199) {
					Assert.fail(e.getMessage());
				}
			}
		}
    }

    @And("^User click the Update button$")
    public void user_click_the_update_button() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.updateAmend());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.updateAmend());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.updateAmend());
    }

    @And("^User Confirm Save Record$")
    public void user_confirm_save_record() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.confirmSaveRecord());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.confirmSaveRecord());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.confirmSaveRecord());
    }

    @And("^User Success Ok pop up message$")
    public void user_success_ok_pop_up_message() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.recordSavedSuccessfully());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.recordSavedSuccessfully());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.recordSavedSuccessfully());
    }

    @And("^User Click Chequebook Request Menu$")
    public void user_click_chequebook_request_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequebookRequestModule());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequebookRequestModule());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequebookRequestModule());
    }

    @And("^User Click Chequebook Query Sub Menu$")
    public void user_click_chequebook_query_sub_menu() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequebookQuerySubMenu());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequebookQuerySubMenu());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequebookQuerySubMenu());
    }

    @And("^User Enter Branch Code in Chequebook Query Screen$")
    public void user_enter_branch_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.branchCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.branchCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.branchCodeInChequeBookQuery());
		amendChequeBookObj.branchCodeInChequeBookQuery().sendKeys("0001");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }

    @And("^User Enter Currency Code in Chequebook Query Screen$")
    public void user_enter_currency_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.currencyCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.currencyCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.currencyCodeInChequeBookQuery());
		amendChequeBookObj.currencyCodeInChequeBookQuery().sendKeys("840");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		
    }

    @And("^User Enter GL Code in Chequebook Query Screen$")
    public void user_enter_gl_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.glCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.glCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.glCodeInChequeBookQuery());
		amendChequeBookObj.glCodeInChequeBookQuery().sendKeys("150150");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }

    @And("^User Enter CIF Code in Chequebook Query Screen$")
    public void user_enter_cif_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.cifCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.cifCodeInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.cifCodeInChequeBookQuery());
		amendChequeBookObj.cifCodeInChequeBookQuery().sendKeys("993437");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }

    @And("^User Enter Serial no in Chequebook Query Screen$")
    public void user_enter_serial_no_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.serialNoInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.serialNoInChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.serialNoInChequeBookQuery());
		amendChequeBookObj.serialNoInChequeBookQuery().sendKeys("000");
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequeBookRequest_ChequeBookQuery());
    }
    @And("^User Enter Cheque book search code in Chequebook Query Screen$")
    public void user_enter_cheque_book_search_code_in_chequebook_query_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.chequebookCodeInCheckbooQueryScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.chequebookCodeInCheckbooQueryScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.chequebookCodeInCheckbooQueryScreen());
		amendChequeBookObj.chequebookCodeInCheckbooQueryScreen().sendKeys("805");
		amendChequeBookObj.chequebookCodeInCheckbooQueryScreen().sendKeys(Keys.ENTER);
    }
    @And("User_482 Search chequebook code in MaintenanceScreen under chequebook request")
    public void user_482_search_chequebook_code_in_maintenance_screen_under_chequebook_request() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		for (int i = 0; i <100; i++) {
			chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(Keys.ENTER);
		}
		
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				
			}
			
		}
		
    }
    @And("User_482 Validate the chequebook status changed from submitted to apply to submit")
	public void user_482_validate_the_chequebook_status_changed_from_submitted_to_apply_to_submit() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, amendChequeBookObj.applyToSubmitValidation());
    	Assert.assertTrue(amendChequeBookObj.applyToSubmitValidation().isDisplayed());
	}
    @And("User_482 click search icon in MaintenanceScreen under chequebook request")
    public void user_482_click_search_icon_in_maintenance_screen_under_chequebook_request() {
    	for (int i = 0; i <200; i++) {
			try {
				seleniumActions.getClickAndActionsHelper().moveToElement(amendChequeBookObj.searchIconInChequeBookMaintenanceScreen());
				seleniumActions.getClickAndActionsHelper().clickOnElement(amendChequeBookObj.searchIconInChequeBookMaintenanceScreen());
				break;
			} catch (Exception e) {
//				if (i==199) {
//					Assert.fail(e.getMessage());
//				}
			}
		}

		
    }
    
    @And("^User_482 Search Cheque Book Code in Submit Screen$")
    public void user_482_search_cheque_book_code_in_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInSubmitScreen());
		chequeBookRequestObj.searchChequeBookCodeInSubmitScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInSubmitScreen().sendKeys(Keys.ENTER);
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
			} catch (Exception e) {
				
			}
		}
    }

    @And("^User_482 Select Cheque Book Code in Submit Screen$")
    public void user_482_select_cheque_book_code_in_submit_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.selectChequeBookCodeInSubmitScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInSubmitScreen());    
		}
    @And("^User_482 Click Ok button in Warning pop up Message in Submit screen$")
    public void user_click_ok_button_in_warning_pop_up_message_in_submit_screen() throws Throwable {
    	for (int i = 0; i <200000; i++) {
			try {
				if (chequeBookRequestObj.closeIconInWarningPopUpSubmitScreen().isDisplayed()) {
					seleniumActions.getClickAndActionsHelper()
					.moveToElement(chequeBookRequestObj.closeIconInWarningPopUpSubmitScreen());
			seleniumActions.getClickAndActionsHelper()
					.clickOnElement(chequeBookRequestObj.closeIconInWarningPopUpSubmitScreen());
			break;
				}
				
		
			} catch (Exception e) {
//				if (i==199) {
//				Assert.fail(e.getMessage());	
//				}
			}
		}
    
}
    @And("^User_482 Search Submitted chequebook code in Cheque book Request Maintenance Screen$")
    public void user_482_search_submitted_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		for (int i = 0; i <10; i++) {
			chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(Keys.ENTER);
		}
		
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				
			}
			
		}
    }
    @And("User_482 click ok button for no signatures and no finger print pop up warning Message")
    public void user_482_click_ok_button_for_no_signatures_and_no_finger_print_pop_up_warning_message() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookCreation_OkbuttonWarningPopUp());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.chequeBookCreation_OkbuttonWarningPopUp());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.chequeBookCreation_OkbuttonWarningPopUp());
    }
    @Then("^User Validate the Submitted chequebook record in Cheque book Request Maintenance Screen$")
	public void user_validate_the_submitted_chequebook_record_in_cheque_book_request_maintenance_screen()
			throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.submittedRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.submittedRecordValidationInCBMaintenance().isDisplayed());
	}
    
    @And("User_482 Validate the chequebook status changed from cancelled to apply to approved")
    public void user_482_validate_the_chequebook_status_changed_from_cancelled_to_apply_to_approved() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approvedRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.approvedRecordValidationInCBMaintenance().isDisplayed());
    }
    @Given("User_482 select Chequebookstatus in Amend Cheque Maintanence screen")
    public void user_482_select_chequebookstatus_in_amend_cheque_maintanence_screen() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,amendChequeBookObj.selectChequeBookStatusInAmendChequeCardStatus());
        seleniumActions.getDropDownHelper().SelectUsingVisibleText(amendChequeBookObj.selectChequeBookStatusInAmendChequeCardStatus(),"Cancelled");
    }
    @And("User_482 Search Cheque Book Code in To Cancel Screen")
    public void user_482_search_cheque_book_code_in_to_cancel_screen() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInToCancelScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInToCancelScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInToCancelScreen());
		chequeBookRequestObj.searchChequeBookCodeInToCancelScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInToCancelScreen().sendKeys(Keys.ENTER);
        String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				
			}
			
		}
    }
    @And("User_482 Select Cheque Book Code in To Cancel Screen")
    public void user_482_select_cheque_book_code_in_to_cancel_screen() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.selectChequeBookCodeInToCancelScreen());
		seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInToCancelScreen());
    }
    @And("User_482 Search Cheque Book Code in Approve Cancel Screen")
    public void user_482_search_cheque_book_code_in_approve_cancel_screen() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver,chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen());
		chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen().sendKeys(testData.get("ChequeBookCode"));
		chequeBookRequestObj.searchChequeBookCodeInApproveCancelScreen().sendKeys(Keys.ENTER);
        String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		
		for (int i = 0; i <2000; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
				
			} catch (Exception e) {
				
			}
			
		}
    }
    @And("User_482 Select Cheque Book Code in Approve Cancel Screen")
    public void user_482_select_cheque_book_code_in_approve_cancel_screen() {
    	for (int i = 0; i <200; i++) {
    		try {
    			seleniumActions.getClickAndActionsHelper().doubleClick(chequeBookRequestObj.selectChequeBookCodeInApproveCancelScreen());;
    			break;
    		} catch (Exception e) {
    			if (i==199) {
    				Assert.fail(e.getMessage());
    			}
    		}
    	}
    }
    @And("User_482 Search Cancelled chequebook code in Cheque book Request Maintenance Screen")
    public void user_482_search_cancelled_chequebook_code_in_cheque_book_request_maintenance_screen() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"),Keys.ENTER);
		for (int i = 0; i <50; i++) {
			chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(Keys.ENTER);
		}
		
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				
			}
			
		}
    }
    @And("User_482 Validate the chequebook status changed from cancelled to send to provider")
    public void user_482_validate_the_chequebook_status_changed_from_cancelled_to_send_to_provider() {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.sentToProviderRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.sentToProviderRecordValidationInCBMaintenance().isDisplayed());
    }
    
}
