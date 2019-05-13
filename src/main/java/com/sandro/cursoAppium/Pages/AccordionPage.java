package com.sandro.cursoAppium.Pages;

import org.openqa.selenium.By;

import com.sandro.cursoAppium.core.BasePage;

public class AccordionPage extends BasePage {
	
	public void selecionarOpcao1() {
		clicarPorTexto("Op��o 1");
	}
	
	public String obterValorOp1() {
		return obterTexto(By.xpath("//*[@text='Op��o 1']/../..//following-sibling::android.view.ViewGroup//android.widget.TextView"));
	}
	
}
