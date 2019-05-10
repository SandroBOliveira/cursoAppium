package com.sandro.cursoAppium;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;


public class CalculadoraTeste {
	
	@Test
	public void deveSomarDoisValores() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("deviceName", "elumator-5554");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appPackage", "com.android.calculator2");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		
		AndroidDriver<MobileElement> ad = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"),dc);
		
		MobileElement el1 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_2");
	    el1.click();
	    MobileElement el2 = (MobileElement) ad.findElementByAccessibilityId("plus");
	    el2.click();
	    MobileElement el3 = (MobileElement) ad.findElementById("com.android.calculator2:id/digit_2");
	    el3.click();
	    MobileElement el4 = (MobileElement) ad.findElementById("com.android.calculator2:id/result");

	    
	    Assert.assertEquals("4", el4.getText());
	    
	    ad.quit();
	}

}
