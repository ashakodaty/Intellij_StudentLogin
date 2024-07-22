package AutomationTest;

import Automation.pageobjects.Logout;
import org.testng.annotations.Test;

public class InstructorLogoutTestcases extends Logout {
    @Test(priority=16)
    public static void logoutAsStudent() {
        // Instructor Logout profile select
        verifyprofileimg();
        profileimageclick(); // Drop down select
        verifyLogoutDD();
        LogoutDDSelect();
        LogoutDDclick();
        System.out.println(" Logout from Student ID");
        logoutTextPresence();
        System.out.println(" Logout verification of infyni logo ");
        System.out.println("***********Student Logout  Test Cases Ended****************");
    }
}
