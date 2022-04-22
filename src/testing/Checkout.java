package testing;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkout {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\BrowserDriver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div/div[4]/form/div/div[3]/div/p/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/header/div[3]/div/div/div[4]/div[1]/div[2]/div[4]/a")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/p[2]/a[1]")).click();
		driver.findElement(By.id("email")).sendKeys("ademirahmetovic@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("ademir299");
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/div[2]/form/div/p[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/form/div/p/a")).click();
		driver.findElement(By.id("address1")).sendKeys("Testin123");
		driver.findElement(By.id("city")).sendKeys("Testing1233"); // It accepts numerical numbers without letters #fix the issue 
		driver.findElement(By.id("id_state")).click();
		driver.findElement(By.xpath("/html/body/div/div[2]/div/div[3]/div/div/form/div[7]/div/select/option[2]")).click();
		driver.findElement(By.id("postcode")).sendKeys("11111");
		driver.findElement(By.id("phone")).sendKeys("2123123123");
		driver.findElement(By.id("alias")).sendKeys(Keys.DELETE);
		driver.findElement(By.id("alias")).sendKeys("New Addressees");
		driver.findElement(By.id("submitAddress")).click();
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button")).click();
		driver.findElement(By.xpath("//*[@id=\"cgv\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button")).click();
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[2]/div/p/a")).click();
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button")).click();
	}

}
