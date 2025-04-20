package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class LogoutPage {

    By logoutButton = By.xpath("//a[.='Log out']");

    public void clickLogoutButton() {
        driver.findElement(logoutButton).click();
    }
}
