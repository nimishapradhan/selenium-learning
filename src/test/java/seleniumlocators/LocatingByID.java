package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByID {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();    //establising communication with the webdriver existing in my device EgeDriver for edge and so on for firefox, safari
        driver.manage().window().maximize();      //opening chrome in its maximum size

        driver.get("https://www.saucedemo.com/"); //visit the site
        WebElement userNameField = driver.findElement(By.id("user-name"));  //web-element datatype for web element
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();


        //driver.close --> closes current tab
        //driver.quit  --> closes entire web browser
         driver.quit();
    }
}
