package pages;

import helper.Utility;
import org.openqa.selenium.By;

import static helper.Utility.driver;

public class SignupPage {
    Utility util = new Utility();

    By signupLabel = By.id("signin2");
    By signupUsername = By.id("sign-username");
    By signupPassword = By.id("sign-password");
    By signupButton = By.xpath("//button[.='Sign up']");


    public void clickSignupLabel() {
        driver.findElement(signupLabel).click();
    }

    public void signupUsername(String username) {
        driver.findElement(signupUsername).sendKeys(username);
    }

    public void signupPassword(String password) {
        driver.findElement(signupPassword).sendKeys(password);
    }

    public void clickBtnSignup() {
        driver.findElement(signupButton).click();
    }

    public void messageSuccessPopup(String messageSuccess) {
        util.displayPopupLogin(messageSuccess);

    }

    public void messageErrorPopup(String messageError) {
        util.displayPopup(messageError);
    }

}
