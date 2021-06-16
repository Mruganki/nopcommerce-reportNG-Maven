package com.nopcommerce.demo.page;

import com.nopcommerce.demo.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    public static void selectMenu(String menu) {
        if (menu.equalsIgnoreCase("Computers")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        } else if (menu.equalsIgnoreCase("Electronics")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        } else if (menu.equalsIgnoreCase("Apparel ")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        } else if (menu.equalsIgnoreCase("Digital downloads ")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
        } else if (menu.equalsIgnoreCase("Books ")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        } else if (menu.equalsIgnoreCase("Jewelry ")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        } else if (menu.equalsIgnoreCase("Gift Cards ")) {
            clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        }

    }
}