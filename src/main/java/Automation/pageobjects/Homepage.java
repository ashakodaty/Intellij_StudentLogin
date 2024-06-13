package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.testng.Assert;


public class Homepage extends Base {
//Common Login Button Home page Objects
    public static By loginButton = By.xpath("//span[text()='Log In']");
    public static By loginText = By.xpath("//span[contains(text(),'Please enter your details to Log In')]");
    // Infyni logo (back to home from every page)
    public static By infyniLogo = By.xpath("//div[@class='undefined w-[calc(100%-60px)]   bg-white flex items-center justify-center']/a/img[@alt='logo']");
    // Infyni logo (back to home from sign up page)
    public static By infyniLogo2 = By.xpath("//img[@class='w-[6.25rem]' and @alt='logo']");
    //common infyni logo
    public static By commonInfyniLogo = By.xpath("//a[@href='/']/img[@alt='logo']");
    // Home page Footer links
    public static By helpCenterLink = By.xpath("//a[@href='/help-center']");
    public static By helpCenterText = By.xpath("//p[contains(text(),'Help Center')]");
    public static By privacyPolicyLink = By.xpath("//a[@href='/privacy-policy']");
    public static By termsConditionsLink = By.xpath("//a[@href='/terms-conditions']");
    public static By termsConditionsText = By.xpath("//p[contains(text(),'Terms & Conditions')]");
    public static By signUpLink = By.xpath("//a[@href='/signup' and text()='Sign Up']");
    public static By signUpText = By.xpath("//h4[contains(text(),'Sign Up')]");
    public static By becomeInstructorLink = By.xpath("//a[@href='/instructor-homepage']");
    public static By becomeInstructorText = By.xpath("//div[@class='instructorhomepage_title__JrzNA' and text()='Become an Instructor']");
    public static By infyniForBusinessLink = By.xpath("//a[@href='/business' and text()='Infyni for Business']");
    public static By infyniForBusinessText = By.xpath("//h2[contains(text(),'Infyni for Business')]");
    public static By privacyPolicyText = By.xpath("//p[contains(text(),'Privacy Policy')]");
    public static By infynilogo = By.xpath("//div[@class='header_header__aawC5']/div/a[@href='/']"); // action click
    //Web Elements for the quick links in Infyni homepage footer
    public static By infyniimage = By.xpath("//a/img[@class='sm:block hidden']");
    //Home Page AboutUsLink Objects
    public static By aboutUsLink = By.xpath("//a[@href='/about-us' and text()='About Us']"); // action click
    public static By aboutUsText = By.xpath("//div/p[contains(text(),'About Us')]");// to verify text presence
    // Home Page footer - 'News' link objects
    public static By newsLink = By.xpath("//div/a[@href='/news']");
    public static By newsText = By.xpath("//div/p[contains(text(),'News')]");

    //Home page footer - 'Careers' link objects
    public static By careersLink = By.xpath("//div/a[@href='/careers']"); // action click
    public static By careerText = By.xpath("//div/h2[contains(text(),'Careers')]");

    //Home page related contact us link objects
    public static By contactusLink = By.xpath("//div/a[@href='/contact-us']");
    public static By contactusText = By.xpath("//div/h2[contains(text(),'Contact Us')]");

    //Home Page Blogs link element locators
    public static By blogsLink = By.xpath("//div/a[@href='https://infyni.com/blog/']");
    public static By blogslogoimage = By.xpath("//div[@class='logo-menu-wrap']");
    //Home page footer - FreeWebinars link objects
    public static By freeWebinarsLink = By.xpath("//div/a[@href='/freewebinars']");
    public static By freewebinartext = By.xpath("//div[@class='FreeWebinars_freewebinars__ZBX_Y']/div/p[contains(text(),'Free Webinars')]");


