package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class CartPage {


    By cartLabel = By.xpath("//a[.='Cart']");
    By buttonPlaceOrder = By.xpath("//button[@class='btn btn-success']");

    public void clickCartLabel() {
        driver.findElement(cartLabel).click();

    }

    public void clickButtonPlaceOrder() {
        driver.findElement(buttonPlaceOrder).click();

    }

}
