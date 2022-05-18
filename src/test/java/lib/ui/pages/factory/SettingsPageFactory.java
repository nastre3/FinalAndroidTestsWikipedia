package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidSettingsPageObject;
import lib.ui.pages.android.AndroidStartPageObject;
import lib.ui.pages.interfaces.ISettingsPageObject;
import lib.ui.pages.interfaces.IStartPageObject;
import lib.ui.pages.ios.iOSSettingsPageObject;
import lib.ui.pages.ios.iOSStartPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class SettingsPageFactory {
    public static ISettingsPageObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSSettingsPageObject(driver);
        } else {
            return new AndroidSettingsPageObject(driver);
        }
    }
}
