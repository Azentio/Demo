package stepdefinitions;

import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import dataprovider.ExcelData;
import helper.ClicksAndActionsHelper;
import helper.DropDownHelper;
import helper.JavascriptHelper;
import helper.Selenium_Actions;
import helper.WaitHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobjects.commonelements.CSMCommonWebElements;
import pageobjects.csm.CSM_AmendChequeStatusObj;
import pageobjects.csm.CSM_TransactionObj;
import pageobjects.csm.ChequeBookRequestObj;
import resources.BaseClass;

public class CSM_AmendChequeCardStatusSteps extends BaseClass {
	WebDriver driver = BaseClass.driver;
	WaitHelper waitHelper = new WaitHelper(driver);
	DropDownHelper dropdownHelper = new DropDownHelper(driver);
	Selenium_Actions seleniumActions = new Selenium_Actions(driver);
	ClicksAndActionsHelper clicksAndActionsHelper = new ClicksAndActionsHelper(driver);
	CSM_AmendChequeStatusObj amendChequeStatusObj = new CSM_AmendChequeStatusObj(driver);
	CSMCommonWebElements csmCommonWebElements = new CSMCommonWebElements(driver);
	ChequeBookRequestObj chequeBookRequestObj = new ChequeBookRequestObj(driver);
	JavascriptHelper javascriptHelper = new JavascriptHelper(driver);
	CSM_TransactionObj transactionObj = new CSM_TransactionObj(driver);
	String path = System.getProperty("user.dir") + "\\TestData\\CSMTestData.xlsx";
	ExcelData excelData = new ExcelData(path,"ChequebookRequest","DataSet ID");
	ExcelData testExecution = new ExcelData(path,"TestExecution","TestCaseID");
	Map<String, String> testExecutionData;
	Map<String, String> testData;

