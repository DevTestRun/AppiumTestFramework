package com.app.ebay.performTests;

import com.app.ebay.pages.PersonalAccRegistrationPage;

import org.testng.annotations.Test;

/**
 * TestEbayPersonalUserRegistration class have the test to perform Personal user registration for ebay account
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class TestEbayPersonalUserRegistration extends BaseTestClass{
    /** Method : registerPersonalUserWorkFlow
     *  Description:Test to perform the personal user registration
     */
    @Test
    public void registerPersonalUserWorkFlow() {
        try{
            firstInteractionPage.registerUser();
            personalUserRegisterPage.selectPersonalAccRadioBtn();
            personalUserRegisterPage.enterFirstName(testDataProvider.getFirstName());
            personalUserRegisterPage.enterLastName(testDataProvider.getLastName());
            personalUserRegisterPage.enterEmail(testDataProvider.getUserEmail);
            personalUserRegisterPage.enterPwd(testDataProvider.getUserPassword);
            personalUserRegisterPage.registerPersonalUser();

        }catch (Exception e){
           Log.logError(getClass().getName(), "registerPersonalUserWorkFlow", "Unable to Register the user successfully");
        }
    }
}
