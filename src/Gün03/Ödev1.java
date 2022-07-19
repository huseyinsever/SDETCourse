package Gün03;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class Ödev1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");

        WebElement box1=driver.findElement(By.id("userName"));
        box1.sendKeys("Automation");

        WebElement box2=driver.findElement(By.id("userEmail"));
        box2.sendKeys("Testing@gmail.com");

        WebElement box3=driver.findElement(By.id("currentAddress"));
        box3.sendKeys("Testing Current Address");

        WebElement box4=driver.findElement(By.id("permanentAddress"));
        box4.sendKeys("Testing Permanent Address");

        WebElement button=driver.findElement(By.className("btn-primary"));
        button.click();

        WebElement msg=driver.findElement(By.id("name"));
        if (msg.getText().contains("Automation"))
            System.out.println("Test Mission Complated");

        else
            System.out.println("Test Failed");

        WebElement msg1=driver.findElement(By.id("email"));
        if (msg1.getText().contains("Testing@gmail.com"))
            System.out.println("Test 2 Mission Complate");

        else
            System.out.println("Test 2 Failed");

        BekleKapat();


    }
}
