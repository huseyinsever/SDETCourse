package Gün04;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");

        WebElement element=driver.findElement(By.cssSelector("[id='calculatetest'][href='calculator']"));
        element.click();
        Bekle(2);
        WebElement element2=driver.findElement(By.cssSelector("[action='calculator']>:nth-child(1) [type='text'][id='number1'][name='number1']"));
        element2.sendKeys("12");
        Bekle(2);
        WebElement element3=driver.findElement(By.cssSelector("[action='calculator']>:nth-child(1) [type='text'][id='number2'][name='number2']"));
        element3.sendKeys("10");
        Bekle(2);
        WebElement button=driver.findElement(By.cssSelector("[type='submit'][value='Calculate'][class='styled-click-button']"));
        button.click();
        Bekle(2);
        WebElement sonuc=driver.findElement(By.cssSelector("[id='answer']"));
        System.out.println(sonuc.getText());


        BekleKapat();

    }
}
