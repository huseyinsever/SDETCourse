package Gün11;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _02_IFramelerGeçis extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // frame1

        WebElement input=driver.findElement(By.cssSelector("b[id='topic'] ~ input"));
        input.sendKeys("Türkiye");

        driver.switchTo().defaultContent(); // ilk ana sayfaya direk geri dön

        driver.switchTo().frame(1); // frame2
        WebElement avatar=driver.findElement(By.id("animals"));
        Select menü=new Select(avatar);
        menü.selectByIndex(3); // Son elemanı sectik




        BekleKapat();

    }
     // frame 0
     //       >subframe 0
     //       >subframe 1 ------> framelerin mantığı
     // frame 1
}
