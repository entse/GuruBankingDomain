import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest {

    @Test
    public void verifyLoginSection() {

        String login = "mngr140669";
        String password = "tynYquj1";
        WebDriver driver = new FirefoxDriver();


        driver.get("http://www.demo.guru99.com/V4/");
        driver.findElement(By.xpath("//input[@name='uid']")).sendKeys(login);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
        driver.findElement(By.xpath("//input[@type='submit']")).click();

        Assert.assertEquals(driver.getTitle(), "Guru99 Bank Manager HomePage");
        driver.quit();
    }
}
