package Modules;
import Support.SetupSever;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import org.junit.Before;
import org.openqa.selenium.By;

import org.openqa.selenium.Keys;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.io.IOException;
import java.security.Key;
import java.util.concurrent.TimeUnit;


public class Settings_Email extends SetupSever{
    @BeforeMethod
    public void Setup() throws IOException {
        SetupSever.SetUp();
    }
    @Test
    public void Settings_Email_View() {
        // Open Settings View
        driver.findElement(By.name("\uE01A")).click();
        // Open Settings Emails view
        new TouchAction(driver).press(124,372).release().perform();

        System.out.println("Open Settings > Emails view");
        // Open Description Lines
        if (driver.findElementByName("Description Lines").isDisplayed()) {
            System.out.println("Description Lines is showing");
        } else {
            System.out.println("Description Lines - FAIL");
        }
        // Sending Email
        driver.findElementByName("Default Account for Sending Mail").isDisplayed();
        if (driver.findElementByName("Flo").isDisplayed()) {
            System.out.println("Default sending email is Flo account");
        } else {
            System.out.println("Default sending email is NOT Flo account");
        }
        // Move email after creating Event or Todo

        if (driver.findElementByName("Move email after creating Event of Todo").isDisplayed()) {
            // driver.findElementByName("Move email after creating Event of Todo").isDisplayed();
            System.out.println("Show title 'Move email after creating Event or Todo' - FAIL");
        } else {
            System.out.println("Show title 'Move email after creating Event or Todo'");
        }
        // Notify if NO reply
        driver.findElementByName("Notify if NO reply").isDisplayed();
        System.out.println("Notify if NO reply - OK");
        // Notify upon reply
        driver.findElementByName("Notify upon reply").isDisplayed();
        System.out.println("Notify upon reply - OK");


        /**
         DESCRIPTION LINES
         */

        driver.findElementByName("Description Lines").click();
        System.out.println("Open Description Lines");
        driver.findElementByName("0 Line").click();
        System.out.println("Select Email display 0 Line");
       // driver.findElementByXPath("//XCUIElementTypeImage[@name=\"Emails\"]").click();
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        System.out.println("Not show email line");
        //
        // driver.findElementByXPath("//XCUIElementTypeButton[@name=\"\uE01A\"]").click();
        driver.findElement(By.name("\uE01A")).click();
        System.out.println("Open Settings View");
        driver.findElementByName("1 Line").click();
        System.out.println("Select Email display 1 Line");
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        System.out.println("Show 1 line in email");
        //
        // driver.findElementByXPath("//XCUIElementTypeButton[@name=\"\uE01A\"]").click();
        driver.findElement(By.name("\uE01A")).click(); //Open Email view
        System.out.println("Open Settings View");
        driver.findElementByName("2 Lines").click();
        System.out.println("Select Email display 2 Lines");
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        System.out.println("Show 2 lines in email");
        //
        // driver.findElementByXPath("//XCUIElementTypeButton[@name=\"\uE01A\"]").click();
        driver.findElement(By.name("\uE01A")).click();
        System.out.println("Open Settings View");
        driver.findElementByName("3 Lines").click();
        System.out.println("Select Email display 3 Lines");
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        System.out.println("Show 3 lines in email");
        //
        driver.findElement(By.name("\uE01A")).click();
        System.out.println("Open Settings View");
        driver.findElementByName("4 Lines").click();
        System.out.println("Select Email display 4 Lines");
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        System.out.println("Show 4 lines in email");
        driver.findElement(By.name("\uE01A")).click(); // Settings icon
        //Back to Settings > Emais
        new TouchAction(driver).tap(314, 20).release().perform();

        /**
         Setting Default Sender
         */

        driver.findElementByName("Default Account for Sending Mail").click();
        //Select Sender is Flo account
        driver.findElementByName("Flo").click();
        //Back to Settings > Emais
        new TouchAction(driver).tap(314, 20).release().perform();
        // Open Email view and Compose new Email
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon

        // Check Sender email address
        driver.findElementByName("New Message").click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        if(driver.findElementByName("bi_test01@123flo.com").isDisplayed()){

            System.out.println("Sender is Flo account - OK");
        }else {
            System.out.println("Sender is NOT Flo account - FAIL");
        }
        new TouchAction(driver).press(295, 20).release().perform();
        driver.findElementByName("Cancel").click();
        driver.findElement(By.name("\uE01A")).click(); // Settings icon
        driver.findElementByName("Default Account for Sending Mail").click();
        //Select Sender is Google account
        driver.findElementByName("Google").click();
        //Back to Settings > Emais
        new TouchAction(driver).tap(314, 20).release().perform();
        // Open Email view and Compose new Email
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        // Check Sender email address
        driver.findElementByName("New Message").click();
        driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        if(driver.findElementByName("eyeucantin@gmail.com").isDisplayed()){

            System.out.println("Sender is Google account - OK");
        }else {
            System.out.println("Sender is NOT Google account - FAIL");
        }
        new TouchAction(driver).press(295, 20).release().perform();
        driver.findElementByName("Cancel").click();

        /**
         Move email after creating Event or Todo
         */

        // Move email after creating Event or Todo
        driver.findElement(By.name("\uE01A")).click(); // Settings icon
        new TouchAction(driver).press(687,211).release().perform(); // OFF
        // Open Email view
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        new TouchAction(driver).press(110,172).moveTo(245,-5).release().perform();
        driver.findElementByName("\uE004").click();
        System.out.println("Tap on Event icon");
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        new TouchAction(driver).press(110,172).moveTo(245,-5).release().perform();
        driver.findElementByName("\uE083").click();
        System.out.println("Tap on ToDo icon");
        /**
         Bear Track Settings
         */

        // NOTIFY IF NO REPLY

        driver.findElementByName("Notify if NO reply").click();
        // Open Email view and Compose new Email
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        // driver.findElementByName("To:").sendKeys("bi");
        new TouchAction(driver).tap(96, 82).release().perform();
        driver.findElementByName("To:").sendKeys("nguyen.nd9362@gmail.com",Keys.RETURN);
        new TouchAction(driver).tap(84, 217).release().perform();
        driver.findElementByName("Subject:").sendKeys("TEST BT");
        driver.findElementByName("Type something").sendKeys("Send email by bear track");
        new TouchAction(driver).tap(669,20).release().perform();
        driver.findElementByName("10 seconds").click();
        driver.findElementByName("Send").click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        // NOTIFY UPON REPLY
        driver.findElement(By.name("\uE01A")).click(); // Settings icon
        driver.findElementByName("Notify upon reply").click();
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        // driver.findElementByName("To:").sendKeys("bi");
        new TouchAction(driver).tap(96, 82).release().perform();
        driver.findElementByName("To:").sendKeys("nguyen.nd9362@gmail.com",Keys.RETURN);

        // driver.findElementByName("To").sendKeys(Keys.ENTER);
        new TouchAction(driver).tap(84, 217).release().perform();
        driver.findElementByName("Subject:").sendKeys("TEST BT");
        driver.findElementByName("Type something").sendKeys("Send email by bear track");
        new TouchAction(driver).tap(669,20).release().perform();
        driver.findElementByName("10 seconds").click();
        driver.findElementByName("Send").click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


    }
}
