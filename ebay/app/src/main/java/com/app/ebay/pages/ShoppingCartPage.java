package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * ShoppingCartPage has all the ui locators and actions performed in the checkout screen in app
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class ShoppingCartPage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/title")
    public MobileElement cartProductName;

    @FindBy(id = "com.ebay.mobile:id/item_price")
    public MobileElement cartProductPrice;

    @FindBy(id = "com.ebay.mobile:id/remove_from_cart_button")
    public MobileElement cartRemoveProduct;

    @FindBy(id = "android:id/button1")
    public MobileElement removeConfirmation;

    /** Constructor */
    public ShoppingCartPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** Method : getCartProdName
     *  Description: returns the product name on the Shopping cart page
     *  @return:  String
     */
    public String getCartProdName(){
        String prodName = cartProductName.toString();
        return  prodName;
    }

    /** Method : getCartProdPrice
     *  Description: returns the product price on the Shopping cart page
     *  @return:  String
     */
    public String getCartProdPrice(){
        String prodPrice = cartProductPrice.toString();
        return  prodPrice;
    }

    /** Method : clickOnCartRemoveProduct
     *  Description: clicks on cart remove product element
     *  @return:  none
     */
    public void clickOnCartRemoveProduct(){
        clickElement(cartRemoveProduct);
    }

    /** Method : clickOnCartRemoveConfirmation
     *  Description: clicks on remove confirmation
     *  @return:  None
     */
    public void clickOnCartRemoveConfirmation(){
        clickElement(removeConfirmation);
    }
}