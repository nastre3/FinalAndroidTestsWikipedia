package lib.ui.pages.ios;

import lib.ui.MainPageObject;
import lib.ui.pages.interfaces.ILoginPageObject;
import lib.ui.pages.interfaces.ISettingsPageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

public class iOSLoginPageObject extends MainPageObject implements ILoginPageObject {
    final static String USERNAME_FIELD = "id:login_username_text";


    public iOSLoginPageObject(RemoteWebDriver driver) {
        super(driver);
    }

    @Override
    public void assertLoginOpened() {
        WebElement usernameField = this.waitForElementPresent(
                USERNAME_FIELD,
                "Cannot find User name field"
        );
        usernameField.click();
    }
}