    // Methods for Verification
    public static void backToHomePage() {
        try {
            driver.findElement(infynilogo).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    // About Us link getting clicked
    public static void clickAboutUsLink() {
        try {
            driver.findElement(aboutUsLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    //verification for AboutUs text presence
    public static boolean aboutUsTextPresence() {
        boolean result = false;

        try {
            result = driver.findElement(aboutUsText).isDisplayed();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    //validating the aboutUs text
    public static String aboutUsText() {
        String value = " ";
        try {
            value = driver.findElement(aboutUsText).getText();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return value;
    }

    // News link methods
    public static void clickNewsLink() {
        try {
            driver.findElement(newsLink).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Validate News link verification
    public static boolean validateNewsText() {
        boolean result = false;
        try {

            result = driver.findElement(newsText).isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
// infyni home page footer - careers link

    public static void clickCareersLink() {
        try {
            driver.findElement(careersLink).click();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // infyni home page footer - Validate career text
    public static boolean validateCareerText() {
        boolean result = false;
        try {
            result = driver.findElement(careerText).isDisplayed();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    // contact us link action performed
    public static void contactusClick() {
        try {
            driver.findElement(contactusLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    // verifying contact us text is displayed
    public static boolean contactTxt() {
        boolean result = false;
        try {
            result = driver.findElement(contactusText).isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }


    //Verifying contact text is displayed
    public static boolean ContactTextpresence() {
        boolean result = false;

        try {
            result = driver.findElement(contactusText).isDisplayed();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    //verifying contact info
    public static void verifyContactinfo() {
        boolean ContactText = ContactTextpresence();
        boolean expectedContactText = true;
        Assert.assertEquals(ContactText, expectedContactText);
        System.out.println("ActualText:" + ContactText);
        System.out.println("Contact info verified");
        System.out.println("Contact text is retrieved");
    }
    //Method to click on the "Blogs" link in the footer
    public static void clickBlogsLink() {
        try {
            driver.findElement(blogsLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    //Validation method for Infyni - Blogs page
    public static boolean blogsImagePresence() {
        boolean result = false;
        try {
            result = driver.findElement(blogslogoimage).isDisplayed();
            System.out.println("Infyni logo verified");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;

    }

    public static void verifyInfyniTitle() {
        String infyniTitle = driver.getTitle();
        System.out.println("Title is" + infyniTitle);
        String expectedTitle = "Infyni Blog: Insights and Trends to Watch Out For";
        Assert.assertEquals(infyniTitle, expectedTitle);
        System.out.println("Blogs page title INFYNI verified");

    }
    // Free webinars getting clicked
    public static void clickFreeWebinarsLink() {
        try {
            driver.findElement(freeWebinarsLink).click();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //webinar text presence text verification
    public static boolean validatewebinarText() {
        boolean result = false;
        try {
            result = driver.findElement(freewebinartext).isDisplayed();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }


    public static void clickLoginButton() {
        try {
            driver.findElement(loginButton).click();
            System.out.println("Clicked on Login Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
        public static boolean loginTextPresence() {
            boolean result = false;
            try {
                driver.findElement(loginText).isDisplayed();
                System.out.println("Navigated to LoginPage");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            return result;
        }

        public static void clickHelpCenterLink() {
            try {
                driver.findElement(helpCenterLink).click();
                System.out.println("Navigated to HelpCenterPage");
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }


    public static boolean verifyHelpCenterText() {
        try {
            driver.findElement(helpCenterText).isDisplayed();
            System.out.println("HelpCenterPage Text Verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
    public static void clickPrivacyPolicyLink() {
        try {
            driver.findElement(privacyPolicyLink).click();
            System.out.println("Navigated to PrivacyPolicyPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyPrivacyPolicyText() {
        try {
            driver.findElement(privacyPolicyText).isDisplayed();
            System.out.println("PrivacyPolicyPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
    public static void clickTermsConditionsLink() {
        try {
            driver.findElement(termsConditionsLink).click();
            System.out.println("Navigated to Terms&ConditionsPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyTermsConditionsText() {
        try {
            driver.findElement(termsConditionsText).isDisplayed();
            System.out.println("Terms&ConditionsPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
    public static void clickSignUpLink() {
        try {
            driver.findElement(signUpLink).click();
            System.out.println("Navigated to SignUp Page");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifySignUpText() {
        try {
            driver.findElement(signUpText).isDisplayed();
            System.out.println("Sign Up Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
    public static void clickInfyniLogoFromSignUp() {
        try {
            driver.findElement(infyniLogo2).click();
            System.out.println("Navigated to Home Page from SignUp Page");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void clickBecomeInstructorLink() {
        try {
            driver.findElement(becomeInstructorLink).click();
            System.out.println("Navigated to BecomeInstructorPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyBecomeInstructorText() {
        try {
            driver.findElement(becomeInstructorText).isDisplayed();
            System.out.println("BecomeInstructorPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return false;
    }
    public static void clickInfyniForBusinessLink() {
        try {
            driver.findElement(infyniForBusinessLink).click();
            System.out.println("Navigated to InfyniForBusinessPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean verifyinfyniForBusinessText() {
        try {
            driver.findElement(infyniForBusinessText).isDisplayed();
            System.out.println("infyniForBusinessPage Text verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return false;
    }

    public static void backToInfyniHomePage() {
        try {
            driver.findElement(commonInfyniLogo).click();
            System.out.println("infyni logo clicked");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
