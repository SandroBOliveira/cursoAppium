package com.sandro.cursoAppium.core;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTeste {
	
	public WebDriverWait wait = new WebDriverWait(driverFactory.getDriver(),10);

	@Rule
	public TestName testName = new TestName();

	@AfterClass
	public static void finalizarClasse() {
		driverFactory.killDriver();
	}

	@After
	public void tearDown() {
		gerarScreenShot();
		driverFactory.getDriver().resetApp();
	}

	public void gerarScreenShot() {
		File image = ((TakesScreenshot) driverFactory.getDriver()).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(image, new File("target/screenshots/" + testName.getMethodName() + ".png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public void esperar(long tempo) {
		try {
			Thread.sleep(tempo);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
