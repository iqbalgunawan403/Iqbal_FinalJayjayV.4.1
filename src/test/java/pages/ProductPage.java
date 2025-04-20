package pages;

import helper.Utility;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

import static helper.Utility.driver;

public class ProductPage {
    Utility util = new Utility();

    By itemCategory = By.className("list-group-item");
    By addToCard = By.xpath("//a[.='Add to cart']");


    public void clickItemCategory() {
        driver.findElement(itemCategory).click();

    }

    public String generateLocator(String itemName) {
        String locator = "//a[.='" + itemName + "']";
        return locator;
    }

    public void clickItem(String itemName) {
        driver.findElement(By.xpath(generateLocator(itemName))).click();
    }


    public void clickAddToCard() {
        driver.findElement(addToCard).click();
    }

    public void acceptAlert() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Alert alert = wait.until(ExpectedConditions.alertIsPresent());
        alert.accept();
    }
}
