package Gün11;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _04_Soru extends BaseStaticDriver {
    /*
    Senaryo
    1- https://testsheepnz.github.io/BasicCalculator.html sitesine gidiniz.
    2- random 100 e kadar 2 sayı üretiniz.
    3- Sayıları hesap makinesinin bütün fonksiyonları için çalıştırınız.
    4- Sonuçları Assert ile kontrol ediniz.
    5- Yukarıdaki işlemi 5 kez tekrar ettiriniz.
    */
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        Bekle(1);
        for (int i = 0; i < 5; i++) {

            WebElement input1 = driver.findElement(By.id("number1Field"));
            input1.sendKeys(Integer.toString(rndcreate()));

            WebElement input2 = driver.findElement(By.id("number2Field"));
            input2.sendKeys(Integer.toString(rndcreate()));

            for (int j = 0; j < 5; j++) {
                Bekle(1);
                WebElement selectdropdown = driver.findElement(By.id("selectOperationDropdown"));
                Select ss = new Select(selectdropdown);
                ss.selectByValue(String.valueOf(j));

                WebElement calculatebtn = driver.findElement(By.id("calculateButton"));
                calculatebtn.click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
                WebElement Dogrulama=driver.findElement(By.cssSelector("[id='numberAnswerField']"));
                Assert.assertNotNull(Dogrulama);

            }
            
            input1.clear();
            input2.clear();

        }
    }

    public static int rndcreate() {
        int random= (int) ((Math.random() * 100));
        return random;
    }


}
