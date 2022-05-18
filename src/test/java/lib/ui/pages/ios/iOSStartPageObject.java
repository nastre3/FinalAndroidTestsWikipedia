package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSStartPageObject extends MainPageObject implements IStartPageObject {
    final static String INIT_SEARCH = "xpath://XCUIElementTypeSearchField[@name='Search Wikipedia']";
    final static String FEATURED_ARTICLE_IMAGE = "id:view_featured_article_card_image";
    final static String MY_LIST_BUTTON = "id:0x1";
    final static String MY_LIST_SEARCH = "id:menu_search_lists";
    final static String MENU_BUTTON = "id:menu_overflow_button";
    final static String SETTINGS_BUTTON = "id:explore_overflow_settings";
    private static final String LOGIN_BUTTON = "id:explore_overflow_account_name";


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


    @Override
    public void clickMenu() {
        WebElement menuButton = this.waitForElementPresent(
                MENU_BUTTON,
                "Cannot find Menu Button"
        );
        menuButton.click();
    }

    @Override
    public void clickSettings() {
        WebElement settingsButton = this.waitForElementPresent(
                SETTINGS_BUTTON,
                "Cannot find Settings Button"
        );
        settingsButton.click();
    }

    @Override
    public void clickLogin() {
        WebElement loginButton = this.waitForElementPresent(
                LOGIN_BUTTON,
                "Cannot find Login Button"
        );
        loginButton.click();
    }
}
