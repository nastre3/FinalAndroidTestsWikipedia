package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.IArticlePageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidArticlePageObject extends MainPageObject implements IArticlePageObject {
    final static String HEADER_PENCIL = "id:view_page_header_edit_pencil";

    public AndroidArticlePageObject(RemoteWebDriver driver) {
        super(driver);
    }

    public void clickArticlePencil() {
        WebElement headerPencil = this.waitForElementPresent(
                HEADER_PENCIL,
                "Cannot find Header Pencil"
        );
        headerPencil.click();
    }
}
