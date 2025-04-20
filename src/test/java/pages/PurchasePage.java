package pages;

import org.openqa.selenium.By;

import static helper.Utility.driver;

public class PurchasePage {

    By formPlaceOrder = By.id("orderModalLabel");
    By nameInput = By.id("name");
    By countryInput = By.id("country");
    By cityInput = By.id("city");
    By cardInput = By.id("card");
    By monthInput = By.id("month");
    By yearInput = By.id("year");
    By purchaseBTN = By.xpath("//button[.='Purchase']");
    By successMSG = By.xpath("//h2[.='Thank you for your purchase!']");


    public void assertForm() {
        driver.findElement(formPlaceOrder).isDisplayed();

    }

    public void fillOrderForm(String name, String country, String city, String card, String month, String year) {
        driver.findElement(nameInput).sendKeys(name);
        driver.findElement(countryInput).sendKeys(country);
        driver.findElement(cityInput).sendKeys(city);
        driver.findElement(cardInput).sendKeys(card);
        driver.findElement(monthInput).sendKeys(month);
        driver.findElement(yearInput).sendKeys(year);
    }

    public void clickButtonPurchase() {
        driver.findElement(purchaseBTN).click();
    }

    public String getSuccessMessage() {
        return driver.findElement(successMSG).getText();
    }

}
