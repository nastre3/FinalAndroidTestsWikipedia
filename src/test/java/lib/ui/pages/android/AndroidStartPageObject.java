package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidStartPageObject extends MainPageObject implements IStartPageObject {
    final static String INIT_SEARCH = "id:org.wikipedia:id/search_container";
    final static String FEATURED_ARTICLE_IMAGE = "id:view_featured_article_card_image";
    final static String MY_LIST_BUTTON = "0x1";
    final static String MENU_BUTTON = "id:menu_overflow_button";
    final static String SETTINGS_BUTTON = "id:explore_overflow_settings";
    final static String LOGIN_BUTTON = "id:explore_overflow_account_name";
    final static String MY_LIST_SEARCH = "id:@id/menu_search_lists";

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
        WebElement featuredArticleImage = this.waitForElementPresent(
                FEATURED_ARTICLE_IMAGE,
                "Cannot find Featured Article Image"
        );
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
