import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Main {
        public static void main(String[] args) throws InterruptedException {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            try {
                driver.get("https://www.youtube.com/channel/UCX-USfenzQlhrEJR1zD5IYw");
                Thread.sleep(2000);
// 1 клик
                WebElement element = driver.findElement(By.xpath("//a[contains(@href, 'OrKck3kI5o0')]"));

                Actions actions = new Actions(driver);
                actions.moveToElement(element).click(element).release().build().perform();
// 2 клик
                Actions actionstwo = new Actions(driver);
                Thread.sleep(2000);

                WebElement elementtwo = driver.findElement(By.xpath("//a[contains(@href, '/')]"));
                actionstwo.moveToElement(elementtwo).click(elementtwo).release().build().perform();
// 3 клик
                Actions actionsthree = new Actions(driver);
                Thread.sleep(2000);

                WebElement elementthree = driver.findElement(By.xpath("//a[contains(@href, '/feed/explore')]"));
                actionsthree.moveToElement(elementthree).click(elementthree).release().build().perform();
// 4 клик
                Actions actionsfour = new Actions(driver);
                Thread.sleep(2000);

                WebElement elementfour = driver.findElement(By.xpath("//a[contains(@href, '/channel/UCYfdidRxbB8Qhf0Nx7ioOYw')]"));
                actionsfour.moveToElement(elementfour).click(elementfour).release().build().perform();
            }

            finally {
                Thread.sleep(15000);
                driver.quit();
            }

        }
}
