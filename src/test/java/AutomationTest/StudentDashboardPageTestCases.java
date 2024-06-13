package AutomationTest;

import Automation.pageobjects.StudentDashBoardPage;
import org.testng.annotations.Test;

public class StudentDashboardPageTestCases extends StudentDashBoardPage{
    @Test(priority = 16)
    public static void searchCourseToEnroll() {
        clickHomeLink();
        selectCourseStatusByOpenEnrollment();
        enterCourseName("art");
        viewDisplayedList();
        selectCourse();
    }

    @Test(priority = 17)
    public static void EnrollCourse() {
       clickEnrollNow();
     /* enterfirstName("Earth");
        enterLastName("Queen");
        enterAddressLine1("1919");
        enterAddressLine2("newGateway Rd");
        enterCity("Newyork");
        selectCountry("United States of America");
        enterState("NY");
        enterAddressZipcode("10001");
        clickSaveAddressButton();*/
        verifyPaymentMethod();
        clickPayNowButton();
        verifyCardTabSelection();
        enterCardNumber("4242 4242 4242 4242");
        enterExpiration("1225");
        enterCvc("345");
        enterZipcode("76423");
        clickContinueButton();
    }


}
