package com.sandro.cursoAppium.Pages;

import static com.sandro.cursoAppium.core.driverFactory.getDriver;

import org.openqa.selenium.By;

import com.sandro.cursoAppium.core.BasePage;

import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;

public class SwipeListPage extends BasePage {

	
	public void swipeElementRight(String opcao) {
		swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.9, 0.1);
	}
	
	public void swipeElementLeft(String opcao) {
		swipeElement(getDriver().findElement(By.xpath("//*[@text='"+opcao+"']/..")), 0.1, 0.9);
	}
	
	public void clicarBotaoMais() {
		MobileElement botao = getDriver().findElement(By.xpath("//*[@text='(+)']/.."));
		
		new TouchAction(getDriver()).tap(botao, -50, 0).perform();
	}
}
