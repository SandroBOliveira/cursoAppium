package com.sandro.cursoAppium.Pages;

import static com.sandro.cursoAppium.core.driverFactory.getDriver;

import java.util.Set;

import org.openqa.selenium.By;

public class WebViewPage {
	
	public void entrarContextoWeb() {
		Set<String> contextHandles = getDriver().getContextHandles();
		for(String valor: contextHandles) {
			System.out.println(valor);
		}
	}
	
	public void setEmail(String valor) {
		getDriver().findElement(By.id("email"))	;
	}

}
