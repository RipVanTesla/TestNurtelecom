package tests.tests;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;
import org.junit.BeforeClass;

import java.util.concurrent.TimeUnit;

import io.appium.java_client.CommandExecutionHelper;
import io.appium.java_client.ExecutesMethod;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.android.AndroidKeyMetastate;
import tests.activities.LoginActivity;
import tests.helpers.ConfigHelper;
import static io.appium.java_client.MobileCommand.pressKeyCodeCommand;

import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import static io.appium.java_client.android.AndroidKeyCode.*;
import static io.appium.java_client.android.AndroidKeyMetastate.*;
import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;
import static junit.framework.Assert.fail;

import io.appium.java_client.android.AndroidKeyCode;

public class LoginActivityTests extends ConfigHelper{
    private LoginActivity loginActivity = new LoginActivity();
//    private void tearDown() {
//        driver.resetApp();
//    }

    public LoginActivityTests()  {
    }

    @Before
    public void implicitlyElements() {
        ConfigHelper.driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
        driver.resetApp();

    }

    @Test
    public void pressAcceptButton() {
        Boolean conditionTextBox = loginActivity.conditionTextBox().isDisplayed();
        if (!conditionTextBox) {
            System.out.println("condition text not found");}
        Boolean iconBoxO = loginActivity.iconBoxO().isDisplayed();
        if (!iconBoxO) {
            System.out.println("logo O not found");}
        loginActivity.agreeAgeConditionBox().click();
        Boolean checkAcceptButton = loginActivity.acceptButton().isEnabled();
        if (checkAcceptButton) {
            System.out.println("save button is enabled");}
        loginActivity.acceptButton().isEnabled();
        loginActivity.agreeAppConditionBox().click();
        Boolean checkAcceptButton1 = loginActivity.acceptButton().isEnabled();
        if (checkAcceptButton1) {
            System.out.println("save button is enabled");}
        loginActivity.agreeAppConditionBox().click();
        loginActivity.agreeAgeConditionBox().click();
        Boolean checkAcceptButton2 = loginActivity.acceptButton().isEnabled();
        if (!checkAcceptButton2) {
            System.out.println("save button is not enabled");}
        loginActivity.acceptButton().click();
    }


    @Test
    public void loginPhoneNumber() {
        loginActivity.acceptButton().click();
        Boolean phoneNumberNextButton = loginActivity.phoneNumberNextButton().isEnabled();
        if (phoneNumberNextButton) {
            System.out.println("continue button is enabled without insert number");}
        Boolean iconBoxO = loginActivity.iconBoxO().isDisplayed();
        if (!iconBoxO) {
            System.out.println("logo O not found");}
        Boolean headerText = loginActivity.headerText().isDisplayed();
        if (!headerText) {
            System.out.println("No Header Text");}

        loginActivity.phoneNumberContainer().clear();
        loginActivity.phoneNumberContainer().sendKeys("+996702247783");
        loginActivity.phoneNumberContainer().clear();
        loginActivity.phoneNumberContainer().sendKeys("+996700546039");
        Boolean phoneNumberNextButton1 = loginActivity.phoneNumberNextButton().isEnabled();
        if (!phoneNumberNextButton1) {
            System.out.println("continue button is Disabled with insert number");}
        loginActivity.phoneNumberNextButton().click();
        }

