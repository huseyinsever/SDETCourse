package Gün06;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Ödev2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html");

        Bekle(2);


        List<WebElement> ogrenciler = driver.findElements(By.cssSelector("[id^='node']"));
        List<WebElement> siniflar = driver.findElements(By.cssSelector("[id^='box']"));

        Actions actions = new Actions(driver);

        for (WebElement ogrenci : ogrenciler) {
            for (WebElement sinif : siniflar) {

                Action action = actions.clickAndHold(ogrenci).build();
                action.perform();

                Bekle(1);

                action = actions.moveToElement(sinif).release().build();
                action.perform();

            }
        }
        BekleKapat();
    }
}