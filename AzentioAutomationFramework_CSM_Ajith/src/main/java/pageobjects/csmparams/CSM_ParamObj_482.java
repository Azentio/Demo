package pageobjects.csmparams;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_ParamObj_482 {
	WebDriver driver;
	public CSM_ParamObj_482(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	// SystemParameters ---->Cheques------->Cheques----->Chequebbok
	@FindBy(xpath="//a[@id='P029MA']")
	private WebElement updateAfterApprove_ChequeBook_482;
	public WebElement updateAfterApprove_ChequeBook_482() {
		return updateAfterApprove_ChequeBook_482;
	}
	
	@FindBy(xpath="//div[@id='_selenuimP0058']//td[text()='ChequeBook']")
	private WebElement chequeBook_Params_482;
	public WebElement chequeBook_Params_482() {
		return chequeBook_Params_482;
	}
	
	@FindBy(xpath="//div[@id='_selenuimP0058']//td[text()='Cheques']")
	private WebElement cheques_Params_482;
	public WebElement cheques_Params_482() {
		return cheques_Params_482;
	}
	
	@FindBy(xpath="//div[@id='_selenuimO001']//td[text()='Control Record']")
	private WebElement controlRecord_Params_482;
	public WebElement controlRecord_Params_482() {
		return controlRecord_Params_482;
	}
	
	@FindBy(xpath="//div[@id='_selenuimSP001']//td[text()='System Parameters']")
	private WebElement systemParameters_Params_482;
	public WebElement systemParameters_Params_482() {
		return systemParameters_Params_482;
	}
	
	@FindBy(xpath="//div[@id='_selenuimP000']//td[text()='Parameters']")
	private WebElement parameters_Params_482;
	public WebElement parameters_Params_482() {
		return parameters_Params_482;
	}
	
	@FindBy(xpath="//input[@id='chequesBookList_GridTbl_Id_P029MA_gs_ctschequesVO.CODE']")
	private WebElement searchChequeBookCodeInUpdateAfterApprove_482;
	public WebElement searchChequeBookCodeInUpdateAfterApprove_482() {
		return searchChequeBookCodeInUpdateAfterApprove_482;
	}
	
	@FindBy(xpath="//td[@id='td_chequesBookList_GridTbl_Id_P029MA_1_ctschequesVO.CODE']")
	private WebElement selectSearchedChequeBookCodeInUpdateAfterApprove_482;
	public WebElement selectSearchedChequeBookCodeInUpdateAfterApprove_482() {
		return selectSearchedChequeBookCodeInUpdateAfterApprove_482;
	}
	
	@FindBy(xpath="//input[@id='chequesBookList_GridTbl_Id_P029P_gs_ctschequesVO.CODE']")
	private WebElement searchChequeBookCodeInrApproveScreen_482;
	public WebElement searchChequeBookCodeInrApproveScreen_482() {
		return searchChequeBookCodeInrApproveScreen_482;
	}
	@FindBy(xpath="//td[@id='td_chequesBookList_GridTbl_Id_P029P_1_ctschequesVO.CODE']")
	private WebElement selectSearchedChequeBookCodeInApproveScreen_482;
	public WebElement selectSearchedChequeBookCodeInApproveScreen_482() {
		return selectSearchedChequeBookCodeInApproveScreen_482;
	}
	
	@FindBy(xpath="//label[@id='chequesBookMaint_FormId_P029P_Approve_key']")
	private WebElement approveButtonInApproveScreen_482;
	public WebElement approveButtonInApproveScreen_482() {
		return approveButtonInApproveScreen_482;
	}
	
	@FindBy(xpath="//label[@id='chequesBookMaint_FormId_P029MA_Update_After_Approve_key']")
	private WebElement updateAfterApproveButtonInUpdateApproveScreen_482;
	public WebElement updateAfterApproveButtonInUpdateApproveScreen_482() {
		return updateAfterApproveButtonInUpdateApproveScreen_482;
	}
	
	@FindBy(xpath="//input[@id='chqbook_process_O001UP']")
	private WebElement chequeBookAdvancedProcessCheckBox_482;
	public WebElement chequeBookAdvancedProcessCheckBox_482() {
		return chequeBookAdvancedProcessCheckBox_482;
	}
	
	@FindBy(xpath="//div[@id='_selenuimO001']//td[text()='Control Record']")
	private WebElement controlRecords_482;
	public WebElement controlRecords_482() {
		return controlRecords_482;
	}
	
	@FindBy(xpath="//a[@id='O001UP']//span[text()='Update After Approve']")
	private WebElement updateAfterApproveControlRecords_482;
	public WebElement updateAfterApproveControlRecords_482() {
		return updateAfterApproveControlRecords_482;
	}
	
	@FindBy(xpath="//label[@id='controlRecordMaint_FormId_O001UP_Update_After_Approve_key']/ancestor::button")
	private WebElement updateAfterApproveButtonControlRecords_482;
	public WebElement updateAfterApproveButtonControlRecords_482() {
		return updateAfterApproveButtonControlRecords_482;
	}
	
	@FindBy(xpath="//a[@id='O001P']//span[text()='Approve']")
	private WebElement approveScreenControlRecords_482;
	public WebElement approveScreenControlRecords_482() {
		return approveScreenControlRecords_482;
	}
	
	@FindBy(xpath="//label[@id='controlRecordMaint_FormId_O001P_Approve_key']/ancestor::button")
	private WebElement approveButtonControlRecords_482;
	public WebElement approveButtonControlRecords_482() {
		return approveButtonControlRecords_482;
	}
	
	@FindBy(id="_popup_path_sol_confirm_ok")
	private WebElement confirmOk_Params_482;
	public WebElement confirmOk_Params_482() {
		return confirmOk_Params_482;
	}
	
	@FindBy(xpath="//a[@id='P029P']")
	private WebElement approveScreen_482;
	public WebElement approveScreen_ChequeBook_482() {
		return approveScreen_482;
	}
	
	@FindBy(xpath="//input[@id='require_cancel_reason_P029MA']")
	private WebElement requireCancelReasonInUpdateApproveScreen_482;
	public WebElement requireCancelReasonInUpdateApproveScreen_482() {
		return requireCancelReasonInUpdateApproveScreen_482;
	}
}
