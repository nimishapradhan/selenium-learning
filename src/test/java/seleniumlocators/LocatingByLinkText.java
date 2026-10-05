package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatingByLinkText {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));    //waiting the orange hrm's login page to load max threshold is 10 sec, but if it gets loaded early within 4 sec then it'll redirect to the link text without waiting for another 6 sec.

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


       // WebElement text = driver.findElement(By.linkText("OrangeHRM, Inc"));

        WebElement text = driver.findElement(By.partialLinkText("Orange"));
        text.click();    //throws synchronization issue, therefore we need to slow down the fast website or add some implicit wait to let the initial website load first.

    }
}