	@And("^click on amend cheque card status module$")
	public void click_on_amend_cheque_card_status_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.csmAmendChequeCardStatusModule());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.csmAmendChequeCardStatusModule());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.csmAmendChequeCardStatusModule());
	}

	@And("^click on maintenance screen under cheque card status module$")
	public void click_on_maintenance_screen_under_cheque_card_status_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.csmAmendChequeCardStatusMaintenance());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.csmAmendChequeCardStatusMaintenance());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.csmAmendChequeCardStatusMaintenance());
	}
	

	@And("^get the test data for test case ACSD_002$")
	public void get_the_test_data_for_test_case_acsd002() throws Throwable {
		testData = excelData.getTestdata("DS01_ACSD_002");
	}

	@And("^get the test data for test case ACSD_003$")
	public void get_the_test_data_for_test_case_acsd003() throws Throwable {
		testData = excelData.getTestdata("DS01_ACSD_003");
	}

	@And("^change the product type to cheque book$")
	public void change_the_product_type_to_cheque_book() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardProductTypeDropdown());
		dropdownHelper.SelectUsingVisibleText(amendChequeStatusObj.amendChequeCardProductTypeDropdown(),
				testData.get("Product Type"));
	}

	@And("^enter the branch code in amend cheque$")
	public void enter_the_branch_code_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardBranchCodeInput());
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardBranchCodeInput());
				clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardBranchCodeInput());
				amendChequeStatusObj.amendChequeCardBranchCodeInput()
						.sendKeys(testData.get("Branch Code"));
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^enter the currency code in amend cheque$")
	public void enter_the_currency_code_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardCurrencyCodeInput());

		amendChequeStatusObj.amendChequeCardCurrencyCodeInput().click();
		amendChequeStatusObj.amendChequeCardCurrencyCodeInput()
				.sendKeys(testData.get("Currency Code"));
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardGLCodeInput());

		for (int i = 0; i <= 50; i++) {
			if (!(amendChequeStatusObj.amendChequeCardCurrencyCodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}

	}

	@And("^enter the GL code in amend cheque$")
	public void enter_the_gl_code_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardGLCodeInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardGLCodeInput());

		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardGLCodeInput());
		amendChequeStatusObj.amendChequeCardGLCodeInput().sendKeys(testData.get("Gl Code"));
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardCIFNoInput());
		for (int i = 0; i <= 50; i++) {
			if (!(amendChequeStatusObj.amendChequeCardGLCodeInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}

	}

	@And("^enter the CIF No in amend cheque$")
	public void enter_the_cif_no_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardCIFNoInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardCIFNoInput());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardCIFNoInput());
		amendChequeStatusObj.amendChequeCardCIFNoInput().sendKeys(testData.get("CIF No"));
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardSerialNoInput());
		for (int i = 0; i <= 50; i++) {
			if (!(amendChequeStatusObj.amendChequeCardCIFNoInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}

	}

	@And("^enter the serial number in amend cheque$")
	public void enter_the_serial_number_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardSerialNoInput());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardSerialNoInput());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardSerialNoInput());
		amendChequeStatusObj.amendChequeCardSerialNoInput().sendKeys(testData.get("Serial Number"));
		for (int i = 0; i <= 50; i++) {
			if (!(amendChequeStatusObj.amendChequeCardSerialNoInput().getAttribute("prevvalue").isBlank())) {
				break;
			}
		}

	}

	@And("^click on ok button in amend cheque screen$")
	public void click_on_ok_button_in_amend_cheque_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmOkButton());
	}

	@And("^close the warningpopupin amend cheque screen$")
	public void close_the_warningpopupin_amend_cheque_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmAlertCloseButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmAlertCloseButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmAlertCloseButton());
	}

	

	@And("^give the status in submitted$")
	public void give_the_status_in_submitted() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardStatusDropdown());
		dropdownHelper.SelectUsingVisibleText(amendChequeStatusObj.amendChequeCardStatusDropdown(),
				testData.get("Status"));
	}

	

	@And("^click on retrive in amend cheque$")
	public void click_on_retrive_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardRetriveButton());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardRetriveButton());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardRetriveButton());
	}

	@And("^select the retrived record from amend cheque$")
	public void select_the_retrived_record_from_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardChequeBookCheckBox());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardChequeBookCheckBox());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardChequeBookCheckBox());
	}

	@And("^click on update in amend cheque$")
	public void click_on_update_in_amend_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardUpdateButton());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardUpdateButton());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardUpdateButton());
	}

	@And("^click on ok button in amend cheque update confirmation$")
	public void click_on_ok_button_in_amend_cheque_update_confirmation() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, csmCommonWebElements.csmSaveRecordConfirmOkButton());
		clicksAndActionsHelper.moveToElement(csmCommonWebElements.csmSaveRecordConfirmOkButton());
		clicksAndActionsHelper.clickOnElement(csmCommonWebElements.csmSaveRecordConfirmOkButton());
	}

	@And("^click on ok button after saving the amend cheque status record$")
	public void click_on_ok_button_after_saving_the_amend_cheque_status_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, amendChequeStatusObj.amendChequeCardSaveSuccessOkButton());
		clicksAndActionsHelper.moveToElement(amendChequeStatusObj.amendChequeCardSaveSuccessOkButton());
		clicksAndActionsHelper.clickOnElement(amendChequeStatusObj.amendChequeCardSaveSuccessOkButton());
	}

	
	@Then("^User Validate the Approved chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_approved_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.approvedRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.approvedRecordValidationInCBMaintenance().isDisplayed());
    }
	@Then("^User Validate the destroyed chequebook record in Cheque book Request Maintenance Screen$")
    public void user_validate_the_destroyed_chequebook_record_in_cheque_book_request_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyedRecordValidationInCBMaintenance());
		Assert.assertTrue(chequeBookRequestObj.destroyedRecordValidationInCBMaintenance().isDisplayed());
    }
	@And("^User Search Submitted chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_submitted_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
		seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}

    }


    @And("^User Search Approved chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_approved_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
//    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
//    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
//		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("Created Cheque Book Code"),Keys.ENTER);
		String xpath ="//td[text()='"+testData.get("Created Cheque Book Code")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).isDisplayed();
				break;
				
			} catch (Exception e) {
				
			}
		}
