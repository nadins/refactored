package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pages.HomePage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

public class OpenGmailTest {
    private WebDriver driver;
    private HomePage home;

    @Before
    public void setUp() {

//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ad\\AppData\\Local\\Google\\Chrome\\Application\\chromedriver.exe");
//        driver = new ChromeDriver();
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://google.com");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test
    public void goToGmailTest() {
        home = new HomePage(driver);
        home.goToDrive();
        assertTrue(home.getElement().contains("<name>"));
    }

    @After
    public void tearDown() {
        driver.close();
    }
}
