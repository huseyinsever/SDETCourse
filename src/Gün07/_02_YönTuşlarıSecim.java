package Gün07;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _02_YönTuşlarıSecim extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demoqa.com/auto-complete");
        Bekle(2);
        WebElement box=driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);

        Action aksiyon=aksiyonlar
                .moveToElement(box)
                .click()
                .sendKeys("g")
                .build();
        aksiyon.perform();

        Bekle(2);
        aksiyon=aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        aksiyon.perform();

        BekleKapat();




    }
}
