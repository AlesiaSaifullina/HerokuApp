import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class InputsTest extends BaseTest{


    @Test
    public void inputs() {
        driver.get("http://the-internet.herokuapp.com/inputs");
        driver.findElement(By.tagName("input")).sendKeys("5");
        String input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "5", "input is not correct");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_UP);
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "6", "input is not correct");
        driver.findElement(By.tagName("input")).sendKeys(Keys.ARROW_DOWN);
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "5", "input is not correct");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("e");
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "e", "input is not correct");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("z");
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "", "input is not correct");
        driver.findElement(By.tagName("input")).clear();
        driver.findElement(By.tagName("input")).sendKeys("abc1abc");
        input = driver.findElement(By.tagName("input")).getAttribute("value");
        assertEquals(input, "1", "input is not correct");
    }
}