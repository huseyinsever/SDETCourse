package Proje3;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje3_Senaryo5 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");


        WebElement AddToCard=driver.findElement(By.xpath("(//*[@class='view_product'])[2]"));
        AddToCard.click();

        WebElement frameWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[class*='EJIframeV3']")));
        driver.switchTo().frame(frameWait);

        WebElement PayUsingCreditCart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Payment-Button CC']")));
        PayUsingCreditCart.click();

        WebElement eMail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Email'][type='email']")));
        eMail.sendKeys("mehmetdemirkol555@outlook.com");

        WebElement confirMail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Confirm Email'][type='email']")));
        confirMail.sendKeys("mehmetdemirkol555@outlook.com");

        WebElement cardOfName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Name On Card']")));
        cardOfName.sendKeys("mehmetDemirkol");

        WebElement OptionsPhone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Optional'][type='text'][autocomplete='phone']")));
        OptionsPhone.sendKeys("0554654334");

        WebElement OptionsCompany=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Optional'][type='text'][autocomplete='company']")));
        OptionsCompany.sendKeys("532 sk.No:40 D:4 Buca/İZMİR");

        driver.switchTo().frame(2);

        WebElement CartNumarasi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='InputElement is-empty Input Input--empty'][autocomplete='cc-number']")));
        CartNumarasi.sendKeys("4242 4242 4242 4242");

        WebElement SonKullanTarihi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='InputElement is-empty Input Input--empty'][autocomplete='cc-exp']")));
        SonKullanTarihi.sendKeys("12/22");

        WebElement CVV=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='InputElement is-empty Input Input--empty'][autocomplete='cc-csc']")));
        CVV.sendKeys("000");

        driver.switchTo().parentFrame();
        WebElement PayButton=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Pay-Button']")));
        PayButton.click();
        driver.switchTo().defaultContent();

        wait.until(ExpectedConditions.urlContains("https://www.fatfreecartpro.com/"));
        WebElement ThanksDoğrula=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='green_text_margin']")));
        Assert.assertTrue(ThanksDoğrula.isDisplayed());

        BekleKapat();

    }
}
