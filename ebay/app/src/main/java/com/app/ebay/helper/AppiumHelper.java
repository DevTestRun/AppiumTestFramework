package com.app.ebay.helper;

import com.app.ebay.logger.Log;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.appium.java_client.MobileElement;
/**
 * AppiumHelper is a class providing methods that perform common actions performed on the mobile elements
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class AppiumHelper {
    //wait for maximum 30 seconds before any operation
    WebDriverWait wait = new WebDriverWait(AppiumController.instance.driver, 30);

    /** Method : getPageSource
     *  Description: provides page source details
     *  @return PageSource details
     */
    protected String getPageSource() {
        return AppiumController.instance.driver.getPageSource();
    }

    /** Method : inputString
     *  Description: method to enter text in the text elements
     *  @param mobileElement, stringToBeEntered
     */
    protected void inputString(MobileElement mobileElement, String stringToBeEntered) {
        mobileElement = waitTillElementVisible(mobileElement);
        mobileElement.sendKeys(stringToBeEntered);
        AppiumController.instance.driver.hideKeyboard();
    }
    /** Method : clickElement
     *  Description: perform click action on the mobile element
     *  @param  mobileElement
     *                  Element on which the click operation need to be performed
     */
    protected void clickElement(MobileElement mobileElement) {
         mobileElement.click();
         mobileElement = waitTillElementVisible(mobileElement);
         mobileElement.click();
    }
    /** Method : goBack
     *  Description: provides navigating back operation
     */
    protected void goBack() {
        AppiumController.instance.driver.navigate().back();
    }

    /** Method : isVisible
     *  Description: checks the presence of the element and returns true/false
     *  @param mobileElement
     *              Mobile element for visibility need to be checked
     *  @return:  status
     */
    protected boolean isVisible(MobileElement mobileElement) {
        boolean status = false;
        try {
            mobileElement = waitTillElementVisible(mobileElement);
            status = true;
            Log.info(mobileElement.toString()+" Element is visible");
        } catch (Exception e) {
            Log.logError(getClass().getName(),"isVisible","Element is not visible");
        }
        return status;
    }
    /** Method : waitTillElementVisible
     *  Description: returns the element once it is visible
     *  @param mobileElement
     *              Mobile element on which the action need to be performed
     *  @return:  MobileElement
     */
    private MobileElement waitTillElementVisible(MobileElement mobileElement) {
        return (MobileElement) wait.until(ExpectedConditions.visibilityOf(mobileElement));
    }
}