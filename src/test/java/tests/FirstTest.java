package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstTest {

    @Test
    public void openSauceDemo(){
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.saucedemo.com");
        String title= driver.getTitle();
        System.out.println("Title:"+ title);
        Assert.assertEquals(title, "Swag Labs");
        driver.quit();
    }

}
