package com.app.ebay.helper;


import io.appium.java_client.AppiumDriver;

/**
 * AppiumBase abstract class that provides method that return a driver instance
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public abstract class AppiumBase {
     /** Method : driver
     *  Description: method returns an instance of the Android/IOS driver accordingly
     *  @return:  AppiumDriver
     */
    protected AppiumDriver<?> driver() {
        return AppiumController.instance.driver;
    }
}