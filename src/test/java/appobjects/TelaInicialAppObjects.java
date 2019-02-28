package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaInicialAppObjects {
	private WebDriver driver;
	
	public TelaInicialAppObjects(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement criarContaButton() {
		return driver.findElement(By.xpath("/html/body/div[3]/header/div/div/div[2]/ul/li[4]"));
	}
	
	public WebElement cpfTextField() {
		return driver.findElement(By.id("login-cpf"));
	}
	
	public WebElement cadastrarCpfButton() {
		return driver.findElement(By.id("send2"));
	}
}
