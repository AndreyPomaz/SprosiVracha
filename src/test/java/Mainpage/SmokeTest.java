package Mainpage;

import io.opentelemetry.api.trace.StatusCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SmokeTest {

    @Test
    public void testSmoke() {

        WebDriver driver = new ChromeDriver();
        driver.get("https://sprosivracha.com/");

        String title = driver.getTitle();
        Assert.assertEquals("Бесплатные консультации врачей онлайн — задать вопрос на СпросиВрача", title);
    }

    @Test
    public void testbutton() throws InterruptedException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--remote-allow-origins=*", "--headless", "--window-size=1920,1080");

        WebDriver driver = new ChromeDriver(chromeOptions);
        driver.get("https://sprosivracha.com/");
        Thread.sleep(2000);

        WebElement button = driver.findElement(By.linkText("Задайте вопрос врачу"));
        button.click();





    }
}
