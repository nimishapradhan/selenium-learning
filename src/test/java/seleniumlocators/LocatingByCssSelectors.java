package seleniumlocators;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.time.Duration;

public class LocatingByCssSelectors {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.cssSelector("input#user-name"));  //web-element datatype for web element
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.cssSelector("input#password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.cssSelector("input#login-button"));
        loginButton.click();
    }
}




