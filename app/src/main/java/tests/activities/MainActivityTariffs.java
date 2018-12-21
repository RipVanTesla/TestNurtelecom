package tests.activities;

import org.yaml.snakeyaml.tokens.Token;

import io.appium.java_client.MobileElement;
import tests.helpers.SelectorsHelper;
import tests.helpers.ConfigHelper;

public class MainActivityTariffs extends ConfigHelper {
    private LoginActivity loginActivity = new LoginActivity();

    public static String activity = ".ui.auth.conditions_confirm.UseConditionConfirmActivity";

    public void authorizationBlock() {
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

    /**
     * Login activity elements
     */

    public  MobileElement servicesButton(){
        return  SelectorsHelper.getElementByXPath("[@text=['Tariff'])");
    }

    public  MobileElement tariffsButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/tariffs");
    }

    public MobileElement currentTariffbutton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/rl_own_tariff");
    }

    public MobileElement tariffLinkButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/tv_link");
    }

    public  MobileElement backButton(){
        return  SelectorsHelper.getElementByClassName("android.widget.ImageButton");
    }

    public  MobileElement tariffsForYourSmartPhoneSortButton(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Для твоего смартфона']");
    }

    public  MobileElement tariffsForCallsAndInternetSortButton(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Для звонков и интернета']");
    }

    public  MobileElement tariffsForRegions(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Для регионов']");
    }

    public  MobileElement tariffsBasic(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Базовые']");
    }

    public MobileElement oVipButton(){
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Переходи на О! VIP+']");
    }

    public  MobileElement tariffSwitchButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/connect");
    }

    public MobileElement tariffsButton2(){
        return  SelectorsHelper.getElementByName("Tariffs");

    }
}
