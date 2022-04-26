package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSStartPageObject extends MainPageObject implements IStartPageObject {
    final static String INIT_SEARCH = "xpath://XCUIElementTypeSearchField[@name='Search Wikipedia']";
    final static String FEATURED_ARTICLE = "xpath://XCUIElementTypeSearchField[@id/view_featured_article_card_article_title]";

    public iOSStartPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void initSearch() {
        WebElement searchInit = this.waitForElementPresent(
                INIT_SEARCH,
                "Cannot find Search Wikipedia init search input"
        );
        searchInit.click();
    }

    public void clickFeaturedArticle() {
        WebElement searchInit = this.waitForElementPresent(
                FEATURED_ARTICLE,
                "Cannot find Featured Article"
        );
        searchInit.click();
    }
}
