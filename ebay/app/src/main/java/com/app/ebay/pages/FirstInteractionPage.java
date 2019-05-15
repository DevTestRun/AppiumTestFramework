package com.app.ebay.pages;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.app.ebay.helper.AppiumHelper;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * FirstInteractionPage has all the ui locators and actions performed in the checkout screen in app
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class FirstInteractionPage extends AppiumHelper {

    @FindBy(id = "com.ebay.mobile:id/home")
    public MobileElement homeNavMenu;

    @FindBy(id = "com.ebay.mobile:id/menu_cart")
    public MobileElement menuCart;

    @FindBy(id = "com.ebay.mobile:id/capsule_selling")
    public MobileElement sellingCapsule;

    @FindBy(id = "com.ebay.mobile:id/capsule_deals")
    public MobileElement dealsCapsule;

    @FindBy(id = "com.ebay.mobile:id/capsule_categories")
    public MobileElement categoriesCapsule;

    @FindBy(id = "com.ebay.mobile:id/button_register")
    public MobileElement registerPage;

    @FindBy(id = "com.ebay.mobile:id/button_sign_in")
    public MobileElement signin;

    @FindBy(id = "com.ebay.mobile:id/search_box")
    public MobileElement searchBox;
    /** Constructor */
    public FirstInteractionPage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    /** Method : registerUser
     *  Description: performs click action on register page button
     *  @return:  None
     */
    public void registerUser() {
        clickElement(registerPage);
    }

    /** Method : pressSignIn
     *  Description: performs click action on sign in button
     *  @return:  None
     */
    public void pressSignIn(){
        clickElement(signin);
    }
}