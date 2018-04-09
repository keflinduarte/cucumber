package pages;

import Base.DriverQA;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver stepDriver) {
        driver = stepDriver;
    }

    public void clickLogin() {
        driver.findElement(By.name("Login")).submit();
    }


}
