package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LeapTapsApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		System.out.println(driver.getTitle());
		
		WebElement usernameBox = driver.findElement(By.id("username"));
		
		usernameBox.sendKeys("demosalesmanager");
		
		//2..Password Text Box
		
		WebElement passwordBox = driver.findElement(By.id("password"));
		
		passwordBox.sendKeys("crmsfa");
		
		//3.. Login Button
		
		WebElement loginButton = driver.findElement(By.className("decorativeSubmit"));
		
		loginButton.click();
		
		System.out.println(driver.getTitle());
		
		//4. Link Interaction
		
		WebElement crmsfaHyperLink = driver.findElement(By.linkText("CRM/SFA"));
		
		crmsfaHyperLink.click();
		
		System.out.println(driver.getTitle());
		
		driver.close();

	}

}
