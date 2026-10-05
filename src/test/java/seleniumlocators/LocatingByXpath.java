package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatingByXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input"));  //Traversing from node to desired element -- Absolute X Path

        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input"));
        passwordField.sendKeys("secret_sauce");   //TagIDAttribute

        WebElement loginButton = driver.findElement(By.xpath("html/body/div/div/div[2]/div[1]/div/div/form/input"));
        loginButton.click();
    }
}













//X path is defined as XML Path
// Types of X Path :
// 1. Absolute X Path - traversing from root node to the desired elements /html/body/nav/div/div/div[2]/ul/li
// html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input --> swag lags username
// 2. Relative/ partial Xpath --> //tagname@[attribute="value"] or //"[@attribute="value"]" or //*@[attribute="value"]  --> * means all

//input[@data-test='useranme']
// *[@data-test='useranme']