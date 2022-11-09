package buymeTests.core;

import buymeTests.BasePage;
import org.openqa.selenium.By;

public class IntroScreenPage extends BasePage {

    //Pressing on Login/Signup button
    public void pressLoginSignup() {
        clickElement(By.linkText("כניסה / הרשמה"));
    }

    //assertion
    public String getTextLoginHeader() {
        return getElementText(By.className("bm-h1"));
    }

    //Click signup to open a new profile on the website
    public void pressSignup() {
        clickElement(By.xpath("//span[@class='text-link theme']"));
    }

    //assertion
    public String getTextHeaderSignUp() {
        return getElementText(By.className("bm-h1"));
    }

    //Entering first name
    public String enterFirstText() {
        return sendKeysToElement(By.xpath("//input[@class='ember-view ember-text-field']" +
                "\n[@placeholder='שם פרטי']"), "Orr");
    }

    //Entering an email adress
    public String enterEmail() {
        return sendKeysToElement(By.xpath("//input[@class='ember-view ember-text-field']" +
                "\n[@placeholder='מייל']"), "testngtests@testng.co.il");
    }

    //Entering valid password
    public void enterPassword() {
        sendKeysToElement(By.id("valPass"), "Aa112233");
    }

    //Reentering password
    public void reEnterPassword() {
        sendKeysToElement(By.xpath("//input[@class='ember-view ember-text-field']" +
                "\n[@placeholder='אימות סיסמה']"), "Aa112233");
    }

    //Won't be able to sign up without agreeing to the website terms
    public void pressAgreeCheckbox() {
        clickElement(By.xpath("//div[@class='login-options grid register-text']" +
                "\n//div[@class='ember-view bm-checkbox']//span[@class='circle']"));
    }

    //Pressing the button to confirm/sign up
    public HomePage pressSignupButton() {
        clickElement(By.xpath("//div[@class='main-form']//button[@type='submit']"));
        return new HomePage();
    }

    ///////EXTRA///////
    public void pressSignInToBUYME() {
        clickElement(By.xpath("//div[(@class='option oldschool')]//button[@type='submit']"));
    }

    public String getValidationError1() {
        return getElementText(By.xpath("//ul[@id='parsley-id-12']"));
    }

    public String getValidationError2() {
        return getElementText(By.xpath("//ul[@id='parsley-id-14']"));
    }
}
