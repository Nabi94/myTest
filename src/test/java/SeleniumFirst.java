import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.junit.Test;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumFirst {


    @Test
    public void testSelenium(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com");

        WebElement element = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",element);
        element.click();

        WebElement textbox = driver.findElement(By.xpath("//span[normalize-space()='Text Box']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",textbox);
        textbox.click();



    }
}
