package buymeTests.core;

import buymeTests.BasePage;
import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {

    //Pressing on the gift receiver button
    public void clickOnReceiverButton() {
        clickElement(By.xpath("//div[@gtm='למישהו אחר']"));
    }

    //Entering receiver name
    public void enterReceiverName() {
        sendKeysToElement(By.id("//label[@id='friendName']//input[@class='ember-view ember-text-field']"), "כפיר");
    }

    //Choosing event type from the dropdown list
    public void eventType() {
        selectDropDownList(By.xpath("//select[@name='eventType']"), "יום הולדת");
    }

    //Erasing default text and entering preferred blessing
    public void blessingsText() {
        clearText(By.xpath("//textarea[@data-parsley-group='voucher-greeting']"));
        sendKeysToElement(By.xpath("//textarea[@data-parsley-group" +
                "\n='voucher-greeting']"), "לאחי היקר, יום הולדת שמח!");
    }

    //Picture upload from pc
    public void uploadPicVid() {
        clickElement(By.className("media-circle-btn ember-view bm-media-upload"));
        sendKeysToElement(By.className("media-circle-btn ember-view bm-media-upload"), ("Users/orr/Downloads/123"));
    }

    //Press to continue
    public void pressContinue() {
        waitUntilElementClickable(By.className("ember-view bm-btn no-reverse main xl stretch"));
        clickElement(By.className("ember-view bm-btn no-reverse main xl stretch"));
    }

    //Choosing preferred time for the gift to be sent
    public void sendingTime() {
        clickElement(By.id("//div[@class='buttons']/div[@class='ember-view button button-now selected']"));
    }

    //Choosing preferred way of sending the gift
    public void pickMailOrSMS() {
        clickElement(By.xpath("//*[local-name()='svg' and @gtm='method-sms']"));
    }

    //Entering the phone number of the gift receiver
    public void enterNumForSMS() {
        sendKeysToElement(By.id("sms"), "0521234567");
    }

    //Entering gift sender's name
    public void enterSenderName() {
        sendKeysToElement(By.xpath("//input[@placeholder='שם שולח המתנה']"), "אור");
    }

    //Press to pay
    public void pressToPay() {
        clickElement(By.className("ember-view bm-btn no-reverse main xl stretch"));
    }

    //Assertion
    public String getTextSenderName() {
        return getElementText(By.xpath("//label[@class='ember-view bm-field bm-input " +
                "\nfilled blur md with-label']"));
    }
}
