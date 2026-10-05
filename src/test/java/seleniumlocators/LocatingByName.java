package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatingByName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();    //establising communication with the webdriver existing in my device EgeDriver for edge and so on for firefox, safari
        driver.manage().window().maximize();      //opening chrome in its maximum size

        driver.get("https://www.saucedemo.com/"); //visit the site

        //locating the web elements
        WebElement userNameField = driver.findElement(By.name("user-name"));  //web-element datatype for web element
        WebElement passwordField = driver.findElement(By.name("password"));
        WebElement loginButton = driver.findElement(By.name("login-button"));

        //Actions
        userNameField.sendKeys("standard_user");
        passwordField.sendKeys("secret_sauce");
        loginButton.click();

    }
}
