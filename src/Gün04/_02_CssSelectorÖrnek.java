package Gün04;

import Utilis.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_CssSelectorÖrnek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");

        Bekle(2);
        WebElement element=driver.findElement(By.cssSelector("[placeholder='Full Name'] "));
        element.sendKeys("Automation");
        Bekle(2);
        WebElement element2=driver.findElement(By.cssSelector("[placeholder='name@example.com'][type='email'][autocomplete='off']"));
        element2.sendKeys("Testing@gmail.com");
        Bekle(2);
        WebElement element3=driver.findElement(By.cssSelector("[rows='5'][cols='20'][placeholder='Current Address']"));
        element3.sendKeys("Testing Current Address");
        Bekle(2);
        WebElement element5=driver.findElement(By.cssSelector("[id='permanentAddress-wrapper'] [rows='5'][cols='20'] "));
        element5.sendKeys("Testing Permanent Address");
        Bekle(2);
        WebElement element6=driver.findElement(By.cssSelector("[class='mt-2 justify-content-end row'] [type='button'][class='btn btn-primary'] "));
        element6.click();

        WebElement msg1=driver.findElement(By.cssSelector("[class='border col-md-12 col-sm-12'] >:nth-child(1)"));
        if (msg1.getText().contains("Automation"))
            System.out.println("Doğrulandi");
        else
            System.out.println("Error Failed");

        WebElement msg2=driver.findElement(By.cssSelector("[class='border col-md-12 col-sm-12'] >:nth-child(2)"));
        if (msg2.getText().contains("Testing@gmail.com"))
            System.out.println("Doğrudur");

        else
            System.out.println("Hata Verdi");

        BekleKapat();



    }
}
