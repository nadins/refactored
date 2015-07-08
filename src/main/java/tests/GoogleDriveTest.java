package tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

public class GoogleDriveTest {

    private WebDriver driver;
    private HomePage home;

    @Before
    public void setUp() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ad\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://google.com");
    }

    @Test
    public void goToDriveTest() {
        home = new HomePage(driver);
        home.goToDrive();
        home.openFolder();
    }

    @After
    public void tearDown() {
        home.removeFolder();
        driver.close();
    }
}
