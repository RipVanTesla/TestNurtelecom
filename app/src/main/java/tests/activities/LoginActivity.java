package tests.activities;

import io.appium.java_client.MobileElement;
import tests.helpers.SelectorsHelper;
import tests.helpers.ConfigHelper;
import tests.helpers.TouchHelper;

public class LoginActivity extends ConfigHelper {

    public static String activity = ".ui.auth.conditions_confirm.UseConditionConfirmActivity";

    /** Login activity elements */

    public MobileElement agreeAppConditionBox() {
        return SelectorsHelper.getElementById("kg.o.nurtelecom:id/app_using_condition");
    }

    public MobileElement agreeAgeConditionBox() {
        return SelectorsHelper.getElementById("kg.o.nurtelecom:id/age_condition");
    }
    public  MobileElement conditionTextBox() {
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/conditions_header");
    }
    public  MobileElement iconBoxO() {
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/icon");
    }
    public  MobileElement headerText() {
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/header");
    }


    public MobileElement acceptButton() {
        return SelectorsHelper.getElementById("kg.o.nurtelecom:id/confirm");
    }

    public MobileElement phoneNumberContainer() {
        return SelectorsHelper.getElementById("kg.o.nurtelecom:id/phone_number");
    }

    public MobileElement phoneNumberNextButton() {
        return SelectorsHelper.getElementById("kg.o.nurtelecom:id/next");
    }

    public MobileElement phonePasswordContainer() {
        return SelectorsHelper.getElementByClassName("android.widget.EditText");
    }

    public  MobileElement phonePasswordNextButton() {
        return  SelectorsHelper.getElementById("kg.o.nurtelecom:id/confirm");
    }




//    private AndroidElement underLinePassword() {
//        return SelectorsHelper.getElementById("com.goindriver:id/underlinePassword");
//    }
//
//    private MobileElement emailField() {
//        return SelectorsHelper.getElementById("com.goindriver:id/etEmail");
//    }
//
//    private AndroidElement passwordField() {
//        return SelectorsHelper.getElementById("com.goindriver:id/etPassword");
//    }
//
//    private AndroidElement errorTextView() {
//        return SelectorsHelper.getElementById("com.goindriver:id/tvError");
//    }
//
//    private AndroidElement logoImageView(){
//        return SelectorsHelper.getElementByAccessibilityId("Goin Driver");
//    }

//    /** Methods for login activity elements */
//
//    public boolean enabledUnderLineUserName() {
//        return underLineUserName().isEnabled();
//    }
//
//    public boolean enabledUnderLinePassword() {
//        return underLinePassword().isEnabled();
//    }
//
//    public void enterTestEmail() {
//        emailField().sendKeys("test@mail.com");
//    }
//
//    public void enterIncorrectEmail() {
//        emailField().sendKeys("incorrectEmail");
//    }
//
//    public void enterNotExistEmail() {
//        emailField().sendKeys("notExistDriver@gmail.com");
//    }
//
//    public void enterExistEmail() {
//        emailField().sendKeys("fortestzensoft@gmail.com");
//    }
//
//    public void enterNotExistPassword() {
//        passwordField().sendKeys("notExistPassword");
//    }
//
//    public void enterExistPassword() {
//        passwordField().sendKeys("test");
//    }
//
//    public boolean enabledErrorTextView() {
//        return errorTextView().isEnabled();
//    }
//
//    public String getErrorTextViewMessage() {
//        return errorTextView().getText();
//    }
//
//    public boolean enabledEmailField(){
//        return emailField().isEnabled();
//    }
//
//    public boolean enabledPasswordField(){
//        return passwordField().isEnabled();
//    }
//
//    public boolean enabledLogoImageView(){
//        return logoImageView().isEnabled();
//    }
//
//    public void phoneNumberContainerClick() {
//        phoneNumberContainer().click();
//    }

}

