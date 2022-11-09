package buymeTests.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {


    private static WebDriver driver;

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", Constants.CHROMEDRIVER_PATH);
        driver = new ChromeDriver();
        driver.get("https://www.buyme.co.il");
        driver.findElement(By.linkText("כניסה / הרשמה")).click();
        driver.findElement(By.tagName("1823")).click();
        driver.findElement(By.id("fff")).sendKeys("Orr");
    }
}
