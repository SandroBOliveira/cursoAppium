package com.sandro.cursoAppium.core;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class driverFactory {

	private static AndroidDriver<MobileElement> ad;

	public static AndroidDriver<MobileElement> getDriver() {
		if (ad == null) {
			createDriver();
		}
		return ad;
	}

	private static void createDriver() {
		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("deviceName", "elumator-5554");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\Sandro\\eclipse-workspace\\cursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");
		try {
			ad = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), dc);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		ad.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	public static void killDriver() {
		if (ad != null) {
			ad.quit();
			ad = null;
		}
	}
}