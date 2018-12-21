package tests.helpers;

//
import org.w3c.dom.Text;

import io.appium.java_client.android.AndroidElement;
//
public class SelectorsHelper extends ConfigHelper {

    public static AndroidElement getElementById(String id){
        return (AndroidElement) driver.findElementById(id);
    }
    public static AndroidElement getElementByName(String name){
        AndroidElement element = driver.findElementByName(name);
        return element;
    }
    public static AndroidElement getElementByClassName(String className){
        AndroidElement element = driver.findElementByClassName(className);
        return element;
    }
    public static AndroidElement getElementByXPath(String XPath){
        AndroidElement element = driver.findElementByXPath(XPath);
        return element;
    }
//    public static AndroidElement getElementByCssSelector(String CssSelector){
//        AndroidElement element = driver.findElementByCssSelector(CssSelector);
//        return element;
//    }
//    public static AndroidElement getElementByTagName(String TagName){
//        AndroidElement element = driver.findElementByTagName(TagName);
//        return element;
//    }
    public static AndroidElement getElementByAccessibilityId(String AccessibilityId){
        AndroidElement element = (AndroidElement) driver.findElementByAccessibilityId(AccessibilityId);
        return element;
    }
//    public static AndroidElement getElementByLinkText(String LinkText){
//        AndroidElement element = driver.findElementByLinkText(LinkText);
//        return element;
//    }
//    public static AndroidElement getElementByPartialLinkText(String PartialLinkText){
//        AndroidElement element = driver.findElementByPartialLinkText(PartialLinkText);
//        return element;
//    }
//    public static AndroidElement getElementByText(){
//        AndroidElement element = driver.findElementByLinkText();
//    }

}
