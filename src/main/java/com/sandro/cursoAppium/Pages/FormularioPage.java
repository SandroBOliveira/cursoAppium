package com.sandro.cursoAppium.Pages;

import static com.sandro.cursoAppium.core.driverFactory.getDriver;

import org.openqa.selenium.By;

import com.sandro.cursoAppium.core.BasePage;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class FormularioPage extends BasePage {


	public void escreverNome(String nome) {
		escrever(MobileBy.AccessibilityId("nome"), nome);
	}

	public String obterNome() {
		return obterTexto(MobileBy.AccessibilityId("nome"));
	}

	public void selecionarCombo(String valor) {
		selecionarCombo(MobileBy.AccessibilityId("console"), valor);
	}

	public String obterValorCombo() {
		return obterTexto(By.xpath("//android.widget.Spinner/android.widget.TextView"));
	}

	public void clicarCheck() {
		clicar(By.className("android.widget.CheckBox"));
	}

	public void clicarSwitch() {
		clicar(MobileBy.AccessibilityId("switch"));
	}

	public boolean isCHeckMarcado() {
		return isCheckMarcado(By.className("android.widget.CheckBox"));
	}

	public boolean isSwitchMarcado() {
		return isCheckMarcado(MobileBy.AccessibilityId("switch"));
	}

	public void clicarSeekBar(double posicao) {
		MobileElement seek = getDriver().findElement(MobileBy.AccessibilityId("slid"));
		
		int y = seek.getLocation().y + (seek.getSize().height / 2);
		System.out.println(y);
		
		int x = (int) (seek.getLocation().x + (seek.getSize().width * posicao));
		System.out.println(x);
		
		tap(x, y);
		
	}
	
	public void clicarSalvar() {
		clicarPorTexto("SALVAR");
	}

	public String obterNomeCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Nome:')]"));
	}

	public String obterConsoleCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Console:')]"));
	}

	public String obterCheckBoxCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Checkbox:')]"));
	}
	public String obterSwitchCadastrado() {
		return obterTexto(By.xpath("//android.widget.TextView[starts-with(@text,'Switch:')]"));
	}
	
	

}
