package automationFramework;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YandexMusic {
	private static WebDriver driver;
	WebElement element;

	@BeforeClass
	public static void openBrowser() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

	}

	@Test
	public void loginToSite() {
		System.out.println("Starting test1: " + new Object() {
		}.getClass().getEnclosingMethod().getName());

		driver.get("https://music.yandex.ru/");
		String mainWindow = driver.getWindowHandle();
		String loginWindow = null;

		driver.findElement(By.xpath(".//*[@id='nb-1']/body/div[1]/div[2]/div[1]/div[2]/a")).click();

		Set<String> windows = driver.getWindowHandles();
		Iterator<String> iterator = windows.iterator();

		while (iterator.hasNext()) {
			loginWindow = iterator.next();
		}

		driver.switchTo().window(loginWindow);

		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("bak-tatyana-bak-tatyana");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("@@a7s7d7@@");
		
//		driver.switchTo().window(mainWindow);
		
		try {
			driver.switchTo().window(mainWindow);
			element = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='nb-3']")));
			if (element != null) {
				System.out.println("Switched to main page");
			}

		} catch (NoSuchElementException e) {
		}
		
		

		System.out.println("Ending test1: " + new Object() {
		}.getClass().getEnclosingMethod().getName());

	}

	@AfterClass
	public static void closeBrowser() {
		driver.quit();

	}
}
