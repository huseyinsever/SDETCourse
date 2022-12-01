package Proje3;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class Proje3_Senaryo2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
        WebElement AddTocard = driver.findElement(By.xpath("//h4[text()=\"Demo eBook\"]//following::button"));
        AddTocard.click();


        WebElement frameWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='EJIframeV3']")));
        driver.switchTo().frame(frameWait);

        WebElement promosyonKodTıkla=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Apply-Button Show-Promo-Code-Button']")));
        promosyonKodTıkla.click();


        WebElement koduGir=driver.findElement(By.cssSelector("[class='Promo-Code-Value']"));
        koduGir.sendKeys("123456789");

        WebElement applyTıkla=driver.findElement(By.xpath("//*[text()='Apply']"));
        applyTıkla.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SnackBar")));
        WebElement ınvalidPromokodDogrla=driver.findElement(By.id("SnackBar"));
        Assert.assertTrue(ınvalidPromokodDogrla.isDisplayed());
        driver.switchTo().defaultContent();

        BekleKapat();


    }
}

