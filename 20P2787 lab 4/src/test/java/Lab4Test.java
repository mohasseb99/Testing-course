import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class Lab4Test {

    WebDriver driver;
    final String Website = "https://formy-project.herokuapp.com/form";

    @BeforeAll
    public static void init(){
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    public void beforeTest(){
        driver = new ChromeDriver();
        driver.get(Website);
    }

    @AfterEach
    public void afterTest() {
        driver.quit();
    }

    @Test
    public void test1(){
        WebElement fN = driver.findElement(By.id("first-name"));
        WebElement lN = driver.findElement(By.id("last-name"));
        WebElement jT = driver.findElement(By.id("job-title"));
        WebElement cR = driver.findElement(By.id("radio-button-2"));

        fN.sendKeys("Mahmoud");
        lN.sendKeys("Mohasseb");
        jT.sendKeys("Engineer");
        cR.click();

        assertEquals(fN.getAttribute("value"),"Mahmoud");
        assertEquals(lN.getAttribute("value"),"Mohasseb");
        assertEquals(jT.getAttribute("value"),"Engineer");
        assertTrue(cR.isSelected());

        WebElement btn = driver.findElement(By.className("btn"));

        btn.click();
    }


}