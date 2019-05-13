package com.sandro.cursoAppium.teste;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class desafio {

	@Test
	public void desafioAppium() throws MalformedURLException {

		DesiredCapabilities dc = new DesiredCapabilities();
		dc.setCapability("platformName", "android");
		dc.setCapability("deviceName", "qualquer");
		dc.setCapability("automationName", "uiautomator2");
		dc.setCapability(MobileCapabilityType.APP,
				"C:\\Users\\Sandro\\eclipse-workspace\\cursoAppium\\src\\main\\resources\\CTAppium-1-1.apk");

		AndroidDriver<MobileElement> ad = new AndroidDriver<MobileElement>(new URL("http://localhost:4723/wd/hub"), dc);
		ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		// Seleciona formulario
		ad.findElement(By.xpath("//*[@text='Formulário']")).click();

		// Preenche nome
		ad.findElement(By.className("android.widget.EditText")).sendKeys("Sandro Bruno");
		ad.findElement(MobileBy.AccessibilityId("console")).click();
		ad.findElement(By.xpath("//android.widget.CheckedTextView[@text='PS4']")).click();
		ad.findElement(MobileBy.AccessibilityId("check")).click();
		ad.findElement(MobileBy.AccessibilityId("switch")).click();

		// clica em salvar
		ad.findElement(By.xpath("//android.widget.TextView[@text='SALVAR']")).click();

		// Verifica formulario

		MobileElement nome = ad.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
		Assert.assertEquals("Nome: Sandro Bruno", nome.getText());
		MobileElement console = ad.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
		Assert.assertEquals("Console: ps4", console.getText());
		MobileElement switc = ad.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
		Assert.assertEquals("Switch: Off", switc.getText());
		MobileElement checkbox = ad.findElement(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
		Assert.assertEquals("Checkbox: Marcado", checkbox.getText());

	}

}
