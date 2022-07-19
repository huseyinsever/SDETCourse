package Gün05;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectEBay extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com/");

        WebElement ddmenu=driver.findElement(By.id("gh-cat"));
        Select menu=new Select(ddmenu);

        menu.selectByValue("11116");

        WebElement searhButton=driver.findElement(By.id("gh-cat"));
        searhButton.click();
        Bekle(2);
        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        BekleKapat();




    }
}
