package com.sandro.cursoAppium.teste;

import org.junit.Assert;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class OpcaoEscondidaTeste extends BaseTeste {
	
	
	private MenuPage menu = new MenuPage();

	
	@Test
	public void deveEncontrarOpcaoEscondida() {
		menu.scrollDown();
		menu.clicarPorTexto("Opção bem escondida");
		Assert.assertEquals("Você achou essa opção", menu.obterTextoAlerta());
		menu.clicarPorTexto("OK");
	}

}
