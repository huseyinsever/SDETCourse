package Proje2;

import Utilis.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Proje2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement email=driver.findElement(By.id("session_email"));
        email.sendKeys("technostudygroup23@hotmail.com");
        Bekle(1);
        WebElement password=driver.findElement(By.id("session_password"));
        password.sendKeys("group23");

        Bekle(1);
        WebElement signin=driver.findElement(By.name("commit"));
        signin.click();

        WebElement adress= driver.findElement(By.xpath("//*[@href='/addresses']"));
        Bekle(1);
        adress.click();


        Bekle(1);
        WebElement newAdress= driver.findElement(By.xpath("//*[text()='New Address']"));
        newAdress.click();

        Bekle(1);
        WebElement firstname=driver.findElement(By.id("address_first_name"));
        firstname.sendKeys("Fernando");

        Bekle(1);
        WebElement lastname=driver.findElement(By.id("address_last_name"));
        lastname.sendKeys("Torres");

        Bekle(1);
        WebElement adres1=driver.findElement(By.id("address_street_address"));
        adres1.sendKeys("Anfield Rd");

        Bekle(1);
        WebElement adres2=driver.findElement(By.id("address_secondary_address"));
        adres2.sendKeys("Anfield");

        Bekle(1);
        WebElement city=driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");

        Bekle(1);
        WebElement state=driver.findElement(By.id("address_state"));
        state.click();


        Select menu=new Select(state);
        List<WebElement> values=driver.findElements(By.cssSelector("[id=\"address_state\"]>option"));
        int random= (int)(Math.random()*(values.size()));
        WebElement selectx=values.get(random);
        menu.selectByValue(selectx.getAttribute("value"));


        Bekle(1);
        WebElement zip=driver.findElement(By.id("address_zip_code"));
        zip.sendKeys("L4 0TH");

        WebElement unitedstate=driver.findElement(By.xpath("//div//input[@id='address_country_us']"));
        Bekle(1);
        unitedstate.click();



        Bekle(1);
        WebElement Birtday=driver.findElement(By.id("address_birthday"));
        LocalDate tarih= LocalDate.now();
        DateTimeFormatter ozelFormat= DateTimeFormatter.ofPattern("dd/MM/yyyy");
        Birtday.sendKeys(tarih.format(ozelFormat));


        Bekle(1);
        WebElement age=driver.findElement(By.id("address_age"));
        age.sendKeys("36");

        Bekle(1);
        WebElement website=driver.findElement(By.id("address_website"));
        website.sendKeys("https://www.google.com/");

        Bekle(1);
        WebElement phone=driver.findElement(By.id("address_phone"));
        phone.sendKeys("8625747878");


        Bekle(1);
        WebElement climb=driver.findElement(By.id("address_interest_climb"));
        climb.click();

        Bekle(1);
        WebElement dance=driver.findElement(By.id("address_interest_dance"));
        dance.click();

        Bekle(1);
        WebElement note=driver.findElement(By.id("address_note"));
        note.sendKeys("Never Back Down");

        WebElement create=driver.findElement(By.xpath("//*[@data-disable-with='Create Address']"));
        create.click();
        Bekle(1);

        Bekle(1);
        WebElement verifyName=driver.findElement(By.cssSelector("[data-test='first_name']"));
        Assert.assertTrue(verifyName.getText().contains("Fernando"));

        Bekle(1);
        WebElement verifySurname=driver.findElement(By.cssSelector("[data-test='last_name']"));
        Assert.assertTrue(verifySurname.getText().contains("Torres"));

        Bekle(1);
        WebElement adressagain= driver.findElement(By.xpath("//*[@href='/addresses']"));
        adressagain.click();

        Bekle(1);
        WebElement edit=driver.findElement(By.cssSelector("[data-test^='edit']"));
        edit.click();

        Bekle(2);
        WebElement editfirstname=driver.findElement(By.id("address_first_name"));
        editfirstname.clear();
        editfirstname.sendKeys("Peter");


        Bekle(2);
        WebElement editlastname=driver.findElement(By.id("address_last_name"));
        editlastname.clear();
        editlastname.sendKeys("Crouch");


        Bekle(1);
        WebElement update=driver.findElement(By.name("commit"));
        update.click();

        Bekle(1);
        WebElement verifyName2=driver.findElement(By.cssSelector("[data-test='first_name']"));
        Assert.assertTrue(verifyName2.getText().contains("Peter"));

        Bekle(1);
        WebElement verifySurname2=driver.findElement(By.cssSelector("[data-test='last_name']"));
        Assert.assertTrue(verifySurname2.getText().contains("Crouch"));

        Bekle(1);
        WebElement adressagain2= driver.findElement(By.xpath("//*[@href='/addresses']"));
        adressagain2.click();

        Bekle(1);
        WebElement destroy=driver.findElement(By.cssSelector("[data-test^='destroy']"));
        destroy.click();

        Bekle(1);
        driver.switchTo().alert().accept();

        driver.quit();

        BekleKapat();


    }
}
