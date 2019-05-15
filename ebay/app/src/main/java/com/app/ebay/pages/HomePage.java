package com.app.ebay.pages;

import com.app.ebay.helper.AppiumHelper;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

/**
 * HomePage has all the ui locators and actions performed in the checkout screen in app
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class HomePage extends AppiumHelper {
    @FindBy(id = "com.ebay.mobile:id/search_box")
    public MobileElement homePageSearchBox;

    @FindBy(id = "com.ebay.mobile:id/cell_collection_item")
    public MobileElement productList;

    /** Constructor */
    public HomePage(AppiumDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    /** Method : enterTextInSearchField
     *  Description: Enters the given text in the mobile element field
     *  @param txt
     *           text to be entered in th efield provided
     *  @return:  None
     */
    public void enterTextInSearchField(String txt){
        inputString(homePageSearchBox,txt);
    }
    /** Method : selectProdFromList
     *  Description: performs click action on product list element
     *  @return:  None
     */
    public void selectProdFromList(){
        clickElement(productList);
    }
}