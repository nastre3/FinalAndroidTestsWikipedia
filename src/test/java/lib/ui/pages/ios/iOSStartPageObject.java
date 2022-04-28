package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSStartPageObject extends MainPageObject implements IStartPageObject {
    final static String INIT_SEARCH = "xpath://XCUIElementTypeSearchField[@name='Search Wikipedia']";
    final static String FEATURED_ARTICLE = "id:view_featured_article_card_article_title";
    final static String FEATURED_ARTICLE_IMAGE = "id:view_featured_article_card_image";
    final static String MY_LIST_BUTTON = "id:0x1";
    final static String MY_LIST_SEARCH = "id:menu_search_lists";
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
        /*
        WebElement featuredArticle = this.waitForElementPresent(
                FEATURED_ARTICLE,
                "Cannot find Featured Article"
        );
         */

        WebElement featuredArticleImage = this.waitForElementPresent(
                FEATURED_ARTICLE_IMAGE,
                "Cannot find Featured Article Image"
        );
        // featuredArticle.click();
        featuredArticleImage.click();
    }

    public void clickMyList() {
        WebElement myListButton = this.waitForElementPresent(
                MY_LIST_BUTTON,
                "Cannot find My List Button"
        );
        myListButton.click();
    }

    public void assertMyListOpened() {
        WebElement expectedResult = this.waitForElementPresent(
                MY_LIST_SEARCH,
                "Cannot find My Lists label"
        );
    }
}
