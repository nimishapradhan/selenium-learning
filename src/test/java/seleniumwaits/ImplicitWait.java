package seleniumwaits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ImplicitWait {

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









// Types of selenium Wait:
//Implicit Wait: wait for entire element of the page to load , however if something loads at 4 sec instead of 10 sec it'll perform entire action, it won't wait for another 6 sec.
//Explicit Wait: don't wait for entire element of the page to load only the necessary element
//Fluent Wait: polling frequency
//thread.sleep: waits entire 5000, i.e 5 sec even if something loads in 2 sec.