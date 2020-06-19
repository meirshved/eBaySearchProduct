import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomationTest extends ProjectTestBase {

    private final String eBAY_URL = "https://www.ebay.com/";

    JavascriptExecutor js = (JavascriptExecutor)driver;

    @Test
    public void test_1_eBayLandingPage(){
        driver.get(eBAY_URL);
    }
}