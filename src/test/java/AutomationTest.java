import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageOjects.HomeScreenObject;
import pageOjects.ItemSearchScreenObject;
import pageOjects.ResultScreenObject;
import pageOjects.SearchDialogWindow;

import java.util.List;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class AutomationTest extends ProjectTestBase {

    private final String eBAY_URL = "https://www.ebay.com/";

    // page objects
    private HomeScreenObject homeScreen = new HomeScreenObject();
    private ItemSearchScreenObject itemScreen = new ItemSearchScreenObject();
    private SearchDialogWindow searchDialog = new SearchDialogWindow();
    private ResultScreenObject resultsScreen = new ResultScreenObject();

    private UI_Actions userActions = new UI_Actions(driver);

    private JavascriptExecutor js = (JavascriptExecutor) driver;

    private WebDriverWait wait = new WebDriverWait(driver, 15);

    @Test
    public void test_01_eBayLandingPage() {
        driver.get(eBAY_URL);
    }

    @Test
    public void test_02_EmitateHoverOnElectronics() {
        js.executeScript("arguments[0].style.display='block';", userActions.getWebElement(homeScreen.electronicsLinkElement));
    }

    @Test
    public void test_03_ClickSmartWatches() {
        userActions.clickElement(homeScreen.smartWatchesElement);
    }

    @Test
    public void test_04_OpenSearchDialog() {
        userActions.clickElement(itemScreen.searchDialogContainer);
    }

    @Test
    public void test_05_ChoseBrand() {
        userActions.chooseSearchSegments(searchDialog.brandTabElement, searchDialog.brandRadioBtnElement);
    }

    @Test
    public void test_05_ChoseCaseSize() {
        userActions.chooseSearchSegments(searchDialog.caseSizeTabElement, searchDialog.caseSizeRadioBtnElement);
    }

    @Test
    public void test_06_ChoseSeries() {
        userActions.chooseSearchSegments(searchDialog.seriesTabElement, searchDialog.seriesRadioBtnElement);
    }

    @Test
    public void test_07_choseColor() {
        userActions.chooseSearchSegments(searchDialog.bandColorTabElement, searchDialog.bandColorRadioBtnElement);
    }

    @Test
    public void test_08_ChoseMode() {
        userActions.chooseSearchSegments(searchDialog.modelTabElement, searchDialog.modelRadioBtnElement);
    }

    //51625
    @Test
    public void test_09_clickApply() {
        userActions.clickElement(searchDialog.applyBtnEllement);
    }

    @Test
    public void test_10string() {
        wait.until(ExpectedConditions.visibilityOfElementLocated(resultsScreen.resultElement));
        String str = userActions.getInnerText(resultsScreen.resultElement);
        str = str.substring(str.indexOf("f") + 2);
        System.out.println("According to applied criteria there are: " + str);
    }

    @Test
    public void test_11_scrollAndPrintItemDescription() throws InterruptedException {
        List<WebElement> items = userActions.getWebElements(resultsScreen.itemDescriptionElement);
        for (WebElement item : items) {
            js.executeScript("window.scrollBy("+item.getLocation().x+" ,"+item.getLocation().y+");");
            System.out.println(item.getText());
        }
    }
}