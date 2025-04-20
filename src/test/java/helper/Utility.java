package helper;

import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class Utility {

    public static WebDriver driver;

    public static File getJSONSchemaFile (String JSONFile) {
        return new File("src/test/java/helper/JSONSchemaData/" + JSONFile);
    }

    public static String generateRandomEmail() {
        String allowedChars = "abcdefghijklmnopqrstuvwxyz" + "1234567890" + "_-,.";
        String email = "";
        String temp = RandomStringUtils.randomAlphanumeric(10);// Panjang email 10 karakter
        email = temp + "@testdata.com";
        return email;
    }
    public static void startDriver() {
        ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("window-size=1920,1080");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }

    public void displayPopupLogin(String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(message, actualMessage);
        alert.accept();
    }

    public void displayPopup(String message) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        String actualMessage = alert.getText();
        Assert.assertEquals(message, actualMessage);
        alert.accept();
    }

    public void goToHomepage() {
        if (driver == null) {
            Utility.startDriver();  // Inisialisasi driver jika belum ada
        }
        driver.get("https://www.demoblaze.com/");
    }

    public static void quitDriver() {
        driver.quit();
    }
}
