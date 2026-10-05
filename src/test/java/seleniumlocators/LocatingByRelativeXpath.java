package seleniumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LocatingByRelativeXpath {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://www.saucedemo.com/");

        WebElement userNameField = driver.findElement(By.xpath("//input[@data-test='username']"));
        userNameField.sendKeys("standard_user");

        WebElement passwordField = driver.findElement(By.xpath("//input[@name='password']"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = driver.findElement(By.xpath("//*[@data-test='login-button']"));
        loginButton.click();
    }
}
















// 2. Relative/ partial Xpath --> //tagname@[attribute="value"] or //"[@attribute="value"]" or //*@[attribute="value"]  --> * means all

//input[@data-test='useranme']          ---> specific tag name
// *[@data-test='username']            --> for all tag name
//input[@class="input_error_form_input" or @data-test=username]      --> or case
//input[@class="input_error_form_input" and @data-test=username]     --> and case
// --> //input[contains(@class,'in')]
// tagname[contains(@attribute,'value')]            -->--> contains case

//--. starts with case:   //input[starts-with(@id,'l')]
//tagname[starts-with(@attribute,'value')]                           -->--> starts -with case

// ---> text case:
//<div attributes = "value'> xyz </div>
//div[text()='Swag Labs']


//input[@name='username']/parent::div/preceding-sibling::div/child::label         --> locating by ancestors and descendents