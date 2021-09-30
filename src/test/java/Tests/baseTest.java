package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class baseTest {
    protected WebDriver driver;

    @BeforeClass
    public void setup() {
        String path = System.getProperty("user.dir");
        System.setProperty("webdriver.edge.driver", path + "/src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().window().maximize();
    }

    public WebDriver getDriver() {
        return driver;
    }


    @AfterClass
    public void teardown() {
        driver.quit();
    }
}