//		for (int i = 0; i <200; i++) {
//			try {
//				driver.findElement(By.xpath(xpath)).click();
//				break;
//				
//			} catch (Exception e) {
//				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
//				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
//				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
//				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
//			}
//			
//		}
	
    }

    @And("^User Search destroyed chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_destroyed_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("Created Cheque Book Code"));
		String xpath ="//td[text()='"+testData.get("Created Cheque Book Code")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}
    }
    @And("^User Search Cancelled chequebook code in Cheque book Request Maintenance Screen$")
    public void user_search_cancelled_chequebook_code_in_cheque_book_request_maintenance_screen() throws Throwable {
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
    	seleniumActions.getWaitHelper().waitForElementwithFluentwait(driver, chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookCodeInCBMaintenance());
		chequeBookRequestObj.searchChequeBookCodeInCBMaintenance().sendKeys(testData.get("ChequeBookCode"));
		String xpath ="//td[text()='"+testData.get("ChequeBookCode")+"']";
		for (int i = 0; i <200; i++) {
			try {
				driver.findElement(By.xpath(xpath)).click();
				break;
				
			} catch (Exception e) {
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.searchChequeBookGridInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().moveToElement(chequeBookRequestObj.findButtonInCBMaintenance());
				seleniumActions.getClickAndActionsHelper().clickOnElement(chequeBookRequestObj.findButtonInCBMaintenance());
			}
			
		}

    }

	@Then("^validate system through the validation for the amend cheque record$")
	public void validate_system_through_the_validation_for_the_amend_cheque_record() throws Throwable {

		for (double i = 0; i <= 900000000; i++) {
			try {
				waitHelper.waitForElementwithFluentwait(driver,
						amendChequeStatusObj.amendChequeCardValidationElement());
				String validationMessage = amendChequeStatusObj.amendChequeCardValidationElement().getText();
				System.out.println("Validation Msg " + validationMessage);
				if (validationMessage.contains(
						"Can't proceed, there is cheques status that are different from the chequebook status")) {
					break;
				} else if (i == 900000000) {
					Assert.fail("Validation is not comming " + validationMessage);
				}
			} catch (Exception e) {

			}
		}

	}

	@And("^click on cheque request module$")
	public void click_on_cheque_request_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.csmChequeBookRequestModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csmChequeBookRequestModule());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csmChequeBookRequestModule());
	}

	@And("^click on cheque query module$")
	public void click_on_cheque_query_module() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.csmchequeBooQueryModule());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.csmchequeBooQueryModule());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.csmchequeBooQueryModule());
				break;
			} catch (Exception e) {
				if (i == 100) {

					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on live search in cheque query$")
	public void click_on_live_search_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
		clicksAndActionsHelper.doubleClick(chequeBookRequestObj.chequeBooQueryModuleLiveSearch());
	}

	@And("^enter the Gl number in cheque query live search$")
	public void enter_the_gl_number_in_cheque_query_live_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode());
		chequeBookRequestObj.chequeBooQueryModuleLiveSearchGlCode().sendKeys(testData.get("Gl Code"));
	}

	@And("^enter the CIF number in cheque query live search$")
	public void enter_the_cif_number_in_cheque_query_live_search() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo());
		chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo().sendKeys(testData.get("CIF No"));
		chequeBookRequestObj.chequeBooQueryModuleLiveSearchCIFNo().sendKeys(Keys.ENTER);
	}

	@And("^select the records from live search$")
	public void select_the_records_from_live_search() throws Throwable {
		String xpath = "(//td[contains(text(),'" + testData.get("Gl Code") + "')])[1]";
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}

		}
		for (int i = 0; i <= 500; i++) {
			try {
				chequeBookRequestObj.chequeBooQueryModuleLiveSearchTableValidation().isDisplayed();
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^enter the currency code in cheque query$")
	public void enter_the_currency_code_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCurrencyCode());
		chequeBookRequestObj.chequeBooQueryModuleCurrencyCode()
				.sendKeys(testData.get("Currency Code"));
		Thread.sleep(1000);

	}

	@And("^enter the Gl Code in cheque query$")
	public void enter_the_gl_code_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleAccGlCode());

		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleAccGlCode());
		chequeBookRequestObj.chequeBooQueryModuleAccGlCode().sendKeys(testData.get("Gl Code"));
		Thread.sleep(1000);
	}

	@And("^enter te Cif Number in cheque query$")
	public void enter_te_cif_number_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleCIFNumber());

		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleCIFNumber());
		chequeBookRequestObj.chequeBooQueryModuleCIFNumber().sendKeys(testData.get("CIF No"));

		Thread.sleep(1000);
	}

	@And("^enter the serial number in cheque query$")
	public void enter_the_serial_number_in_cheque_query() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleSLNumber());

		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleSLNumber());
		chequeBookRequestObj.chequeBooQueryModuleSLNumber().sendKeys(testData.get("Serial Number"));
		Thread.sleep(1000);

	}

	@And("^enter the cheque request number in search grid$")
	public void enter_the_cheque_request_number_in_search_grid() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBooQueryModuleChequeCode());
		for (int i = 0; i <= 100; i++) {
			try {
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBooQueryModuleChequeCode());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBooQueryModuleChequeCode());
				chequeBookRequestObj.chequeBooQueryModuleChequeCode()
						.sendKeys(testData.get("Request No"));
				chequeBookRequestObj.chequeBooQueryModuleChequeCode().sendKeys(Keys.ENTER);
				break;
			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify status of the cheque should changed destroyed to approved$")
	public void verify_status_of_the_cheque_should_changed_destroyed_to_approved() throws Throwable {
		String xpath = "//td[text()='" + testData.get("Request No")
				+ "']//following-sibling::td[contains(text(),'Approved')]";
		boolean status = false;
		for (int i = 0; i <= 500; i++) {
			try {
				status = driver.findElement(By.xpath(xpath)).isDisplayed();

			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
		Assert.assertTrue(status);
	}

	@Then("^get the transaction number and click on alert ok button$")
	public void get_the_transaction_number_and_click_on_alert_ok_button() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyTransactionNumber());
		String transactionNum = chequeBookRequestObj.destroyTransactionNumber().getText();
		String finalTransactionNum = transactionNum.substring(42);
		System.out.println(finalTransactionNum);
		excelData.updateTestData(testData.get("DataSet ID"), "TransactionNumber",
				finalTransactionNum);
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyDestroyAlertOkButton());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyDestroyAlertOkButton());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyDestroyAlertOkButton());
	}

	@And("^click on to be destroyed module$")
	public void click_on_to_be_destroyed_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeDestroyMainModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroyMainModule());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeDestroyMainModule());
	}

	@And("^get the test data for ACSD_004 test case$")
	public void get_the_test_data_for_acsd004_test_case() throws Throwable {
		testData = excelData.getTestdata("DS01_ACSD_004");
	}
	@And("User_482 update Test data id for test case CHB_006 in Amend feature")
	public void user_482_update_test_data_id_for_test_case_chb_in_amend_feature() {
		testExecutionData = testExecution.getTestdata("CHB_006");
    	testData = excelData.getTestdata(testExecutionData.get("Data Set ID"));
	}

	@And("^search the cheque code for to be destroyed cheque code$")
	public void search_the_cheque_code_for_to_be_destroyed_cheque_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeDestroySearchChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroySearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeDestroySearchChequeCode());
		chequeBookRequestObj.toBeDestroySearchChequeCode().sendKeys(testData.get("Created Cheque Book Code"));
		chequeBookRequestObj.toBeDestroySearchChequeCode().sendKeys(Keys.ENTER);
		String xpath = "//td[text()='" + testData.get("Created Cheque Book Code") + "']";

		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on to destroy button$")
	public void click_on_to_destroy_button() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.toBeDestroyToDestroyButton());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroyToDestroyButton());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeDestroyToDestroyButton());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@Then("^verify server got loaded for to be destroyed record$")
	public void verify_server_got_loaded_for_to_be_destroyed_record() throws Throwable {
		String branchCodePrevValue = "";
		for (int i = 0; i <= 1000; i++) {
			try {
				branchCodePrevValue = chequeBookRequestObj.toBeDestroyBranchCodeValidation().getAttribute("prevvalue");
				if (branchCodePrevValue.isBlank()) {
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@And("^click on destroy module$")
	public void click_on_destroy_module() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyMainModule());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyMainModule());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyMainModule());
	}

	@And("^search for destroy record cheque code$")
	public void search_for_destroy_record_cheque_code() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.destroyChequeCodeSearch());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyChequeCodeSearch());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyChequeCodeSearch());
		chequeBookRequestObj.destroyChequeCodeSearch().sendKeys(testData.get("Created Cheque Book Code"));
		chequeBookRequestObj.destroyChequeCodeSearch().sendKeys(Keys.ENTER);
	}

	@And("^select the destroy record$")
	public void select_the_destroy_record() throws Throwable {
		String xpath = "//td[text()='" + testData.get("Created Cheque Book Code") + "']";

		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.clickOnElement(driver.findElement(By.xpath(xpath)));
				clicksAndActionsHelper.doubleClick(driver.findElement(By.xpath(xpath)));
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on destroy button$")
	public void click_on_destroy_button() throws Throwable {
		for (int i = 0; i <= 500; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.destroyDestroyButon());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.destroyDestroyButon());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.destroyDestroyButon());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@Then("^verify server got loaded while we destroy the cheque in destroy stage$")
	public void verify_server_got_loaded_while_we_destroy_the_cheque_in_destroy_stage() throws Throwable {
		String branchCodePrevValue = "";
		for (int i = 0; i <= 1000; i++) {
			try {
				branchCodePrevValue = chequeBookRequestObj.destroyedBranchCodeValidation().getAttribute("prevvalue");
				if (branchCodePrevValue.isBlank()) {
					break;
				}

			} catch (Exception e) {

			}
		}
	}

	@Then("^verify system should show the status to approved for the cheque$")
	public void verify_system_should_show_the_status_to_approved_for_the_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.ChequeBookApprovedStatus());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.ChequeBookApprovedStatus());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.ChequeBookApprovedStatus());
	}

	@And("^click on cheque book request maintenance screen$")
	public void click_on_cheque_book_request_maintenance_screen() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(chequeBookRequestObj.chequeBookMaintenenaceScreen());
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenenaceScreen());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenenaceScreen());
				break;
			}

			catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on search in cheque book request maintenance scren$")
	public void click_on_search_in_cheque_book_request_maintenance_scren() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenaceSearch());
		for (int i = 0; i <= 500; i++) {
			try {
				clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenaceSearch());
				clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenaceSearch());
				break;
			} catch (Exception e) {
				if (i == 500) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^search the cheque code in cheque book request maintenance screen$")
	public void search_the_cheque_code_in_cheque_book_request_maintenance_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode());
		chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode()
				.sendKeys(testData.get("Request No").trim());
		for (int i = 0; i <= 10; i++) {
			chequeBookRequestObj.chequeBookMaintenanceSearchChequeCode().sendKeys(Keys.ENTER);
		}

	}

	@And("^click on Transaction module$")
	public void click_on_transaction_module() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.csmTransactionMainModule());
				clicksAndActionsHelper.moveToElement(transactionObj.csmTransactionMainModule());
				clicksAndActionsHelper.clickOnElement(transactionObj.csmTransactionMainModule());
				break;

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^click on maintenance scree under transaction module$")
	public void click_on_maintenance_scree_under_transaction_module() throws Throwable {
		for (int i = 0; i <= 100; i++) {
			try {
				javascriptHelper.scrollIntoView(transactionObj.transactionMaintenance());
				clicksAndActionsHelper.moveToElement(transactionObj.transactionMaintenance());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionMaintenance());
				break;

			} catch (Exception e) {
				if (i == 100) {
					Assert.fail(e.getMessage());
				}
			}
		}
	}

	@And("^click on search in transaction screen$")
	public void click_on_search_in_transaction_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchIcon());
		for (int i = 0; i <= 200; i++) {
			try {
				clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchIcon());
				clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchIcon());
				break;
			} catch (Exception e) {
				if (i == 200) {
					Assert.fail(e.getMessage());
				}
			}
		}

	}

	@And("^search the transaction number in transaction screen$")
	public void search_the_transaction_number_in_transaction_screen() throws Throwable {
		testData = excelData.getTestdata("DS01_ACSD_004");
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionSearchTransactionNumber());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionSearchTransactionNumber());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionSearchTransactionNumber());
		transactionObj.transactionSearchTransactionNumber()
				.sendKeys(testData.get("TransactionNumber"));
		transactionObj.transactionSearchTransactionNumber().sendKeys(Keys.ENTER);

	}

	@And("^verify transaction status should be approved$")
	public void verify_transaction_status_should_be_approved() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionStatus());
		Assert.assertTrue(transactionObj.transactionTransactionStatus().isDisplayed());
	}

	@And("^close the tranaction screen$")
	public void close_the_tranaction_screen() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionClosebutton());
		clicksAndActionsHelper.moveToElement(transactionObj.transactionClosebutton());
		clicksAndActionsHelper.clickOnElement(transactionObj.transactionClosebutton());
	}

	@Then("^verify system should reverse the transaction of the charged cheque$")
	public void verify_system_should_reverse_the_transaction_of_the_charged_cheque() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, transactionObj.transactionTransactionReversedStatus());
		Assert.assertTrue(transactionObj.transactionTransactionReversedStatus().isDisplayed());
	}
	@And("^User enter reason to suspend chequebook record$")
    public void user_enter_reason_to_suspend_chequebook_record() throws Throwable {
		waitHelper.waitForElementwithFluentwait(driver, chequeBookRequestObj.toBeDestroyed_Reason());
		clicksAndActionsHelper.moveToElement(chequeBookRequestObj.toBeDestroyed_Reason());
		clicksAndActionsHelper.clickOnElement(chequeBookRequestObj.toBeDestroyed_Reason());
		if (chequeBookRequestObj.toBeDestroyed_Reason().getText().isBlank()) {
			chequeBookRequestObj.toBeDestroyed_Reason().sendKeys("ok");
		}
		
    }
	


	

}
