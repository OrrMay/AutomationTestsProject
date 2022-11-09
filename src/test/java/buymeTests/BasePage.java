package buymeTests;

import buymeTests.core.DriverSingleton;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    public static WebDriverWait wait;

    public void clickElement(By locator) {
        getWebElement(locator).click();
    }

    public String sendKeysToElement(By locator, String text) {
        getWebElement(locator).sendKeys(text);
        return text;
    }

    public String getElementText(By locator) {
        return getWebElement(locator).getText();
    }

    public void waitUntilElementClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }

//    public void waitUntilElementVisible(By locator){
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }

    public WebElement getWebElement(By locator) {
        return DriverSingleton.getDriverInstance().findElement(locator);
    }

    public void selectDropDownList(By locator, String option) {
        Select dropDown = new Select(getWebElement(locator));
        dropDown.selectByVisibleText(option);
        System.out.println(dropDown.getFirstSelectedOption().getText());
    }

    public void clearText(By locator) {
        getWebElement(locator).clear();
    }
}
