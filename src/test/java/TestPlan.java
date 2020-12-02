import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.xpath;

public class TestPlan {

    @BeforeSuite
    public static void main(String[] args) throws InterruptedException {
        // ChromeDriver location set up in Utils class
        System.setProperty("webdriver.chrome.driver", Utils.CHROME_DRIVER_LOCATION);

        WebDriver driver = new ChromeDriver();
        driver.get(Utils.BASE_URL);

        Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@id=\"TemplateStrip1\"]/div/div/div[1]/div[1]/div[1]/div/div/a/img")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"TemplateStrip1\"]/div/div/div[1]/div[2]/div[1]/div/div/ul/li[2]/a/span")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"TemplateStrip1\"]/div/div/div[1]/div[2]/div[1]/div/div/ul/li[3]/a/span")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"TemplateStrip1\"]/div/div/div[1]/div[2]/div[1]/div/div/ul/li[4]/a/span")).click();
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"TemplateStrip1\"]/div/div/div[1]/div[2]/div[1]/div/div/ul/li[5]/a/span")).click();
        System.out.println(driver.getTitle());
    }

}