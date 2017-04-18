package ios.trialwithAppium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;


import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;


public class UICatalog {
	IOSDriver driver;
	
	@Before
	public void setup() throws MalformedURLException{

	DesiredCapabilities cap= new DesiredCapabilities();
	File f=new File("/Users/efrem/Documents/Java Program Files/UI-Catalog-App.zip");
	cap.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.3");
	cap.setCapability(MobileCapabilityType.DEVICE_NAME, "iPhone 6");
	cap.setCapability(MobileCapabilityType.BROWSER_NAME, "");
	cap.setCapability(MobileCapabilityType.APP, f.getAbsolutePath());
	
	driver=new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	}	
	
	
	//@Test
	public void switches()
	{
		driver.scrollTo("TextFields").click();
		//driver.scrollToExact("TextFields").click();
		//driver.findElementByLinkText("TextFields").click();	
		//System.out.println(driver.findElements(By.className("UIASwitch")).get(0).getAttribute("value"));
		
	}
	//@Test
	public void Pickers(){
		driver.scrollTo("Picker View").click();
		driver.findElements(By.className("UIAPickerWheel")).get(0).sendKeys("75");
		driver.findElements(By.className("UIA")).get(1).sendKeys("215");
		
		System.out.println();
		
	}
	
	@Test
	public void Alerts(){
		driver.scrollTo("Alert Views").click();
		driver.findElementByName("Simple").click();
		// Your Appium is now focusing on the alert
		// instead of accept() we can also say dismiss()
		driver.switchTo().alert().accept();
		
		
	}
	
	
}
