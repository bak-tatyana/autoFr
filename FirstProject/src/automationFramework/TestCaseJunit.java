//package automationFramework;
//
//import java.util.concurrent.TimeUnit;
//
//import org.junit.AfterClass;
//import org.junit.Assert;
//import org.junit.BeforeClass;
//import org.junit.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.NoSuchElementException;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.firefox.FirefoxDriver;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//public class TestCaseJunit {
//	private static WebDriver driver;
//	WebElement element;
//
//	@BeforeClass
//	public static void openBrowser() {
//		driver = new FirefoxDriver();
//		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
//
//	}
//
//	@Test
//	public void CredentialsIsValid() {
//		System.out.println("Starting test1: " + new Object() {
//		}.getClass().getEnclosingMethod().getName());
//		driver.get("http://www.store.demoqa.com");
//		driver.findElement(By.xpath("//*[@id='account']/a")).click();
//		driver.findElement(By.xpath("//*[@id='log']")).sendKeys("bak-tatyana");
//		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("kw8loFV2ki5Q");
//		driver.findElement(By.xpath("//*[@value='Login »']")).click();
//		
//		Assert.assertEquals(driver.findElement(By.partialLinkText("Log out")).isEnabled(), true);
//
//		try {
//			element = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Log out")));
//			if (element != null) {
//				element.click();
//				System.out.println("Have alresdy clicked by " + element);
//			}
//
//		} catch (NoSuchElementException e) {
//			System.out.println("Page doesn't have Log out button");
//		}
//
//		System.out.println("Ending test1: " + new Object() {}.getClass().getEnclosingMethod().getName());
//
//	}
//	
//	@Test
//	public void CredentialsIsNotValid(){
//		System.out.println("Starting test2: "+ new Object(){}.getClass().getEnclosingMethod().getName());
//		driver.get("http://www.store.demoqa.com");
//		driver.findElement(By.xpath("//*[@id='account']/a")).click();
//		driver.findElement(By.xpath("//*[@id='log']")).sendKeys("bak-tatyana1");
//		driver.findElement(By.xpath("//*[@id='pwd']")).sendKeys("kw8loFV2ki5Q1");
//		driver.findElement(By.xpath("//*[@value='Login »']")).click();
//		
//		element = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//p[contains(text(), 'Invalid login credentials1')]")));
//		if (element != null){
//			System.out.println("Error is right");
//		}else{
//			System.out.println("Error isn't right");
//		}
//		
//		System.out.println("Ending test2: "+ new Object(){}.getClass().getEnclosingMethod().getName());
//	}
//
//	
//	@AfterClass
//	public static void closeBrowser() {
//		driver.quit();
//	}
//}
