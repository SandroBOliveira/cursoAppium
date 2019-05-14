package com.sandro.cursoAppium.Pages;

import com.sandro.cursoAppium.core.BasePage;

public class AlertPage extends BasePage {

	public void clicarAlertaConfirm() {
		clicarPorTexto("ALERTA CONFIRM");
	}

	public void clicarAlertaSimples() {
		clicarPorTexto("ALERTA SIMPLES");
	}

	public void clicarForaCaixa() {
		tap(100, 150);
	}

	public void confirmar() {
		clicarPorTexto("CONFIRMAR");
	}

	public void sair() {
		clicarPorTexto("SAIR");
	}

}
