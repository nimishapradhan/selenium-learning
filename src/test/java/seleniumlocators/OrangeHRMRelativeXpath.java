package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class OrangeHRMRelativeXpath {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement userNameField = driver.findElement(
                By.xpath("//input[@name='username']")
        );
        userNameField.sendKeys("Admin");


        WebElement passwordField = driver.findElement(
                By.xpath("//input[@type='password']")
        );
        passwordField.sendKeys("admin123");


        WebElement loginButton = driver.findElement(
                By.xpath("//button[@type='submit']")
        );
        loginButton.click();
    }
}