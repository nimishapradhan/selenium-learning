package seleniumlocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;

    public class LocatingByXPathAxes {

        public static void main(String[] args) {

            WebDriver driver = new ChromeDriver();

            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

            driver.get("https://testautomationpractice.blogspot.com/");


            // SELF AXIS

            WebElement nameField = driver.findElement(
                    By.xpath("//input[@id='name']/self::input")
            );

            nameField.sendKeys("Nimisha");


            // PARENT AXIS

            WebElement emailField = driver.findElement(
                    By.xpath("//input[@id='email']/parent::div//input")
            );

            emailField.sendKeys("nimisha@gmail.com");


            // CHILD AXIS

            WebElement childField = driver.findElement(
                    By.xpath("//div[@id='name']/child::input")
            );

            childField.sendKeys("Nimisha");


            //ANCESTOR AXIS

            WebElement phoneField = driver.findElement(
                    By.xpath("//input[@id='phone']/ancestor::div[1]//input")
            );

            phoneField.sendKeys("9800000000");


            //DESCENDANT AXIS

            WebElement addressField = driver.findElement(
                    By.xpath("//form/descendant::input[@id='textarea']")
            );

            addressField.sendKeys("Kathmandu");


            //FOLLOWING AXIS

            WebElement followingField = driver.findElement(
                    By.xpath("//input[@id='name']/following::input[1]")
            );

            followingField.sendKeys("Following");


            //FOLLOWING-SIBLING AXIS

            WebElement followingSiblingField = driver.findElement(
                    By.xpath("//input[@id='name']/following-sibling::input[1]")
            );

            followingSiblingField.sendKeys("Following Sibling");


            //PRECEDING AXIS

            WebElement precedingField = driver.findElement(
                    By.xpath("//input[@id='phone']/preceding::input[1]")
            );

            precedingField.sendKeys("Preceding");


            // PRECEDING-SIBLING AXIS

            WebElement precedingSiblingField = driver.findElement(
                    By.xpath("//input[@id='phone']/preceding-sibling::input[1]")
            );

            precedingSiblingField.sendKeys("Preceding Sibling");

        }
    }




//Xpath Axes:
// – Self
//– Parent (//*[@attribute=”value”]/parent::tagname)
//– child (//*[@attribute=”value”]/child::tagname)
  //                – ancestor (//*[@attribute=”value”]/ancestor::tagname)
   //               – descendant (//*[@attribute=”value”]/descendant::tagname)
     //             – following (//*[@attribute=”value”]/following::tagname)
       //           – following-sibling (//*[@attribute=”value”]/following-sibling::sibling-tagname[@attribute=”value”])
         //         – preceding (//*[@attribute=”value”]/preceding::tagname)
           //       – preceding-sibling (//*[@attribute=”value”]/preceding-sibling::preceding-tagname[@attribute=”value”])



//parent              → one level up
//ancestor             → any level up

//child                → one level down
//descendant           → any level down

//following            → anywhere after
//following-sibling    → sibling after

//preceding            → anywhere before
//preceding-sibling    → sibling before

//self                 → current element