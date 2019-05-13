package com.sandro.cursoAppium.teste;

import org.junit.Assert;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.Pages.SplashPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class SplashTeste extends BaseTeste{
	
	private MenuPage menu = new MenuPage();
	private SplashPage page = new SplashPage();

	
	@Test
	public void deveAguardarSplashSumir() {
		
		menu.acessarSplash();
		page.isTelaSplashVisivel();
		page.aguardarSplashSumir();
		Assert.assertTrue(page.existeUmelementoPorTexto("Formulário"));
	}

}
