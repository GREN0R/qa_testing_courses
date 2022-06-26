package OLD;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class SileniumWebDriver {

    @Test
    public void doit() {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com.ua");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//input")).sendKeys("Dog \n");
        driver.findElement(By.xpath("//h3[contains(text(), 'Dog - Wikipedia')]")).click();
        driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table/tbody/tr[6]/td[2]/a")).click();
    }
}