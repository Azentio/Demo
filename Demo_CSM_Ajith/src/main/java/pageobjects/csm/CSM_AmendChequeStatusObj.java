package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_AmendChequeStatusObj {
	WebDriver driver;
	public CSM_AmendChequeStatusObj(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//td[text()='Amend Cheque/Card status']")
	private WebElement csm_AmendChequeCardStatusModule;
	public WebElement csmAmendChequeCardStatusModule()
	{
		return csm_AmendChequeCardStatusModule;
	}
	@FindBy(xpath="//td[text()='Amend Cheque/Card status']//ancestor::div//span[text()='Maintenance']")
	private WebElement csm_AmendChequeCardStatusMaintenance;
	public WebElement csmAmendChequeCardStatusMaintenance()
	{
		return csm_AmendChequeCardStatusMaintenance;
	}
	@FindBy(xpath="//select[@id='product_type_QG001MT']")
	private WebElement amendChequeCard_ProductTypeDropdown;
	public WebElement amendChequeCardProductTypeDropdown()
	{
		return amendChequeCard_ProductTypeDropdown;
	}
	@FindBy(xpath="//input[@id='BR_CODE_QG001MT']")
	private WebElement amendChequeCard_BranchCodeInput;
	public WebElement amendChequeCardBranchCodeInput()
	{
		return amendChequeCard_BranchCodeInput;
	}
	@FindBy(xpath="//input[@id='CY_CODE_QG001MT']")
	private WebElement amendChequeCard_CurrencyCodeInput;
	public WebElement amendChequeCardCurrencyCodeInput()
	{
		return amendChequeCard_CurrencyCodeInput;
	}
	@FindBy(xpath="//input[@id='GL_CODE_QG001MT']")
	private WebElement amendChequeCard_GLCodeInput;
	public WebElement amendChequeCardGLCodeInput()
	{
		return amendChequeCard_GLCodeInput;
	}
	@FindBy(xpath="//input[@id='CIF_SUB_NO_QG001MT']")
	private WebElement amendChequeCard_CIFNoInput;
	public WebElement amendChequeCardCIFNoInput()
	{
		return amendChequeCard_CIFNoInput;
	}
	@FindBy(xpath="//input[@id='lookuptxt_SL_NO_QG001MT']")
	private WebElement amendChequeCard_SerialNoInput;
	public WebElement amendChequeCardSerialNoInput()
	{
		return amendChequeCard_SerialNoInput;
	}
	              
	@FindBy(xpath="//input[@id='requestNo_QG001MT']")
	private WebElement amendChequeCard_RequestNoInput;
	public WebElement amendChequeCardRequestNoInput()
	{
		return amendChequeCard_RequestNoInput;
	}
	@FindBy(xpath="//select[@name='amendChequeCardCO.ctsAmendProductVO.STATUS']")
	private WebElement amendChequeCard_StatusDropdown;
	public WebElement amendChequeCardStatusDropdown()
	{
		return amendChequeCard_StatusDropdown;
	}
	@FindBy(xpath="//button[@id='retrieveBtn_QG001MT']")
	private WebElement amendChequeCard_RetriveButton;
	public WebElement amendChequeCardRetriveButton()
	{
		return amendChequeCard_RetriveButton;
	}
	@FindBy(xpath="//input[@name='jqg_ammendChequeBookGridTbl_Id_QG001MT_1']")
	private WebElement amendChequeCard_ChequeBookCheckBox;
	public WebElement amendChequeCardChequeBookCheckBox()
	{
		return amendChequeCard_ChequeBookCheckBox;
	}
	@FindBy(xpath="//button[@id='amendChequeCard_update_QG001MT']")
	private WebElement amendChequeCard_UpdateButton;
	public WebElement amendChequeCardUpdateButton()
	{
		return amendChequeCard_UpdateButton;
	}
	@FindBy(xpath="//div[@class='jMsgbox-contentWrap']")
	private WebElement amendChequeCard_ValidationElement;
	public WebElement amendChequeCardValidationElement()
	{
		return amendChequeCard_ValidationElement;
	}
	@FindBy(xpath="//div[text()='record saved successfully']//parent::div//following-sibling::center//input")
	private WebElement amendChequecard_SaveSuccessOkButton;
	public WebElement amendChequeCardSaveSuccessOkButton()
	{
		return amendChequecard_SaveSuccessOkButton;
	}
}
