package com.sandro.cursoAppium.Pages;

import com.sandro.cursoAppium.core.BasePage;

public class MenuPage extends BasePage {

	public void acessarFormulario() {
		clicarPorTexto("Formulário");

	}

	public void acessarSplash() {
		clicarPorTexto("Splash");
	}

	public void acessarAlertas() {
		clicarPorTexto("Alertas");
	}
	
	public void acessarAbas() {
		clicarPorTexto("Abas");
	}
	
	public void AcessarAcorddion() {
		clicarPorTexto("Accordion");
	}
	
	public void AcessarCliques() {
		clicarPorTexto("Cliques");
	}
	
	public void acessarSwipe() {
		clicarPorTexto("Swipe");
	}
	
	public void acessarSwipeList() {
		scrollDown();
		clicarPorTexto("Swipe List");
	}
	public void acessarDragDrop() {
		scrollDown();
		clicarPorTexto("Drag and drop");
	}
	public void acessarSeuBarrigaHibrido() {
		clicarPorTexto("SeuBarriga Híbrido");
	}
	
	
}
