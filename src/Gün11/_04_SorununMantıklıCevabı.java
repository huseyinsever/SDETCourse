package Gün11;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

public class _04_SorununMantıklıCevabı extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testsheepnz.github.io/BasicCalculator.html");
        for (int i = 0; i < 5; i++) {

            WebElement input1 = driver.findElement(By.id("number1Field"));
            input1.sendKeys(String.valueOf(rndcreate()));

            WebElement input2 = driver.findElement(By.id("number2Field"));
            input2.sendKeys(String.valueOf(rndcreate()));

            for (int j = 0; j < 5; j++) {
                Bekle(1);
                WebElement selectdropdown = driver.findElement(By.id("selectOperationDropdown"));
                Select ss = new Select(selectdropdown);
                ss.selectByValue(String.valueOf(j));

                WebElement calculatebtn = driver.findElement(By.id("calculateButton"));
                calculatebtn.click();

                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[id='numberAnswerField']")));
                WebElement Dogrulama=driver.findElement(By.cssSelector("[id='numberAnswerField']"));

                System.out.println(ss.getFirstSelectedOption().getText() + " /" + Dogrulama.getAttribute("value"));

                switch (j) {
                    case 0:
                        Assert.assertTrue(Integer.parseInt(input1.getAttribute("value")) + Integer.parseInt(input2.getAttribute("value")) == Integer.parseInt(Dogrulama.getAttribute("value")));
                        break;
                    case 1:
                        Assert.assertTrue(Integer.parseInt(input1.getAttribute("value")) - Integer.parseInt(input2.getAttribute("value")) == Integer.parseInt(Dogrulama.getAttribute("value")));
                        break;
                    case 2:
                        Assert.assertTrue(Integer.parseInt(input1.getAttribute("value")) * Integer.parseInt(input2.getAttribute("value")) == Integer.parseInt(Dogrulama.getAttribute("value")));
                        break;
                    case 3:
                        Assert.assertTrue(Double.parseDouble(input1.getAttribute("value")) / Double.parseDouble(input2.getAttribute("value")) == Double.parseDouble(Dogrulama.getAttribute("value")));
                        break;
                    case 4:
                        Assert.assertTrue((input1.getAttribute("value") + input2.getAttribute("value")).contains(Dogrulama.getAttribute("value")) );
                        break;
                }
            }

            input1.clear();
            input2.clear();
        }
        BekleKapat();
    }
    public static int rndcreate() {
        return (int) ((Math.random() * 100) + 1);







    }
}
