package Gün07;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");

        WebElement element=driver.findElement(By.cssSelector("[id='catnav-primary-link-10855']"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element).build();
        aksiyon.perform();
        Bekle(2);
        WebElement element2=driver.findElement(By.cssSelector("[id='side-nav-category-link-10873']"));
        Action aksiyon2=aksiyonlar.moveToElement(element2).build();
        aksiyon2.perform();
        Bekle(2);
        WebElement element3=driver.findElement(By.cssSelector("[id='catnav-l3-10881']"));
        Action aksiyon3=aksiyonlar.moveToElement(element3).click().build();
        aksiyon3.perform();

        Assert.assertTrue(driver.getCurrentUrl().contains("bib"));






        BekleKapat();

    }
}
