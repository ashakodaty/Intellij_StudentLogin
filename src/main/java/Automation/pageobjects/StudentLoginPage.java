package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class StudentLoginPage extends Base {
  //student login Details
    public static By stu_EmailInputBox=By.xpath("//input[@type='email']");
    public static By stu_PasswordInputBox=By.xpath("//input[@type='password']");
    public static By stu_LogInButton=By.xpath("//button[@type='submit']");


    public static By dashboardText=By.xpath("//span[@class='font-primary-font-bold tab-panel_title__oPS_k' and text()='Dashboard']");
    public static void clickLoginButton() {
        try {
            driver.findElement(stu_LogInButton).click();
            System.out.println("Clicked on Login Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static void enterStudentEmailAddress(String email) {
        try {
            driver.findElement(stu_EmailInputBox).clear();
            driver.findElement(stu_EmailInputBox).sendKeys(email);
            System.out.println("Entered Student Email Address");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void enterStudentPassword(String password) {
        try {
            driver.findElement(stu_PasswordInputBox).clear();
            driver.findElement( stu_PasswordInputBox).sendKeys(password);
            System.out.println("Entered Student Password");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }

    }
    public static void clickStudentLogin() {
        try {
            driver.findElement(stu_LogInButton).click();
            System.out.println("Clicked on Student Login Button");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static boolean dashboardTextPresence() {
        boolean result = false;
        try {
            driver.findElement(dashboardText).isDisplayed();
            System.out.println("Navigated to Student DashboardPage");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
}

