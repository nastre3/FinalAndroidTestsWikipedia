package lib.ui.pages.android;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ISettingsPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class AndroidSettingsPageObject extends MainPageObject implements ISettingsPageObject {

    private static final String SWITCH_WIDGET = "id:switchWidget";

    public AndroidSettingsPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    @Override
    public void assertSettingsOpened() {
        WebElement switchWidget = this.waitForElementPresent(
                SWITCH_WIDGET,
                "Cannot find Header Pencil"
        );
        switchWidget.click();
    }
}
