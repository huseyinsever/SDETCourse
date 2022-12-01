package Gün10;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class _03_FillingForeTask extends BaseStaticDriver {
    /*
        Bu siteye gidiniz.  http://demo.seleniumeasy.com/ajax-form-submit-demo.html
        Name giriniz.
        Comment giriniz.
        Submit'e tıklayınız.
        Form submited Successfully! yazısı görüntülenmelidir.
        assert ile kontrol ediniz
 */
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/ajax-form-submit-demo.html");
        Bekle(2);
        WebElement ad=driver.findElement(By.cssSelector("[id='title']"));
        ad.sendKeys("hüseyin");

        WebElement comment=driver.findElement(By.cssSelector("[id='description']"));
        comment.sendKeys("Bir Yazi Giriniz");

        WebElement submit=driver.findElement(By.cssSelector("[id='btn-submit']"));
        submit.click();


        wait.until(ExpectedConditions.textToBe(By.cssSelector("[id='submit-control']"),"Form submited Successfully!"));
        WebElement Form= driver.findElement(By.cssSelector("[id='submit-control']"));
        Assert.assertTrue(Form.getText().contains("Form submited Successfully!"));


        BekleKapat();


    }
}
