package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _07_SendText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        Bekle(2);
        WebElement element = driver.findElement(By.partialLinkText("No, thanks!"));
        element.click();
        Bekle(2);

        WebElement txtBox = driver.findElement(By.id("user-message"));
        txtBox.sendKeys("merhaba selenium");
        Bekle(2);

        WebElement btn = driver.findElement(By.className("btn-default"));
        btn.click();
        Bekle(3);
        WebElement msg = driver.findElement(By.id("display"));

            if (msg.getText().contains("merhaba selenium"))
            System.out.println("test passed");
            else
             System.out.println("test failed");


        BekleKapat();

        }

    }
