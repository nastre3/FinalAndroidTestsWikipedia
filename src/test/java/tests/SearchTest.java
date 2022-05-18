package tests;

import lib.CoreTestCase;
import lib.ui.pages.factory.*;
import lib.ui.pages.interfaces.*;
import org.junit.Test;

public class SearchTest extends CoreTestCase {

    @Test
    public void testSearch() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        ISearchPageObject searchPage = SearchPageFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        startPage.initSearch();
        searchPage.findByText("Java");
        searchPage.selectByText("Island of Indonesia");
    }

    @Test
    public void testNegativeSearch() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        ISearchPageObject searchPage = SearchPageFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        startPage.initSearch();
        searchPage.findByText("qwerty12");
        searchPage.findByText("No results found");
    }

    @Test
    public void testFeaturedArticle() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        IArticlePageObject articlePage = ArticlePageFactory.get(this.driver);

        onboardingPage.skipOnboarding();
        startPage.clickFeaturedArticle();
        articlePage.clickArticlePencil();
    }

    @Test
    public void testMyList() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        onboardingPage.skipOnboarding();
        startPage.clickMyList();
        startPage.assertMyListOpened();
    }

    @Test
    public void testSettingsPage() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        ISettingsPageObject settingsPage = SettingsPageFactory.get(this.driver);
        onboardingPage.skipOnboarding();
        startPage.clickMenu();
        startPage.clickSettings();
        settingsPage.assertSettingsOpened();
    }

    @Test
    public void testLoginPage() {
        IOnboardingPageObject onboardingPage = OnboardingPageFactory.get(this.driver);
        IStartPageObject startPage = StartPageFactory.get(this.driver);
        ILoginPageObject loginPage = LoginPageFactory.get(this.driver);
        onboardingPage.skipOnboarding();
        startPage.clickMenu();
        startPage.clickLogin();
        loginPage.assertLoginOpened();
    }
}
