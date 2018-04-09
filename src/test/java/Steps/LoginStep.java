package Steps;

import Base.BaseUtil;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import pages.LoginPage;

public class LoginStep extends BaseUtil{

    WebDriver driver;

    @Given("^I navigate to the login page$")
    public void INavigateToTheLoginPage(){
        System.out.println("Page is open");

        System.setProperty("webdriver.firefox.bin", "C:\\Users\\knro\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\knro\\workspace\\cucumber\\geckodriver-v0.20.0-win64\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://www.executeautomation.com/demosite/Login.html");
    }

    @And("^I enter UserName and Password$")
    public void iEnterUserNameAndPassword() throws Throwable {
        System.out.println("Testing Step");

        driver.findElement(By.name("UserName")).sendKeys("admin");
        driver.findElement(By.name("Password")).sendKeys("123456");
    }

    @And("^I click on Login button$")
    public void iClickOnLoginButton() throws Throwable {
        LoginPage page = new LoginPage(driver);
        page.clickLogin();
    }
}
