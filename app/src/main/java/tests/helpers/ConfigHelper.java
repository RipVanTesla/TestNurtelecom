package tests.helpers;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.AppiumCommandInfo;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.AndroidKeyCode;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServerHasNotBeenStartedLocallyException;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class ConfigHelper {
    public static AppiumDriver<AndroidElement> driver;
//        public static AppiumDriver<> driver;
//        private static AppiumDriverLocalService service;



    @BeforeClass
    public static void driverInitialization() throws MalformedURLException {
//        AppiumServiceBuilder.APPIUM_PATH = "";
//        service = AppiumDriverLocalService.buildDefaultService();
//        service.start();

//        AppiumServiceBuilder builder = new AppiumServiceBuilder()
//                .withAppiumJS(new File("/usr/local/lib/node_modules/appium/build/lib/main.js"));
////                .usingDriverExecutable(new File("/usr/local/bin/node"));
//////                .withArgument(GeneralServerFlag.APP, System.getProperty("user.dir") + "/build/wordpress.apk")
//////                .withArgument(GeneralServerFlag.LOG_LEVEL, "info")
//////                .withLogFile(new File(System.getProperty("user.dir") + "/target/logs/sample.txt"))
//                .usingPort(Integer.parseInt("8800"))
////                /* and so on */;
//        AppiumDriverLocalService service = builder.build();
//        service.start();

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("automationName", "Appium");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "8.0");
        capabilities.setCapability("deviceName", "Nexus_5X_API_26_AV8");
        capabilities.setCapability("appPackage", "kg.o.nurtelecom");
        capabilities.setCapability("appActivity", ".ui.splash.SplashScreenActivity");
        capabilities.setCapability("deviceReadyTimeout", 40);
        capabilities.setCapability("autoGrantPermissions", true);
        capabilities.setCapability("unicodeKeyboard", true);
        capabilities.setCapability("resetKeyboard", true);
        capabilities.setCapability("fingerprintInstrument", true);
		capabilities.setCapability("unlockType", "fingerprint");
//        AppiumDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);

        driver = new AndroidDriver<>(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
    }

    @AfterClass
    public static void afterClass() {
        if (driver != null) {
            driver.quit();
        }

//        if (service != null) {
//            service.stop();
//        }

    }




//    public static String getCurrentActivity(){
//        return driver.currentActivity();
//    }

//    public void setImplicitlyWait(int timeSec){
//        driver.manage().timeouts().implicitlyWait(timeSec, TimeUnit.SECONDS);
//    }
//
//    public void setExplicitlyWait(int timeSec, AndroidElement element){
//        WebDriverWait wait = new WebDriverWait(driver,timeSec);
//        wait.until(ExpectedConditions.visibilityOf(element));
//    }
}

