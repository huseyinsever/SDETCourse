package Gün05;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_XPath extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameInput=driver.findElement(By.xpath("//input[@id='user-name2']"));
        usernameInput.sendKeys("standart_user");

        WebElement passwordInput=driver.findElement(By.xpath("//input[@id='password']"));
        passwordInput.sendKeys("secret-sauce");

        WebElement login=driver.findElement(By.xpath("//*[@class='submit-button btn_action']"));
        login.click();


        BekleKapat();







    }
}
