package tests.activities;

import org.yaml.snakeyaml.tokens.Token;

import java.util.List;

import io.appium.java_client.MobileElement;
import tests.helpers.SelectorsHelper;
import tests.helpers.ConfigHelper;
import tests.helpers.TouchHelper;

public class MainActivity extends ConfigHelper {
    private LoginActivity loginActivity = new LoginActivity();

    public static String activity = ".ui.auth.conditions_confirm.UseConditionConfirmActivity";

    /**
     * Login activity elements
     */

    public void authorizationBlock() throws InterruptedException {
        Thread.sleep(20000);

        loginActivity.acceptButton().click();
        loginActivity.phoneNumberContainer().clear();
//        driver.getKeyboard().pressKey("1");

        loginActivity.phoneNumberContainer().sendKeys("+996702247783");

        loginActivity.phoneNumberContainer().clear();
        loginActivity.phoneNumberContainer().sendKeys("+996700546039");

        loginActivity.phoneNumberNextButton().click();
        loginActivity.phonePasswordContainer().sendKeys("qwerty");

        loginActivity.phonePasswordNextButton().click();
    }

    public  MobileElement oShopButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/menu_store");
    }

    public MobileElement promotionButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/menu_promotion");
    }

    public  MobileElement BurgerButton(){
        return  SelectorsHelper.getElementByClassName("android.widget.ImageButton");
    }

    public  MobileElement EditProfileButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/edit");
    }

    public  MobileElement EditEmailContainer(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/profile_email");
    }

    public  MobileElement EditNameContainer(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/profile_name");
    }

    public  MobileElement EditLastNameContainer(){
        return  SelectorsHelper.getElementByClassName("android.widget.EditText");
    }

    public  MobileElement QAbutton(){
        return  SelectorsHelper.getElementByXPath("//android.widget.LinearLayout[@index='0']");
    }

    public MobileElement SendInternetSettingsButton(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView['Configure the internet']");
    }

    public MobileElement CommandsButton(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.LinearLayoutCompat[@index='4']");
    }

    public MobileElement MapButton(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.LinearLayoutCompat[@index='2']");
    }

    public MobileElement Check4gButton(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='1']");
    }

    public MobileElement InternetBallanceButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/internet_statistics");
    }

    public MobileElement tariffFromInternetBalanceButton(){
        return SelectorsHelper.getElementByXPath("//android.widget.LinearLayout[@index='1']");
    }

    public MobileElement yoursTariffLinkButton() {
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/link");
    }

    public MobileElement backButton() {
        return  SelectorsHelper.getElementByClassName("android.widget.ImageButton");
    }

    public  MobileElement turboknopkaButton() {
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='6']");
    }

    public  MobileElement activateTKButton() {
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/connect");
    }

    public MobileElement callBallanceButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/out_call_statistics");
    }

    public  MobileElement tariffFromCallBalanceButton(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[@index='1']");
    }

    public  MobileElement addCallMinutesTarrifButton(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='4']");
    }

    public  MobileElement activateAddCallMinutesButton() {
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/connect");
    }

    public MobileElement faqButton() {
        return SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[@index='3']");
    }

    public MobileElement faqExpandButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Что такое приложение «Мобильный помощник О!»?']");
    }

    public MobileElement myLocationButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/office_list");
    }

    public MobileElement terminalsButton(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='TERMINALS']");
    }

    public  MobileElement officeBereketGrand(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/row");
    }

    public MobileElement settingsButton(){
        return SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[@index='6']");
    }

    public MobileElement aboutAPPButton(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='About the app']");
    }

    public MobileElement detailingButton(){
        return SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.support.v7.widget.LinearLayoutCompat[@index='5']");
    }

    public MobileElement filterHeaderButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/filters_header");
    }

    public MobileElement filterRemoveFree(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/chb_unfree");
    }

    public MobileElement filterSpending(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/chb_charge");
    }

    public MobileElement filterDeposit(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/chb_replenishment");
    }

    public MobileElement sortFromDate(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/from_date");
    }

    public MobileElement cancelCalendar(){
        return  SelectorsHelper.getElementById("android:id/button2");
    }

    public MobileElement sortTillDate(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/till_date");
    }

    public MobileElement promotionButtons0(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='0']");
    }

    public MobileElement promotionButtons1(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='1']");
    }

    public MobileElement promotionButtons2(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='2']");
    }

    public MobileElement promotionButtons3(){
        return  SelectorsHelper.getElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.FrameLayout[@index='3']");
    }


//    public  MobileElement tapByElement(){
//        return TouchHelper.tapByElement();
//    }


}



