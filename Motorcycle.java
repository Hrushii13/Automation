package Automobile;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Motorcycle {
	public static void main(String[]args) throws InterruptedException ,IOException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://sampleapp.tricentis.com/101/index.php");
		  
		  driver.findElement(By.partialLinkText("Motorcycle")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[1]/select/option[7]")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[2]/select/option[5]")).click();
		  
		  WebElement cmm =driver.findElement(By.id("cylindercapacity"));
		  cmm.sendKeys("500");
		  
		  WebElement kw =driver.findElement(By.id("engineperformance"));
		  kw.sendKeys("500");

		  WebElement date =driver.findElement(By.id("dateofmanufacture"));
		  date.sendKeys("03/27/2001");
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[1]/div[6]/select/option[3]")).click();
		  
		  WebElement price =driver.findElement(By.id("listprice"));
		  price.sendKeys("90000");
		  
		  WebElement mi =driver.findElement(By.id("annualmileage"));
		  mi.sendKeys("90000");
		  
		  driver.findElement(By.id("nextenterinsurantdata")).click();
		  
		  WebElement fname =driver.findElement(By.id("firstname"));
		  fname.sendKeys("Hrushikesh");
		  
		  WebElement lname =driver.findElement(By.id("lastname"));
		  lname.sendKeys("Sawant");
		  
		  WebElement bdate =driver.findElement(By.id("birthdate"));
		  bdate.sendKeys("10/13/2003");
		  
           driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
		  
		  WebElement add =driver.findElement(By.id("streetaddress"));
		  add.sendKeys("Nanded Goan");
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[6]/select/option[103]")).click();
		  
		  WebElement zip =driver.findElement(By.id("zipcode"));
		  zip.sendKeys("411041");
		  
		  WebElement city =driver.findElement(By.id("city"));
		  city.sendKeys("Pune");
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[9]/select/option[6]")).click();
		  
          driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span")).click();
		  
		  driver.findElement(By.id("nextenterproductdata")).click();
		  
		  WebElement sdate=driver.findElement(By.id("startdate"));
		  sdate.sendKeys("2/28/2026");
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[2]/select/option[8]")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[3]/select/option[4]")).click();
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[4]/p/label[2]/span")).click();
		  
		  driver.findElement(By.id("nextselectpriceoption")).click();
		  
		  String expectedPrice = "2,429.00";
	      String expectedOnlineClaim = "Submit";
	      String expectedDiscount = "2";
	      String expectedCover = "Limited";

	      String actualPrice = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[1]/td[3]/span")).getText();
	      String actualOnlineClaim = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[2]/td[3]")).getText();
	      String actualDiscount = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[3]/td[3]")).getText();
	      String actualCover = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tbody/tr[4]/td[3]")).getText();

	      if (actualPrice.equals(expectedPrice) &&
	          actualOnlineClaim.equals(expectedOnlineClaim) &&
	          actualDiscount.equals(expectedDiscount) &&
	          actualCover.equals(expectedCover)) {
	          
	          System.out.println("All values match! Clicking the radio button.");

	          WebElement radioButton = driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[4]/section/div[1]/table/tfoot/tr/th[2]/label[2]/span"));
	          radioButton.click();
	      } else {
	          System.out.println("Values do not match. No action taken.");
	      }
		  
	      driver.findElement(By.id("nextsendquote")).click();
	      
 Thread.sleep(2000);
		  
		  WebElement mail=driver.findElement(By.id("email"));
		  mail.sendKeys("hrushikeshsawant5426@gmail.com");
		  
		  WebElement number=driver.findElement(By.id("phone"));
		  number.sendKeys("8766854168");
		  
		  WebElement uname=driver.findElement(By.id("username"));
		  uname.sendKeys("hrushi");
		  
		  WebElement pass=driver.findElement(By.id("password"));
		  pass.sendKeys("Hrushi13");
		  
		  WebElement cpass=driver.findElement(By.id("confirmpassword"));
		  cpass.sendKeys("Hrushi13");
		  
		  driver.findElement(By.id("sendemail")).click();
		  
		
		  
		  Thread.sleep(10000);
		  File File1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		   FileUtils.copyFile(File1, new File("D:\\Project\\lib\\Screenshot.jpeg"));
		   
		   driver.findElement(By.className("confirm")) .click();
		  

		   driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a/span/i"))
		   .click();
	
		  
	
	}

}
