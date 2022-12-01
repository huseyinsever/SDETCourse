package Gün06;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class Ödev1 extends BaseStaticDriver {

    public static void main(String[] args) {
        driver.get("http://dhtmlgoodies.com/scripts/drag-drop-quiz/drag-drop-quiz-d2.html");
        Bekle(2);

        List <WebElement> ulkeler=driver.findElements(By.xpath("//*[@id='questionDiv']//div[@class='destinationBox']"));
        List <WebElement> sehirler=driver.findElements(By.xpath("//*[@id='answerDiv']//div"));

        Actions Aksiyonlar=new Actions(driver);

        for (WebElement sehir:sehirler) {
            for (WebElement ulke:ulkeler) {

                Action aksiyon = Aksiyonlar.clickAndHold(sehir).build();
                aksiyon.perform();
                Bekle(1);

                aksiyon = Aksiyonlar.moveToElement(ulke).release().build();
                aksiyon.perform();

                if (sehir.getCssValue("background-color").contains("rgba(0, 128, 0, 1)"))
                    break;

            }
        }
        Bekle(2);
        BekleKapat();
    }
}

