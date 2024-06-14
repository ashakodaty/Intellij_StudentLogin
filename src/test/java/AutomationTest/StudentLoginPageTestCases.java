package AutomationTest;

import Automation.pageobjects.StudentLoginPage;
import org.testng.annotations.BeforeSuite;
import org.testng.asserts.SoftAssert;
import org.testng.annotations.Test;


public class StudentLoginPageTestCases extends StudentLoginPage {
 /*   @BeforeSuite
    public static void lauchApplication()
 {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }*/
    @Test(priority = 14)
    public static void loginAsStudent() {
      //  clickLoginButton();
        enterStudentEmailAddress("abc123@gmail.com");
        enterStudentPassword("Mylife@123");
        clickStudentLogin();
    }

    @Test(priority=15)
    public static void verifyDashboardTextPresence() {
        boolean actualresult = dashboardTextPresence();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("Dashboard Text Presence Validation Success");
        System.out.println("***********Student LoginPage Test Cases Ended****************");
    }


}
