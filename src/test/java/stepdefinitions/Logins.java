package stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class Logins {
	
	WebDriver driver=new ChromeDriver();
	
	
	@Given("User is on login page")
    public void user_is_on_login_page() {
		 
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		 driver.get("https://www.saucedemo.com");
   
}

@When("User enters valid {string} and {string}")
public void User_enters_valid_username_and_password(String name,String password) {
	
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user");
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("secret_sauce");
    
}

@When("Clicks on login button")
public void clicks_on_login_button() {
	
	driver.findElement(By.xpath("//input[@id='login-button']")).click();
    
}

@Then("User is navigated to home page")
public void user_is_navigated_to_home_page() throws InterruptedException {
	
	Thread.sleep(5000);	
	driver.findElement(By.xpath("//div[@class='login_logo']"));
		
  
}

@Then("Close the browser")
public void close_the_browser() {
	
	driver.close();
 
}



}
