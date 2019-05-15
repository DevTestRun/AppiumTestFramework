package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;


/**
 * CheckoutPage has all the ui locators and actions performed in the checkout screen in app
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class CheckoutPage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/textview_item_name")
    public MobileElement checkoutProductName;

    @FindBy(id = "com.ebay.mobile:id/textview_item_price")
    public MobileElement checkoutProductPrice;

    @FindBy(id = "com.ebay.mobile:id/")
    public MobileElement checkoutProductDescription;

    @FindBy(id = "com.ebay.mobile:id/button_confirm_pay")
    public MobileElement confirmAndPay;

    /** Constructor */
    public CheckoutPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    /** Method : getCheckoutProdDetailsName
     *  Description: returns the product name on the checkout page
     *  @return:  String
     */
    public String getCheckoutProdDetailsName(){
        String prodName = checkoutProductName.toString();
        return  prodName;
    }
    /** Method : getCheckoutProdDetailsPrice
     *  Description: returns the product price on the checkout page
     *  @return:  String
     */
    public String getCheckoutProdDetailsPrice(){
        String prodPrice = checkoutProductPrice.toString();
        return  prodPrice;
    }
    /** Method : getCheckoutProdDetailsDescription
     *  Description: returns the product description on the checkout page
     *  @return:  String
     */
    public String getCheckoutProdDetailsDescription(){
        String prodDescription = checkoutProductDescription.toString();
        return  prodDescription;
    }
    /** Method : getCheckoutProdDetailsDescription
     *  Description: performs click action on the pay and confirm button
     *  @return:  None
     */
    public void clickPayConfirmBtn(){
        clickElement(confirmAndPay);
    }
}