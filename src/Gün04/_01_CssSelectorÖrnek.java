package Gün04;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorÖrnek  extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://formsmarts.com/form/yu?mode=h5");

        Bekle(2);
        WebElement element=driver.findElement(By.cssSelector("[id='u_1fG_4586_0']"));
        element.click();
        Bekle(2);
        WebElement element2=driver.findElement(By.cssSelector("[id='u_1fG_4588']"));
        element2.click();
        Bekle(2);
        WebElement element3=driver.findElement(By.cssSelector("[value='Online Advertising']"));
        element3.click();
        Bekle(2);
        WebElement element4=driver.findElement(By.cssSelector("[id^='u_1fG_89585_0']"));
        element4.click();
        Bekle(2);
        WebElement element5=driver.findElement(By.cssSelector("[id^='u_1fG_4589_0']"));
        element5.click();
        Bekle(2);
        WebElement element6=driver.findElement(By.cssSelector("[id^='u_1fG_4597']"));
        element6.click();
        Bekle(2);
        WebElement element7=driver.findElement(By.cssSelector("[id='u_1fG_4597'] > :nth-child(4)"));
        element7.click();


        BekleKapat();





    }
    // button[onclick='showInput();'][class='btn btn-default']

    // İd için
    // By.id("get-input");
    // Css Selector
    // By.cssSelector(" [id='get-input'] ");
    // By.cssSelector("#get-input");
}
