package com.nopcommerce.demo.testsuit;

import com.nopcommerce.demo.customlisteners.CustomListeners;
import com.nopcommerce.demo.page.BuildYourOwnPage;
import com.nopcommerce.demo.page.Computer;
import com.nopcommerce.demo.page.Desktop;
import com.nopcommerce.demo.page.HomePage;
//import com.nopcommerce.demo.page.computerpage.Computer;
import com.nopcommerce.demo.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListeners.class)
public class TestSuit extends TestBase {
    HomePage homePage = new HomePage();
    Computer computer = new Computer();
    Desktop desktop = new Desktop();
    BuildYourOwnPage buildyourownpage = new BuildYourOwnPage();

    @Test(groups = {"sanity","regression"})
    public void clickOnAllSelectMenuTabs(){

        homePage.selectMenu("Computers");
    }
    @Test(groups = {"sanity","smoke","regression"})
    public void clickOnComputersTab() throws InterruptedException{
        computer.clickOnComputersTab();
        computer.clickOndesktopTab();
        computer.clickOnComputersTab();
    }
    @Test(groups = {"smoke","regression"})
    public void productArragedInAscendingOrder() throws InterruptedException{
        desktop.clickonComputer();
        desktop.clickonDesktopOption();
        desktop.selectFromDropdownMenu("Name: A to Z");
        desktop.clickOnAddToCartButton();
    }
    @Test(groups = {"regression"})
    public void verifyShoppingCart()throws InterruptedException{

        homePage.selectMenu("Computers");
        desktop.clickonDesktopOption();
        desktop.selectFromDropdownMenu("Name: A to Z");
        desktop.clickOnAddToCartButton();
        SoftAssert softAssert = new SoftAssert();
        String expectedPagetext = "Build your own computers";  //verify build your own page
        String actualPageText = buildyourownpage.getBuildyourOwnPageText();
        Assert.assertEquals( expectedPagetext, actualPageText );
        softAssert.assertTrue(false);
        buildyourownpage.selectProcessorFromDropDownList( "2.2 GHz Intel Pentium Dual-Core E2200" );
        buildyourownpage.selectRamFromDropDownTwo( "8GB [+$60.00]" );
        buildyourownpage.clickOnHDDRadioButton();
        buildyourownpage.clickOSOnRadioButton();
        buildyourownpage.clickOnSoftwareCheckBox();
        String expectedtotal = "$1,475.00";          //Verifying Total
        String actualTotal = buildyourownpage.getTotalAmt();
        Assert.assertEquals( expectedtotal, actualTotal );
        buildyourownpage.clickOnAddToCart();
        softAssert.assertTrue(true);
        String expectedBarMessage = "The product has been added 2 your shopping cart";
        String actualBarMessage = buildyourownpage.getPopUpBarMessage();
        Assert.assertEquals( expectedBarMessage, actualBarMessage );
        softAssert.assertTrue(false);
        softAssert.assertAll();

    }

}
