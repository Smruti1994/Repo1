package stepDefinations;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UtilityMenthods {
	
	public static void gmailLogin(String mailid, String password){
		
		System.setProperty("webdriver.chrome.driver","D:\\SOFTWARES\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		String url="https://mail.google.com/mail/";
		//launch browser with URL
		driver.get(url);
		//Maximize browser window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username_paceholder_gmail")).sendKeys(mailid);
		driver.findElement(By.id("Next_Button_locator")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("Locator_of_Password_Textfield")));
		driver.findElement(By.id("Locator_of_Password_Textfield")).sendKeys(password);
		driver.findElement(By.id("Login_Button_id")).click();
		
	}

}
