package com.sandro.cursoAppium;

import static org.junit.Assert.assertEquals;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import com.sandro.cursoAppium.core.DSL;
import com.sandro.cursoAppium.core.driverFactory;

import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class FormularioTeste {

	private AndroidDriver<MobileElement> ad;
	
	private DSL dsl = new DSL();

	@Before
	public void inicializarAppium() throws MalformedURLException {
	
		ad = driverFactory.getDriver();
		ad.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ad.findElement(By.xpath("//*[@text='Formulário']")).click();
	}

	@After
	public void tearDown() {
		driverFactory.killDriver();
	}

	@Test
	public void devePreencherCampoTexto() throws MalformedURLException {
		// Escrever nome
		dsl.escrever(MobileBy.AccessibilityId("nome"), "Sandro");
		
		// Checar nome escrito
		assertEquals("Sandro", dsl.obterTexto(MobileBy.AccessibilityId("nome")));
	}

	@Test
	public void deveInteragirCombo() throws MalformedURLException {

		// clicar no combo
		dsl.selecionarCombo(MobileBy.AccessibilityId("console"), "PS4");

		// VERFICAR CONSOLE
		String text = ad.findElement(By.xpath("//android.widget.Spinner/android.widget.TextView")).getText();
		Assert.assertEquals("PS4", text);
	}

	@Test
	public void deveInteragirSwitchCheckBox() throws MalformedURLException {

		// Verificar status check e switch
		MobileElement check = ad.findElement(By.className("android.widget.CheckBox"));
		MobileElement switc = ad.findElement(MobileBy.AccessibilityId("switch"));
		Assert.assertTrue(check.getAttribute("checked").equals("false"));
		Assert.assertTrue(switc.getAttribute("checked").equals("true"));

		// Mudar status
		check.click();
		switc.click();

		// verificar mudança
		Assert.assertFalse(check.getAttribute("checked").equals("false"));
		Assert.assertFalse(switc.getAttribute("checked").equals("true"));
	}

}
