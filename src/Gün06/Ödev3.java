package Gün06;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class Ödev3 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-nodes-quiz/drag-drop-nodes-quiz.html");

        Bekle(2);

        List<WebElement> sehirler = driver.findElements(By.xpath("//ul[@id='allItems']//li"));
        List<WebElement> ulkeler = driver.findElements(By.xpath("//div[@id='dhtmlgoodies_mainContainer']//div/ul"));

        Actions actions = new Actions(driver);

        for (WebElement sehir:sehirler) {
            for (WebElement ulke: ulkeler) {

                Action action = actions.clickAndHold(sehir).build();
                action.perform();

                Bekle(1);

                action = actions.moveToElement(ulke).release().build();
                action.perform();

                if (sehir.getAttribute("class").equals("correctAnswer")){
                    break;

                }
            }   System.out.println(sehir.getAttribute("class"));
        }

        BekleKapat();







    }
}