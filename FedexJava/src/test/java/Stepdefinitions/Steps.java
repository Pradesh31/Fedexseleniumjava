package Stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pageobject.Locationmapper;
import Pageobject.Loginpage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When; 



public class Steps extends Baseclass  

{ 
	@Given("user launch the chrome browser")
	public void user_launch_the_chrome_browser() {
		System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		lm = new Locationmapper(driver);

	}

	@When("user opens URL {string}") 
	public void user_opens_url(String url) throws InterruptedException {
		driver.get(url);
		Thread.sleep(2000);
	}
	@And("user should be able to see {string} Language")
	public void user_should_be_able_to_see_language1(String string) {

	}

	@And("user should be able to see {string}  language")
	public void user_should_be_able_to_see_language11(String string) {

	} 



	@When("user clicks on {string} language")
	public void user_clicks_on_language(String string) throws InterruptedException {
		lm.clickEnglish();
		Thread.sleep(3000);
	}

	@When("user accepted all Cookies in the home page")
	public void user_accepted_all_cookies_in_the_home_page() throws InterruptedException {
		lm.clickAccept();
		Thread.sleep(2000);
	}

	@Then("page Title should be {string}")
	public void page_title_should_be(String string) throws InterruptedException {
		// getTitle() to obtain page title
		System.out.println("Page title is : " + driver.getTitle());
		Thread.sleep(2000);

	}	

	//Login Feature steps

	@When("user click the {string} in Covid alert banner.")
	public void user_click_the_in_covid_alert_banner(String string) {
		// Write code here that turns the phrase above into concrete actions

		lp = new Loginpage(driver); 
		lp.closealert();
	}







	@When("user clicks on {string} icon.")
	public void user_clicks_on_icon(String string) throws InterruptedException {
		lp.singupandSignin();
		Thread.sleep(2000);

	}
	@And("user should be able to see {string} option in the menu.")
	public void user_should_be_able_to_see_option_in_the_menu (String string) throws InterruptedException {
		Assert.assertTrue(driver.findElement(By.tagName("body")).getText()
				.contains("Log In"));
		Thread.sleep(2000);

	}


	@When("user clicks on {string}")
	public void user_clicks_on(String string) throws InterruptedException {
		lp.login();
		Thread.sleep(3000);

	}

	@And("user enters userid as {string} and pwd as {string}")
	public void user_enters_email_as_and_password_as(String userid, String pwd) throws InterruptedException {
		lp.setUserName(userid);
		lp.setPassword(pwd);
		Thread.sleep(3000);

	}

	@When("user click Remember my user ID")
	public void user_click_Remember_my_user_ID() throws InterruptedException {
		lp.checkbox();
		Thread.sleep(2000);

	}
	@And("user clicks on login")
	public void user_clicks_on_login(){
		lp.btnlogin();
		
	}
	
	
	
	@And("close browser")
	public void close_browser() {
		driver.quit();
	}

}
