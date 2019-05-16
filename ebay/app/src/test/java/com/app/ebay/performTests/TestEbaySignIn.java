package com.app.ebay.performTests;

import org.testng.annotations.Test;

/**
 * TestEbaySignIn class have the test to perform Sign in to the app
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class TestEbaySignIn extends BaseTestClass {
    /** Method : signInTest
     *  Description: Method to test the Sign in to the app
     */
    @Test
    public void signInTest(){
        try{
             firstInteractionPage.pressSignIn();
             signInPage.enterUserName(testDataProvider.getUsr());
             signInPage.enterPassword(testDataProvider.getPwd());
             signInPage.pressSignInButton();
        }catch (Exception e){
           Log.logError(getClass().getName(), "signInTest", "Sign In Unsuccessful");
        }
    }
}
