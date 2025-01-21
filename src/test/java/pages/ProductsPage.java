package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    // Botão Add to Cart - T-Shirt
    @FindBy(xpath = "//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
    WebElement addTShirtToCartButton;

    // Cart icon
    @FindBy(xpath = "//*[@id='shopping_cart_container']/a/span")
    WebElement cartIcon;


    // Botão Remove
    //@FindBy(xpath = "//*[@id=\"remove-sauce-labs-backpack\"]")
    //WebElement removeButton;

    // Botão Checkout
    //@FindBy(xpath = "//*[@id=\"checkout\"]")
    //WebElement checkoutButton;

    // Ações com os elementos mapeados

    // Ler o título da página
    public String readPageTitle() {
        return productsPagetitle.getText();
    }

    // Clicar no botão Add to Cart - T-Shirt
    public void clickAddTShirtToCart() {
        this.addTShirtToCartButton.click();
    }

    // Read the cart icon value
    public String readCartIconValue() {
        return cartIcon.getText();
    }

    // Clicar no botão Remove
    //public void clickRemove () {
    //    this.removeButton.click();
    //}

    // Clicar no botão Checkout
    // public void clickCheckout () {
    //    this.checkoutButton.click();
    //}
}