package Gün05;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Ödev2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        Bekle(2);
        WebElement element=driver.findElement(By.xpath("//*[@onkeypress='clickGo(event, this)']"));
        element.sendKeys("teddy bear");
        Bekle(2);
        WebElement element2=driver.findElement(By.xpath("//*[@class='searchTextSpan']"));
        element2.click();
        Bekle(2);
        WebElement textdogrula=driver.findElement(By.xpath("//span[@style='color: #212121; font-weight: normal'] "));
        if (textdogrula.getText().contains("We've got 294 results for 'teddy bear'"))
            System.out.println("Test Dogru");
        else
            System.out.println("Test Yanlis");


        BekleKapat();
    }
}
