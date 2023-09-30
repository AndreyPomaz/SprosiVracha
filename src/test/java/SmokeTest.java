import io.opentelemetry.api.trace.StatusCode;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import runer.BaseTest;

public class SmokeTest extends BaseTest{
    private static final String BASE_URL = "https://sprosivracha.com/";
    @Test
    public void testSmoke() {

        getDriver().get(BASE_URL);
        String title = getDriver().getTitle();
        Assert.assertEquals("Бесплатные консультации врачей онлайн — задать вопрос на СпросиВрача", title);
    }

    @Test
    public void testbutton() throws InterruptedException {
        getDriver().get(BASE_URL);

        WebElement button = getDriver().findElement(By.linkText("Задайте вопрос врачу"));
        button.click();
    }
}
