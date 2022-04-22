package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUp {
	
	/* Sign Up */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[2]/div/div/nav/div[1]/a")).click();
		driver.findElement(By.id("email_create")).sendKeys("testin2222123@hotmail.com");
		driver.findElement(By.id("SubmitCreate")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("customer_firstname")).sendKeys("Ademir");
		Thread.sleep(2000);
		driver.findElement(By.id("customer_lastname")).sendKeys("Ahmetovic");
		Thread.sleep(2000);
		driver.findElement(By.id("passwd")).sendKeys("testing123");
		Thread.sleep(2000);
		driver.findElement(By.id("uniform-days")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[1]/div/select/option[6]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("months")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[2]/div/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("years")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[1]/div[6]/div/div[3]/div/select/option[3]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("address1")).sendKeys("Testin");
		Thread.sleep(2000);
		driver.findElement(By.id("city")).sendKeys("Sarajevo");
		Thread.sleep(2000);
		driver.findElement(By.id("id_state")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[2]/p[7]/div/select/option[4]")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("postcode")).sendKeys("77777");
		Thread.sleep(2000);
		driver.findElement(By.id("phone_mobile")).sendKeys("111111111");
		Thread.sleep(2000);
		driver.findElement(By.id("submitAccount")).click();
		
	
	}
	
	class SingUp {
		
	}

	
}