    @Test
    public void loginPhonePassword() {
        loginActivity.acceptButton().click();
        loginActivity.phoneNumberContainer().clear();
//        driver.getKeyboard().pressKey("1");
        loginActivity.phoneNumberContainer().sendKeys("0702247783");
        loginActivity.phoneNumberContainer().clear();
        loginActivity.phoneNumberContainer().sendKeys("+996700546039");
        loginActivity.phoneNumberNextButton().click();
        loginActivity.phonePasswordContainer().sendKeys("qwerty");
        loginActivity.phonePasswordNextButton().click();


    }
//
//    @Test
//    public void loginWithDataOnlyInEmailField() {
//        loginActivity.enterTestEmail();
//        loginActivity.loginButtonClick();
//
//        assertTrue("Should be a highlights only password underline",
//                !loginActivity.enabledUnderLinePassword() &&
//                        loginActivity.enabledUnderLineUserName());
//
//        assertEquals("Should be login activity is displayed",
//                getCurrentActivity(), LoginActivity.activity);
//    }
//
//    @Test
//    public void loginWithDataOnlyInPasswordField() {
//        loginActivity.enterNotExistPassword();
//        loginActivity.loginButtonClick();
//
//        assertTrue("Underlines should be a highlights",
//                !loginActivity.enabledUnderLinePassword() &&
//                        !loginActivity.enabledUnderLineUserName());
//
//        assertEquals("Should be login activity is displayed",
//                getCurrentActivity(), LoginActivity.activity);
//    }
//
//    @Test
//    public void loginWithIncorrectEmail() {
//        String correctMessageError = "Username or password are incorrect";
//
//        loginActivity.enterIncorrectEmail();
//        loginActivity.enterNotExistPassword();
//        loginActivity.loginButtonClick();
//
//        assertTrue("Underlines should be a highlights",
//                !loginActivity.enabledUnderLinePassword() &&
//                        !loginActivity.enabledUnderLineUserName());
//
//        assertTrue("Should be displayed message error",
//                loginActivity.enabledErrorTextView());
//
//        assertEquals("Should be displayed correct text message",
//                correctMessageError, loginActivity.getErrorTextViewMessage());
//
//        assertEquals("Should be login activity is displayed",
//                getCurrentActivity(), LoginActivity.activity);
//    }
//
//    @Test
//    public void loginWithNotExistEmail() {
//        String correctMessageError = "Username or password are incorrect";
//
//        loginActivity.enterNotExistEmail();
//        loginActivity.enterNotExistPassword();
//        loginActivity.loginButtonClick();
//
//        assertTrue("Underlines should be a highlights",
//                !loginActivity.enabledUnderLinePassword() &&
//                        !loginActivity.enabledUnderLineUserName());
//
//        assertTrue("Should be displayed message error",
//                loginActivity.enabledErrorTextView());
//
//        assertEquals("Should be displayed correct text message",
//                correctMessageError, loginActivity.getErrorTextViewMessage());
//
//        assertEquals("Should be login activity is displayed",
//                getCurrentActivity(), LoginActivity.activity);
//    }
//
//    @Test
//    public void loginWithExistEmailAndIncorrectPassword() {
//        String correctMessageError = "Incorrect email or password";
//
//        loginActivity.enterExistEmail();
//        loginActivity.enterNotExistPassword();
//        loginActivity.loginButtonClick();
//
//        assertTrue("Underlines should be a highlights",
//                !loginActivity.enabledUnderLinePassword() &&
//                        !loginActivity.enabledUnderLineUserName());
//
//        assertTrue("Should be displayed message error",
//                loginActivity.enabledErrorTextView());
//
//        assertEquals("Should be displayed correct text message",
//                correctMessageError, loginActivity.getErrorTextViewMessage());
//
//        assertEquals("Should be login activity is displayed",
//                getCurrentActivity(), LoginActivity.activity);
//    }
//
//    @Test
//    public void loginWithExistEmailAndCorrectPassword() {
//        loginActivity.enterExistEmail();
//        loginActivity.enterExistPassword();
//        loginActivity.loginButtonClick();
//
//    }
//
//    @Test
//    public void displayedElementsOnTheLoginActivity() {
//        assertEquals("Should be login activity is displayed",
//                getCurrentActivity(), LoginActivity.activity);
//
//        assertTrue("Should be displayed email field in login activity",
//                loginActivity.enabledEmailField());
//
//        assertTrue("Should be displayed password field in login activity",
//                loginActivity.enabledPasswordField());
//
//        assertTrue("Should be enabled error text view in login activity",
//                loginActivity.enabledErrorTextView());
//
//        assertTrue("Should be displayed login button in login activity",
//                loginActivity.enabledLoginButton());
//
//        assertTrue("Should be displayed logo \"Goin Driver\" in login activity",
//                loginActivity.enabledLogoImageView());
//    }

}