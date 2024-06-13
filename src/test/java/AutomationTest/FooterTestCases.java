package AutomationTest;

import Automation.pageobjects.Homepage;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FooterTestCases extends Homepage {
    @BeforeSuite
    public static void lauchApplication() {
        launchBrowser("Chrome");
        launchApp("https://devnj.infyni.com/");
        implicitWait(30);
    }

    //TC01---Clicking on About Us link
    @Test(priority = 1)
    public static void aboutUsLink() {
        clickAboutUsLink();
        System.out.println("Navigated to 'About Us' Page");
        // Validating If AboutUs text is displayed or not
        boolean actualresult = aboutUsTextPresence();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);// using soft assert
        sa.assertAll();
        System.out.println("About Us Text Presence Validation Success");

        // Retrieving the value of the text to verify/validate
        String actualText = aboutUsText();
        String expectedText = "About Us";
        sa.assertEquals(actualText, expectedText);
        sa.assertAll();
        //System.out.println("ActualText:" + actualText);
        System.out.println(" Retrived the Value of the About Us Text Successfully");
        backToHomePage();
        System.out.println("Navigated back to Home page from About Us Page");
        System.out.println(" TC-1 About us link test case ");

    }
    //TC 02---Clicking on News link
    @Test(priority = 2)
    public static void validateNewsLink() {
        clickNewsLink();
        System.out.println("Navigated to 'NEWS' link");
        // Verify if the user is navigated to the News page
        boolean actualResult = validateNewsText();
        boolean expectedResult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualResult, expectedResult);// using soft assert
        sa.assertAll();
        backToHomePage();
        System.out.println("Navigated back to Home page from News page");
        System.out.println(" TC-02 News Link test case ");
    }
    //TC-03  --Clicking on career 's Link
    @Test(priority = 3)
    public static void validateCareersLink() {

        // Clicking on the "Careers" link in the Footer
        clickCareersLink();
        System.out.println("Navigated to 'CAREER'S' link");
        // Verify if the user is navigated to the 'Careers' page
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = validateCareerText();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("'Career' text presence verified");
        // Assert all soft assertions
        softAssert.assertAll();
        backToHomePage();
        System.out.println("Navigated back to homepage from Careers page");
        System.out.println(" TC-03 Careers link - test case ");
    }

    // TC04--  Clicking on Contact Us link

    @Test(priority = 4)
    public static void contactUslink() {
        contactusClick();
        System.out.println("Navigated to 'CONTACT US' link");
        // verifyContactTitle();
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = contactTxt();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("'Contact us  text presence verified");
        // Assert all soft assertions
        softAssert.assertAll();
        backToHomePage();
        System.out.println("Navigated back to Home page from ContactUs Page");
        System.out.println(" TC-04 Contact Us link test case ");
    }
    //TC05 --Directing to  'Blogs' link on Home Page footer
    @Test(priority = 5)
    public static void blogsLink() {

        // Clicking on the "Blogs" link in the Footer
        clickBlogsLink();
        System.out.println("Navigated to 'Blogs' page");
        switchToChildWindow();
        verifyInfyniTitle();
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = blogsImagePresence();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("Blogs page Infyni logo verified");
        closeChildWindow();
        System.out.println("Navigated back to the homepage from the Blogs page");
        System.out.println(" TC-05 Blogs link test case ");

    }
    //TC06  --Clicking on FreeWebinars link

    @Test(priority = 6)
    public static void freeWebinarsLink() {
        clickFreeWebinarsLink();
        System.out.println("Clicked on 'FreeWebinars' link");
        SoftAssert softAssert = new SoftAssert();
        boolean actualResult = validatewebinarText();
        boolean expectedResult = true;
        softAssert.assertEquals(actualResult, expectedResult);
        System.out.println("'Webinar' text presence verified");
        // Assert all soft assertions
        softAssert.assertAll();
        backToHomePage();
        System.out.println("Navigated back to Home page from Webinars page");
        System.out.println(" TC-06 Webinar test case ");
    }
    @Test(priority=7)
    public static void helpCenterLink() {
        clickHelpCenterLink();
        boolean actualresult = verifyHelpCenterText();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("HelpCenterText Presence Validation Success");
        backToInfyniHomePage();
    }
    @Test(priority=8)
    public static void PrivacyPolicyLink()
    {
        clickPrivacyPolicyLink();
        boolean actualresult = verifyPrivacyPolicyText();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("PrivacyPolicy Text Presence Validation Success");
        backToInfyniHomePage();
    }
    @Test(priority=9)
    public static void TermsConditionsLink() {
        clickTermsConditionsLink();
        boolean actualresult = verifyTermsConditionsText();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("TermsConditions Text Presence Validation Success");
        backToInfyniHomePage();
    }
    @Test(priority=10)
    public static void signUpLink() {
        clickSignUpLink();
        boolean actualresult = verifySignUpText();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("signUp Text Presence Validation Success");
        backToInfyniHomePage();
    }
    @Test(priority=11)
    public static void BecomeInstructorLink() {
        clickBecomeInstructorLink();
        boolean actualresult = verifyBecomeInstructorText();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("BecomeInstructor Text Presence Validation Success");
        backToInfyniHomePage();
    }
    @Test(priority=12)
    public static void InfyniForBusinessLink() {
        clickInfyniForBusinessLink();
        boolean actualresult = verifyinfyniForBusinessText();
        boolean expectedresult = true;
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(actualresult, expectedresult);//using soft assert sa.assertAll();
        System.out.println("InfyniForBusiness Text Presence Validation Success");
        backToInfyniHomePage();
        System.out.println("***********HomePage Footer Test Cases Ended****************");
    }
    @AfterSuite
    public static void closeApp()
    {
        driver.close();
    }

}
