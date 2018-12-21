package tests.activities;

import org.yaml.snakeyaml.tokens.Token;

import io.appium.java_client.MobileElement;
import tests.helpers.SelectorsHelper;
import tests.helpers.ConfigHelper;

public class MainActivityServices extends ConfigHelper {
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

//    public  MobileElement servicesButton() {
//        return SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Services']");
//    }

    public  MobileElement servicesButton(){
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/services");
    }

    public  MobileElement currentServicesfbutton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='My services']");
    }

    public MobileElement activeFeedInterner() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Раздавай Интернет']");
    }

    public MobileElement backButton() {
        return  SelectorsHelper.getElementByClassName("android.widget.ImageButton");
    }

    public MobileElement otvCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='О!ТВ и О!Кино']");
    }

    public MobileElement zeroOpportunitiesCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Возможности при нуле']");
    }

    public MobileElement entertainmentServicesCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Информационно-развлекательные услуги']");
    }

    public MobileElement callManagmentCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Управление звонками']");
    }

    public MobileElement otherCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Прочие услуги']");
    }

    public MobileElement roamingCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Роуминг и междунар. связь']");
    }

    public  MobileElement internetCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Для интернета']");
    }

    public  MobileElement mobileSalaryCategoryButton() {
        return  SelectorsHelper.getElementByXPath("//android.widget.TextView[@text='Мобильная зарплата']");
    }
}
