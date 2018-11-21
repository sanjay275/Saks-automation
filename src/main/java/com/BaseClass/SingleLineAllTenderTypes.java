
package com.BaseClass;
import com.helper.BrowserFactory;
import com.pageobjects.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;




public class SingleLineAllTenderTypes {

    static boolean result=false;

    @Test(priority = 0,enabled=false)
    public void SinglineVisa() throws InterruptedException {
        WebDriver driver = BrowserFactory.launchBrowser("chrome", "https://www.qa.saks.com/Entry.jsp");
        try {

            Home_page homePage = PageFactory.initElements(driver, Home_page.class);
            homePage.Close_popup();
            System.out.println("sad");

            SkuSearchpage skusearch = PageFactory.initElements(driver,SkuSearchpage.class);
            skusearch.SearchSku();


            AddtoCart_page cart = PageFactory.initElements(driver, AddtoCart_page.class);
            cart.Addtocart();
            cart.Checkout();
            Thread.sleep(3000);
            cart.Checkout2();
            Thread.sleep(3000);
            cart.select_user();

            ShippingInfo_page ship = PageFactory.initElements(driver,ShippingInfo_page.class);
            ship.firstname();
            Thread.sleep(2000);
            ship.lastname();
            ship.address();
            ship.selectstate();
            ship.city();
            ship.email();
            ship.phone();
            ship.Postal();
            Thread.sleep(3000);
            ship.confirmAdd();

            Payment_page pay = PageFactory.initElements(driver,Payment_page.class);
            Thread.sleep(2000);
            pay.CardName();
            pay.CardYear();
            pay.CardCvv();
            Thread.sleep(2000);
            pay.cardnumber("visa");
            pay.confirmPayment();
            Thread.sleep(3000);

            OrderConfirm_page cnfrm = PageFactory.initElements(driver,OrderConfirm_page.class);
            boolean result = cnfrm.GetorderNumber();
            Assert.assertEquals(true ,result);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 1,enabled=true)
    public void SingleLineAmex()
    {
        WebDriver driver = BrowserFactory.launchBrowser("chrome", "https://www.qa.saks.com/Entry.jsp");
        try {

          Home_page homePage = PageFactory.initElements(driver, Home_page.class);
           homePage.Close_popup();
            homePage.Change_country();
            homePage.SwitchToUS();

            SkuSearchpage skusearch = PageFactory.initElements(driver,SkuSearchpage.class);
            skusearch.SearchSku();


            AddtoCart_page cart = PageFactory.initElements(driver, AddtoCart_page.class);
            cart.selectColor("Tahoe");
            cart.Addtocart();
            Thread.sleep(2000);
            cart.Checkout();
            cart.Checkout2();
            Thread.sleep(3000);
            cart.select_user();

            ShippingInfo_page ship = PageFactory.initElements(driver,ShippingInfo_page.class);
            ship.firstname();
            Thread.sleep(2000);
            ship.lastname();
            ship.address();
            ship.selectstate();
            ship.city();
            ship.email();
            ship.phone();
            ship.Postal();
            //ship.CtnCheckout();
            Thread.sleep(3000);
            ship.confirmAdd();

            Payment_page pay = PageFactory.initElements(driver,Payment_page.class);
            pay.SelectType();
            Thread.sleep(2000);
            pay.cardnumber("Visa");
            Thread.sleep(2000);
            pay.CardName();
            pay.CardYear();
            pay.CardCvv();
            pay.confirmPayment();
            Thread.sleep(3000);

            OrderConfirm_page cnfrm = PageFactory.initElements(driver,OrderConfirm_page.class);
            cnfrm.PlaceOrder();
            Thread.sleep(2000);
            result = cnfrm.GetorderNumber();
            Assert.assertEquals(true ,result);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    @Test(priority = 2,enabled = false)
    public void singleLineDiscover()
    {
        WebDriver driver = BrowserFactory.launchBrowser("chrome", "http://qaslot5.saksdirect.com/");
        try {

            Home_page homePage = PageFactory.initElements(driver, Home_page.class);
            homePage.Close_popup();

            SkuSearchpage skusearch = PageFactory.initElements(driver,SkuSearchpage.class);
            skusearch.SearchSku();


            AddtoCart_page cart = PageFactory.initElements(driver, AddtoCart_page.class);
            cart.Addtocart();
            cart.Checkout();
            Thread.sleep(3000);
            cart.Checkout2();
            Thread.sleep(3000);
            cart.select_user();

            ShippingInfo_page ship = PageFactory.initElements(driver,ShippingInfo_page.class);
            ship.firstname();
            Thread.sleep(2000);
            ship.lastname();
            ship.address();
            ship.selectstate();
            ship.city();
            ship.email();
            ship.phone();
            ship.Postal();
            Thread.sleep(3000);
            ship.confirmAdd();

            Payment_page pay = PageFactory.initElements(driver,Payment_page.class);
            Thread.sleep(2000);
            pay.cardnumber("DISCOVER");
            Thread.sleep(2000);
            pay.CardName();
            pay.CardYear();
            pay.CardCvv();
            pay.confirmPayment();
            Thread.sleep(3000);

            OrderConfirm_page cnfrm = PageFactory.initElements(driver,OrderConfirm_page.class);
            cnfrm.PlaceOrder();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Test(priority = 3,enabled = false)
    public void SingleLineMastercard()
    {
        WebDriver driver = BrowserFactory.launchBrowser("chrome", "http://qaslot5.saksdirect.com/");
        //int iFrameSize = driver.findElements(By.tagName("iframe")).size();
        try {
            int iFrameSize = driver.findElements(By.tagName("iframe")).size();
            System.out.print("Size" + iFrameSize);
            driver.switchTo().defaultContent();
            Thread.sleep(2000);
            driver.switchTo().frame(3);
            driver.findElement(By.xpath("//*[@name='saksSignUpEmail']")).sendKeys("Hiiii");
            Thread.sleep(2000);

        /*for (int i = 0; i < iFrameSize; i++) {
            driver.switchTo().defaultContent();
            Thread.sleep(3000);
            driver.switchTo().frame(i);
            Thread.sleep(2000);
            if (driver.findElements(By.xpath("//*[@name='saksSignUpEmail']")).size() != 0) {
                System.out.println("Element is Present");
                driver.findElement(By.xpath("//*[@name='saksSignUpEmail']")).sendKeys("Hiiii");

            } else {
                System.out.println("Element is Absent");
            }
        }*/


            //}
            //driver.switchTo().frame().

            driver.findElement(By.xpath("//*[@name='saksSignUpEmail']")).sendKeys("exit");
            Home_page homePage = PageFactory.initElements(driver, Home_page.class);
            homePage.Close_popup();

            SkuSearchpage skusearch = PageFactory.initElements(driver,SkuSearchpage.class);
            skusearch.SearchSku();


            AddtoCart_page cart = PageFactory.initElements(driver, AddtoCart_page.class);

            cart.Addtocart();
            cart.Checkout();
            Thread.sleep(3000);
            cart.Checkout2();
            Thread.sleep(3000);
            cart.select_user();

            ShippingInfo_page ship = PageFactory.initElements(driver,ShippingInfo_page.class);
            ship.firstname();
            Thread.sleep(2000);
            ship.lastname();
            ship.address();
            ship.selectstate();
            ship.city();
            ship.email();
            ship.phone();
            ship.Postal();
            Thread.sleep(3000);
            ship.confirmAdd();

            Payment_page pay = PageFactory.initElements(driver,Payment_page.class);
            Thread.sleep(2000);
            pay.cardnumber("Mastercard");
            Thread.sleep(2000);
            pay.CardName();
            pay.CardYear();
            pay.CardCvv();
            pay.confirmPayment();
            Thread.sleep(3000);

            OrderConfirm_page cnfrm = PageFactory.initElements(driver,OrderConfirm_page.class);
            cnfrm.PlaceOrder();


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}


