package pageobjects.commonelements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSMCommonWebElements {
	WebDriver driver;

	public CSMCommonWebElements(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "j_username")
	private WebElement csm_UserName;

	public WebElement csmUserName() {
		return csm_UserName;
	}

	@FindBy(id = "passwordInp")
	private WebElement csm_Password;

	public WebElement csmPassword() {
		return csm_Password;
	}

	@FindBy(id = "lookuptxt_COMP_CODE")
	private WebElement csm_CompanyCode;

	public WebElement csmCompanyCode() {
		return csm_CompanyCode;
	}

	@FindBy(xpath = "//input[@id='lookuptxt_BRANCH_CODE']")
	private WebElement csm_BranchCode;

	public WebElement csmBranchCode() {
		return csm_BranchCode;
	}

	@FindBy(id="legend")
	private WebElement csm_CompanyAndBranchLogin;

	public WebElement csmCompanyAndBranchLogin() {
		return csm_CompanyAndBranchLogin;
	}
	@FindBy(xpath="//input[@name='branchesVO.BRIEF_DESC_ENG']")
	private WebElement csm_BranchCodeValidation;

	public WebElement csmBranchCodeValidation() {
		return csm_BranchCodeValidation;
	}

	@FindBy(id = "login")
	private WebElement csm_LoginButon;

	public WebElement csmLoginButon() {
		return csm_LoginButon;
	}

	@FindBy(xpath = "//span[contains(text(),' Continue')]")
	private WebElement csm_ContinueButton;

	public WebElement csmContinueButton() {
		return csm_ContinueButton;
	}

	@FindBy(xpath = "//label[contains(text(),'User')]")
	private WebElement csm_LoginValidation;

	public WebElement csmLoginValidation() {
		return csm_LoginValidation;
	}
	@FindBy(id="hder_logout_icon_id")
	private WebElement csm_logoutButton;
	public WebElement csmLogoutButton()
	{
		return csm_logoutButton;
	}
	@FindBy(xpath="//span[contains(text(),' Yes')]//parent::a")
	private WebElement csm_ForceLogoutYesButton;
	public WebElement csmForceLogoutYesButton()
	{
		return csm_ForceLogoutYesButton;
	}
	@FindBy(xpath="//div[@id='div__popup_path_sol_ok']//div[2]//div")
	private WebElement csm_AlertPopup;
	public WebElement csmAlertPopup()
	{
		return csm_AlertPopup;
	}
	@FindBy(xpath="//span[contains(text(),'Maintenance')]")
	private WebElement csm_MaintenanceButton;
	public WebElement csmMaintenanceButton()
	{
		return csm_MaintenanceButton;
	}
	@FindBy(xpath="//label[text()='Approve ']//ancestor::button")
	private WebElement csm_ApproveButton;
	public WebElement csmApproveButton()
	{
		return csm_ApproveButton;
	}
	@FindBy(xpath="//div[text()='Confirm Approve Process']//ancestor::div//center//input[1]")
	private WebElement csm_ConfirmApprovOkButton;
	public WebElement csmConfirmApprovOkButton()
	{
		return csm_ConfirmApprovOkButton;
	}
	@FindBy(xpath="//div[text()='Record was Approved Successfully']//ancestor::div//center//input[1]")
	private WebElement csm_ApproveSuccessOkButton;
	public WebElement csmApproveSuccessOkButton()
	{
		return csm_ApproveSuccessOkButton;
	}
	@FindBy(xpath="//button[@value='Submit']")
	private WebElement csm_SaveButton;
	public WebElement csmSaveButton()
	{
		return csm_SaveButton;
	}
	@FindBy(xpath="//div[text()='Confirm Save Process']//ancestor::div//center//input[1]")
	private WebElement csm_SaveConfirmOkButton;
	public WebElement csmSaveConfirmOkButton()
	{
		return csm_SaveConfirmOkButton;
	}
	@FindBy(xpath="//div[text()='Confirm Save Record']//ancestor::div//center//input[1]")
	private WebElement csm_SaveRecordConfirmOkButton;
	public WebElement csmSaveRecordConfirmOkButton()
	{
		return csm_SaveRecordConfirmOkButton;
	}
	@FindBy(xpath="//span[@class='displayProgIcon']//img")
	private WebElement csm_LoadingImage;
	public WebElement csmLoadingImage()
	{
		return csm_LoadingImage;
	}
	@FindBy(xpath="//div[text()='Record Saved Successfully']//ancestor::div//center//input[1]")
	private WebElement csm_SaveSuccessOkButton;
	public WebElement csmSaveSuccessOkButton()
	{
		return csm_SaveSuccessOkButton;
	}
	@FindBy(xpath="//center//input[@value='Ok']")
	private WebElement csm_OkButton;
	public WebElement csmOkButton()
	{
		return csm_OkButton;
	}
	@FindBy(xpath="//span[text()='close']")
	private WebElement csm_AlertCloseButton;
	public WebElement csmAlertCloseButton()
	{
		return csm_AlertCloseButton;
	}
	// user already login
		@FindBy(xpath="//td[text()='User already logged in with different session, force other session logout?']")
		private WebElement csm_UserAlreadyLoginPopUp;
		public WebElement csm_UserAlreadyLoginPopUp()
		{
			return csm_UserAlreadyLoginPopUp;
		}
		
		@FindBy(xpath="//a[@id='continueBtn']")
		private WebElement csm_UserAlreadyLoginYes;
		public WebElement csm_UserAlreadyLoginYes()
		{
			return csm_UserAlreadyLoginYes;
		}

}
