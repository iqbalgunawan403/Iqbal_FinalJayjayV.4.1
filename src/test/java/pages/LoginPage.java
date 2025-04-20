package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;

public class LoginPage {
    By loginLabel = By.xpath("//a[.='Log in']");
    By loginUsername = By.id("loginusername");
    By loginPassword = By.id("loginpassword");
    By loginButton = By.xpath("//button[.='Log in']");
    By nameOfUser = By.id("nameofuser");

    public void clickLoginLabel() {
        driver.findElement(loginLabel).click();
    }

    public void loginUsername(String username) {
        driver.findElement(loginUsername).sendKeys(username);
    }

    public void loginPassword(String password) {
        driver.findElement(loginPassword).sendKeys(password);
    }

    public void clickBtnLogin() {
        driver.findElement(loginButton).click();
    }

    public void greetingUser(String expectedMessage) {
        WebElement welcomeMessage = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(nameOfUser));
        String actualMessage = welcomeMessage.getText();
//        System.out.println(actualMessage);
        Assert.assertEquals(actualMessage, expectedMessage);
    }

}