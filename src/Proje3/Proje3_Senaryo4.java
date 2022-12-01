package Proje3;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje3_Senaryo4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement AddToCard=driver.findElement(By.xpath("//h4[text()='Demo eBook']//following::button"));
        AddToCard.click();

        WebElement frameWait=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[class*='EJIframeV3']")));
        driver.switchTo().frame(frameWait);

        WebElement PayUsingCreditCart=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button[class='Payment-Button CC']")));
        PayUsingCreditCart.click();

        WebElement eMail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Email'][type='email']")));
        eMail.sendKeys("mehmetdemirkol555@outlook.com");

        WebElement confirMail=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Confirm Email'][type='email']")));
        confirMail.sendKeys("mehmet555@outlook.com");

        WebElement cardOfName=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Name On Card']")));
        cardOfName.sendKeys("mehmetDemirkol");

        WebElement OptionsPhone=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Optional'][type='text'][autocomplete='phone']")));
        OptionsPhone.sendKeys("0554654334");

        WebElement OptionsCompany=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[placeholder='Optional'][type='text'][autocomplete='company']")));
        OptionsCompany.sendKeys("532 sk.No:40 D:4 Buca/İZMİR");


        Bekle(2);
        WebElement frameWait2=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("iframe[name*='__privateStripeFrame']")));
        driver.switchTo().frame(frameWait2);

        WebElement CartNumarasi=wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[class='InputElement is-empty Input Input--empty'][autocomplete='cc-number']")));
        CartNumarasi.sendKeys("1111 1111 1111 1111");

        driver.switchTo().parentFrame();

        WebElement MesajGözüküyorMu=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("SnackBar")));
        Assert.assertTrue(MesajGözüküyorMu.isDisplayed());
        driver.switchTo().defaultContent();

        BekleKapat();


    }
}
