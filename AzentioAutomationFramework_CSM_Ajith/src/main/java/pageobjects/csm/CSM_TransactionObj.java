package pageobjects.csm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CSM_TransactionObj {
	WebDriver driver;

	public CSM_TransactionObj(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//td[text()='Transactions']")
	private WebElement csm_TransactionMainModule;

	public WebElement csmTransactionMainModule() {
		return csm_TransactionMainModule;
	}

	@FindBy(xpath = "//a[@id='D001MT']//span[text()='Maintenance']")
	private WebElement transaction_Maintenance;

	public WebElement transactionMaintenance() {
		return transaction_Maintenance;
	}

	@FindBy(xpath = "//a[@id='infoBarSearchButton_D001MT']")
	private WebElement transaction_SearchIcon;

	public WebElement transactionSearchIcon() {
		return transaction_SearchIcon;
	}

	@FindBy(xpath = "//input[@id='trxMgntGridTbl_Id_D001MT_gs_ctstrsVO.TRS_NO']")
	private WebElement transaction_SearchTransactionNumber;

	public WebElement transactionSearchTransactionNumber() {
		return transaction_SearchTransactionNumber;
	}
	@FindBy(xpath="//td[text()='Approved']")
	private WebElement transaction_TransactionStatus;

	public WebElement transactionTransactionStatus() {
		return transaction_TransactionStatus;
	}
	@FindBy(xpath="//td[text()='Reversed']")
	private WebElement transaction_TransactionReversedStatus;

	public WebElement transactionTransactionReversedStatus() {
		return transaction_TransactionReversedStatus;
	}
	@FindBy(xpath="//a[text()='Transactions / Maintenance']//parent::td//following-sibling::td//span")
	private WebElement transaction_Closebutton;
	public WebElement transactionClosebutton()
	{
		return transaction_Closebutton;
	}

}
