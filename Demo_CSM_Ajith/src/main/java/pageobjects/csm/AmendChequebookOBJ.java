package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmendChequebookOBJ {
	WebDriver driver;

	public AmendChequebookOBJ(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	@FindBy(xpath="//select[@id='product_type_QG001MT']")
	private WebElement productType;
	public WebElement productType() {
		return productType;
	}
	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[1]")
	private WebElement branchCode;

	public WebElement branchCode() {
		return branchCode;
	}
	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[2]")
	private WebElement currencyCode;

	public WebElement currencyCode() {
		return currencyCode;
	}
	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[3]")
	private WebElement glCode;

	public WebElement glCode() {
		return glCode;
	}

	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[4]")
	private WebElement cifCode;

	public WebElement cifCode() {
		return cifCode;
	}

	@FindBy(xpath = "((//label[text()='A/C No. '])[2]//parent::td//following-sibling::td[1]//input)[5]")
	private WebElement serialNumber;

	public WebElement serialNumber() {
		return serialNumber;
	} 
	
	@FindBy(xpath="//label[text()='Request No ']/parent::td/ancestor::tr//input[@name='amendChequeCardCO.ctsAmendProductVO.CHEQUEBOOK_CODE']")
	private WebElement chequeRequestNo;
	public WebElement chequeRequestNo() {
		return chequeRequestNo;
	}
	@FindBy(xpath="//button[@id='retrieveBtn_QG001MT']")
	private WebElement retrieve;
	public WebElement retrieve() {
		return retrieve;
	}
	@FindBy(xpath="//td[text()='Amend Cheque/Card status']")
	private WebElement AmendChequeCardMenu;
	public WebElement AmendChequeCardMenu() {
		return AmendChequeCardMenu;
	}
	@FindBy(xpath="(//span[text()='Maintenance'])[1]")
	private WebElement MaintenanceIcon;
	public WebElement MaintenanceIcon() {
		return MaintenanceIcon;
	}
	//td[text()='694']/parent::tr//input
	

	@FindBy(xpath = "//button[@id='amendChequeCard_update_QG001MT']")
	private WebElement updateAmend;

	public WebElement updateAmend() {
		return updateAmend;
	}
	
	
	@FindBy(xpath = "//td[text()='Chequebook Request']/preceding-sibling::td/span")
	private WebElement chequebookRequestModule;

	public WebElement chequebookRequestModule() {
		return chequebookRequestModule;
	}
	
	@FindBy(xpath = "//span[text()='Chequebook Query']")
	private WebElement chequebookQuerySubMenu;

	public WebElement chequebookQuerySubMenu() {
		return chequebookQuerySubMenu;
	}
	
	@FindBy(xpath = "//label[text()='Account ']/parent::legend/following-sibling::table//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement branchCodeInChequeBookQuery;

	public WebElement branchCodeInChequeBookQuery() {
		return branchCodeInChequeBookQuery;
	}
	
	@FindBy(xpath = "//label[text()='Account ']/parent::legend/following-sibling::table//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement currencyCodeInChequeBookQuery;

	public WebElement currencyCodeInChequeBookQuery() {
		return currencyCodeInChequeBookQuery;
	}
	
	@FindBy(xpath = "//label[text()='Account ']/parent::legend/following-sibling::table//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement glCodeInChequeBookQuery;

	public WebElement glCodeInChequeBookQuery() {
		return glCodeInChequeBookQuery;
	}
	
	@FindBy(xpath = "//label[text()='Account ']/parent::legend/following-sibling::table//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement cifCodeInChequeBookQuery;

	public WebElement cifCodeInChequeBookQuery() {
		return cifCodeInChequeBookQuery;
	}
	
	@FindBy(xpath = "//label[text()='Account ']/parent::legend/following-sibling::table//input[@id='lookuptxt_status_sl_Q000QR']")
	private WebElement serialNoInChequeBookQuery;

	public WebElement serialNoInChequeBookQuery() {
		return serialNoInChequeBookQuery;
	}
	
	@FindBy(xpath = "//input[@value='Ok ']")
	private WebElement confirmSaveRecord;

	public WebElement confirmSaveRecord() {
		return confirmSaveRecord;
	}	
	@FindBy(xpath = "//input[@id='_popup_path_sol_ok']")
	private WebElement recordSavedSuccessfully;

	public WebElement recordSavedSuccessfully() {
		return recordSavedSuccessfully;
	}
	
	@FindBy(xpath = "//input[@id='chequeBookQueryTbl_Id_Q000QR_gs_CODE']")
	private WebElement chequebookCodeInCheckbooQueryScreen;

	public WebElement chequebookCodeInCheckbooQueryScreen() {
		return chequebookCodeInCheckbooQueryScreen;
	}
	@FindBy(xpath = "//td[text()='Apply To Submit']")
	private WebElement applyToSubmitValidation;

	public WebElement applyToSubmitValidation() {
		return applyToSubmitValidation;
	}
	
	@FindBy(xpath = "//a[text()='Chequebook Request / Chequebook Query']")
	private WebElement chequeBookRequest_ChequeBookQuery;

	public WebElement chequeBookRequest_ChequeBookQuery() {
		return chequeBookRequest_ChequeBookQuery;
	}
	
	@FindBy(xpath = "//a[@id='infoBarSearchButton_Q000MT']")
	private WebElement searchIconInChequeBookMaintenanceScreen;

	public WebElement searchIconInChequeBookMaintenanceScreen() {
		return searchIconInChequeBookMaintenanceScreen;
	}
	
	@FindBy(xpath = "//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE']")
	private WebElement searchChequeBookCodeInChequeBookMaintenanceScreen;

	public WebElement searchChequeBookCodeInChequeBookMaintenanceScreen() {
		return searchChequeBookCodeInChequeBookMaintenanceScreen;
	}
	
	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000MT_1_ctschqbookVO.CODE']")
	private WebElement selectSearchedChequeBookCodeInChequeBookMaintenanceScreen;

	public WebElement selectSearchedChequeBookCodeInChequeBookMaintenanceScreen() {
		return selectSearchedChequeBookCodeInChequeBookMaintenanceScreen;
	}
	
	@FindBy(xpath = "//select[@id='check_status_type_QG001MT']")
	private WebElement selectChequeBookStatusInAmendChequeCardStatus;

	public WebElement selectChequeBookStatusInAmendChequeCardStatus() {
		return selectChequeBookStatusInAmendChequeCardStatus;
	}
	
	
	

}
