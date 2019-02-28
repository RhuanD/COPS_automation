package org.dbserver.riachuelo;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import tasks.TelaCadastroTasks;
import tasks.TelaInicialTasks;

public class RiachueloTestCase {
	private WebDriver driver;
	private TelaInicialTasks telaInicialTasks;
	private TelaCadastroTasks telaCadastroTasks;
	
	@Before
	public void setUp() {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get("https://www.riachuelo.com.br/");
		telaInicialTasks = new TelaInicialTasks(driver);
		telaCadastroTasks = new TelaCadastroTasks(driver);
	}
	
	@Test
	public void mainTestCase() {
		telaInicialTasks.realizarCadastro("03834580058");
		driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
		telaCadastroTasks.preencherNomeCompleto("Marcio");
		telaCadastroTasks.preencherEmail("teste@teste.com");
		telaCadastroTasks.preencherDataNascimento("27022000");
		telaCadastroTasks.preencherTelefone("51994735674");	
		telaCadastroTasks.preencherTelefoneAlternativo("5195959595");
	}
	
	@After
	public void tearDown() {
		//driver.close();
	}
}
