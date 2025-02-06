package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ProductsPage extends CommonPage {


    // Construtor
    public ProductsPage(WebDriver driver) {
        super(driver); // Usar o drive herdado
        PageFactory.initElements(driver, this); // Inicializa o driver com essa página
    }

    // Elementos mapeados:

    // Título da págia
    @FindBy(xpath = "//*[@id=\"header_container\"]/div[2]/span")
    WebElement productsPagetitle;

    // Lista de produtos
    @FindBy(className = "inventory_list")
    public WebElement productList;

    // Botão Add to Cart
    public By addProductToCart(String product) {
        return By.xpath("//*[@id=\"add-to-cart-sauce-labs-" + product + "\"]");
    }

    // Cart icon
    @FindBy(xpath = "//*[@id='shopping_cart_container']/a/span")
    WebElement cartIcon;

    // Botão Remove
    public By removeButton(String product) {
        return By.xpath("//*[@id=\"remove-sauce-labs-" + product + "\"]");
    }


    // Ações com os elementos mapeados

    // Ler o título da página
    public String readPageTitle() {
        return productsPagetitle.getText();
    }

    // Clicar no botão Add to Cart
    public void clickAddToCart(String product) {
        driver.findElement(addProductToCart(product)).click();
    }

    // Clicar no botão Remove
    public void clickRemove(String product) {
        driver.findElement(removeButton(product)).click();
    }

    // Read the cart icon value
    public String readCartIconValue() {
        return cartIcon.getText();
    }

}