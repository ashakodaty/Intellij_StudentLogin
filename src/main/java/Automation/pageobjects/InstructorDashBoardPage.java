package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class InstructorDashBoardPage extends Base {
    public static By homeLink = By.xpath("//a[@href='/']/img[@class='sm:block hidden']");
    // Search input box
    public static By searchInputBox = By.xpath("//input[@placeholder='Search' and @type='text']");
    public static By listCount = By.xpath("//ul[@class='absolute top-[100%] max-h-[300px] overflow-auto w-full bg-white shadow-md rounded-[10px]']/li");
    public static By CourseLink = By.xpath("//p[@class='capitalize text-[16px] line-clamp-2 !font-primary-font-bold']");
    public static By courseStatusDropdown = By.xpath("//div/p[text()='Course Status']");
    public static By enrollmentOpenCheckbox = By.xpath("//input[@id='courseFilter701' and @type='checkbox']");
    public static By sortByButtonOn = By.xpath("//div[@class='text-[!#000]']");
    public static By highestRatedButton= By.xpath("//li/span[text()='Highest Rated']");
    public static By lowToHighButton= By.xpath("//li/span[text()='Price Low to High']");
    public static By highToLowButton= By.xpath("//li/span[text()='Price High to Low']");
    public static void clickHomeLink() {
        try {
            driver.findElement(homeLink).click();

            System.out.println("Clicked HomeLink in Student Dashboard Page");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    //Method for Course to enter
    public static void enterCourseName(String text) {
        try {
            driver.findElement(searchInputBox).click();
            driver.findElement(searchInputBox).clear();
            System.out.println("Enter Instructor Course name in search box");
            driver.findElement(searchInputBox).sendKeys(text);
            driver.findElement(searchInputBox).click();
            System.out.println("Entered Instructor Course name in search box");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void clickCourseName(){
        try {
        driver.findElement(searchInputBox).click();
        System.out.println(" Course name in search box is clicked");
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
                if (searchList.get(j).getText().equals("Java Fundamentals")) {
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
    public static void setSortBy(){
        try {
            driver.findElement(sortByButtonOn).isDisplayed();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Sort By on  Instructor page ");
    }
    public static void sortByClick() {
        try {
            driver.findElement(sortByButtonOn).click();
            System.out.println("Sort By drop down is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void sortByDDSelect() {
        try {
            driver.findElement(lowToHighButton).isSelected();
            System.out.println("Low to High Drop down is Selected");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
