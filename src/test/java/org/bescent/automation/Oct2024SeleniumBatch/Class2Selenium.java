package org.bescent.automation.Oct2024SeleniumBatch;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Class2Selenium {
	static WebDriver driver;

	@BeforeTest
	public void launchBrowser() {
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("start-maximized");
		driver = new ChromeDriver(chromeOptions);
	}

	public void takeSS(WebDriver driver) {
		File screenshotAs = ((TakesScreenshot) this.driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(screenshotAs, new File("./"+System.currentTimeMillis()+"myfile.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@AfterTest
	public void stopBrowser() {
		driver.quit();
	}

	@Test(priority = 1)
	@Parameters({ "appURL" })
	public void loginToApp(String appUrl) throws InterruptedException {
		driver.get(appUrl);
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		driver.findElement(By.id("login-button")).click();
		String text = driver.findElement(By.className("app_logo")).getText();
		assertEquals(text, "Swag Labs1");
	}

	@Test(priority = 2)
	public void addToCard() throws InterruptedException {
		driver.findElement(By.xpath("//div[contains(text(),'Sauce Labs Backpack')]")).click();
		WebElement addToCart = driver.findElement(By.id("add-to-cart"));
		addToCart.click();
		String text = driver.findElement(By.id("remove")).getText();
		assertEquals(text, "Remove");
	}

}
