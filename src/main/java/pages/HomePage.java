package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public static final String TEST_TASK_DIGICODE_GMAIL_COM = "<gmail email>";
    public static final String TESTDIGICODE = "<password>";
    private WebDriver driver;

    @FindBy(id = "gb_70")
    WebElement button;
    @FindBy(id = "Email")
    WebElement email;
    @FindBy(id = "next")
    WebElement next;
    @FindBy(id = "signIn")
    WebElement signIn;
    @FindBy(id = "Passwd")
    WebElement passwd;
    @FindBy(xpath = ".//*[@id='gbwa']/div[1]/a")
    WebElement link;
    @FindBy(xpath = ".//*[@id='gb49']/span[1]")
    WebElement span;
    @FindBy(xpath = ".//*[@id='drive_main_page']/div/div[2]/div[2]/div/div/div[1]/div/div/div[1]/div/div/div")
    WebElement div;
    @FindBy(css = ".a-D-P")
    WebElement folder;
    @FindBy(xpath = "html/body/div[11]/div[3]/button[2]")
    WebElement element;
    @FindBy(xpath = "(.//*[@class='k-v-M'])[1]")
    WebElement newFolder;

    public void goToDrive() {
        button.click();
        email.sendKeys(TEST_TASK_DIGICODE_GMAIL_COM);
        next.click();
        passwd.sendKeys(TESTDIGICODE);
        signIn.click();
        link.click();
        span.click();
        div.click();
    }

    public void openFolder() {
//        folder.click();
//        element.click();

        Actions action = new Actions(driver);
        action.contextClick(newFolder).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();
    }

    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void removeFolder(){
        Actions action = new Actions(driver);
        action.contextClick(newFolder).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.RETURN).build().perform();

    }

    public String getElement() {
        return driver.findElement(By.className("gb_D")).getText();
    }
}
