package com.sandro.cursoAppium.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.AlertPage;
import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class AlertTest extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private AlertPage page = new AlertPage();

	@Before
	public void setup() {
		menu.acessarAlertas();
	}

	@Test
	public void deveConfirmarAlerta() {
		page.clicarAlertaConfirm();
		assertEquals("Confirma a operação?", page.obterTextoAlerta());
		assertEquals("Info", page.obterTituloAlerta());
		page.confirmar();
		assertEquals("Confirmado", page.obterTextoAlerta());
		page.sair();

	}

	@Test
	public void deveClicarForaAlerta() {

		page.clicarAlertaSimples();
		esperar(1000);
		page.clicarForaCaixa();
		assertFalse(page.existeUmelementoPorTexto("Pode clicar no OK ou fora da caixa para sair"));
	}
}
