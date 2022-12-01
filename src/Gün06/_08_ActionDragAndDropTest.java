package Gün06;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDragAndDropTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        WebElement oslo=driver.findElement(By.id("box1"));
        WebElement norway=driver.findElement(By.id("box101"));
        // 1.Yöntem
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(oslo,norway).build();
        aksiyon.perform();


        Bekle(2);
        // 2.Yöntem
        WebElement seul=driver.findElement(By.id("box5"));
        WebElement kore=driver.findElement(By.id("box105"));
        aksiyon=aksiyonlar.clickAndHold(seul).moveToElement(kore).release().build();
        aksiyon.perform();


        BekleKapat();


    }
}
