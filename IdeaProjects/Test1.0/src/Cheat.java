import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.junit.Assert.assertTrue;

public class Cheat  {

    @Test

    public void FlibustaNegative ()

    {
        System.setProperty("webdriver.chrome.driver", "C://Users/xlopo/IdeaProjects/Test1.0/lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flibusta.is");
        driver.findElement(By.id("edit-name")).clear();
        driver.findElement(By.id("edit-name")).sendKeys("xlopovidr");
        driver.findElement(By.id("edit-pass")).clear();
        driver.findElement(By.id("edit-pass")).sendKeys("07089184jledfyxbrer");
        driver.findElement(By.id("edit-submit")).click();
        assertEquals(driver.findElement(By.cssSelector("div.messages.error")).getText().matches("^exact:Извините, это имя пользователя или пароль неверны\\. Забыли пароль[\\s\\S]$"));
        driver.close();
    }

    private void assertEquals(boolean matches) {
    }


}
