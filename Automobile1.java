package Automobile;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Automobile1 {



	public static void main(String[]args) throws InterruptedException ,IOException {
		  WebDriver driver = new ChromeDriver();
		  driver.manage().window().maximize();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		  driver.get("https://sampleapp.tricentis.com/101/index.php");
		  
		  driver.findElement(By.partialLinkText("Automobile")).click();
		  
		   WebElement f= driver.findElement(By.id("make"));
		  Select mk =new Select(f);
		  List<WebElement> sc =mk.getOptions();
		  for(WebElement ele:sc)sc.get(2).click();
		  
		  WebElement kw =driver.findElement(By.id("engineperformance"));
		  kw.sendKeys("1500");
		  
		  WebElement date =driver.findElement(By.id("dateofmanufacture"));
		  date.sendKeys("03/27/2002");
		  
		  WebElement nos= driver.findElement(By.id("numberofseats"));
		  Select Seat =new Select(nos);
		  List<WebElement> nos1 =Seat.getOptions();
		  for(WebElement ele:nos1)nos1.get(2).click();
		  
		  WebElement fule1= driver.findElement(By.id("fuel"));
		  Select ft =new Select(fule1);
		  List<WebElement> ft1 =ft.getOptions();
		  for(WebElement ele:ft1)ft1.get(2).click();
		 
		  WebElement price=driver.findElement(By.id("listprice"));
		  price.sendKeys("50000");
		  
		  WebElement plateno=driver.findElement(By.id("licenseplatenumber"));
		  plateno.sendKeys("MH12XM1658");
		  
		  WebElement mileage =driver.findElement(By.id("annualmileage"));
		  mileage.sendKeys("500");
		  
		  driver.findElement(By.id("nextenterinsurantdata")).click();
		  
		  // Enter Insurant data
		  
		  WebElement fname =driver.findElement(By.id("firstname"));
		  fname.sendKeys("Hrushikesh");
		  
		  WebElement lname =driver.findElement(By.id("lastname"));
		  lname.sendKeys("Sawant");
		  
		  WebElement bdate =driver.findElement(By.id("birthdate"));
		  bdate.sendKeys("10/13/2003");
		  
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[4]/p/label[1]/span")).click();
		  
		  WebElement add =driver.findElement(By.id("streetaddress"));
		  add.sendKeys("Nanded Goan");
		  
		  WebElement country1= driver.findElement(By.id("country"));
		  Select c =new Select(country1);
		  List<WebElement> c1 =c.getOptions();
		  for(WebElement ele:c1)c1.get(102).click();
		
		  WebElement zip =driver.findElement(By.id("zipcode"));
		  zip.sendKeys("411041");
		  
		  WebElement city =driver.findElement(By.id("city"));
		  city.sendKeys("Pune");
		
		  WebElement occupation1= driver.findElement(By.id("occupation"));
		  Select o =new Select(occupation1);
		  List<WebElement> occ1 =o.getOptions();
		  for(WebElement ele:occ1)occ1.get(1).click();
		
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[2]/div[10]/p/label[1]/span")).click();
		  
		  driver.findElement(By.id("nextenterproductdata")).click();
		  
		  //Enter Product Data
		  
		  WebElement sdate=driver.findElement(By.id("startdate"));
		  sdate.sendKeys("2/28/2026");
		 
		  WebElement insurance1= driver.findElement(By.id("insurancesum"));
		  Select i =new Select(insurance1);
		  List<WebElement> i1 =i.getOptions();
		  for(WebElement ele:i1)i1.get(2).click();
		  
		  WebElement merit1= driver.findElement(By.id("meritrating"));
		  Select m =new Select(merit1);
		  List<WebElement> m1 =m.getOptions();
		  for(WebElement ele:m1)m1.get(8).click();
		  
		  WebElement damage1= driver.findElement(By.id("damageinsurance"));
		  Select d =new Select(damage1);
		  List<WebElement> d1 =d.getOptions();
		  for(WebElement ele:d1)d1.get(3).click();
		 
		  driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/form/div/section[3]/div[5]/p/label[2]/span")).click();
		 
		  WebElement car1= driver.findElement(By.id("courtesycar"));
		  Select ca =new Select(car1);
		  List<WebElement> ca1 =ca.getOptions();
		  for(WebElement ele:ca1)ca1.get(2).click();
		 
		  driver.findElement(By.id("nextselectpriceoption")).click();
		  
		  //Select price Option
		  
		
		  String expectedPrice = "847.00";
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
	      
	     
	     //   driver.findElement(By.id("viewquote")).click();

		  
		  
		  driver.findElement(By.id("nextsendquote")).click();
		  
		  //Send Quote
		  
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
		   FileUtils.copyFile(File1, new File("D:\\Project\\lib\\Screenshot.gif"));
		   
		   driver.findElement(By.className("confirm")) .click();
		  

		   driver.findElement(By.xpath("html/body/div[1]/div/div[1]/div/div/form/div/section[5]/section/div[8]/div/div[1]/div/div[1]/a/span/i"))
		   .click();
	
		  
		
		  
		  
			
		  
	  }
	}


