package buymeTests.tests;

import buymeTests.BaseTest;
import buymeTests.core.IntroScreenPage;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Extras extends BaseTest {

    @BeforeClass
    @Override
    public void setUp() {
        super.setUp();
    }

    @Test
    public void test01_Error1() {
        IntroScreenPage introScreenPage = new IntroScreenPage();
        introScreenPage.pressLoginSignup();
        introScreenPage.pressSignInToBUYME();
        String error1 = introScreenPage.getValidationError1(); //used variable
        assertEquals(error1, "כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה");
        assertEquals(introScreenPage.getValidationError2(), "כל המתנות מחכות לך! אבל קודם צריך מייל וסיסמה");
    }
}
