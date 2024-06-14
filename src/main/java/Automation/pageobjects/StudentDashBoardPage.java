package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import java.util.List;

public class StudentDashBoardPage extends Base {
    public static By homeLink = By.xpath("//a[@href='/']/img[@alt='logo']");
    public static By courseStatusDropdown = By.xpath("//div/p[text()='Course Status']");
    public static By enrollmentOpenCheckbox = By.xpath("//input[@id='courseFilter701' and @type='checkbox']");
    public static By searchInputBox = By.xpath("//input[@placeholder='Search' and @class='text-[16px] leading-[20px] bg-[#f4f5f7] border-0 w-full ml-1  focus:outline-0']");
    public static By listCount = By.xpath("//ul[@class='absolute top-[100%] max-h-[300px] overflow-auto w-full bg-white shadow-md rounded-[10px]']/li");
    public static By CourseLink = By.xpath("//p[@class='capitalize text-[16px] line-clamp-2 !font-primary-font-bold']");
    public static By enrollNowButton = By.xpath("//span[contains(text(),'Enroll Now')]");
    public static By firstNameInputBox = By.xpath("//input[@id='first_name']");
    public static By lastNameInputBox = By.xpath("//input[@id='last_name']");
    public static By address1InputBox = By.xpath("//input[@id='address1']");
    public static By adderss2InputBox = By.xpath("//input[@id='address2']");
    public static By cityInputBox = By.xpath("//input[@id='city']");
    public static By countryInputBox = By.xpath("//div[@id='country']");
    public static By stateInputBox = By.xpath(" //input[@id='state']");
    public static By countryListDropdown = By.xpath(" //div/ul[@class='MuiList-root MuiList-padding MuiMenu-list css-r8u8y9']/li");
    public static By zipInputBox = By.xpath("//input[@id='zip']");
    public static By saveButton = By.xpath("//button/span[contains(text(),'SAVE')]");
    public static By StripeText = By.xpath(""//div/img[@alt='stripepay']);
    public static By payNowButton = By.xpath(" //button/span[text()='Pay Now']");
    public static By frame = By.xpath("//iframe[@title='Secure payment input frame']");

    public static By cardTabButton = By.xpath("//span[@class='p-TabLabel TabLabel TabLabel--selected' and text()='Card']");
    public static By cardNumberTextbox = By.xpath("//div[@class='p-Input']/input[@id='Field-numberInput']");
    public static By expirationTextbox = By.xpath("//input[@id='Field-expiryInput']");
    public static By cvcTextbox = By.xpath("//input[@id='Field-cvcInput']");
    public static By countryDropdown = By.xpath("//div[@class='p-Input']/input[@id='Field-numberInput']");
    public static By zipcodeTextbox = By.xpath("//input[@id='Field-postalCodeInput']");
    public static By continueButton = By.xpath("//span[text()='Continue']");

    //Methods
    public static void clickHomeLink() {
        try {
            driver.findElement(homeLink).click();

            System.out.println("Clicked HomeLink in Student Dashboard Page");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectCourseStatusByOpenEnrollment() {
        try {
            driver.findElement(courseStatusDropdown).click();
            System.out.println("Clicked courseStatusDropdown in left Navigation Menu");
            JavascriptExecutor js = (JavascriptExecutor) driver;
            WebElement chkbox = driver.findElement(enrollmentOpenCheckbox);
            js.executeScript("arguments[0].click();", chkbox);

            //driver.findElement(checkbox).click();
            System.out.println("Clicked enrollmentOpen under Course Status Filter");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterCourseName(String text) {
        try {
            driver.findElement(searchInputBox).click();
            driver.findElement(searchInputBox).clear();
            driver.findElement(searchInputBox).sendKeys(text);
            System.out.println("Entered Course name in search box");
            driver.findElement(searchInputBox).click();

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void viewDisplayedList() {
        try {
            List<WebElement> searchList = driver.findElements(listCount);
            System.out.println("Count of Search list:" + searchList.size());
            System.out.println("List of items from the search");
            for (int i = 0; i < searchList.size(); i++) {

                System.out.println(searchList.get(i).getText());

            }
            for (int j = 0; j < searchList.size(); j++) {
                if (searchList.get(j).getText().equals("interior Art design")) {
                    searchList.get(j).click();
                    break;
                }
            }

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectCourse() {
        try {
            driver.findElement(CourseLink).click();
            System.out.println("Clicked on course link to enroll");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void clickEnrollNow() {
        try {
            driver.findElement(enrollNowButton).click();
            System.out.println("Clicked on enroll now button in course page");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterfirstName(String fname) {
        try {

            driver.findElement(firstNameInputBox).clear();
            driver.findElement(firstNameInputBox).sendKeys(fname);
            System.out.println("Entered first name");


        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterLastName(String lname) {
        try {
            driver.findElement(lastNameInputBox).clear();
            driver.findElement(lastNameInputBox).sendKeys(lname);
            System.out.println("Entered last name ");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterAddressLine1(String addr1) {
        try {
            driver.findElement(address1InputBox).clear();
            driver.findElement(address1InputBox).sendKeys(addr1);
            System.out.println("Entered address in addressline1");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterAddressLine2(String addr2) {
        try {
            driver.findElement(adderss2InputBox).clear();
            driver.findElement(adderss2InputBox).sendKeys(addr2);
            System.out.println("Entered address in addressline2");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterCity(String city) {
        try {
            driver.findElement(cityInputBox).clear();
            driver.findElement(cityInputBox).sendKeys(city);
            System.out.println("Entered city ");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void selectCountry(String country) {
        try {
            driver.findElement(countryInputBox).click();
            List<WebElement> countrylist = driver.findElements(countryListDropdown);

            for (int j = 0; j < countrylist.size(); j++) {
                if (countrylist.get(j).getText().equals("United States of America")) {
                    countrylist.get(j).click();
                    break;
                }

            }
            System.out.println("selected Country");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void enterState(String state) {
        try {
            driver.findElement(stateInputBox).clear();
            driver.findElement(stateInputBox).sendKeys(state);
            System.out.println("Entered State ");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void enterAddressZipcode(String zip) {
        try {
            driver.findElement(zipInputBox).clear();
            driver.findElement(zipInputBox).sendKeys(zip);
            System.out.println("Entered Zipcode ");

        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void clickSaveAddressButton() {
        try {
            driver.findElement(saveButton).click();
            System.out.println("saved billing address");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static boolean verifyPaymentMethod() {
        boolean result = false;
        try {
            driver.findElement(StripeText).isDisplayed();
            System.out.println("Stripe text presence verified");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }


    public static void clickPayNowButton() {
        try {
            driver.findElement(payNowButton).click();
            System.out.println("clicked pay now button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static boolean verifyCardTabSelection() {
        boolean result = false;
        try {
            WebElement frame1 = driver.findElement(frame);
            driver.switchTo().frame(frame1);
            driver.findElement(cardTabButton).isSelected();
            System.out.println("card tab is selected ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }

    public static void enterCardNumber(String number) {
        try {
            driver.findElement(cardNumberTextbox).sendKeys(number);
            System.out.println("Entered card number");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void enterExpiration(String expdate) {
        try {
            driver.findElement(expirationTextbox).clear();
            driver.findElement(expirationTextbox).sendKeys(expdate);
            System.out.println("Entered expiry date ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void enterCvc(String cvc) {
        try {
            driver.findElement(cvcTextbox).clear();
            driver.findElement(cvcTextbox).sendKeys(cvc);
            System.out.println("Entered cvc ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void selectCountry() {
        try {
            driver.findElement(countryDropdown);
            System.out.println("Selected country");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void enterZipcode(String zipcode) {
        try {
            driver.findElement(zipcodeTextbox).clear();
            driver.findElement(zipcodeTextbox).sendKeys(zipcode);
            System.out.println("Entered zipcode ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void clickContinueButton() {
        try {
            driver.switchTo().defaultContent();
            driver.findElement(continueButton).click();
            System.out.println("clicked on continue button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
