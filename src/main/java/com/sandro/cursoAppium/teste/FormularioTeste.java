package com.sandro.cursoAppium.teste;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.FormularioPage;
import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class FormularioTeste extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private FormularioPage formulario = new FormularioPage();

	@Before
	public void inicializarAppium() throws MalformedURLException {

		menu.acessarFormulario();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {

		formulario.escreverNome("Sandro");

		assertEquals("Sandro", formulario.obterNome());
	}

	@Test
	public void deveInteragirCombo() throws MalformedURLException {

		formulario.selecionarCombo("PS4");

		Assert.assertEquals("PS4", formulario.obterValorCombo());
	}

	@Test
	public void deveInteragirSwitchCheckBox() throws MalformedURLException {

		assertTrue(formulario.isCHeckMarcado());
		assertFalse(formulario.isSwitchMarcado());

		formulario.clicarCheck();
		formulario.clicarSwitch();

		assertFalse(formulario.isCHeckMarcado());
		assertTrue(formulario.isSwitchMarcado());
	}

	@Test
	public void desafioAppium() {
		formulario.escreverNome("Julio");
		formulario.selecionarCombo("PS4");
		formulario.clicarCheck();
		formulario.clicarSwitch();
		formulario.clicarSalvar();
		assertEquals("Nome: Julio", formulario.obterNomeCadastrado());
		assertEquals("Console: ps4", formulario.obterConsoleCadastrado());
		assertEquals("Switch: Off", formulario.obterSwitchCadastrado());
		assertEquals("Checkbox: Marcado", formulario.obterCheckBoxCadastrado());

	}

}
