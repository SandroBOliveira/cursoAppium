package com.sandro.cursoAppium.teste;

import org.junit.Test;

import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.Pages.WebViewPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class WebWiewTest extends BaseTeste{
	
	private MenuPage menu = new MenuPage();
	private WebViewPage page = new WebViewPage();
	
	@Test
	public void deveFazerLogin() {
		//acessar menu
		
		menu.acessarSeuBarrigaHibrido();
		esperar(3000);
		//preencher email
		page.entrarContextoWeb();
		page.setEmail("sandrobrunooliveira@hotmail.com");
		
		//preencher senha
		
		
		//entrar
		
		
		//verificar mensagem de sucesso
	}

}
