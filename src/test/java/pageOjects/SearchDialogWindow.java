package pageOjects;

import org.openqa.selenium.By;

public class SearchDialogWindow {

    // dialog window tabs
    public By brandTabElement = By.cssSelector("div[data-aspecttitle = 'aspect-Brand']");
    public By caseSizeTabElement = By.cssSelector("div[data-aspecttitle = 'aspect-Case%20Size']");
    public By seriesTabElement = By.cssSelector("div[data-aspecttitle = 'aspect-Series']");
    public By bandColorTabElement = By.cssSelector("div[data-aspecttitle = 'aspect-Band%20Color']");
    public By modelTabElement = By.cssSelector("div[data-aspecttitle = 'aspect-Model']");

    //tabs search options / radiobuttons
    public By brandRadioBtnElement = By.id("c3-subPanel-Brand_Apple_cbx");
    public By caseSizeRadioBtnElement = By.id("c3-subPanel-Case%20Size_44%20mm_cbx");
    public By seriesRadioBtnElement = By.id("c3-subPanel-Series_Apple%20Watch%20Series%205_cbx");
    public By bandColorRadioBtnElement = By.id("c3-subPanel-Band%20Color_Black_cbx");
    public By modelRadioBtnElement = By.id("c3-subPanel-Model_Apple%20Watch%20Series%205_cbx");

    //apply button
    public By applyBtnEllement = By.cssSelector("button[aria-label='Apply']");
}
