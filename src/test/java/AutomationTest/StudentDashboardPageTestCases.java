package AutomationTest;

import Automation.pageobjects.StudentDashBoardPage;
import org.testng.annotations.Test;

public class StudentDashboardPageTestCases extends StudentDashBoardPage{
  //  @Test(priority = 4)
    public static void searchCourseToEnroll() {
        clickHomeLink();
        selectCourseStatusByOpenEnrollment();
        enterCourseName("java");
        viewDisplayedList();
        selectCourse();
    }

// @Test(priority = 5)
    public static void EnrollCourse() {
       clickEnrollNow();
       clickBilling();
        enterfirstName("ppp");
        enterLastName("qqq");
        enterAddressLine1("134 SaddleCreek");
        enterAddressLine2("Gateway Rd");
        enterCity("Austin");
        selectCountry("United States of America");
        enterState("Texas");
        enterAddressZipcode("76423");
        clickSaveAddressButton();
        verifyPaymentMethod();
        clickPayNowButton();
        verifyCardTabSelection();
        enterCardNumber("4242 4242 4242 4242");
        enterExpiration("1225");
        enterCvc("345");
        enterZipcode("76423");
        clickContinueButton();
    }
 //   @Test(priority = 5)
    public static void AddToCartTestcase() {
        checkoutCartHeader();
        verifyCheckoutCart();
        verifyEmptyCart();
        exploreCourses();
        System.out.println("Explore test case is passed");
    }
    //this remove case is passed
  //  @Test(priority = 6)
    public static void cartCourseRemoveTestcase() {
        checkoutCartHeader();
        verifyCheckoutCart();
        cartCheckBoxClick();
        removeCoursesClick();
        verifyCheckoutCart();
        verifyEmptyCart();
        exploreCourses();
        System.out.println("remove testcase is passed");
    }

 //   @Test(priority = 7)
    public static void moreCoursesAddTestcase() {
        checkoutCartHeader();
        verifyCheckoutCart();
        addMoreCoursesClick();
        System.out.println("Add more courses  testcase is passed");
    }

 //  @Test(priority = 8)
    public static void cartCourseCloseTestcase() {
        checkoutCartHeader();
        verifyCheckoutCart();
        closeClicked();
        System.out.println("Cart close  testcase is passed");
    }

    @Test(priority = 9)
    public static void courseNextTestcase() {
        checkoutCartHeader();
        verifyCheckoutCart();
        cartCheckBoxClick();
        nextClicked();
        clickBilling();
        enterfirstName("ppp");
        enterLastName("qqq");
        enterAddressLine1("134 SaddleCreek");
        enterAddressLine2("Gateway Rd");
        enterCity("Austin");
        selectCountry("United States of America");
        enterState("Texas");
        enterAddressZipcode("76423");
        clickSaveAddressButton();
        verifyPaymentMethod();
        clickPayNowButton();
        verifyCardTabSelection();
        enterCardNumber("4242 4242 4242 4242");
        enterExpiration("1225");
        enterCvc("345");
        enterZipcode("76423");
        clickContinueButton();
        System.out.println("Next  testcase is passed");
    }









}
