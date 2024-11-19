package org.bescent.automation.Oct2024SeleniumBatch;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Class3Selenium {
	@DataProvider
	public Object[] myTestData() {
		return new Object[] { "standard_user"};
	}

	WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		driver = new ChromeDriver(chromeOptions);
	}

	@AfterTest
	public void stopBrowser() {
		driver.quit();
	}

	@Test(retryAnalyzer = ListnerImplRetry.class)
	public void loginToApp() throws InterruptedException {
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String text = driver.findElement(By.className("app_logo")).getText();
		assertEquals(text, "Swag Labs");
	}

}
