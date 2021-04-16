package metodos;

import static org.junit.Assert.assertEquals;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Metodos {

	JavascriptExecutor cb = (JavascriptExecutor) driver;
	static WebDriver driver;

	public void abrirBrowser(String site) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();

	}

	public void preencherDados(By elemento, String texto) throws InterruptedException {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void click(By elemento) throws InterruptedException {

		driver.findElement(elemento).click();

	}

	public void esperarElemento(By el) {

		(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated((el)));

	}

	public void aguardar(int tempo) throws InterruptedException {

		Thread.sleep(tempo);
	}

	public void fecharBrowser() throws InterruptedException {
		driver.quit();
	}

	public void validaTexto(By elemento, String txtEsperado) {

		String texto = driver.findElement(elemento).getText();
		System.out.println("Texto apresentado na tela: " + texto);
		assertEquals(txtEsperado, texto);

	}

	public void preencherDadosUsuario(String email, String fone, String username, String password, String confirm) {

		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("phone")).sendKeys(fone);
		driver.findElement(By.id("username")).sendKeys(username);
		driver.findElement(By.id("password")).sendKeys(password);
		driver.findElement(By.id("confirmpassword")).sendKeys(confirm);

	}

	public void ScrollDescer() {
		((JavascriptExecutor) driver).executeScript("scroll(0,500)");
	}

}
