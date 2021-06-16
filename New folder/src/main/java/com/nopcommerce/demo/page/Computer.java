package com.nopcommerce.demo.page;

//import com.nopcommerce.demo.homepage.TopMenu;
import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Computer extends Utility {


    HomePage homepage = new HomePage();
    By clickonDesktop = By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']");
    By selectZtoA = By.id("products-orderby");
    By desktoplist = By.xpath("//div[@class='item-grid']//div/div/div[2]//child::h2");



    public void clickOnComputersTab(){
        Reporter.log("click on Computer"+homepage.toString()+"<br>");

    homepage.selectMenu("Computers");


    }
    public void clickOndesktopTab () throws InterruptedException {

        Reporter.log("click on Desktop"+clickonDesktop.toString()+"<br>");
        Thread.sleep(2000);

        clickOnElement(clickonDesktop);
    }

    public void sortByDescendingOrder(String sortby){

        Reporter.log("click on dropdown Z to A"+selectZtoA.toString()+"<br>");
    // Select Sort By position "Name: Z to A"
   selectByTextFromDropDown(selectZtoA,sortby);
        Reporter.log("Get reverse order text"+desktoplist.toString()+"<br>");
        SoftAssert softassert = new SoftAssert();

    // desktoplist of products in its originalorder
    List<WebElement> deskTopList = driver.findElements(desktoplist);

    List<String> productName = new ArrayList<>();

    for (WebElement deskTop : deskTopList) {
        productName.add(deskTop.getText());
    }

    List<String> tempList = new ArrayList<>();
    tempList.addAll(productName);

    Collections.sort(tempList,Collections.reverseOrder());
    Collections.sort(productName,Collections.reverseOrder());
    System.out.println(productName);
    System.out.println(tempList);
    Assert.assertEquals(productName, tempList);
    softassert.assertTrue(false);
        softassert.assertAll();



}
}



