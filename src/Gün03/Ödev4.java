package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev4 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);
        WebElement  element=driver.findElement(By.id("calculatetest"));
        element.click();
        Bekle(2);
        WebElement element2=driver.findElement(By.id("number1"));
        element2.sendKeys("12345");
        Bekle(2);
        WebElement element3=driver.findElement(By.id("number2"));
        element3.sendKeys("1357");
        Bekle(2);
        WebElement button=driver.findElement(By.id("calculate"));
        button.click();
        Bekle(2);
        WebElement yazdir=driver.findElement(By.id("answer"));
        System.out.println( "sonuc = " +yazdir.getText());


        BekleKapat();






    }
}
