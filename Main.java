import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/saadjaved/Downloads/Selenium jave/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://quixel.com/megascans/home/");

        driver.findElement(By.xpath("//*[@id='app-page']/div/div[1]/div/ul/li[4]/a")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/div[5]/div/button/div/span")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[2]/div[5]/div/div/ul/li[5]/button/span")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id='app-page']/div/div[4]/div[1]/div[1]/div/div/div/div[2]/div/input")).sendKeys("Huge Icelandic Lava Cliff");

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[4]/div[1]/div[1]/div/div[2]/section/ul/li[2]/button/div")).click();

        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[2]/div/div/section[2]/div/div[1]/div/a/span/div/div")).click();


        driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div[3]/div/div[2]/div/div/div/div[2]/div[2]/div/button")).click();

        driver.findElement(By.className("_3PNMHbJE22xaFXrB596K3i")).click();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div[2]/div/div[1]/ul/div[1]/span")).click();
        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("saadee.jawed@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("saad123*");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[@id='sign-in']")).click();
        //Thread.sleep(10000);

    }
}