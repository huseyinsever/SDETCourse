package Gün06;

import Mentoring4.Select;
import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_isDisplayed extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");

        WebElement createnewAccount=driver.findElement(By.cssSelector("[class^='_42ft _4jy0 _6lti _4jy6 _4jy2 selected _51sy']"));
        createnewAccount.click();
        Bekle(2);
        WebElement pencere=driver.findElement(By.name("firstname"));
        pencere.sendKeys("hüseyin");
        Bekle(2);
        WebElement pencere2=driver.findElement(By.name("lastname"));
        pencere2.sendKeys("sever");
        Bekle(2);
        WebElement remail=driver.findElement(By.name("reg_email_confirmation__"));
        Assert.assertFalse(remail.isDisplayed());

        WebElement email=driver.findElement(By.name("reg_email__"));
        email.sendKeys("huseyinsever514@gmail.com");

        Assert.assertTrue(remail.isDisplayed());


        BekleKapat();



    }
}
