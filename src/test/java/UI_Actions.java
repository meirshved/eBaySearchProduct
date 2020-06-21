import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class  UI_Actions {

    private WebDriver driver;

    public void clickElement(By element){
        driver.findElement(element).click();
    }

    public String getInnerText(By element){
        return driver.findElement(element).getText();
    }

    public WebElement getWebElement(By element){
        return driver.findElement(element);
    }

    public List<WebElement> getWebElements(By element){
        return driver.findElements(element);
    }

    public void chooseSearchSegments(By tab, By radioBtn){
        clickElement(tab);
        clickElement(radioBtn);
    }

    public int getAxeX(WebElement element){
        return element.getLocation().getX();
    }

    // class constructor
    public UI_Actions(WebDriver driver){
        this.driver = driver;
    }
}
