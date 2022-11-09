package buymeTests.tests;

import buymeTests.BaseTest;
import buymeTests.core.CheckoutPage;
import buymeTests.core.HomePage;
import buymeTests.core.IntroScreenPage;
import buymeTests.core.PickBusinessPage;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class EndToEndTest extends BaseTest {

    @Test(groups = {"Intro"})
    public void test01_Intro() throws InterruptedException {
        IntroScreenPage introScreenPage = new IntroScreenPage();
        introScreenPage.pressLoginSignup();
        introScreenPage.getTextLoginHeader().contains("כניסה");
        introScreenPage.pressSignup();
        introScreenPage.getTextHeaderSignUp().contains("הרשמה");
        String name = introScreenPage.enterFirstText();
        String email = introScreenPage.enterEmail();
        introScreenPage.enterPassword();
        introScreenPage.reEnterPassword();
        introScreenPage.pressAgreeCheckbox();

        assertEquals("Orr", name);
        assertEquals("testngtests@testng.co.il", email);
        introScreenPage.pressSignupButton();
    }

    @Test
    public void test02_HomeScreen() throws InterruptedException {
        HomePage homePage = new HomePage();
        homePage.selectSum("עד 99 ש\"ח");
        homePage.selectRegion("מרכז");
        homePage.selectCategory("המתנות האהובות של 2022");
        PickBusinessPage pickBusinessPage = homePage.clickFindMePresent();
        pickBusinessPage.getHeaderText();
        String url = "https://buyme.co.il/search?budget=1&category=359&region=11";
        assertEquals(getUrl(), url);
    }

    @Test(dependsOnMethods = {"test02_HomeScreen"}, groups = "PickBusiness")
    public void test03_PickBusiness() {
        PickBusinessPage pickBusinessPage = new PickBusinessPage();
        pickBusinessPage.clickWantedGift();
        pickBusinessPage.PressToChooseBTN();
    }

    @Test(dependsOnMethods = {"test03_PickBusiness"})
    public void test04_SenderAndReceiver() {
        CheckoutPage checkoutPage = new CheckoutPage();
        checkoutPage.clickOnReceiverButton();
        checkoutPage.enterReceiverName();
        checkoutPage.eventType();
        checkoutPage.blessingsText();
        checkoutPage.uploadPicVid();
        checkoutPage.pressContinue();
        checkoutPage.sendingTime();
        checkoutPage.pickMailOrSMS();
        checkoutPage.enterNumForSMS();
        checkoutPage.enterSenderName();
//        checkoutPage.pressToPay();
        String senderName = checkoutPage.getTextSenderName();
        assertEquals(senderName, "אור");
    }
}
