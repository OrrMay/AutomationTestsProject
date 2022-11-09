package buymeTests;

import buymeTests.core.DriverSingleton;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    private static WebDriver driver;

    @BeforeClass
    public void setUp() {
        driver = DriverSingleton.getDriverInstance();
        driver.manage().window().maximize();
        driver.get("https://www.buyme.co.il");
    }

    public String getUrl() {
        return driver.getCurrentUrl();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }
}
