package AutomationTest;

import Automation.pageobjects.Homepage;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class HomepageTestCases extends Homepage {
 /*   @BeforeSuite
    public static void lauchApplication()
    {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }*/
    @Test(priority = 13)
    public static void redirectToLoginPage() {
        clickLoginButton();
        //Validating If Login text is displayed or not
        boolean actualresult = loginTextPresence();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("Login Text Presence Validation Success");
        System.out.println("***********HomePage Login Test Cases Ended****************");
    }

   /* @AfterSuite
    public static void closeApplication()
    {
        closeApp();
    }*/
}
