package Gün06;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;

public class _05_ActionClickTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/buttons");

        WebElement element=driver.findElement(By.xpath("//button[text()='Click Me']"));
        Bekle(2);

        Actions aksiyonlar=new Actions(driver);
        System.out.println("Aksiyon öncesi Aksiyonlar sınıfı oluşturuldu");
        Bekle(2);
        Action aksiyon=aksiyonlar.moveToElement(element).click().build(); // elementin üzerine git CLİCK İ hazırla
        System.out.println("Aksiyon hazirlandi");

        Bekle(2);
        aksiyon.perform(); // aksiyonu gerçekleştir
        System.out.println("Aksiyon gerçekleşti");

        // aksiyonlar.moveToElement(element).click().build().perform(); kısa hali
        BekleKapat();





    }
}
