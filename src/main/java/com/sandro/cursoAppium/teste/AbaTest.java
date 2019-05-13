package com.sandro.cursoAppium.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sandro.cursoAppium.Pages.AbaPage;
import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class AbaTest extends BaseTeste {

	public MenuPage menu = new MenuPage();
	public AbaPage page = new AbaPage();

	@Test
	public void deveInteragirComAbas() {

		menu.acessarAbas();
		assertEquals("Este é o conteúdo da Aba 1", page.obterTextoAba1());
		page.clicarAba2();
		assertEquals("Este é o conteúdo da Aba 2", page.obterTextoAba2());
	}

}
