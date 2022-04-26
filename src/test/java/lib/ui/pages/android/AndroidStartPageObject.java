package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidStartPageObject extends MainPageObject implements IStartPageObject {
    final static String INIT_SEARCH = "id:org.wikipedia:id/search_container";
    final static String FEATURED_ARTICLE = "id:view_featured_article_card_article_title";

    public AndroidStartPageObject(RemoteWebDriver driver) {
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
        WebElement featuredArticle = this.waitForElementPresent(
                FEATURED_ARTICLE,
                "Cannot find Featured Article"
        );
        featuredArticle.click();
    }
}
