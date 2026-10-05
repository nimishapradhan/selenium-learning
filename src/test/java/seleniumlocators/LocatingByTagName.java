package seleniumlocators;    // --> //div to find any tag name

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LocatingByTagName {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        List<WebElement> divTags = driver.findElements(By.tagName("div"));   //multiple web elements is stored inside List<E>

        System.out.println("The total number of div tag are: " + divTags.size());
    }
}

//how many links in imdb page