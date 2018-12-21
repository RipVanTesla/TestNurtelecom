package tests.tests;

import android.transition.Slide;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.server.handler.interactions.touch.Down;

import java.util.concurrent.TimeUnit;

import tests.activities.MainActivity;
import tests.activities.MainActivityTariffs;
import tests.helpers.ConfigHelper;
import tests.helpers.SelectorsHelper;

import static io.appium.java_client.MobileCommand.pressKeyCodeCommand;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

public class MainActivityTariffsTests extends ConfigHelper {
    private MainActivityTariffs mainActivityTariffs = new MainActivityTariffs();
//    private void tearDown() {
//        driver.resetApp();
//    }

    public MainActivityTariffsTests() {
    }

    @Before
    public void implicitlyElements() {
        ConfigHelper.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.resetApp();

    }

    @Test
    public void clickTariffsButton() {
        mainActivityTariffs.authorizationBlock();
        mainActivityTariffs.tariffsButton().click();
    }

    @Test
    public void clickCurrentTariff() {
        mainActivityTariffs.authorizationBlock();
        mainActivityTariffs.tariffsButton().click();
        mainActivityTariffs.currentTariffbutton().click();
//        mainActivityTariffs.tariffLinkButton().isDisplayed();
        mainActivityTariffs.backButton().click();
    }

    @Test
    public void clickAllTariffSort() {
        mainActivityTariffs.authorizationBlock();
        mainActivityTariffs.tariffsButton().click();
        mainActivityTariffs.tariffsForYourSmartPhoneSortButton().click();
        mainActivityTariffs.backButton().click();
        mainActivityTariffs.tariffsForCallsAndInternetSortButton().click();
        mainActivityTariffs.backButton().click();
        mainActivityTariffs.tariffsForRegions().click();
        mainActivityTariffs.backButton().click();
        mainActivityTariffs.tariffsBasic().click();
        mainActivityTariffs.backButton();
    }

    @Test
    public void  checkSwitchToTariff() {
        mainActivityTariffs.authorizationBlock();
        mainActivityTariffs.tariffsButton().click();
        mainActivityTariffs.tariffsForYourSmartPhoneSortButton().click();
        mainActivityTariffs.oVipButton().click();
        mainActivityTariffs.tariffSwitchButton().click();
//        SelectorsHelper.getElementById("dsa").press("ele").moveTo("lele").release();
    }


//    @Test
//    public void testtest() {
//
//    }


}