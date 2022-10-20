package dev.oviedo.e2e.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/dev/oviedo/features", glue = "dev.oviedo.steps")

public class POneRunner {

    public static ChromeDriver driver;

    @BeforeClass
    public static void setup(){
        File chrome = new File("src/test/resources/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chrome.getAbsolutePath());
        driver = new ChromeDriver();
    }

    @AfterClass
    public static void teardown(){
        driver.quit();
    }
}
