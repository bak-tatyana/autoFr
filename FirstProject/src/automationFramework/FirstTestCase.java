//package automationFramework;
//
//import java.util.NoSuchElementException;
//import java.util.concurrent.TimeUnit;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
//
//public class FirstTestCase {
//	
//private static WebDriver driver;
//
//	public static void main(String[] args) {
//
//		driver = new FirefoxDriver();
//
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//		driver.get("http://www.store.demoqa.com");
//		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
//		driver.findElement(By.id("log")).sendKeys("bak-tatyana");
//		driver.findElement(By.name("pwd")).sendKeys("kw8loFV2ki5Q");
//		driver.findElement(By.id("login")).click();
//		System.out.println("Login successfully");
//
//		driver.findElements(By.partialLinkText("Log out"));
//	}
//
//	// Assert.assertTrue("Element isn't present1",
//	// !driver.findElements(By.partialLinkText("Log out")).isEmpty());
//	//
//	// Assert.assertEquals("Element isn't present2", " Log out",
//	// driver.findElements(By.partialLinkText("Log out")));
//

  //      Assert.assertEquals(driver.findElement(By.xpath("//*[contains(.,'Пароль из СМС:')]")).isEnabled(), true);

//	public boolean isElementPresent(WebDriver driver, By locator) {
//		try {
//			driver.findElement(By.partialLinkText("Log out")).click();
//			System.out.println("have already found 1");
//			return true;
//
//		} catch (NoSuchElementException e) {
//			System.out.println("have not found 1");
//			return false;
//		}
//
//	}
//
//
//}
