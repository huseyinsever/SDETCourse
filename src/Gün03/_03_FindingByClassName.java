package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _03_FindingByClassName extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://form.jotform.com/221934510376353");
        WebElement eleman= driver.findElement(By.className("form-submit-button"));
        System.out.println(eleman.getText());
        // form-submit-button

        WebElement eleman2= driver.findElement(By.className("form-sub-label"));
        System.out.println(eleman2.getText()); //-> FindElement birden fazla eleman varsa ilkini getirir.
        // form-sub-label

        List <WebElement> Liste= driver.findElements(By.className("form-sub-label"));
        for (WebElement e :Liste)
            System.out.println(e.getText());




        BekleKapat();

    }
}
