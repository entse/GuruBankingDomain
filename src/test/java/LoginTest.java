import base.Util;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import utilities.Utilities;

import java.util.Hashtable;

public class LoginTest extends Util {


    @Test(dataProviderClass = Utilities.class, dataProvider = "dp")
    public void loginTest(Hashtable<String, String> data) {


        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(data.get("login"));
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(data.get("password"));
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        try {
            Alert alert = wait.until(ExpectedConditions.alertIsPresent());
            Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
            alert.accept();
        } catch (TimeoutException Ex){

        } finally {
            Assert.assertEquals(driver.getTitle(), data.get("title"));
        }


    }



}
