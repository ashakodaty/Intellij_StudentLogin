package AutomationTest;

import Automation.pageobjects.Logout;
import org.testng.annotations.Test;

public class StudentLogoutTestcases extends Logout {
    @Test(priority=6)
    public static void logoutAsStudent() {
        // Student Logout profile select
        verifyprofileimg();
        profileimageclick(); // Drop down select
        verifyLogoutDD();
        LogoutDDSelect();
        LogoutDDclick();
        System.out.println(" Logout from student ID");
        logoutTextPresence();
        System.out.println(" Logout verification of infyni logo ");
        System.out.println("***********Student Logout  Test Cases Ended****************");
    }
}
