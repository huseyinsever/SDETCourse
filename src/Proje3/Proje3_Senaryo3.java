package Proje3;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje3_Senaryo3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");


        WebElement AddToCard=driver.findElement(By.xpath("//h4[text()='Demo eBook']//following::button"));
        AddToCard.click();

        WebElement frameWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[class*='EJIframeV3']")));
        driver.switchTo().frame(frameWait);

        WebElement PayUsingCreditCart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Payment-Button CC']")));
        PayUsingCreditCart.click();

        WebElement PayButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Pay-Button']")));
        PayButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SnackBar")));
        WebElement MesajGözüküyorMu=driver.findElement(By.id("SnackBar"));
        Assert.assertTrue(MesajGözüküyorMu.isDisplayed());
        driver.switchTo().defaultContent();


        BekleKapat();




    }
}
