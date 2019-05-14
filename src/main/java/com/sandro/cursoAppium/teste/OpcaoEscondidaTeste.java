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
		menu.clicarPorTexto("Op��o bem escondida");
		Assert.assertEquals("Voc� achou essa op��o", menu.obterTextoAlerta());
		menu.clicarPorTexto("OK");
	}

}
