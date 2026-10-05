package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatingByTagClassAttribute {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.saucedemo.com/");

        //WebElement userNameField = driver.findElement(By.cssSelector("input.input_error[data-test='username']"));  //TagClassAttribute
        WebElement userNameField = driver.findElement(By.cssSelector("div.login-box > form > div.form_group > input.input_error[data-test='username'] "));  //Traversing into child element

        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.cssSelector("input#password[placeholder='Password']"));
        passwordField.sendKeys("secret_sauce");   //TagIDAttribute

        WebElement loginButton = driver.findElement(By.cssSelector("input[data-test='login-button']"));
        loginButton.click();
    }

}

// Traversing into child elements of DOM using cssSelectors:
//div.login-box > form > div.form_group > input.input_error[data-test='username']
