import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Created by xlopo on 21.07.2016.
 */
public class Selenium {
    @Test

            public void Selenium ()
    {
        System.setProperty("webdriver.chrome.driver", "C://Users/xlopo/IdeaProjects/Test1.0/lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flibusta.is");
        driver.findElement(By.id("edit-submit")).click();
        driver.findElement(By.name("ask")).clear();
        driver.findElement(By.name("ask")).sendKeys("чарльз буковски");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.linkText("Чарльз Буковски")).click();
        assertEquals("Чарльз Буковски", driver.findElement(By.cssSelector("h1.title")).getText());
        driver.close ();
    }
    private void assertEquals(String s, String text) {
    }

    @Test
    public void flibusta () {
        System.setProperty("webdriver.chrome.driver", "C://Users/xlopo/IdeaProjects/Test1.0/lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flibusta.is");
        driver.findElement(By.id("edit-name")).clear();
        driver.findElement(By.id("edit-name")).sendKeys("xlopovidr");
        driver.findElement(By.id("edit-pass")).clear();
        driver.findElement(By.id("edit-pass")).sendKeys("jledfyxbr07081984");
        driver.findElement(By.id("edit-submit")).click();
        driver.close ();
    }

    @Test
    public void flibusta2 () {
        System.setProperty("webdriver.chrome.driver", "C://Users/xlopo/IdeaProjects/Test1.0/lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flibusta.is");
            driver.findElement(By.id("edit-name")).clear();
            driver.findElement(By.id("edit-name")).sendKeys("xlopovidr");
            driver.findElement(By.id("edit-pass")).clear();
            driver.findElement(By.id("edit-pass")).sendKeys("jledfyxbr07081984");
            driver.findElement(By.id("edit-submit")).click();
            driver.findElement(By.linkText("Выйти")).click();
            driver.close ();
    }

    @Test
    public void flibusta5 () {
        System.setProperty("webdriver.chrome.driver", "C://Users/xlopo/IdeaProjects/Test1.0/lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://flibusta.is");
        driver.findElement(By.id("edit-name")).clear();
        driver.findElement(By.id("edit-name")).sendKeys("xlopovidr");
        driver.findElement(By.id("edit-pass")).clear();
        driver.findElement(By.id("edit-pass")).sendKeys("jledfyxbr07081984");
        driver.findElement(By.id("edit-submit")).click();
        driver.findElement(By.name("ask")).clear();
        driver.findElement(By.name("ask")).sendKeys("трудно быть богом");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.linkText("Трудно быть богом")).click();
        driver.findElement(By.id("93872")).clear();
        driver.findElement(By.id("93872")).sendKeys("Офигенная книжка");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.linkText("(записать)")).click();
        driver.findElement(By.linkText("Трудно быть богом")).click();
        assertEquals("Xlopovidr в 08:47 / 21-07-2016\nОфигенная книжка", driver.findElement(By.cssSelector("span.container_93872")).getText());
        driver.close ();
    }
}

