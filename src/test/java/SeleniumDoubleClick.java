import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import io.qameta.allure.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SeleniumDoubleClick {



    @Test

    public void doubleClick(){


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://demoqa.com");

        WebElement elementButton = driver.findElement(By.xpath("//*[name()='path' and contains(@d,'M16 132h41')]"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",elementButton);
        elementButton.click();

        WebElement buttonsClick = driver.findElement(By.xpath("//div[@class='element-list collapse show']//li[@id='item-4']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",buttonsClick);
        buttonsClick.click();

        WebElement doubleClick = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",doubleClick);
        Actions action = new Actions(driver);
        action.doubleClick(doubleClick).perform();
    }
}
