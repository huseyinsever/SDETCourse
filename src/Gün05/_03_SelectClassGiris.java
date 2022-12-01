package Gün05;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class _03_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.amazon.com.tr/");

        Bekle(2);
        WebElement kabulEtButton=driver.findElement(By.cssSelector("[id='sp-cc-accept']"));
        kabulEtButton.click();

        Bekle(2);
        WebElement menu=driver.findElement(By.id("searchDropdownBox"));
        Select ddmenu=new Select(menu);

        ddmenu.selectByValue("search-alias=computers");


        Bekle(2);
        WebElement srcButton=driver.findElement(By.id("nav-search-submit-button"));
        srcButton.click();


        String url=driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon"));

        BekleKapat();

    }
    /*
     select class ı
     görünen text ile seçim için: selectByVisibleText
     valueden seçim için        : selectByValue
     sırasından seçim için      : selectByIndex
 */
}
