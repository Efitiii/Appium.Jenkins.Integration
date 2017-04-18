package ios.trialwithAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Safaribrowser {
	IOSDriver driver;
	
	@Test
	public void browser() throws MalformedURLException
	{
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.BROWSER_NAME, "safari");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.3");
		dc.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), dc);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://gmail.com");
		driver.findElementByName("Email").sendKeys("efrem.teweldeg@gmail.com");
		driver.findElementByXPath(".//*[@id='next']").click();
		driver.findElementByName("Passwd").sendKeys("rahul");
		driver.findElementByXPath(".//*[@id='signIn']").click();
		
	}

}
