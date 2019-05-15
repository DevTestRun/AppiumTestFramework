package com.app.ebay.performTests;

import org.testng.annotations.Test;
import static junit.framework.TestCase.assertTrue;

/**
 * TestEbayProductPurchaseWorkflow class have the different tests
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class TestEbayProductPurchaseWorkflow extends BaseTestClass {
    /** Method : placeOrderWorkFlow
     *  Description:Test to search an item and proceed with checkout of the product
     */
     @Test
     public void placeOrderWorkFlow(){
        //On first interaction page
        firstInteractionPage.pressSignIn();
        //navigate to sign in page
        signInPage.enterUserName(testDataProvider.getUsr());
        signInPage.enterPassword(testDataProvider.getPwd());
        signInPage.pressSignInButton();
        signInPage.pressNoThanksBtn();
        //On home page
        homePage.enterTextInSearchField(testDataProvider.getProduct());
        //select the product from the list
        homePage.selectProdFromList();
        productPage.clickProductDetailsAddToCartBtn();
        //Verify the cart details with checkout details
        assertTrue(verifyCartAndCheckoutProdDetails());
        //Click on pay confirmation button
        checkoutPage.clickPayConfirmBtn();
    }

    /** Method : verifyCartAndCheckoutProdDetails
     *  Description:Method  to define and verify the cart details with the product details in the checkout page
     * @return boolean
     */
    private boolean verifyCartAndCheckoutProdDetails(){
       boolean prodNameFlag = productPage.getProdDetailsName().equals(checkoutPage.getCheckoutProdDetailsName());
       boolean prodPriceFlag = productPage.getProdDetailsPrice().equals(checkoutPage.getCheckoutProdDetailsPrice());
       return (prodNameFlag && prodPriceFlag);
    }
}