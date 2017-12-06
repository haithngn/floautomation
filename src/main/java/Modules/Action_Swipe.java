package Modules;

import Support.SetupSever;
import io.appium.java_client.MobileBy;
import io.appium.java_client.TouchAction;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Action_Swipe extends SetupSever {
    @BeforeMethod
    public void Setup() throws IOException {
        SetupSever.SetUp();
    }
    @Test
    public void Swipe_Left_To_Right(){
        new TouchAction(driver).tap(10, 112).release().perform(); //Email icon
        // Swipe Left to Right
        new TouchAction(driver).press(110,172).moveTo(245,-5).release().perform();
     //   driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);


        if (driver.findElementByName("\uE069").isDisplayed()){
            System.out.println("Show options - OK");
        }else {  System.out.println("Show options - FAIL");}

        new TouchAction(driver).press(110,172).moveTo(245,-5).release().perform();
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

        driver.findElementByName("\uE068").click(); //REPLY icon
        System.out.println("click reply - OK");
        driver.findElementByName("Cancel").click();
        driver.findElementByName("Delete Draft").click();
        new TouchAction(driver).press(110,172).moveTo(245,-5).release().perform();
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElementByName("\uE069").click(); //REPLY ALL icon
        driver.findElementByName("Cancel").click();
        driver.findElementByName("Delete Draft").click();
//        driver.findElementByName("\uE083");

       // driver.findElementByXPath("//XCUIElementTypeButton[@name=\"\uE083\"]");

                new TouchAction(driver).press(110,172).moveTo(245,-5).release().perform();
        //driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElementByName("\uE051").click(); //FORWARD icon
        driver.findElementByName("Cancel").click();
        driver.findElementByName("Delete Draft").click();


        new TouchAction(driver).press(110,262).moveTo(245 ,-5).release().perform();

        driver.findElementByName("\uE004").click(); //EVENT icon


        new TouchAction(driver).press( 110,  391).moveTo(245 ,-5).release().perform();
     //   driver.findElementByName("\uE083").click(); //TODO icon



    }
}
