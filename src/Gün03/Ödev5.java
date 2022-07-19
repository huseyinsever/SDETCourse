package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev5 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);
        WebElement button=driver.findElement(By.id("fakealerttest"));
        button.click();
        Bekle(2);
        WebElement button2=driver.findElement(By.id("fakealert"));
        button2.click();
        Bekle(2);
        WebElement button3=driver.findElement(By.id("dialog-ok"));
        button3.click();

        BekleKapat();











    }
}
