import java.net.MalformedURLException;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class Testclass2 extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement>driver=Capabilities();
		
		driver.get("https://www.amazon.in");
		driver.findElementByXPath("//*[@id=\"twotabsearchtextbox\"]\r\n").sendKeys("i7 processor, 8/16 GB RAM and a screen<=14");
		driver.findElementByXPath("//*[@id=\"nav-search\"]/form/div[2]/div/input").click();
		
		System.out.println("x");
		System.out.println("y");
		System.out.println("z");
		
		System.out.println("o");
		System.out.println("p");
		System.out.println("i");
		

	}

}
