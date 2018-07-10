package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import utilities.ExcelReader;

import java.util.concurrent.TimeUnit;

public class Util {


    public static WebDriver driver;
    public int implicitWait = 10;
    public static WebDriverWait wait;

    public static final String testsiteurl = "http://www.demo.guru99.com/V4/";
    public static final String login = "mngr140669";
    public static final String password = "tynYquj"; //tynYquj1
    public static final String firefoxLocation = "\\src\\test\\resources\\exec\\geckodriver.exe";

    public static ExcelReader excel = new ExcelReader(System.getProperty("user.dir")+ "\\src\\test\\resources\\excel\\testdata.xlsx");




    @BeforeMethod
    public void setUp(){

        /*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + firefoxLocation);
        driver = new FirefoxDriver();*/

        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\exec\\chromedriver.exe");
        driver = new ChromeDriver();

        driver.get(testsiteurl);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(implicitWait, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 5);

    }



    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
