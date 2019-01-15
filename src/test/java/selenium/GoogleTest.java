package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GoogleTest
{
   private WebDriver driver = null;
   private String url = "https:\\google.com";

    @BeforeTest
    public void setUp()
    {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        System.out.println("step_1");
    }

    @Test
    public void GoogleOpen()
    {
        driver.get(url);
        System.out.println("step_2");
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
        driver.quit();
        System.out.println("step_3");
    }
}
