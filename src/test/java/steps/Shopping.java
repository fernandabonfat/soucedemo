package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.Base;
import pages.ProductsPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

public class Shopping {

    final WebDriver driver;
    private ProductsPage productsPage;

    public Shopping(Base base) {
        this.driver = base.driver;
    }

    @When("I add the {string} to the cart")
    public void i_add_the_product_to_the_cart(String product) {
        productsPage = new ProductsPage(driver);
        productsPage.clickAddToCart(product);
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        synchronized (driver) {
            try {
                driver.wait(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Then("The product should be added to the cart")
    public void theProductShouldBeAddedToTheCart() {
        assertEquals("1", productsPage.readCartIconValue());
        driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        synchronized (driver) {
            try {
                driver.wait(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Then("I should see the list of products")
    public void iShouldSeeTheListOfProducts() {
        //assertTrue(productsPage.productListIsDisplayed());
    }

    @And("The remove button should be displayed")
    public void theRemoveButtonShouldBeDisplayed() {
        //assertTrue(productsPage.removeButton.isDisplayed());
    }

    @And("I remove the {string} from the cart")
    public void iRemoveTheProductFromTheCart(String product) {
        productsPage.clickRemove(product);

        synchronized (driver) {
            try {
                driver.wait(2000);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Then("The product should be removed from the cart")
    public void theProductShouldBeRemovedFromTheCart() {

        // cart icon should not be displayed on the page

    }
}