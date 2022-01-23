package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {

	public WebDriver ldriver;

	public Loginpage(WebDriver rdriver)

	{
		ldriver = rdriver;
		PageFactory.initElements(ldriver, this);
	}

	//@FindBy(xpath = "//header/fedex-alert[1]/div[1]")
	//@CacheLookup
	//WebElement txtalert;


	@FindBy(xpath = "//header/fedex-alert[1]/div[1]/div[1]/span[2]")
	@CacheLookup
	WebElement close;

	@FindBy(xpath = "//span[contains(text(),'Sign Up/Log In')]")
	@CacheLookup
	WebElement lnksignupandsignin_icon;

	@FindBy(xpath = "//a[contains(text(),'Log In')]")
	@CacheLookup
	WebElement lnksignin_menu1;

	@FindBy(xpath = "//a[contains(text(),'CREATE USER ID (FOR EXISTING CUSTOMERS)')]")
	@CacheLookup
	WebElement Createuserid;


	@FindBy(xpath = "//header/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]")
	@CacheLookup
	WebElement openanaccount;



	@FindBy(xpath = "//a[contains(text(),'Log In')]")
	@CacheLookup
	WebElement lnksignin_menu;

	@FindBy(id = "userId" )
	@CacheLookup
	WebElement txtuserid;

	@FindBy(id = "password")
	@CacheLookup
	WebElement txtpassword;


	@FindBy(id = "checkBoxLabel" )
	@CacheLookup
	WebElement checkboxrememberuserid;

	@FindBy(id = "login-btn" )
	@CacheLookup
	WebElement btnlogin;


	//By txtalert = By.xpath("//header/fedex-alert[1]/div[1]");
	//By closeicon = By.xpath("//body[1]/div[1]/header[1]/fedex-alert[1]/div[1]/div[1]/span[2]/svg[1]/g[1]/g[1]/path[2]");

	//By lnksignupandsignin_icon = By.xpath("//span[contains(text(),'Sign Up/Log In')]");

	//By lnksignin_menu = By.xpath("//a[contains(text(),'Log In')]");
	//By lnkcreateuserid = By.xpath("//a[contains(text(),'CREATE USER ID (FOR EXISTING CUSTOMERS)')]");
	//By lnkopenaccount = By.xpath("//header/div[1]/div[1]/nav[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/a[1]");



	//By txtuserid = By.id("userId");
	//By txtpassword = By.id("password");

	//By checkboxrememberuserid = By.id("checkBoxLabel");

	//By btnlogin = By.id("login-btn");

	//Action method


	public String getPageTitle()
	{
		System.out.println("tit"+ldriver.getTitle());
		return ldriver.getTitle();
	}

	public void closealert() {
		close.click();
	}


	public void singupandSignin() {
		lnksignupandsignin_icon.click();
	}

	public void lgnmenu() {
		//String str_Text = lnksignin_menu1.getText();
		//System.out.println("lnksignin_menu1".getText());
		lnksignin_menu1.getText();
	}

	//public void existingcustomer() {
	//	Createuserid.getText();

	//}

	//public String retrieveLoginTextValue() {
	//	String str_Text = openanaccount.getText();
	//	return str_Text;
	//}

	public void login() {
		lnksignin_menu.click();
	}

	public void setUserName(String userid) {
		txtuserid.clear();
		txtuserid.sendKeys(userid);
	}
	public void setPassword(String pwd) {
		txtpassword.clear();
		txtpassword.sendKeys(pwd);

	}

	public void checkbox() {
		checkboxrememberuserid.click();
	}
	public void btnlogin() {
		btnlogin.click();
	}

	//public String getText() {
	//	// TODO Auto-generated method stub
	//	return null;
	//}





}
