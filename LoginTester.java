package pkg2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

class LoginTester {

	WebDriver driver;

	@BeforeEach
	void setUp() throws Exception {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\KATHIR\\Desktop\\chromedriver.exe");

		driver = new ChromeDriver();
		driver.get("https://lite.pubg.com/");
		driver.manage().window().maximize();

		Thread.sleep(2000);
	}

	@AfterEach
	void tearDown() throws Exception {
		//driver.quit();
	}

	@Test
	void test() throws Exception {

		driver.findElement(By.xpath("//*[@id=\"loginComponent\"]/a")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/app-email-input/div/input")).sendKeys("useremail@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"loginForm\"]/div[2]/app-password-input/div/input")).sendKeys("password");
		Thread.sleep(500);
		driver.findElement(By.id("submitButton")).click();
		Thread.sleep(3000);
	}

}
