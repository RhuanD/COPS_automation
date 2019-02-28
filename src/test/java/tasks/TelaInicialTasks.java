package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.TelaInicialAppObjects;

public class TelaInicialTasks {
	private WebDriver driver;
	private TelaInicialAppObjects objetos;
	
	public TelaInicialTasks(WebDriver driver) {
		this.driver = driver;
		
		objetos = new TelaInicialAppObjects(driver);
	}
	
	public void clickCriarContaButton() {
		objetos.criarContaButton().click();
	}
	
	public void preencherCpfTextField(String cpf) {
		objetos.cpfTextField().sendKeys(cpf);
	}
	
	public void clickCadastrarButton() {
		objetos.cadastrarCpfButton().click();
	}
	
	public void realizarCadastro(String cpf) {
		clickCriarContaButton();
		preencherCpfTextField(cpf);
		clickCadastrarButton();
	}
}
