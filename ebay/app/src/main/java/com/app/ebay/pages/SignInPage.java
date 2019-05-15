package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import com.app.ebay.logger.Log;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * SignInPage has all the ui locators and actions performed in the checkout screen in app
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class SignInPage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/edit_text_username")
    public MobileElement userName;

    @FindBy(id = "com.ebay.mobile:id/et_temp")
    public MobileElement password;

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    public MobileElement signInButton;

    @FindBy(id = "com.ebay.mobile:id/button_google_deny")
    public MobileElement noThanksButton;

    /** Constructor */
    public SignInPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** Method : enterUserName
     *  Description: Enters the given user name in the mobile element field
     *  @param uName- text to be entered in the user name field
     *  @return:  None
     */
    public void enterUserName(String uName){
        try{
            if(uName != null){
                inputString(userName,uName);
                Log.info("User Name entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterUserName","Text is not entered in user name field");
        }
    }

    /** Method : enterPassword
     *  Description: Enters the given password in the mobile element field
     *  @param pwd- text to be entered in the password field
     *  @return:  None
     */
    public void enterPassword(String pwd){
        try{
            if(pwd != null){
                inputString(password,pwd);
                Log.info("Password entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterPassword","Text is not enetered in Password");
        }
    }

    /** Method : pressSignInButton
     *  Description: performs click on the Sign in button
     *  @return:  None
     */
    public void pressSignInButton(){
        clickElement(signInButton);
    }

    /** Method : pressNoThanksBtn
     *  Description: performs click on the No Thanks button
     *  @return:  None
     */
    public void pressNoThanksBtn(){
        clickElement(noThanksButton);
    }
}