package seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ExplicitWait {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        WebDriverWait ewait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement userNameField =
                ewait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Username']")
                ));

        userNameField.sendKeys("Admin");


        WebElement passwordField =
                ewait.until(ExpectedConditions.visibilityOfElementLocated(
                        By.xpath("//input[@placeholder='Password']")
                ));

        passwordField.sendKeys("admin123");


        WebElement loginButton =
                ewait.until(ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//button[text()=' Login ']")
                ));

        loginButton.click();
    }
}