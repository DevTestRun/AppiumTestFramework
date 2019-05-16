package com.app.ebay.performTests;

import com.app.ebay.logger.Log;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.ScreenOrientation;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

/**
 * TestDataProvider class picks the sata from the user defined test data present in the xml
 * file and provides methods to handle the data
 * @author  Sarika
 * @version 1.0
 * @since   2019
 */
public class TestDataProvider {
    File classpathRoot = new File(System.getProperty("user.dir"));
    File appDir = new File(classpathRoot, "/src/main/assets");
    File file = new File("testData.xml");
    public String usr;
    public String pwd;
    public String product;
    public String screenOrientation;
    public String firstName;
    public String lastName;
    public String userEmail;
    public String userPassword;
    ScreenOrientation orientation;
    Dimension targetSize;
    Integer width;
    Integer height;
    DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
    DocumentBuilder documentBuilder;
    {
        try {
            documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(file);
            usr = document.getElementsByTagName("user").item(0).getTextContent();
            pwd = document.getElementsByTagName("password").item(0).getTextContent();
            product = document.getElementsByTagName("productName").item(0).getTextContent();
            screenOrientation = document.getElementsByTagName("ScreenOrientation").item(0).getTextContent();
            width = Integer.parseInt(document.getElementsByTagName("WindowSizeWidth").item(0).getTextContent());
            height = Integer.parseInt(document.getElementsByTagName("WindowSizeHeight").item(0).getTextContent());
            firstName = document.getElementsByTagName("firstName").item(0).getTextContent();
            lastName = document.getElementsByTagName("lastName").item(0).getTextContent();
            userEmail = document.getElementsByTagName("email").item(0).getTextContent();
            userPassword = document.getElementsByTagName("password").item(0).getTextContent();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /** Method : getUsr
     *  Description: Method that returns the username provided by user in the testData file
     *  @return   usr
     */
    public String getUsr(){
        return usr;
    }

    /** Method : getPwd
     *  Description: Method that returns the password provided by user in the testData file
     *  @return   pwd
     */
     public String getPwd(){
        return pwd;
    }

    /** Method : getProduct
     *  Description: Method that returns the product to search in the app provided by user in the testData file
     *  @return   product
     */
     public String getProduct(){
        return product;
    }
    
    /** Method : getFirstName
     *  Description: Method that returns the first name provided by user in the testData file
     *  @return   firstName
     */
     public String getFirstName(){
        return firstName;
    }
    
     /** Method : getLastName
     *  Description: Method that returns the last name provided by user in the testData file
     *  @return   lastName
     */
     public String getLastName(){
        return lastName;
    }
    
    /** Method : getUserEmail
     *  Description: Method that returns the email provided by user in the testData file
     *  @return   userEmail
     */
     public String getUserEmail(){
        return userEmail;
    }

     /** Method : getUserPassword
     *  Description: Method that returns the password provided by user in the testData file
     *  @return   userPassword
     */
     public String getUserPassword(){
        return userPassword;
    }

    /** Method : getScreenOrientation
     *  Description:Method that returns the screen rotation based on the user data provided in the testData file
     *  @return   ScreenOrientation
     */
     public ScreenOrientation getScreenOrientation(){
        if(screenOrientation.toLowerCase().equals("potrait"))
            orientation = ScreenOrientation.PORTRAIT;
        else if(screenOrientation.toLowerCase().equals("landscape")){
            orientation = ScreenOrientation.LANDSCAPE;
        }
        else
        {
            Log.logError(getClass().getName(),"screenOrientation","Invalid Screen orientation");
        }
        return orientation;
    }

    /** Method : getTargetSize
     *  Description:Method that returns the screen Dimension based on the user data(width,height) provided in the testData file
     *  @return   Dimension
     */
    public Dimension getTargetSize(){
        targetSize = new Dimension(width,height);
        return targetSize;
    }
   }
