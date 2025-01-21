package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.Base;
import pages.ProductsPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Shopping {

    final WebDriver driver;
    private ProductsPage productsPage;

    public Shopping(Base base) {
        this.driver = base.driver;
    }

    @And("^I add the product to the cart$")
    public void i_add_the_product_to_the_cart() {
        productsPage = new ProductsPage(driver);
        productsPage.clickAddTShirtToCart();
    }

    @Then("The product should be added to the cart")
    public void theProductShouldBeAddedToTheCart() {
        assertEquals("2", productsPage.readCartIconValue());
    }
}