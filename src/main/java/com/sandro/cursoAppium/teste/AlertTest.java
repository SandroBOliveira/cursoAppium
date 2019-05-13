package com.sandro.cursoAppium.teste;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.sandro.cursoAppium.Pages.AlertPage;
import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class AlertTest extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private AlertPage page = new AlertPage();

	@Test
	public void deveConfirmarAlerta() {

		menu.acessarAlertas();
		page.clicarAlertaConfirm();
		assertEquals("Confirma a operação?", page.obterTextoAlerta());
		assertEquals("Info", page.obterTituloAlerta());
		page.confirmar();
		assertEquals("Confirmado", page.obterTextoAlerta());
		page.sair();
		
	}
}
