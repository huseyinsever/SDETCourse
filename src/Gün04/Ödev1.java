package Gün04;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");
        Bekle(2);
        WebElement element=driver.findElement(By.cssSelector("[class='form-group'] [placeholder='Enter your username']"));
        element.sendKeys("ttechno@gmail.com");
        Bekle(2);
        WebElement element2=driver.findElement(By.cssSelector("[class='form-group'] [placeholder='Enter your password']"));
        element2.sendKeys("techno123.");
        Bekle(2);
        WebElement button=driver.findElement(By.cssSelector("[class='buttons-w'] >:nth-child(1)"));
        button.click();
        Bekle(2);
        WebElement msg=driver.findElement(By.cssSelector("[class='content-w'] [style='text-align: center;font-size: x-large;color:red'] "));
        if (msg.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("Mesaj Dogrulandi");
        else
            System.out.println("Hata");

        BekleKapat();

    }
}
