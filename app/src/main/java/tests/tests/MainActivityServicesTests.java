package tests.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import java.util.concurrent.TimeUnit;

import tests.activities.MainActivity;
import tests.activities.MainActivityServices;
import tests.activities.MainActivityTariffs;
import tests.helpers.ConfigHelper;
import static io.appium.java_client.MobileCommand.pressKeyCodeCommand;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

public class MainActivityServicesTests extends ConfigHelper {
    private MainActivityServices mainActivityServices = new MainActivityServices();
//    private void tearDown() {
//        driver.resetApp();
//    }

    public MainActivityServicesTests() {
    }

    @Before
    public void implicitlyElements() {
        ConfigHelper.driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
        driver.resetApp();

    }

    @Test
    public void clickServicesButton() throws InterruptedException {
        mainActivityServices.authorizationBlock();
        mainActivityServices.servicesButton().click();
        mainActivityServices.currentServicesfbutton().click();
//        mainActivityServices.backButton().click();
        mainActivityServices.activeFeedInterner().click();
        mainActivityServices.backButton().click();
        mainActivityServices.backButton().click();


        Thread.sleep(10000);
    }

    @Test
    public void servicesCategories() throws InterruptedException {
        mainActivityServices.authorizationBlock();
        mainActivityServices.servicesButton().click();
        mainActivityServices.otvCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.zeroOpportunitiesCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.entertainmentServicesCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.callManagmentCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.otherCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.roamingCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.internetCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.mobileSalaryCategoryButton().click();
        mainActivityServices.backButton().click();
        mainActivityServices.backButton().click();


        Thread.sleep(10000);

    }
//
//    @Test
//    public void clickCurrentServices() {
//        mainActivityServices.authorizationBlock();
//        mainActivityServices.servicesButton().click();
//        mainActivityServices.currentServicesfbutton().click();
//        mainActivityServices.activeAntiAnonButton().click();
//    }

}