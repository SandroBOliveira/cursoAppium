package com.sandro.cursoAppium.Pages;

import org.openqa.selenium.By;

import com.sandro.cursoAppium.core.BasePage;

public class AbaPage extends BasePage {
	
	public String obterTextoAba1() {
		return obterTexto(By.xpath("//*[@text='Este é o conteúdo da Aba 1']"));
	}

	public void clicarAba2() {
		clicarPorTexto("ABA 2");
	}
	
	public String obterTextoAba2() {
		return obterTexto(By.xpath("//*[@text='Este é o conteúdo da Aba 2']"));
	}
}
