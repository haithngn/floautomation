package Modules;
import Report.ListenerTest;
import Support.SetupSever;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
//import org.junit.Before;
import org.junit.*;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.*;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)



/**
 * Created by DinhNguyen on 8/21/17.
 */
public class TestLogin extends SetupSever {
   @BeforeMethod
   public void setup() throws IOException {
       SetupSever.SetUp();
   }
    @Test
    public void SignIn_002 ()

    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Existing User");
        if(el1.isDisplayed())
        {
            System.out.println("Show Existing User Button - OK");
        }
        else {
            System.out.println("FAILED");
        }
          MobileElement el2 = (MobileElement)
                  driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
          el2.click();

        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        if(el3.isDisplayed())
       {
            System.out.println("Show Username field - OK");
       }
        else {
            System.out.println("FAILED");
        }
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        if(el4.isDisplayed())
       {
           System.out.println("Show Password field - OK");
      }
       else {
           System.out.println("FAILED");
       }
        MobileElement el5 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Logo_Flo\"]");
        if(el5.isDisplayed())
       {
            System.out.println("Show Logo FLO - OK");
        }
        else {
            System.out.println("FAILED");
        }
        MobileElement el6 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Cancel\"]");
        if(el6.isDisplayed())
        {
            System.out.println("Show Cancel button - OK");
        }
        else {
            System.out.println("FAILED");
        }
       MobileElement el7 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isDisplayed())
        {
            System.out.println("Show Login button - OK");
        }
        else {
            System.out.println("FAILED");
        }
        String a;
        a ="I can?t access my account";
            Assert.assertEquals(driver.findElement(By.id("I can?t access my account")).getText(),a);
            if (a.contains("I can?t access my account")){
                System.out.println("Show I can?t access my account button - OK");
            }else {
                System.out.println("FAILED");}
    }
    @Test
    public void SignIn_003()
    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Existing User");
        el1.click();
        String a;
        a ="Existing User";
        driver.findElementByAccessibilityId("Cancel").click();
            if (a.contains("Existing User"))
            {
                System.out.println("Test Case ID 003 - OK");
            }
            else {
                System.out.println("Test Case ID 003 - FAILED");
            }
    }
    @Test
    public void SignIn_006()
    {

        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();//el2.sendKeys("");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("123123");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if (el4.isEnabled())
        {
            el4.click();
            System.out.println("Test Case ID 006 - FAIL");

        }else {
            System.out.println("Test Case ID 006 - OK");
        }
    }
    @Test
    public void SignIn_007()
    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Existing User"); el1.click();

        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.sendKeys("abcdasda");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        el3.click();
        MobileElement Error =(MobileElement)(new WebDriverWait(driver,4)).until(ExpectedConditions.presenceOfElementLocated(
                By.id("Error, User/password is invalid.")));
        String a ;
        a = "Error, User/password is invalid.";
        Assert.assertEquals(Error.getText(),a);
        if(a.contains("Error, Incorrect password/username. Please try again"))
        {
            System.out.println("Test Case ID 007 - OK");

        }
        else{
            System.out.println("Test Case ID 007 - FAIL");
        }
    }
    @Test
    public void SignIn_008()
    {

        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Existing User"); el1.click();

        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoasen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("111111");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        el4.click();
        MobileElement Error =(MobileElement)(new WebDriverWait(driver,4)).until(ExpectedConditions.presenceOfElementLocated(
                By.id("Error, Incorrect password/username. Please try again")));
        String a ;
        a = "Error, Incorrect password/username. Please try again";
        Assert.assertEquals(Error.getText(),a);
        if(a.contains("Error, Incorrect password/username. Please try again"))
        {
            System.out.println("Test Case ID 008 - OK");

        }
        else{
            System.out.println("Test Case ID 008 - FAIL");
        }
    }
    @Test
    public void SignIn_009()
    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Existing User"); el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("@#$$@@#$$");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("111111");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled())
        {
            el4.click();
            System.out.println("Test Case ID 009 - FAIL");
        }else{
            System.out.println("Test Case ID 009 - OK");
        }

    }
    @Test
    public void SignIn_010()
    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Existing User"); el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoa sen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("111111");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled())
        {
            el4.click();
            System.out.println("Test Case ID 010 - FAIL");
        }else{
            System.out.println("Test Case ID 010 - OK");
        }

    }
    @Test
    public void SignIn_011()
    {
        MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("Existing User"); el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoa...sen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("111111");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled())
        {
            el4.click();
            System.out.println("Test Case ID 011 - FAIL");
        }else{
            System.out.println("Test Case ID 011 - OK");
        }

    }
    @Test
    public void SignIn_012()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("ho?sen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("123123");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled()){
            el4.click();
            System.out.println("Test Case ID 012 - FAIL");
        }
        else {

            System.out.println("Test Case ID 012 - OK");
        }
    }
    @Test
    public void SignIn_013()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoa");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("123");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled()){
            el4.click();
            System.out.println("Test Case ID 013 - FAIL");
        }
        else {

            System.out.println("Test Case ID 013 - OK");
        }
    }
    @Test
    public void SignIn_014()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoasen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();//el3.sendKeys("123");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled()){
            el4.click();
            System.out.println("Test Case ID 014 - FAIL");
        }
        else {

            System.out.println("Test Case ID 014 - OK");
        }
    }
    @Test
    public void SignIn_017()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoasen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();//el3.sendKeys("123");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled()){
            el4.click();
            System.out.println("Test Case ID 017 - FAIL");
        }
        else {

            System.out.println("Test Case ID 017 - OK");
        }
    }
    @Test
    public void SignIn_018()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoasen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("123");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled()){
            el4.click();
            System.out.println("Test Case ID 018 - FAIL");
        }
        else {

            System.out.println("Test Case ID 018 - OK");
        }
    }
    @Test
    public void SignIn_019()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoasen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("123456");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        el4.click();
        MobileElement Error =(MobileElement)(new WebDriverWait(driver,4)).until(ExpectedConditions.presenceOfElementLocated(
                By.id("Error, Incorrect password/username. Please try again")));
        String a ;
        a = "Error, Incorrect password/username. Please try again";
        Assert.assertEquals(Error.getText(),a);
        if(a.contains("Error, Incorrect password/username. Please try again"))
        {
            System.out.println("Test Case ID 019 - OK");

        }
        else{
            System.out.println("Test Case ID 019 - FAIL");
        }
    }
    @Test
    public void SignIn_020()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeTextField[@name=\"analytics\"]");
        el2.clear();el2.sendKeys("hoasen");
        MobileElement el3 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeSecureTextField[@name=\"111111\"]");
        el3.clear();el3.sendKeys("123123");
        MobileElement el4 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Login\"]");
        if(el4.isEnabled()){
            el4.click();
            System.out.println("Test Case ID 020 - OK");
        }
        else {
            System.out.println("Test Case ID 020 - FAILED");
        }


    }
    @Test
    public void SignIn_021()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();

        MobileElement el2 = (MobileElement)driver.findElement(By.id("I can?t access my account"));el2.click();
        String a;
        a ="Close";
        Assert.assertEquals(driver.findElement(By.id("Close")).getText(),a);
        if(a.contains("Close")){
            System.out.println("Test Case ID 021 - OK");

        }else {
            System.out.println("Test Case ID 021 - FAILED");
        }
    }
    @Test
    public void SignIn_022()
    {
        MobileElement el1 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Existing User\"]");
        el1.click();

        MobileElement el2 = (MobileElement) driver.findElement(By.id("I can?t access my account"));el2.click();
        MobileElement el3 = (MobileElement) driver.findElement(By.id("Close"));
        el3.click(); System.out.println("Test Case ID 022 - OK");

    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @AfterMethod
    public void CScT(ITestResult result)throws IOException,InterruptedException{
        if(!result.isSuccess()){
//            Mobile.ca[/]
        }
    }
}
