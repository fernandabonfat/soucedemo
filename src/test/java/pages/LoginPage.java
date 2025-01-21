package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends CommonPage {

    // Construtor - conecta o driver herdado com a página
    public LoginPage(WebDriver driver) {
        super(driver); // Usar o drive herdado
        PageFactory.initElements(driver, this); // Inicializa o driver com essa página
    }

    // Elementos mapeados:

    // Título da págia
    @FindBy(xpath = "//*[@id=\"root\"]/div/div[1]")
    WebElement loginPagetitle;

    // Campo Username
    @FindBy(id = "user-name")
    WebElement username;

    // Campo Password
    @FindBy(id = "password")
    WebElement password;

    // Botão Login
    @FindBy(css = ".submit-button")
    WebElement loginButton;

    // Login Error Message
    @FindBy(css = ".error-message-container.error")
    WebElement loginErrorMessage;


    // Ações com os elementos mapeados

    // Preenchendo o campo Username
    public void fillUsername(String username) {
        this.username.sendKeys(username);
    }

    // Preencher o campo Password
    public void fillPassword(String password) {
        this.password.sendKeys(password);
    }

    // Clicar no botão Login
    public void clickLogin() {
        this.loginButton.click();
    }

    //
    public void accessLoginPage(String url) {
        driver.get(url);
    }

    // Lendo o título da página
    public String readPageTitle() {
        return loginPagetitle.getText();
    }
    
    //
    public String readErrorMessage() {
        return loginErrorMessage.getText();
    }
}