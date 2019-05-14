package com.sandro.cursoAppium.teste;

import org.junit.Assert;
import org.junit.Test;

import com.sandro.cursoAppium.Pages.DragDropPage;
import com.sandro.cursoAppium.Pages.MenuPage;
import com.sandro.cursoAppium.core.BaseTeste;

public class DragDropTest extends BaseTeste {

	private MenuPage menu = new MenuPage();
	private DragDropPage page = new DragDropPage();

	private String[] estadoInicial = new String[] { "Esta", "é uma lista", "Drag em Drop!", "Faça um clique longo,",
			"e arraste para", "qualquer local desejado.", };
	private String[] estadoIntermediario = new String[] {  "é uma lista", "Drag em Drop!", "Faça um clique longo,",
			"e arraste para","Esta", "qualquer local desejado.", };

	@Test
	public void deveEfetuarDragDrop() {
		menu.acessarDragDrop();
		esperar(1000);
		Assert.assertArrayEquals(estadoInicial, page.obterLista());
		page.arrastar("Esta", "e arraste para");
		Assert.assertArrayEquals(estadoIntermediario, page.obterLista());
	}

}
