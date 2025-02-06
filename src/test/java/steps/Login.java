package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import pages.Base;
import pages.LoginPage;
import pages.ProductsPage;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Login {

    final WebDriver driver;
    private LoginPage loginPage;
    private ProductsPage productsPage;

    public Login(Base base) {
        this.driver = base.driver;
    }

    @Given("I access the website {string}")
    public void i_access_the_website(String url) {
        loginPage = new LoginPage(driver);
        loginPage.accessLoginPage(url);
        assertEquals("Swag Labs", loginPage.readPageTitle());
    }

    @When("I enter the {string} and {string}")
    public void i_enter_the_username_and_password(String username, String password) {
        loginPage.fillUsername(username);
        loginPage.fillPassword(password);

        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

        /*synchronized (driver) {
            try {
                driver.wait(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }

    @And("I click on the login button")
    public void i_click_on_the_login_button() {
        loginPage.clickLogin();
    }

    @Then("I should see the Products page")
    public void i_should_see_the_products_page() {
        productsPage = new ProductsPage(driver);
        assertEquals("Products", productsPage.readPageTitle());
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
    }

    @Then("I should see the error message {string}")
    public void i_should_see_the_error_message(String invalidLoginMessage) {
        assertEquals(invalidLoginMessage, loginPage.readErrorMessage());
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

       /* synchronized (driver) {
            try {
                driver.wait(1500);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }*/
    }
}