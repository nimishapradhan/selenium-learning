package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class LocatingByLink {


    //Pause the program for 5 seconds and it needs to be declared in order to run thread
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.imdb.com/");

        // Give the page some time to load
        Thread.sleep(5000);


        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Number of links found: " + allLinks.size());

        // Go through every WebElement inside allLinks, one at a time[for-each loop]  --> for (Type variable : collection)
        for (WebElement link : allLinks) {
            System.out.println(link.getAttribute("href"));
        }

    }
}



// --> https://www.youtube.com/watch?app=desktop&v=8kwp1RXgxYI
//not possible for automation when human verification appears
// --> https://testautomationpractice.blogspot.com/