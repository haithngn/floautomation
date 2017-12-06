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
import org.testng.annotations.*;
import org.testng.annotations.Test;

@Listeners(ListenerTest.class)
@FixMethodOrder(MethodSorters.NAME_ASCENDING)

/**
 * Created by DinhNguyen on 9/14/17.
 */
public class TestSignUp extends SetupSever {

    public String a ="Please use between 3 and 32 characters"+"Passwords must have between 6  and 32 characters"+"Only letters, numbers, underscores, and one period are allowed.";

    @BeforeMethod
    public void setUp() throws IOException {
	   SetupSever.SetUp();

    }
    @Test
    public void SignUp_002(){
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   if(el1.isDisplayed())
	   {
		  System.out.println("Show New User Button - OK");el1.click();
	   }
	   else {
		  System.out.println("FAILED");
	   }
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   if(el2.isDisplayed())
	   {
		  System.out.println("Show Username field - OK");
	   }
	   else {
		  System.out.println("FAILED");
	   }
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   if(el3.isDisplayed())
	   {
		  System.out.println("Show Password field - OK");
	   }
	   else {
		  System.out.println("FAILED");
	   }
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Logo_Flo");
	   if(el4.isDisplayed())
	   {
		  System.out.println("Show Logo FLO - OK");
	   }
	   else {
		  System.out.println("FAILED");
	   }
	   MobileElement el5 = (MobileElement) driver.findElementByXPath("//XCUIElementTypeButton[@name=\"Cancel\"]");
	   if(el5.isDisplayed())
	   {
		  System.out.println("Show Cancel button - OK");
	   }
	   else {
		  System.out.println("FAILED");
	   }
	   MobileElement el6 = (MobileElement) driver.findElementByAccessibilityId("27792977-B8FA-4C98-9B51-3D7AFC0E5573");
	   if(el6.isDisplayed())
	   {
		  System.out.println("Show Text By using or accessing Flo,\n I agree to the Term of Service and Privacy Policy - OK");
	   }
	   else {
		  System.out.println("FAILED");
	   }
	   MobileElement el7 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if(el7.isDisplayed())
	   {
		  System.out.println("Show Sign Up Button - OK");
	   }
	   else {
		  System.out.println("FAILED");
	   }

    }
    @Test
    public void SignUp_003(){
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
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
    public void SignUp_006(){

	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("ab");
	   String a ="Please use between 3 and 32 characters";
	   if(a.contains("Please use between 3 and 32 characters")){
		  System.out.println("Test Case ID 006 - OK");
	   }else {
		  System.out.println("Test Case ID 006 - FAIL");
	   }
    }
    @Test
    public void SignUp_007()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if(el3.isEnabled())
	   {
		  System.out.println("Test Case ID 007 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 007 - OK");
	   }
    }
    @Test
    public void SignUp_008(){
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys();
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if(el4.isEnabled())
	   {
		  System.out.println("Test Case ID 008 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 008 - OK");
	   }
    }
    @Test
    public void SignUp_009()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys("12345");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if(a.contains("Passwords must have between 6  and 32 characters") || el4.isEnabled())
	   {
			 System.out.println("Test Case ID 009 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 009 - OK");
	   }
    }
    @Test
    public void SignUp_010()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys("123456");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled()){
		  System.out.println("Test Case ID 010 - OK");
	   }
	   else {
		  System.out.println("Test Case ID 010 - FAIL");
	   }
    }
    @Test
    public void SignUp_011()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("newusersignup");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys("123456");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled()){
		  el4.click();
		  System.out.println("Test Case ID 011 - OK");
	   }
	   else {
		  System.out.println("Test Case ID 011 - FAIL");
	   }
    }
    @Test
    public void SignUp_012()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc123!@#");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled() && a.contains("Only letters, numbers, underscores, and one period are allowed.")){
		  System.out.println("Test Case ID 012 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 012 - OK");
	   }
    }
    @Test
    public void SignUp_013()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("a b c");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled() && a.contains("Only letters, numbers, underscores, and one period are allowed.")){
		  System.out.println("Test Case ID 013 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 013 - OK");
	   }
    }
    @Test
    public void SignUp_014()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys(" abc");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled() && a.contains("Only letters, numbers, underscores, and one period are allowed.")){
		  System.out.println("Test Case ID 014 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 014 - OK");
	   }
    }
    @Test
    public void SignUp_015()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc ");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled() && a.contains("Only letters, numbers, underscores, and one period are allowed.")){
		  System.out.println("Test Case ID 015 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 015 - OK");
	   }
    }
    @Test
    public void SignUp_016()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("123456");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
	       System.out.println("Test Case ID 016 - FAIL");
	   }else {
		  System.out.println("Test Case ID 016 - OK");
	   }
    }
    @Test
    public void SignUp_017()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("______");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 017 - FAIL");
	   }else {
		  System.out.println("Test Case ID 017 - OK");
	   }
    }
    @Test
    public void SignUp_018()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("_abc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 018 - FAIL");
	   }else {
		  System.out.println("Test Case ID 018 - OK");
	   }
    }
    @Test
    public void SignUp_019()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc_");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 019 - FAIL");
	   }else {
		  System.out.println("Test Case ID 019 - OK");
	   }
    }
    @Test
    public void SignUp_020()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("ab_c");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 020 - FAIL");
	   }else {
		  System.out.println("Test Case ID 020 - OK");
	   }
    }
    @Test
    public void SignUp_021()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("a_b_c");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 021 - FAIL");
	   }else {
		  System.out.println("Test Case ID 021 - OK");
	   }
    }
    @Test
    public void SignUp_022()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("a.bc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 022 - FAIL");
	   }else {
		  System.out.println("Test Case ID 022 - OK");
	   }
    }
    @Test
    public void SignUp_023()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys(".abc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 023 - FAIL");
	   }else {
		  System.out.println("Test Case ID 023 - OK");
	   }
    }
    @Test
    public void SignUp_024()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc.");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 024 - FAIL");
	   }else {
		  System.out.println("Test Case ID 024 - OK");
	   }
    }
    @Test
    public void SignUp_025()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("ab.c");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled()){
		  System.out.println("Test Case ID 023 - FAIL");
	   }else {
		  System.out.println("Test Case ID 023 - OK");
	   }
    }
    @Test
    public void SignUp_026()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys(".a.b.c.");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled() && a.contains("Only letters, numbers, underscores, and one period are allowed.")){
		  System.out.println("Test Case ID 026 - FAIL");
	   }else {
		  System.out.println("Test Case ID 026 - OK");
	   }
    }
    @Test
    public void SignUp_027()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("cóc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el3.isEnabled() && a.contains("Only letters, numbers, underscores, and one period are allowed.")){
		  System.out.println("Test Case ID 027 - FAIL");
	   }else {
		  System.out.println("Test Case ID 027 - OK");
	   }
    }
    @Test
    public void SignUp_028()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled()){
		  System.out.println("Test Case ID 028 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 028 - OK");
	   }
    }
    @Test
    public void SignUp_029()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc");el2.clear();
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled()){
		  System.out.println("Test Case ID 029 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 029 - OK");
	   }
    }
    @Test
    public void SignUp_030()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("hoasen");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys("123123");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");el4.click();
	   MobileElement Error =(MobileElement)(new WebDriverWait(driver,4)).until(ExpectedConditions.presenceOfElementLocated(
			 By.id("Error, Sorry, it appears that this username is already registered by someone else. Try another?")));
	   String a ;
	   a = "Error, Sorry, it appears that this username is already registered by someone else. Try another?";
	   Assert.assertEquals(Error.getText(),a);
	   if(a.contains("Error, Sorry, it appears that this username is already registered by someone else. Try another?"))
	   {
		  System.out.println("Test Case ID 030 - OK");

	   }
	   else{
		  System.out.println("Test Case ID 030 - FAIL");
	   }
    }
    @Test
    public void SignUp_032()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled()){
		  System.out.println("Test Case ID 032 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 032 - OK");
	   }
    }
    @Test
    public void SignUp_033()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("abc");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if (el4.isEnabled()){
		  System.out.println("Test Case ID 033 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 033 - OK");
	   }
    }
    @Test
    public void SignUp_034()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("king");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys("12345");
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if(a.contains("Passwords must have between 6  and 32 characters") || el4.isEnabled())
	   {
		  System.out.println("Test Case ID 034 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 034 - OK");
	   }
    }
    @Test
    public void SignUp_035()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys("123456");el3.clear();
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if(el4.isEnabled())
	   {
	       el4.click();
		  System.out.println("Test Case ID 035 - FAIL");
	   }
	   else {
		  System.out.println("Test Case ID 035 - OK");
	   }
    }
    @Test
    public void SignUp_037()
    {
	   MobileElement el1 = (MobileElement) driver.findElementByAccessibilityId("New User");
	   el1.click();
	   MobileElement el2 = (MobileElement) driver.findElementByAccessibilityId("Please use between 3 and 32 characters");
	   el2.sendKeys("theking");
	   MobileElement el3 = (MobileElement) driver.findElementByAccessibilityId("Passwords must have between 6  and 32 characters");
	   el3.sendKeys("123456");
	   el3.clear();
	   MobileElement el4 = (MobileElement) driver.findElementByAccessibilityId("Sign Up");
	   if(el4.isEnabled())
	   {
	       el4.click();
		  System.out.println("Test Case ID 037 - OK");
	   }
	   else {
		  System.out.println("Test Case ID 037 - FAIL");
	   }
    }

    @After
    public void tearDown() {
	   driver.quit();
    }

}
