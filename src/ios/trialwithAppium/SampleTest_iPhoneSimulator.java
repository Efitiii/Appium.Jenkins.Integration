package ios.trialwithAppium;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

public class SampleTest_iPhoneSimulator {
	@Test
	public void testLaunch() throws MalformedURLException, InterruptedException{
		DesiredCapabilities capabilities=new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,MobilePlatform.IOS);
		//capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "10.3");
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, System.getProperty("PlatformName"));
		capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, System.getProperty("PlatformVersion"));
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
		capabilities.setCapability("app", "/Users/efrem/Documents/Java Program Files/UI-Catalog-App.zip");
		IOSDriver driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.findElements(By.className("UIButton")).get(0).click();
		//driver.scrollTo("Data Picker").click();
	}

}
