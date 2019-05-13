package com.sandro.cursoAppium.teste;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class CalculadoraTestePocophone {

	@Test
	public void deveSomarDoisValores() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("deviceName", "elumator-5554");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability("appPackage", "com.google.android.calculator");
		dc.setCapability("appActivity", "com.android.calculator2.Calculator");

		AndroidDriver<MobileElement> ad = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), dc);

		MobileElement el4 = (MobileElement) ad.findElementById("com.google.android.calculator:id/digit_3");
		el4.click();
		MobileElement el5 = (MobileElement) ad.findElementByAccessibilityId("multiplicar");
		el5.click();
		MobileElement el6 = (MobileElement) ad.findElementById("com.google.android.calculator:id/digit_3");
		el6.click();
		MobileElement el7 = (MobileElement) ad.findElementByAccessibilityId("igual");
		el7.click();
		MobileElement el8 = (MobileElement) ad.findElementById("com.google.android.calculator:id/result");
		

		Assert.assertEquals("9", el8.getText());

		ad.quit();
	}

}
