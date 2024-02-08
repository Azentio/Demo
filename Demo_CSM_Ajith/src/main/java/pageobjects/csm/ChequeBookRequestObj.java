package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ChequeBookRequestObj {
	WebDriver driver;
	public ChequeBookRequestObj(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	//******************* Creation of ChequeBook****************************************************//
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.NUM_OF_CHQBOOKS']")
	private WebElement noOfChequeBooks;
	public WebElement noOfChequeBooks() {
		return noOfChequeBooks;
	}
	
	@FindBy(id="lookuptxt_CHEQUE_CODE_Q000MT")
	private WebElement chequeBookCreation_chequeCode;
	public WebElement chequeBookCreation_chequeCode() {
		return chequeBookCreation_chequeCode;
	}
	
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBookCreation_BranchCode;
	public WebElement chequeBookCreation_BranchCode() {
		return chequeBookCreation_BranchCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBookCreation_CurrencyCode;
	public WebElement chequeBookCreation_CurrencyCode() {
		return chequeBookCreation_CurrencyCode;
	}
	
	@FindBy(xpath="//input[@id='cy_name_Q000MT']")
	private WebElement chequeBookCreation_CurrencyCodeValidation;
	public WebElement chequeBookCreation_CurrencyCodeValidation() {
		return chequeBookCreation_CurrencyCodeValidation;
	}
	
	@FindBy(xpath="//*[@id='acc_type_Q000MT']")
	private WebElement chequeBookCreation_AccountTypeValidation;
	public WebElement chequeBookCreation_AccountTypeValidation() {
		return chequeBookCreation_AccountTypeValidation;
	}
	@FindBy(xpath="//*[@id='CIF_NAME_Q000MT']")
	private WebElement chequeBookCreation_AmountCIFValidation;
	public WebElement chequeBookCreation_AmountCIFValidation() {
		return chequeBookCreation_AmountCIFValidation;
	}
	
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBookCreation_GlCode;
	public WebElement chequeBookCreation_GlCode() {
		return chequeBookCreation_GlCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBookCreation_CifCode;
	public WebElement chequeBookCreation_CifCode() {
		return chequeBookCreation_CifCode;
	}
	
	@FindBy(xpath="//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookCreation_SerialNo;
	public WebElement chequeBookCreation_SerialNo() {
		return chequeBookCreation_SerialNo;
	}
	
	@FindBy(xpath="//input[@id='chr_ac_cif_Q000MT']")
	private WebElement chequeBookCreation_DeductChargeValidation;
	public WebElement chequeBookCreation_DeductChargeValidation() {
		return chequeBookCreation_DeductChargeValidation;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000MT_btn_save")
	private WebElement chequeBookCreation_Save;
	public WebElement chequeBookCreation_Save() {
		return chequeBookCreation_Save;
	}
	@FindBy(xpath="//input[@id='lookuptxt_acc_sl_Q000MT']")
	private WebElement chequeBookMaintenance;
	public WebElement chequeBookMaintenance() {
		return chequeBookMaintenance;
	}
	
	@FindBy(xpath="//input[@id='_popup_path_sol_ok']")
	private WebElement chequeBookCreation_OkbuttonWarningPopUp;
	public WebElement chequeBookCreation_OkbuttonWarningPopUp() {
		return chequeBookCreation_OkbuttonWarningPopUp;
	}
	//******************************************************************************************************//
	//*****************************Cancel ******************************************************************//
	
	@FindBy(id="Q000TC")
	private WebElement toCancelScreen;
	public WebElement toCancelScreen() {
		return toCancelScreen;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000TC_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInToCancelScreen;
	public WebElement searchChequeBookCodeInToCancelScreen() {
		return searchChequeBookCodeInToCancelScreen;
	}
	
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TC_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInToCancelScreen;
	public WebElement selectChequeBookCodeInToCancelScreen() {
		return selectChequeBookCodeInToCancelScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000TC_toCancel_key")
	private WebElement toCancelButton;
	public WebElement toCancelButton() {
		return toCancelButton;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000AC_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveCancelScreen;
	public WebElement searchChequeBookCodeInApproveCancelScreen() {
		return searchChequeBookCodeInApproveCancelScreen;
	}
	
	@FindBy(id="chequeBook_cancel_Q000AC")
	private WebElement cancelButton;
	public WebElement cancelButton() {
		return cancelButton;
	}
	@FindBy(xpath="//td[@id='td_chequeBookGridTbl_Id_Q000AC_1_ctschqbookVO.CODE']")
	private WebElement selectChequeBookCodeInApproveCancelScreen;
	public WebElement selectChequeBookCodeInApproveCancelScreen() {
		return selectChequeBookCodeInApproveCancelScreen;
	}
	@FindBy(id="Q000AC")
	private WebElement approveCancelScreen;
	public WebElement approveCancelScreen() {
		return approveCancelScreen;
	}
	
	@FindBy(id="Chequebook Request / To Cancel")
	private WebElement chequebookRequestToCancel;
	public WebElement chequebookRequestToCancel() {
		return chequebookRequestToCancel;
	}
	
	@FindBy(xpath="//*[@id='chq_cancel_reason_desc_Q000TC']")
	private WebElement chequebookCancelReasonValidation;
	public WebElement chequebookCancelReasonValidation() {
		return chequebookCancelReasonValidation;
	}
	@FindBy(id="_popup_path_sol_ok")
	private WebElement okButtonInCancelReasonPopUp;
	public WebElement okButtonInCancelReasonPopUp() {
		return okButtonInCancelReasonPopUp;
	}
	@FindBy(id="lookuptxt_chq_cancel_reason_Q000TC")
	private WebElement cancelReason;
	public WebElement cancelReason() {
		return cancelReason;
	}
	
	@FindBy(xpath="//div[text()='WARNING']/following-sibling::div/a")
	private WebElement closeIconInWarningPopUpcancelScreen;
	public WebElement closeIconInWarningPopUpcancelScreen() {
		return closeIconInWarningPopUpcancelScreen;
	}
	
	@FindBy(xpath="//div[text()='Warning']/following-sibling::div/a")
	private WebElement closeIconInWarningPopUpSubmitScreen;
	public WebElement closeIconInWarningPopUpSubmitScreen() {
		return closeIconInWarningPopUpSubmitScreen;
	}
	//************************************************************************************************************//
	//********************************************Approve Screen**************************************************//
	
	@FindBy(id="Q000AP")
	private WebElement approveSubMenu;
	public WebElement approveSubMenu() {
		return approveSubMenu;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000AP_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveScreen;
	public WebElement searchChequeBookCodeInApproveScreen() {
		return searchChequeBookCodeInApproveScreen;
	}
	@FindBy(xpath ="//td[@id='td_chequeBookGridTbl_Id_Q000AP_1_ctschqbookVO.CODE']")
	private WebElement selectChequeBookCodeInApproveScreen;
	public WebElement selectChequeBookCodeInApproveScreen() {
		return selectChequeBookCodeInApproveScreen;
	}
	
	@FindBy(xpath ="//button[@id='chequebookChargesWaive_Q000AP']")
	private WebElement chargeWaiverButtonInApproveScreen;
	public WebElement chargeWaiverButtonInApproveScreen() {
		return chargeWaiverButtonInApproveScreen;
	}
	
	@FindBy(xpath ="//div[@id='chequeBookChargesDiv_Q000AP']//span[text()='Charges']")
	private WebElement chargeTabInApproveScreen;
	public WebElement chargeTabInApproveScreen() {
		return chargeTabInApproveScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000AP_Approve_key")
	private WebElement approveButton;
	public WebElement approveButton() {
		return approveButton;
	}
	
	@FindBy(id="chequeBook_reject_Q000AP")
	private WebElement rejectButtonInApproveScreen;
	public WebElement rejectButtonInApproveScreen() {
		return rejectButtonInApproveScreen;
	}
	@FindBy(xpath="//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement rejectReasonPopupValidationInApproveChequeBookScreen;
	public WebElement rejectReasonPopupValidationInApproveChequeBookScreen() {
		return rejectReasonPopupValidationInApproveChequeBookScreen;
	}
	
	@FindBy(xpath="//div[text()='[890] Invalid/Missing Reason Code']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
	private WebElement okButtonInCannotProceedPopupInApproveChequeBookScreen;
	public WebElement okButtonInCannotProceedPopupInApproveChequeBookScreen() {
		return okButtonInCannotProceedPopupInApproveChequeBookScreen;
	}
	
	@FindBy(xpath="//label[text()='Reason']/parent::td/following-sibling::td//textarea")
	private WebElement rejectReasonFieldInApproveScreen;
	public WebElement rejectReasonFieldInApproveScreen() {
		return rejectReasonFieldInApproveScreen;
	}
	
	
	//****************************************************************************************************//
	//************************************Submit*********************************************************//
	@FindBy(id="Q000TR")
	private WebElement applyToSubmitSubMenu;
	public WebElement applyToSubmitSubMenu() {
		return applyToSubmitSubMenu	;
	}
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TR_gs_ctschqbookVO.CODE']")
	private WebElement searchChequeBookCodeInApplyToSubmitScreen;
	public WebElement searchChequeBookCodeInApplyToSubmitScreen() {
		return searchChequeBookCodeInApplyToSubmitScreen;
	}
	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000TR_1_ctschqbookVO.CODE']")
	private WebElement selectChequeBookCodeInApplyToSubmitScreen;
	public WebElement selectChequeBookCodeInApplyToSubmitScreen() {
		return selectChequeBookCodeInApplyToSubmitScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000TR_applySubmit_key")
	private WebElement applyToSubmitButton;
	public WebElement applyToSubmitButton() {
		return applyToSubmitButton;
	}
 //******************************************************************************************************************//
 //***********************************************Submit Screen*****************************************************//
	
	@FindBy(id="Q000SB")
	private WebElement submitSubMenuInChequebookRequest;
	public WebElement submitSubMenuInChequebookRequest() {
		return submitSubMenuInChequebookRequest;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000SB_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInSubmitScreen;
	public WebElement searchChequeBookCodeInSubmitScreen() {
		return searchChequeBookCodeInSubmitScreen;
	}
	
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000SB_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInSubmitScreen;
	public WebElement selectChequeBookCodeInSubmitScreen() {
		return selectChequeBookCodeInSubmitScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000SB_submit")
	private WebElement submitButton;
	public WebElement submitButton() {
		return submitButton;
	}
//************************************************************************************************************//
//***************************************Reverse Cancellation*************************************************//
	
	@FindBy(id = "Q000TQ")
	private WebElement toReverseCancellationSubMenu;

	public WebElement toReverseCancellationSubMenu() {
		return toReverseCancellationSubMenu;
	}
	
	@FindBy(id = "chequeBookGridTbl_Id_Q000TQ_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInToReverseCancellationScreen;

	public WebElement searchChequeBookCodeInToReverseCancellationScreen() {
		return searchChequeBookCodeInToReverseCancellationScreen;
	}
	
	@FindBy(id = "td_chequeBookGridTbl_Id_Q000TQ_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInToReverseCancellationScreen;

	public WebElement selectChequeBookCodeInToReverseCancellationScreen() {
		return selectChequeBookCodeInToReverseCancellationScreen;
	}
	
	@FindBy(id = "chequeBookDefFormId_Q000TQ_reverse_key.CODE")
	private WebElement reverseButtonInToReverseCancellationScreen;

	public WebElement reverseButtonInToReverseCancellationScreen() {
		return reverseButtonInToReverseCancellationScreen;
	}
	//*****************************************************Reverse Chequebook **************************************//
	
	@FindBy(id="Q000RV")
	private WebElement reverseChequeBookSubMenu;
	public WebElement reverseChequeBookSubMenu() {
		return reverseChequeBookSubMenu;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000RV_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInReverseChequeBookScreen;
	public WebElement searchChequeBookCodeInReverseChequeBookScreen() {
		return searchChequeBookCodeInReverseChequeBookScreen;
	}
	
	@FindBy(id="td_chequeBookGridTbl_Id_Q000RV_1_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInReverseChequeBookScreen;
	public WebElement selectChequeBookCodeInReverseChequeBookScreen() {
		return selectChequeBookCodeInReverseChequeBookScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000RV_reject_key")
	private WebElement rejectButtonReverseChequeBookScreen;
	public WebElement rejectButtonReverseChequeBookScreen() {
		return rejectButtonReverseChequeBookScreen;
	}
	
	@FindBy(xpath="//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement rejectReasonPopupValidationReverseChequeBookScreen;
	public WebElement rejectReasonPopupValidationReverseChequeBookScreen() {
		return rejectReasonPopupValidationReverseChequeBookScreen;
	}
	
	@FindBy(xpath="//div[text()='[890] Invalid/Missing Reason Code']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
	private WebElement okButtonInCannotProceedPopupReverseChequeBookScreen;
	public WebElement okButtonInCannotProceedPopupReverseChequeBookScreen() {
		return okButtonInCannotProceedPopupReverseChequeBookScreen;
	}
	
	@FindBy(id="//label[text()='Reason']/parent::td/following-sibling::td//textarea")
	private WebElement rejectReasonFieldInReverseChequeBookScreen;
	public WebElement rejectReasonFieldInReverseChequeBookScreen() {
		return rejectReasonFieldInReverseChequeBookScreen;
	}
	//****************************************************Approve Cancellation Reversal *************************************//
	@FindBy(id="Q000AQ")
	private WebElement approveCancellationReversal;
	public WebElement approveCancellationReversal() {
		return approveCancellationReversal;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000AQ_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInApproveCancellationReversalScreen;
	public WebElement searchChequeBookCodeInApproveCancellationReversalScreen() {
		return searchChequeBookCodeInApproveCancellationReversalScreen;
	}
	
	@FindBy(id="chequeBookGridTbl_Id_Q000AQ_gs_ctschqbookVO.CODE")
	private WebElement selectChequeBookCodeInApproveCancellationReversalScreen;
	public WebElement selectChequeBookCodeInApproveCancellationReversalScreen() {
		return selectChequeBookCodeInApproveCancellationReversalScreen;
	}
	
	@FindBy(id="chequeBookDefFormId_Q000AQ_reverse_key")
	private WebElement reverseButtonInApproveCancellationReversalScreen;
	public WebElement reverseButtonInApproveCancellationReversalScreen() {
		return reverseButtonInApproveCancellationReversalScreen;
	}
	@FindBy(id="approveBut_Q000TQ")
	private WebElement approveButtonInSendAlertReverseCancellationScreen;
	public WebElement approveButtonInSendAlertReverseCancellationScreen() {
		return approveButtonInSendAlertReverseCancellationScreen;
	}
	
	@FindBy(id="usr_name_alert_Q000TQ")
	private WebElement userNameInUserInformatioPopUp;
	public WebElement userNameInUserInformatioPopUp() {
		return userNameInUserInformatioPopUp;
	}
	@FindBy(xpath="//label[@id='ApproveAlertsForm_Q000TQ_password_key']/parent::td/following-sibling::td//input")
	private WebElement passwordInUserInformatioPopUp;
	public WebElement passwordInUserInformatioPopUp() {
		return passwordInUserInformatioPopUp;
	}
	
	@FindBy(id="sendButtonForApprove_Q000TQ")
	private WebElement submitButtonInUserInformatioPopUp;
	public WebElement submitButtonInUserInformatioPopUp() {
		return submitButtonInUserInformatioPopUp;
	}
	
	@FindBy(id="alertsOpenItemApprove_Q000TQ")
	private WebElement approveButtonInApproveItemPopUp;
	public WebElement approveButtonInApproveItemPopUp() {
		return approveButtonInApproveItemPopUp;
	}
	
	@FindBy(id="alertsOpenItemReject_Q000TQ")
	private WebElement rejectButtonInApproveItemPopUp;
	public WebElement rejectButtonInApproveItemPopUp() {
		return rejectButtonInApproveItemPopUp;
	}
	//***************************************************** Appprove Cancel**********************************************//
	@FindBy(id="chequeBook_reject_Q000AC")
	private WebElement rejectButtonInApproveCancelScreen;
	public WebElement rejectButtonInApproveCancelScreen() {
		return rejectButtonInApproveCancelScreen;
	}
	@FindBy(xpath="//div[text()='[890] Invalid/Missing Reason Code']")
	private WebElement rejectReasonPopupValidationInApproveCancelChequeBookScreen;
	public WebElement rejectReasonPopupValidationInApproveCancelChequeBookScreen() {
		return rejectReasonPopupValidationInApproveCancelChequeBookScreen;
	}
	
	@FindBy(xpath="//div[text()='[890] Invalid/Missing Reason Code']/parent::div/following-sibling::center/input[@id='_popup_path_sol_ok']")
	private WebElement okButtonInCannotProceedPopupInApproveCancelChequeBookScreen;
	public WebElement okButtonInCannotProceedPopupInApproveCancelChequeBookScreen() {
		return okButtonInCannotProceedPopupInApproveCancelChequeBookScreen;
	}
	@FindBy(id="//label[text()='Reason']/parent::td/following-sibling::td//textarea")
	private WebElement rejectReasonFieldInApproveCancelChequeBookScreen;
	public WebElement rejectReasonFieldInApproveCancelChequeBookScreen() {
		return rejectReasonFieldInApproveCancelChequeBookScreen;
	}
	
	//*****************************************************to reverse cancellation Batch*******************************//
	
	@FindBy(id="Q000BTQ")
	private WebElement toReverseCancellationBatchSubMenu;
	public WebElement toReverseCancellationBatchSubMenu() {
		return toReverseCancellationBatchSubMenu;
	}
	
	@FindBy(id="anchor_1440806148")
	private WebElement retrievebuttonInToReverseCancellationBatchScreen;
	public WebElement retrievebuttonInToReverseCancellationBatchScreen() {
		return retrievebuttonInToReverseCancellationBatchScreen;
	}
	
	
	@FindBy(id="chequebookBulkCancel_to_reverse_cancel_Q000BTQ")
	private WebElement reversebuttonInToReverseCancellationBatchScreen;
	public WebElement reversebuttonInToReverseCancellationBatchScreen() {
		return reversebuttonInToReverseCancellationBatchScreen;
	}
	
	
	@FindBy(id="Q000SP")
	private WebElement suspendScreen;
	public WebElement suspendScreen() {
		return suspendScreen;
	}
	@FindBy(xpath = "//td[text()='Chequebook Request']/preceding-sibling::td/span")
	private WebElement chequebookRequestModule;

	public WebElement chequebookRequestModule() {
		return chequebookRequestModule;
	}
	
	@FindBy(xpath = "//input[@name='CODE']")
	private WebElement suspendSearchCheuqueCode;

	public WebElement suspendSearchCheuqueCode() {
		return suspendSearchCheuqueCode;
	}
	@FindBy(xpath = "//td[@id='td_chequeBookGridTbl_Id_Q000SP_1_ctschqbookVO.CODE']")
	private WebElement suspendSelectCheuqueCode;

	public WebElement suspendSelectCheuqueCode() {
		return suspendSelectCheuqueCode;
	}
	@FindBy(id="chequeBookDefFormId_Q000SP_suspend_key")
	private WebElement suspendButton;
	public WebElement suspendButton() {
		return suspendButton;
	}
	@FindBy(xpath="(//span[text()='Maintenance'])[1]")
	private WebElement MaintenanceIcon;
	public WebElement MaintenanceIcon() {
		return MaintenanceIcon;
	}
	//CB--->ChequeBook
	@FindBy(id="infoBarSearchButton_Q000MT")
	private WebElement searchButtonInCBMaintenance;
	public WebElement searchButtonInCBMaintenance() {
		return searchButtonInCBMaintenance;
	}
	@FindBy(id="search_chequeBookGridTbl_Id_Q000MT")
	private WebElement searchChequeBookGridInCBMaintenance;
	public WebElement searchChequeBookGridInCBMaintenance() {
		return searchChequeBookGridInCBMaintenance;
	}
	@FindBy(id="chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE")
	private WebElement searchChequeBookCodeInCBMaintenance;
	public WebElement searchChequeBookCodeInCBMaintenance() {
		return searchChequeBookCodeInCBMaintenance;
	}
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CHEQUE_CODE']")
	private WebElement searchChequeCodeInCBMaintenance;
	public WebElement searchChequeCodeInCBMaintenance() {
		return searchChequeCodeInCBMaintenance;
	}
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_BR']")
	private WebElement searchBranchCodeInCBMaintenance;
	public WebElement searchBranchCodeInCBMaintenance() {
		return searchBranchCodeInCBMaintenance;
	}
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_CY']")
	private WebElement searchCurrenyCodeInCBMaintenance;
	public WebElement searchCurrenyCodeInCBMaintenance() {
		return searchCurrenyCodeInCBMaintenance;
	}
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_GL']")
	private WebElement searchGlCodeInCBMaintenance;
	public WebElement searchGlCodeInCBMaintenance() {
		return searchGlCodeInCBMaintenance;
	}
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_CIF']")
	private WebElement searchCIFCodeInCBMaintenance;
	public WebElement searchCIFCodeInCBMaintenance() {
		return searchCIFCodeInCBMaintenance;
	}
	
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.ACC_SL']")
	private WebElement searchSLInMaintenance;
	public WebElement searchSLInMaintenance() {
		return searchSLInMaintenance;
	}
	
	@FindBy(id="fbox_chequeBookGridTbl_Id_Q000MT_search")
	private WebElement findButtonInCBMaintenance;
	public WebElement findButtonInCBMaintenance() {
		return findButtonInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='Submitted']")
	private WebElement submittedRecordValidationInCBMaintenance;
	public WebElement submittedRecordValidationInCBMaintenance() {
		return submittedRecordValidationInCBMaintenance;
	}
	@FindBy(xpath="//td[text()='Suspended']")
	private WebElement suspendRecordValidationInCBMaintenance;
	public WebElement suspendRecordValidationInCBMaintenance() {
		return suspendRecordValidationInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='To be Cancelled']")
	private WebElement toBeCancelledRecordValidationInCBMaintenance;
	public WebElement toBeCancelledRecordValidationInCBMaintenance() {
		return toBeCancelledRecordValidationInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='Deleted']")
	private WebElement rejectedRecordValidationInCBMaintenance;
	public WebElement rejectedRecordValidationInCBMaintenance() {
		return rejectedRecordValidationInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='Cancelled']")
	private WebElement cancelledRecordValidationInCBMaintenance;
	public WebElement cancelledRecordValidationInCBMaintenance() {
		return cancelledRecordValidationInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='Sent to Provider']")
	private WebElement sentToProviderRecordValidationInCBMaintenance;
	public WebElement sentToProviderRecordValidationInCBMaintenance() {
		return sentToProviderRecordValidationInCBMaintenance;
	}
	@FindBy(xpath="//td[text()='Approved']")
	private WebElement approvedRecordValidationInCBMaintenance;
	public WebElement approvedRecordValidationInCBMaintenance() {
		return approvedRecordValidationInCBMaintenance;
	}
	@FindBy(xpath="//td[text()='Destroyed']")
	private WebElement destroyedRecordValidationInCBMaintenance;
	public WebElement destroyedRecordValidationInCBMaintenance() {
		return destroyedRecordValidationInCBMaintenance;
	}
	
	@FindBy(xpath="//td[text()='To Reverse Cancellation']")
	private WebElement toReverseCancellationRecordValidationInCBMaintenance;
	public WebElement toReverseCancellationRecordValidationInCBMaintenance() {
		return toReverseCancellationRecordValidationInCBMaintenance;
	}
	
	@FindBy(id="Q000MT")
	private WebElement CBMaintenanceScreen;
	public WebElement CBMaintenanceScreen() {
		return CBMaintenanceScreen;
	}
	
	@FindBy(xpath="//span[text()='close']")
	private WebElement viewMemoPopupClose;
	public WebElement viewMemoPopupClose() {
		return viewMemoPopupClose;
	}
//Anandh
	@FindBy(xpath="//td[text()='Chequebook Request']")
	private WebElement csm_chequeBookRequestModule;
	public WebElement csmChequeBookRequestModule()
	{
		return csm_chequeBookRequestModule;
	}
	@FindBy(xpath="//span[text()='Chequebook Query']")
	private WebElement csm_chequeBooQueryModule;
	public WebElement csmchequeBooQueryModule()
	{
		return csm_chequeBooQueryModule;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_BR']")
	private WebElement chequeBooQueryModule_BranchCode;
	public WebElement chequeBooQueryModuleBranchCode()
	{
		return chequeBooQueryModule_BranchCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CY']")
	private WebElement chequeBooQueryModule_CurrencyCode;
	public WebElement chequeBooQueryModuleCurrencyCode()
	{
		return chequeBooQueryModule_CurrencyCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_GL']")
	private WebElement chequeBooQueryModule_AccGlCode;
	public WebElement chequeBooQueryModuleAccGlCode()
	{
		return chequeBooQueryModule_AccGlCode;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_CIF']")
	private WebElement chequeBooQueryModule_CIFNumber;
	public WebElement chequeBooQueryModuleCIFNumber()
	{
		return chequeBooQueryModule_CIFNumber;
	}
	@FindBy(xpath="//input[@name='chequeBookCO.ctschqbookVO.ACC_SL']")
	private WebElement chequeBooQueryModule_SLNumber;
	public WebElement chequeBooQueryModuleSLNumber()
	{
		return chequeBooQueryModule_SLNumber;
	}
	@FindBy(xpath="//input[@id='chequeBookQueryTbl_Id_Q000QR_gs_CODE']")
	private WebElement chequeBooQueryModule_ChequeCode;
	public WebElement chequeBooQueryModuleChequeCode()
	{
		return chequeBooQueryModule_ChequeCode;
	}
	@FindBy(xpath="//span[@id='spanLookup_status_sl_Q000QR']//span")
	private WebElement chequeBooQueryModule_LiveSearch;
	public WebElement chequeBooQueryModuleLiveSearch()
	{
		return chequeBooQueryModule_LiveSearch;
	}
	@FindBy(xpath="//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.GL_CODE']")
	private WebElement chequeBooQueryModuleLiveSearch_GlCode;
	public WebElement chequeBooQueryModuleLiveSearchGlCode()
	{
		return chequeBooQueryModuleLiveSearch_GlCode;
	}
	@FindBy(xpath="//input[@id='gridtab_status_sl_Q000QR_gs_amfVO.CIF_SUB_NO']")
	private WebElement chequeBooQueryModuleLiveSearch_CIFNo;
	public WebElement chequeBooQueryModuleLiveSearchCIFNo()
	{
		return chequeBooQueryModuleLiveSearch_CIFNo;
	}
	@FindBy(xpath="//table[@id='chequeBookQueryTbl_Id_Q000QR']//tr[2]")
	private WebElement chequeBooQueryModuleLiveSearch_TableValidation;
	public WebElement chequeBooQueryModuleLiveSearchTableValidation()
	{
		return chequeBooQueryModuleLiveSearch_TableValidation;
	}
	@FindBy(xpath="//span[text()='To Be Destroyed']")
	private WebElement toBeDestroy_MainModule;
	public WebElement toBeDestroyMainModule()
	{
		return toBeDestroy_MainModule;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000TD_gs_ctschqbookVO.CODE']")
	private WebElement toBeDestroy_SearchChequeCode;
	public WebElement toBeDestroySearchChequeCode()
	{
		return toBeDestroy_SearchChequeCode;
	}
	@FindBy(xpath="//button[@id='chequeBook_toDestroy_Q000TD']")
	private WebElement toBeDestroy_ToDestroyButton;
	public WebElement toBeDestroyToDestroyButton()
	{
		return toBeDestroy_ToDestroyButton;
	}
	@FindBy(xpath="//input[@id='acc_br_Q000TD']")
	private WebElement toBeDestroy_BranchCodeValidation;
	public WebElement toBeDestroyBranchCodeValidation()
	{
		return toBeDestroy_BranchCodeValidation;
	}
	@FindBy(xpath="//span[text()='Approve Destroyed']")
	private WebElement destroy_MainModule;
	public WebElement destroyMainModule()
	{
		return destroy_MainModule;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000AD_gs_ctschqbookVO.CODE']")
	private WebElement destroy_ChequeCodeSearch;
	public WebElement destroyChequeCodeSearch()
	{
		return destroy_ChequeCodeSearch;
	}
	@FindBy(xpath="//button[@id='chequeBook_destroy_Q000AD']")
	private WebElement destroy_DestroyButon;
	public WebElement destroyDestroyButon()
	{
		return destroy_DestroyButon;
	}
	@FindBy(xpath="//center//input[@value='Ok']")
	private WebElement destroy_DestroyAlertOkButton;
	public WebElement destroyDestroyAlertOkButton()
	{
		return destroy_DestroyAlertOkButton;
	}
	@FindBy(xpath="//div[@class='jMsgbox-contentWrap']")
	private WebElement destroy_TransactionNumber;
	public WebElement destroyTransactionNumber()
	{
		return destroy_TransactionNumber;
	}
	@FindBy(xpath="//td[text()='Chequebook Request']//ancestor::h3//following-sibling::ul//span[text()='Maintenance']")
	private WebElement chequeBook_MaintenenaceScreen;
	public WebElement chequeBookMaintenenaceScreen()
	{
		return chequeBook_MaintenenaceScreen;
	}
	@FindBy(xpath="//a[@id='infoBarSearchButton_Q000MT']")
	private WebElement chequeBookMaintenance_Search;
	public WebElement chequeBookMaintenaceSearch()
	{
		return chequeBookMaintenance_Search;
	}
	@FindBy(xpath="//input[@id='chequeBookGridTbl_Id_Q000MT_gs_ctschqbookVO.CODE']")
	private WebElement chequeBookMaintenance_SearchChequeCode;
	public WebElement chequeBookMaintenanceSearchChequeCode()
	{
		return chequeBookMaintenance_SearchChequeCode;
	}
	@FindBy(xpath="//table[@id='chequeBookGridTbl_Id_Q000MT']//td[text()='Approved']")
	private WebElement ChequeBook_ApprovedStatus;

	public WebElement ChequeBookApprovedStatus() {
		return ChequeBook_ApprovedStatus;
	}
	@FindBy(xpath="//input[@id='acc_br_Q000AD']")
	private WebElement destroyed_BranchCodeValidation;
	public WebElement destroyedBranchCodeValidation()
	{
		return destroyed_BranchCodeValidation;
	}
	
	@FindBy(xpath="//textarea[@name='chequeBookCO.ctschqbookVO.STATUS_REMARKS']")
	private WebElement toBeDestroyed_Reason;
	public WebElement toBeDestroyed_Reason()
	{
		return toBeDestroyed_Reason;
	}
		
	@FindBy(id="Q000BAQ")
	private WebElement approveReversalOfCancellationBatchSubMenu;
	public WebElement approveReversalOfCancellationBatchSubMenu()
	{
		return approveReversalOfCancellationBatchSubMenu;
	}
		
	@FindBy(id="anchor_463075865")
	private WebElement retrieveButtonInApproveReversalOfCancellationBatchScreen;
	public WebElement retrieveButtonInApproveReversalOfCancellationBatchScreen()
	{
		return retrieveButtonInApproveReversalOfCancellationBatchScreen;
	}
	
	@FindBy(id="chequebookBulkCancel_approve_reverse_cancel_Q000BAQ")
	private WebElement approveReverseButtonInApproveReversalOfCancellationBatch;
	public WebElement approveReverseButtonInApproveReversalOfCancellationBatch()
	{
		return approveReverseButtonInApproveReversalOfCancellationBatch;
	}
}
