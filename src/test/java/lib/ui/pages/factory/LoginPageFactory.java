package lib.ui.pages.factory;

import lib.ui.PlatformSelector;
import lib.ui.pages.android.AndroidLoginPageObject;
import lib.ui.pages.android.AndroidSettingsPageObject;
import lib.ui.pages.interfaces.ILoginPageObject;
import lib.ui.pages.interfaces.ISettingsPageObject;
import lib.ui.pages.ios.iOSLoginPageObject;
import lib.ui.pages.ios.iOSSettingsPageObject;
import org.openqa.selenium.remote.RemoteWebDriver;

public class LoginPageFactory {
    public static ILoginPageObject get(RemoteWebDriver driver) {
        if (PlatformSelector.PLATFORM == "ios") {
            return new iOSLoginPageObject(driver);
        } else {
            return new AndroidLoginPageObject(driver);
        }
    }
}
