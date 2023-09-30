package Mainpage;

import io.opentelemetry.api.trace.StatusCode;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
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
}
