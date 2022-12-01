package Gün11;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // "frame1"

        WebElement input=driver.findElement(By.cssSelector("[id='topic']~input"));
        input.sendKeys("MaLaga");

        driver.switchTo().parentFrame(); // -> Geldiği yere geri dön(Yani 1 basamak geri git)
        driver.switchTo().defaultContent();// -> İlk ana sayfaya direk geri dön


            BekleKapat();

    }
}
