package tasks;

import org.openqa.selenium.WebDriver;

import appobjects.TelaCadastroAppObjects;

public class TelaCadastroTasks {
	private WebDriver driver;
	private TelaCadastroAppObjects cadastro;
	
	public TelaCadastroTasks(WebDriver driver) {
		this.driver = driver;
		cadastro = new TelaCadastroAppObjects(driver);
	}
	
	public void preencherNomeCompleto(String nome) {
		cadastro.nomeCompletoTextField().sendKeys(nome);
	}
	
	public void preencherEmail(String email) {
		cadastro.emailTextField().sendKeys(email);
	}
	
	public void preencherDataNascimento(String dataNascimento) {
		cadastro.dataNascimentoTextField().sendKeys(dataNascimento);
	}
	
	public void preencherTelefone(String telefone) {
		cadastro.telefoneTextField().sendKeys(telefone);
	}

	public void preencherTelefoneAlternativo(String telefoneAlternativo) {
		cadastro.telefoneAlternativoTextField().sendKeys(telefoneAlternativo);
	}
}
