import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends Util{


    @Test
    public void verifyLoginSection() {

        driver.get(testsiteurl);
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(login);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");

    }


}
