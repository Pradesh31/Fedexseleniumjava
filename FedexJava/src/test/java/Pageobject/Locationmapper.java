package Pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.WebElement;

public class Locationmapper {
	public WebDriver ldriver;
	
	public Locationmapper(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver,  this);
		
	}
	
	@FindBy(xpath = "//body/div[4]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/ul[1]/li[1]/a[1]")
	@CacheLookup
	WebElement btnEnglish;
	//Span[@class='fxg-geo-locator__button-label']
	//button[contains(text(),'ACCEPT ALL COOKIES')]
	//html[1]/body[1]/div[1]/header[1]/fedex-cookie-consent[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/button[2]
	@FindBy(xpath = "/html[1]/body[1]/div[1]/header[1]/fedex-cookie-consent[1]/div[1]/div[1]/div[1]/div[1]/form[1]/fieldset[1]/div[3]/button[2]")
	@CacheLookup
	WebElement btnACCEPTALLCOOKIES;
	
	public String getPageTitle()
	{
		return ldriver.getTitle();
	}
	
	public void clickEnglish() {
		btnEnglish.click();
	}
	
	public void clickAccept() {
		btnACCEPTALLCOOKIES.click();
	}
	
	}


