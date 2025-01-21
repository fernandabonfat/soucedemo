package pages;

import org.openqa.selenium.WebDriver;

public class CommonPage {

    //Essa classe declara o selenium e conecta com o "mundo" exterior
    // WebDriver é uma interface que representa um driver de navegador

    public WebDriver driver;

    // Construtor - recebe um driver e conecta com o driver da classe
    public CommonPage(WebDriver driver) {
        this.driver = driver;
    }
}