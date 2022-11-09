package buymeTests.core;

import buymeTests.BasePage;
import org.openqa.selenium.By;

public class PickBusinessPage extends BasePage {

    //Assertion
    public String getHeaderText() {
        return getElementText(By.xpath("//h1[@class='title-xxl bottom-md top-none']"));
    }

    //Picking up wanted gift
    public PickBusinessPage clickWantedGift() {
        clickElement(By.xpath("//a[@href='https://buyme.co.il/supplier/1444302?budget=1&category" +
                "\n359&query=&region=11']"));
        return this;
    }

    //Choosing preferred amount for specific gift
    public CheckoutPage PressToChooseBTN() {
        clickElement(By.xpath("//button[@id='ember3440']"));
        return new CheckoutPage();
    }
}
