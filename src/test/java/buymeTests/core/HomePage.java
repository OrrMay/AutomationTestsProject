package buymeTests.core;

import buymeTests.BasePage;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public String getMyAccountText() {
        return getElementText(By.xpath("//li[@class='ember-view dropdown solid']" +
                "\n/a/span[contains(text(),'החשבון שלי')]"));
    }

    //Gets the preferred amount from the dropdown options list
    public void selectSum(String sum) throws InterruptedException {
        Thread.sleep(5000);
        getWebElement(By.xpath("//span[@alt='סכום']")).click();
        getWebElement(By.xpath("//div[@class='dropdown']" +
                "\n//li[@id='ember1171']")).findElement(By.linkText("עד 99 ש\"ח")).click();
    }

    //Gets the preferred area location from the dropdown options list
    public void selectRegion(String area) throws InterruptedException {
        Thread.sleep(5000);
        getWebElement(By.xpath("//span[@alt='אזור']")).click();
        getWebElement(By.xpath("//div[@class='dropdown']" +
                "\n//li[@id='ember1200']")).findElement(By.linkText("מרכז")).click();
    }

    //Gets the preferred gift category from the dropdown options list
    public HomePage selectCategory(String category) throws InterruptedException {
        Thread.sleep(5000);
        getWebElement(By.xpath("//span[@alt='קטגוריה']")).click();
        getWebElement(By.xpath("//div[@class='dropdown']" +
                "\n//li[@id='ember1262']")).findElement(By.linkText("המתנות האהובות של 2022")).click();
        return this;
    }

    //Clicks on "Find me a present" button and moves us to "pickBusinessPage"
    public PickBusinessPage clickFindMePresent() {
        clickElement(By.className("ember-view bm-btn no-reverse main md ember-view"));
        return new PickBusinessPage();
    }
}
