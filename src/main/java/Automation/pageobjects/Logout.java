package Automation.pageobjects;

import Automation.base.Base;
import org.openqa.selenium.By;

public class Logout extends Base {
    //Instructor Logout element Locators
    //Element locators
    public static By BackToInfynihomeLink = By.xpath("//a[@href='/']"); // action click
    public static By logoutProfilePic = By.xpath("//div[@class='header_header_main_list_avatar__fEPbF pl-2']/img[@class='header_header_main_list_avatar_icon__pR0Al']");
    public static By logoutDDButtonSelect = By.xpath("//div/button/img[@src='/_next/static/media/log_out.63b27a2d.svg']");
    //Student Logout element locators
    public static By accountName=By.xpath("//img[@class='header_header_main_list_avatar_icon__pR0Al']");
    public static By logoutButton=By.xpath("//button[@class='flex items-center']");
    // Logout methods
    // Logout image Selected

    public static void profileimageclick() {
        try {
            driver.findElement(logoutProfilePic).click();
            System.out.println("Profile image is clicked");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Logout pic image verified");
    }

    // Validating Image on second Page left corner upside

    public static void verifyprofileimg() {

        try {
            driver.findElement(logoutProfilePic).isDisplayed();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Validating profile image right corner of Instructor page ");
    }
    // validating Logout image

    public static void verifyLogoutDD() {
        try {
            driver.findElement(logoutDDButtonSelect).isDisplayed();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Profile Image is displayed ");
    }
    // Logout select

    public static void LogoutDDclick() {
        try {
            driver.findElement(logoutDDButtonSelect).click();
            System.out.println("Logout drop down is clicked ");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    // Validating logout select button is selected

    public static void LogoutDDSelect() {
        try {
            driver.findElement(logoutDDButtonSelect).isSelected();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Logout Drop down is Selected");
    }

    //
    public static void clickHomeLink()
    {
        try
        {
            driver.findElement(BackToInfynihomeLink).click();
            System.out.println("Infyni Home link clicked");
        }
        catch (Exception e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    ////Student methods
    public static void clickAccountName() {
        try {
            driver.findElement(accountName).click();
            System.out.println("Clicked Account Icon/Name");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
    public static void clickLogout() {
        try {
            driver.findElement(logoutButton).click();

            System.out.println("Logged Out from the Account");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
    public static boolean logoutTextPresence() {
        boolean result = false;
        try {
            driver.findElement(BackToInfynihomeLink).isDisplayed();
            System.out.println("logout verification of Infyni logo after logged out");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return result;
    }
    }
