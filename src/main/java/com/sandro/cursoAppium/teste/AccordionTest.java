package com.sandro.cursoAppium.teste;

import org.junit.Assert;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.AccordionPage;
import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class AccordionTest extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private AccordionPage page = new AccordionPage();

	@Test
	public void interagirComAccordion() {
		menu.AcessarAcorddion();
		page.selecionarOpcao1();
		esperar(1000);
		Assert.assertEquals("Esta é a descrição da opção 1", page.obterValorOp1());

	}

}
