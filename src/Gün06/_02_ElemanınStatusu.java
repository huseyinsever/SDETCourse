package Gün06;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElemanınStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");

        WebElement salı=driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));

        System.out.println(salı.isDisplayed());// Görünüyormu
        System.out.println(salı.isEnabled()); // aktif mi
        System.out.println(salı.isSelected()); // seçili mi
        Bekle(2);

        salı.click();
        Bekle(2);
        System.out.println(salı.isSelected());

        BekleKapat();


    }
}
