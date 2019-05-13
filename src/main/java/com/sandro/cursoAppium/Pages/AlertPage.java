package com.sandro.cursoAppium.Pages;

import org.openqa.selenium.By;

import com.sandro.cursoAppium.core.BasePage;

public class AlertPage extends BasePage {

	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}

	public String obterTextoAlerta() {
		return obterTexto(By.id("android:id/message"));
	}

	public String obterTituloAlerta() {
		return obterTexto(By.id("android:id/alertTitle"));
	}
	
	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}
	
	public void sair() {
		clicarPorTexto("SAIR");
	}

}
