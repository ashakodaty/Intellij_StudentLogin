package AutomationTest;

import Automation.pageobjects.InstructorDashBoardPage;
import org.testng.annotations.Test;

public class InstructorDashboardTestcases extends InstructorDashBoardPage{
    @Test(priority = 15)
    public static void searchCourseToEnroll() {
        clickHomeLink();
        selectCourseStatusByOpenEnrollment();
        enterCourseName("java");
        viewDisplayedList();
        selectCourse();
    }

}
