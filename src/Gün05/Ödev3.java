package Gün05;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);
        WebElement element=driver.findElement(By.cssSelector("[id='calculatetest']"));
        element.click();
        Bekle(2);
        WebElement element2=driver.findElement(By.xpath("//*[@id='number1']"));
        element2.sendKeys("123");
        Bekle(2);
        WebElement element3=driver.findElement(By.xpath("//*[@id='number2']"));
        element3.sendKeys("10");
        Bekle(2);
        WebElement button=driver.findElement(By.xpath("//*[@class='styled-click-button']"));
        button.click();
        Bekle(2);
        WebElement txtDoğrumu=driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("sonuc = " + txtDoğrumu.getText());
        Assert.assertTrue(txtDoğrumu.getText().contains("133"));

        BekleKapat();
    }
}
