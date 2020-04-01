import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

public class base {

	public static AndroidDriver<AndroidElement> Capabilities () throws MalformedURLException {
		// TODO Auto-generated method stub
		
		File f= new File("src");
		File fs=new File(f,"Apidemos.apk");
		
		DesiredCapabilities cap = new DesiredCapabilities();
	    cap.setCapability(MobileCapabilityType.DEVICE_NAME, "NDD4C18A11020124");
	    cap.setCapability(MobileCapabilityType.AUTOMATION_NAME,"uiautomator2");
	    cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());

	    		
        AndroidDriver<AndroidElement> driver = new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	    return driver;

	    

	}

}
