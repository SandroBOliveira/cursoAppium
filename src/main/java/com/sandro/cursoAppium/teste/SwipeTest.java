package com.sandro.cursoAppium.teste;

import org.junit.Assert;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class SwipeTest extends BaseTeste {
	
	private MenuPage menu = new MenuPage();
	
	@Test
	public void deveRealizarSwipe() {
		menu.acessarSwipe();
		Assert.assertTrue(menu.existeUmelementoPorTexto("a esquerda"));
		menu.swipeRight();
		Assert.assertTrue(menu.existeUmelementoPorTexto("E veja se"));
		menu.clicarPorTexto("›");
		Assert.assertTrue(menu.existeUmelementoPorTexto("Chegar até o fim!"));
		menu.swipeLeft();
		menu.clicarPorTexto("‹");
		Assert.assertTrue(menu.existeUmelementoPorTexto("a esquerda"));
	}

}
