import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class testOtomasyon {

    @Test
    public void caseOne (){
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.gittigidiyor.com/");

        String element="GittiGidiyor";
        String mesaj=driver.findElement(By.cssSelector("#main-header > div:nth-child(3) > div > div > div > div.sc-1nx8ums-0.eyEjsD > div > div > a > div > img")).getText();
        Assert.assertEquals(mesaj,element,"Basarili");

        driver.findElement(By.id("header-search-input")).sendKeys("Bilgisayar");
         //Scroll işlemi olacak
        driver.findElement(By.name("<a href=\"/arama/?k=bilgisayar&amp;sf=2\">2</a>")).click();
        driver.findElement(By.cssSelector("#item-info-block-659492135 > div > div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.pl0.pr0.product-info-details > div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.product-title-info > h3")).click();
        driver.findElement(By.id("add-to-basket")).click();
        driver.findElement(By.className("header-cart-hidden-link")).click();

        String fiyat="2.749,00 TL";
        String fiyatelement=driver.findElement(By.cssSelector("#cart-price-container > div.new-price-box > p")).getText();
        Assert.assertEquals(fiyat,fiyatelement,"Basarili");

        driver.findElement(By.className("amount")).click();
        driver.findElement(By.className("#cart-item-465563976 > div.gg-w-24.gg-d-24.gg-t-24.gg-m-24.padding-none.product-item-box-container > div.gg-w-3.gg-d-3.gg-t-4.gg-m-16.pull-right-m.hidden-m.padding-none > div > div.gg-input.gg-input-select > select > option:nth-child(2)")).click();
        driver.findElement(By.className("btn-delete btn-update-item hidden-m")).click();

        String urunsayisi="5.498,00 TL";
        String urunsayisielement=driver.findElement(By.cssSelector("#cart-price-container > div.new-price-box > p")).getText();
        Assert.assertEquals(urunsayisi,urunsayisielement,"Basarili");

        String sepetibos= "Sepetinizde ürün bulunmamaktadır.";
        String sepetiboselement=driver.findElement(By.cssSelector("#empty-cart-container > div.gg-w-15.gg-d-14.gg-t-14.gg-m-24 > div:nth-child(1) > div > div.gg-d-19.gg-w-21.gg-t-19.gg-m-18 > h2")).getText();
        Assert.assertEquals(sepetibos,sepetiboselement,"Basarili");

    }







}

