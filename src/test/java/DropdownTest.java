import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class DropdownTest extends BaseTest{


    @Test
    public void dropdown() {
        driver.get("http://the-internet.herokuapp.com/dropdown");
        Select select = new Select(driver.findElement(By.id("dropdown")));
        String firstOption = select.getOptions().get(0).getText();
        assertEquals(firstOption, "Please select an option","Name of option is not correct");
        String secondOption = select.getOptions().get(1).getText();
        assertEquals(secondOption, "Option 1","Name of option is not correct");
        String thirdOption = select.getOptions().get(2).getText();
        assertEquals(thirdOption, "Option 2","Name of option is not correct");
        assertEquals(select.getOptions().size(),3,"Count of options is not correct");
        assertFalse(select.getOptions().get(0).isEnabled(),"not correct button");
        select.selectByVisibleText("Option 1");
        assertTrue(select.getOptions().get(1).isSelected());
        select.selectByVisibleText("Option 2");
        assertTrue(select.getOptions().get(2).isSelected());
    }
}
