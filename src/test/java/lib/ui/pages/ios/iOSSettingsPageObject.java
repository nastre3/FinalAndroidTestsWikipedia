package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ISettingsPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSSettingsPageObject extends MainPageObject implements ISettingsPageObject {
    final static String SWITCH_WIDGET = "id:switchWidget";


    public iOSSettingsPageObject(RemoteWebDriver driver) {
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
