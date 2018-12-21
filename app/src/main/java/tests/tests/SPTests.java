package tests.tests;

import org.junit.Before;
import org.junit.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidKeyCode;
import tests.activities.MainActivity;
import tests.activities.SPT;
import tests.helpers.ConfigHelper;
import static io.appium.java_client.MobileCommand.pressKeyCodeCommand;

import static io.appium.java_client.android.AndroidKeyCode.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

public class SPTests extends ConfigHelper {
    private SPT sPT = new SPT();
//    private void tearDown() {
//        driver.resetApp();
//    }

    public SPTests() {
    }

    @Before
    public void implicitlyElements() {
        ConfigHelper.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.launchApp();

    }

    @Test
    public void  FingerPrint() {
        sPT.authorizationBlock();
        driver.findElementById("kg.o.nurtelecom:id/app_using_condition");

//        driver.findElementById("dsa").fingerPrint;
//        driver.findElementById()
//        driver.findElementById("kg.o.nurtelecom:id/iv_fingerprint_icon").click();
//
//        sPT.tariffsButton().click();
//        sPT.tariffsForYourSmartPhoneSortButton().click();
//        sPT.oVipButton().click();
//        sPT.tariffSwitchButton().click();
//        driver.toggleTouchIDEnrollment(true);
//        SelectorsHelper.getElementById("dsa").press("ele").moveTo("lele").release();
    }
}