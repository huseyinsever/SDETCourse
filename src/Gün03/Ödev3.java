package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com");
        Bekle(2);
        WebElement element=driver.findElement(By.id("inputValEnter"));
        element.sendKeys("teddy bear");
        Bekle(2);
        WebElement button=driver.findElement(By.className("searchTextSpan"));
        button.click();
        Bekle(2);
        WebElement yazı=driver.findElement(By.className("nnn"));
        if (yazı.getText().contains("We've got 294 results for 'teddy bear'"))
            System.out.println("Mesaj Doğrulandi");
        else
            System.out.println("Hata VErdi");

        BekleKapat();











    }
}
