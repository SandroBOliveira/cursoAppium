package com.sandro.cursoAppium.teste;

import org.junit.Assert;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.Pages.SwipeListPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class SwipeListTest extends BaseTeste {
	
	private MenuPage menu = new MenuPage();
	private SwipeListPage page  = new SwipeListPage();
	

	@Test
	public void deveInteragirSwipeLIst() {
		
		menu.acessarSwipeList();
		page.swipeElementRight("Op��o 1");
		page.clicarBotaoMais();
		Assert.assertTrue(page.existeUmelementoPorTexto("Op��o 1 (+)"));
		page.swipeElementRight("Op��o 4");
		page.clicarPorTexto("(-)");
		Assert.assertTrue(page.existeUmelementoPorTexto("Op��o 4 (-)"));
		page.swipeElementLeft("Op��o 5 (-)");
		Assert.assertTrue(page.existeUmelementoPorTexto("Op��o 5"));

	}

}
