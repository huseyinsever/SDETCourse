package Proje3;
import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Proje3_Senaryo1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://shopdemo.e-junkie.com/");

        WebElement AddTocard = driver.findElement(By.xpath("(//*[@class='basicDetails'])[2]/button"));
        AddTocard.click();

        WebElement framewait = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[class*='EJOverlayV3']")));
        driver.switchTo().frame(framewait);

        WebElement Quantity=driver.findElement(By.xpath("//p[@class=\"Product-Quantity\"]//following::input"));

        Assert.assertTrue(Quantity.getAttribute("value").contains("1"));

        WebElement remove = driver.findElement(By.cssSelector("[class='Product-Remove'][data-item='0']"));
        remove.click();

        Bekle(4);

        WebElement continueShopping = driver.findElement(By.xpath("//*[text()='Continue Shopping']"));
        continueShopping.click();
        driver.switchTo().defaultContent();

        WebElement sifirla = driver.findElement(By.cssSelector("[id=\"cart_item_nos\"]"));
        Assert.assertTrue(sifirla.getText().contains("0"));

        BekleKapat();
    }
}