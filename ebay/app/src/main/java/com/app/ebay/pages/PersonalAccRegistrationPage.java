package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import com.app.ebay.logger.Log;
import org.apache.commons.lang3.ObjectUtils;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * PersonalAccRegistrationPage has all the ui locators and actions performed in the checkout screen in app
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class PersonalAccRegistrationPage extends AppiumHelper {
    //All the locators for the registration page
    @FindBy(xpath = "//*[@text='Personal account']")
    public MobileElement personalAcc;

    @FindBy(id = "firstname")
    public MobileElement firstName;

    @FindBy(id = "lastname")
    public MobileElement lastName;

    @FindBy(id = "email")
    public MobileElement email;

    @FindBy(id = "PASSWORD")
    public MobileElement password;

    @FindBy(id = "ppaFormSbtBtn")
    public MobileElement personalAccRegister;

    /** constructor */
    public PersonalAccRegistrationPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** Method : selectPersonalAccRadioBtn
     *  Description: select the radio button personal account
     *  @return:  None
     */
    public void selectPersonalAccRadioBtn(){
        clickElement(personalAcc);
    }

    /** Method : enterFirstName
     *  Description: enters the text in the field provided
     *  @param txt
     *            String to be entered in the field
     *  @return:  None
     */
    public void enterFirstName(String txt){
       try{
           if(txt != null){
               inputString(firstName,txt);
               Log.info("First Name entered");
           }
       }catch(Exception e){
           Log.logError(getClass().getName(),"enterFirstName","Text is not enetered in first name field");
       }
    }
    /** Method : enterLastName
     *  Description: enters the text in the field provided
     *  @param txt
     *           String to be entered in the field
     *  @return:  None
     */
    public void enterLastName(String txt){
         try{
            if(uName != null){
                inputString(lastName,txt);
                Log.info("Last Name entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterLastName","Text is not entered in last name field");
        }
    }

    /** Method : enterEmail
     *  Description: enters the text in the field provided
     *  @param txt
     *           String to be entered in the field
     *  @return:  None
     */
    public void enterEmail(String txt){
        try{
            if(uName != null){
                inputString(email,txt);
                Log.info("email entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterEmail","Text is not entered in ename field");
        }
    }

    /** Method : enterPwd
     *  Description: enters the text in the field provided
     *  @param txt - String to be entered in the field
     *  @return:  None
     */
    public void enterPwd(String txt){
        try{
            if(uName != null){
                inputString(password,txt);
                Log.info("password entered");
            }
        }catch(Exception e){
            Log.logError(getClass().getName(),"enterPwd","Text is not entered in password field");
        }
    }

    /** Method : registerPersonalUser
     *  Description: performs click action on personal User Register element
     *  @return:  None
     */
    public void registerPersonalUser() {
        clickElement(personalAccRegister);
    }
}
