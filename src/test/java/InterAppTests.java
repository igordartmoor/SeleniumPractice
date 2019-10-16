import com.sun.org.apache.xalan.internal.xsltc.dom.CurrentNodeListFilter;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class InterAppTests {


    WebDriver driver;

    @Test
    public void loginTest(){
////        create driver
        System.setProperty("webdriver.gecko.driver", "/Users/dartmoor/IdeaProjects/JavaTestNG/src/test/resources/geckodriver");
        driver = new FirefoxDriver();


//        open page
        String url = "https://the-internet.herokuapp.com/login";
        driver.get(url);
        driver.manage().window().maximize();

//        enter name
        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("tomsmith");

//        enter password
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("SuperSecretPassword!");



//        click login
        WebElement loginButton = driver.findElement(By.xpath("//button[@class='radius']"));
        loginButton.click();


//        verificationLogOut:
        WebElement logInVerification = driver.findElement(By.xpath("//a[@href='/logout']"));
        logInVerification.isDisplayed();

        //verificationLogOut2

        //WebElement successfullMessage = driver.findElement(By.id("flash"));


//        newurl
//        logout btn
//        successful login page

        //close browser

        driver.quit();

    }

}