package com.sandro.cursoAppium.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.CliquesPage;
import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class CliquesTest extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private CliquesPage page = new CliquesPage();

	@Before
	public void setup() {
		menu.AcessarCliques();
	}

	@Test
	public void deveRealizarCliqueLongo() {
		// acessar menu

		// clique longo

		page.cliqueLongo();
		// verificar texto

		assertEquals("Clique Longo", page.obterTextoCampo());

	}

	@Test
	public void deveRealizarCliqueDuplo() {
		page.clicarPorTexto("Clique duplo");
		page.clicarPorTexto("Clique duplo");
		assertEquals("Duplo Clique", page.obterTextoCampo());
		

	}

}
