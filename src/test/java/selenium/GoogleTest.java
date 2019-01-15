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
    }

    @Test
    public void GoogleOpen()
    {
        driver.get(url);
    }

    @AfterTest
    public void tearDown()
    {
        driver.close();
        driver.quit();
    }
}
