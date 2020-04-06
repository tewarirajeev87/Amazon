import java.net.MalformedURLException;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowseJava extends baseChrome {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver=Capabilities();
		/*driver.get("https://facebook.com");
		driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div[2]/form/div[4]/div/div[1]/input").sendKeys("tewarirajeev5@gmail.com");
		driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div[2]/form/div[4]/div/div[2]/div/div/div[1]/div/input").sendKeys("ramayana7@sbi");
		driver.findElementByXPath("/html/body/div[1]/div/div[3]/div[1]/div/div[2]/div[2]/form/div[5]/div[1]/button").click();*/
		
		/*driver.get("http://cricbuzz.com");
		driver.findElementByXPath("//a[@href='#menu']").click();
		driver.findElementByCssSelector("a[title='Cricbuzz Home']").click();
		System.out.println(driver.getCurrentUrl());
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		   jse.executeScript("window.scrollBy(0,480)", "");
		   Assert.assertTrue(driver.findElement(By.xpath("//h4[text()='Top Stories']")).getAttribute("class").contains("header"));
		*/
		
		
		driver.get("https://www.amazon.in");
		driver.findElementByXPath("//*[@id=\"twotabsearchtextbox\"]\r\n").sendKeys("i7 processor, 8/16 GB RAM and a screen<=14");
		driver.findElementByXPath("//*[@id=\"nav-search\"]/form/div[2]/div/input").click();
		
		
		

	}

}
