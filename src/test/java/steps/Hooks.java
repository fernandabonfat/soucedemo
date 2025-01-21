package steps;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import pages.Base;

public class Hooks {
    Base base;

    // constructor
    public Hooks(Base base) {
        this.base = base;
    }

    @Before
    public void initialize() {
        WebDriverManager.chromedriver().setup();
        base.driver = new ChromeDriver();
        base.driver.manage().timeouts().implicitlyWait(Duration.ofMillis(60000));
        base.driver.manage().window().maximize();
    }

    @After
    public void quit() {
        base.driver.quit();
    }
}