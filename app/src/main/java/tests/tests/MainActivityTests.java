package tests.tests;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Point;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.offset.PointOption;
import tests.activities.MainActivity;
import tests.helpers.ConfigHelper;
import static io.appium.java_client.MobileCommand.pressKeyCodeCommand;
import io.appium.java_client.TouchAction;

import static io.appium.java_client.android.AndroidKeyCode.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

public class MainActivityTests extends ConfigHelper {
    private MainActivity mainActivity = new MainActivity();
//    private void tearDown() {
//        driver.resetApp();
//    }

    public MainActivityTests() {
    }

    @Before
    public void implicitlyElements() {
        ConfigHelper.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.resetApp();
    }

    @Test
    public void editProfile() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.BurgerButton().click();
        mainActivity.EditProfileButton().click();
        mainActivity.EditEmailContainer().clear();
        mainActivity.EditEmailContainer().sendKeys("ololo@mail.ru");
        mainActivity.EditNameContainer().sendKeys("Test name");
        mainActivity.EditLastNameContainer().sendKeys("Test name");
    }

    @Test
    public  void  check4G() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.BurgerButton().click();
        mainActivity.CommandsButton().click();
        mainActivity.Check4gButton().click();
    }

    @Test
    public void internetBalance() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.InternetBallanceButton().click();
        mainActivity.tariffFromInternetBalanceButton().click();
//        mainActivity.yoursTariffLinkButton().isEnabled();
        mainActivity.backButton().click();
    }

    @Test
    public void pressTKButton() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.InternetBallanceButton().click();
        mainActivity.turboknopkaButton().click();
//        mainActivity.activateTKButton().click();
//        mainActivity.yoursTariffLinkButton().isEnabled();
//        mainActivity.backButton().click();
    }

    @Test
    public  void callBalance() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.callBallanceButton().click();
        mainActivity.tariffFromCallBalanceButton().click();
        mainActivity.backButton().click();
        mainActivity.addCallMinutesTarrifButton().click();
        mainActivity.activateAddCallMinutesButton().click();
        Thread.sleep(10000);
    }

    @Test
    public void faq() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.BurgerButton().click();
        mainActivity.faqButton().click();
        mainActivity.faqExpandButton().click();
        mainActivity.faqExpandButton().click();
        mainActivity.BurgerButton().click();
        Thread.sleep(10000);
    }

    @Test
    public void map() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.BurgerButton().click();
        mainActivity.MapButton().click();
        mainActivity.myLocationButton().click();
        mainActivity.officeBereketGrand().click();
        mainActivity.backButton().click();
        mainActivity.terminalsButton().click();
        Thread.sleep(10000);
    }

    @Test
    public void aboutAPP() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.BurgerButton().click();
        mainActivity.settingsButton().click();
        mainActivity.aboutAPPButton().click();
    }

    @Test
    public void Detailing() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.BurgerButton().click();
        mainActivity.detailingButton().click();
        mainActivity.filterHeaderButton().click();
        mainActivity.filterRemoveFree().click();
        Thread.sleep(5000);

        mainActivity.filterHeaderButton().click();
        mainActivity.filterSpending().click();
        Thread.sleep(5000);

        mainActivity.filterHeaderButton().click();
        mainActivity.filterSpending().click();
        Thread.sleep(5000);

        mainActivity.filterHeaderButton().click();
        mainActivity.filterDeposit().click();
        Thread.sleep(5000);

        mainActivity.sortFromDate().click();
        mainActivity.cancelCalendar().click();
        mainActivity.sortTillDate().click();
        mainActivity.cancelCalendar().click();
    }

    @Test
    public void promotion() throws InterruptedException {
        mainActivity.authorizationBlock();
        mainActivity.promotionButton().click();
        mainActivity.promotionButtons0().click();
        mainActivity.backButton().click();
        mainActivity.promotionButtons1().click();
        mainActivity.backButton().click();
        mainActivity.promotionButtons2().click();
        mainActivity.backButton().click();
        mainActivity.backButton().click();
    }

//    @Test
//    public void testswipe() {
//        AndroidElement chronometer = driver.findElementById("kg.o.nurtelecom:id/daimajia_slider_image");
//        Point point1 = chronometer.getCenter();
//        int x1 = point1.getX();
//        int y1 = point1.getY();
//
//        AndroidElement focus = driver.findElementById("kg.o.nurtelecom:id/daimajia_slider_image");
//        Point point2 = focus.getCenter();
//        int x2 = point2.getX();
//        int y2 = point2.getY();
//
//        TouchAction touchAction = new TouchAction(driver);
//        touchAction.press(x2, y2).waitAction(2000).moveTo(x1, y1).release()//swipe 1
//                .press(x1, y1).waitAction(2000).moveTo(x2, y2).release() //swipe 2, seems it needs for relative values
//                .perform();
//        driver.swipe().
//    }



//    @Test
//    public void slide(){
//        mainActivity.authorizationBlock();
//        AndroidElement slider =  driver.findElementByXPath("//android.widget.ImageView");
//        slider.sendKeys("1.0");
//        LongPressOptions longPressOptions = new LongPressOptions();
//        Duration duration = Duration.ofSeconds(2000);
//        longPressOptions.withDuration(duration);
//
//
//
//        PointOption pointOption = new PointOption();
//        pointOption.withCoordinates(900, 1000);
//
//        new TouchAction(driver).longPress(longPressOptions).moveTo(pointOption).release().perform();
//
//    }

//    @Test
//    public void touch(){
//        mainActivity.authorizationBlock();
//        mainActivity.




}
