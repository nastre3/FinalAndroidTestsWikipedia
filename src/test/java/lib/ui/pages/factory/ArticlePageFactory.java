package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidArticlePageObject;
import lib.ui.pages.android.AndroidStartPageObject;
import lib.ui.pages.interfaces.IArticlePageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import lib.ui.pages.ios.iOSArticlePageObject;
import lib.ui.pages.ios.iOSStartPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ArticlePageFactory {
    public static IArticlePageObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSArticlePageObject(driver);
        } else {
            return new AndroidArticlePageObject(driver);
        }
    }
}
