package Steps;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import Util.Lib;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class GUIStepDefinition extends Lib{

public WebDriver driver;

@Before
public void Initialize() {
	
System.out.println("This is Before class");
System.getProperty("webdriver.chrome.driver","/Users/gazifarhana/eclipse-workspace1/CityBank/chromedriver");

driver= new ChromeDriver();
driver.get("https://online.citi.com/US/login.do");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


}
@Given("^i am at City homepage$")
public void citybank() {
	System.out.println(driver.getTitle());
}
@Then("^i am clicking \"([^\"]*)\"$")
public void clicking(String key) throws IOException, InterruptedException {
	findelement(driver,readproperties(key)).click();
	Thread.sleep(2000);
}
@Then("^i am selecting state$")
public void state() throws InterruptedException {
	WebElement select=driver.findElement(By.xpath("//select[@id='state-dropdown-id']"));
	Select sc=new Select(select);
	sc.selectByVisibleText("NY");
	WebElement button=driver.findElement(By.xpath("//button[contains(.,'Continue')]"));
	button.click();
	Thread.sleep(2000);
	
}
@Then("^i am selecting account option$")
public void acctOption() throws InterruptedException {
	WebElement opt=driver.findElement(By.xpath("//select[@aria-labelledby='myDropdownlabel']"));
	Select act=new Select(opt);
	act.selectByVisibleText("Banking");
	driver.findElement(By.xpath("//button[@id='getStartedBtn']")).click();
	Thread.sleep(2000);
}
@And("^i am selecting \"([^\"]*)\" \"([^\"]*)\"$")
public void selecting(String field, String value) throws InterruptedException, IOException{
	WebElement slt= findelement(driver, readproperties(field));
	Select act=new Select(slt);
	act.selectByVisibleText(value);
	Thread.sleep(2000);
}

@Then("^i am entering \"([^\"]*)\" \"([^\"]*)\"$")
public void entering(String key, String value) throws IOException, InterruptedException {
	findelement(driver,readproperties(key)).sendKeys(value);
	Thread.sleep(2000);
}
	
@After
public void teardown(){
driver.manage().deleteAllCookies();
driver.close();
}
	
}
