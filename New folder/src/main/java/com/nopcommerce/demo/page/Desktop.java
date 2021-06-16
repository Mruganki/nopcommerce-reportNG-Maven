package com.nopcommerce.demo.page;


import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;
import org.testng.Reporter;


public class Desktop extends Utility {

    HomePage homePage = new HomePage();
    By clickonDesktopTab = By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']");
    By sortByAscendingOrder = By.id("products-orderby");
    By addtoCart = By.xpath("//span[text()='$1,200.00']//parent::div/following::div[1]/button[text()='Add to cart']");


    public void clickonComputer()  {
        Reporter.log("Click On Computers"+homePage.toString()+"<br>");
        homePage.selectMenu("Computers");
    }

    public void clickonDesktopOption() throws InterruptedException {
        Reporter.log("click on Desktop"+clickonDesktopTab.toString()+"<br>");
        Thread.sleep(2000);
        clickOnElement(clickonDesktopTab);

    }

    public void selectFromDropdownMenu(String sortby) {
        Reporter.log("Select Assending Order from DropDown"+sortByAscendingOrder.toString()+"<br>");
        selectByTextFromDropDown(sortByAscendingOrder, sortby);
    }

    public void clickOnAddToCartButton() throws InterruptedException{
        Reporter.log("Click on Add to cart Button"+addtoCart.toString()+"<br>");
        Thread.sleep(2000);
        clickOnElement(addtoCart);
    }
}

       // Thread.sleep(2000);
        //click on desktop
        //clickOnElement(By.xpath("//ul[@class = 'sublist']//child::li//child::a[text() = 'Desktops ']"));
        // Select Sort By position "Name: A to Z"
        //selectByTextFromDropDown(By.id("products-orderby"), "Name: A to Z");

        //click on add to cart
       // Thread.sleep(2000);
       // clickOnElement(By.xpath("//span[text()='$1,200.00']//parent::div/following::div[1]/button[text()='Add to cart']"));



      /**  // desktoplist of products in its original order
        List<WebElement> deskTopList = driver.findElements(By.xpath("//div[@class='item-grid']//div/div/div[2]//child::h2"));

        List<String> productName = new ArrayList<>();

        for (WebElement deskTop : deskTopList) {
            productName.add(deskTop.getText());
        }

        List<String> tempList = new ArrayList<>();
        tempList.addAll(productName);

        Collections.sort(tempList);
        Collections.sort(productName,Collections.reverseOrder());
        System.out.println(productName);
        System.out.println(tempList);
        Assert.assertEquals(productName, tempList);



    }*/

