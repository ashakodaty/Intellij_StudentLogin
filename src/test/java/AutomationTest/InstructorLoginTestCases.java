package AutomationTest;

import Automation.pageobjects.InstructorLoginPage;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class InstructorLoginTestCases extends InstructorLoginPage {

     @BeforeSuite
   public static void launchApplication()
{
       launchBrowser("Chrome");
       launchApp("https://devnj.infyni.com/");
       implicitWait(30);
   }
    @Test(priority = 2)
    public static void loginAsInstructor() throws Exception {
        clickForInstructorLink();
        System.out.println(" clicked on For Instructor Link");
        clickLogin();
        EnterInstructorEmailId("instructor44@mailinator.com");
        EnterInstructorPwd("start123");
        ClickInstructorLogInButton();
        System.out.println("  login as Instructor test case ");

    }

    @Test(priority=3)
    public static void  verifyDashboardTextPresence() {
        boolean actualresult = dashboardTextPresence();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("Dashboard Text Presence Validation Success");
        System.out.println("***********Student LoginPage Test Cases Ended****************");
    }
}


