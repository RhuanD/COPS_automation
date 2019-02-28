package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaCadastroAppObjects {
	private WebDriver driver;
	
	public TelaCadastroAppObjects(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public WebElement nomeCompletoTextField() {
		return driver.findElement(By.id("firstname"));
	}
	
	public WebElement emailTextField() {
		return driver.findElement(By.id("email_address"));
	}
	
	public WebElement dataNascimentoTextField() {
		return driver.findElement(By.id("dob"));
	}
	
	public WebElement telefoneTextField() {
		return driver.findElement(By.id("telephone"));
	}
	
	public WebElement telefoneAlternativoTextField () {
		return driver.findElement(By.id("alternative_telephone"));
	}
}
