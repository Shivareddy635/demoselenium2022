package seleniumprogrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegisterVerifing {

	public static void main(String[] args) {
		
        System.setProperty("webdriver.chrome.driver","C:\\Testing softwares\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demowebshop.tricentis.com/login");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("FirstName")).sendKeys("shiva");
		driver.findElement(By.id("LastName")).sendKeys("reddy");
		driver.findElement(By.id("Email")).sendKeys("shiva.reddi786@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("shiva@1");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("shiva@1");
		driver.findElement(By.id("register-button")).click();
       
	}

}
