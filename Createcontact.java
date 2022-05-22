package week2.Assignments.Leads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Createcontact {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver cj = new ChromeDriver();
//launch url
cj.get("http://leaftaps.com/opentaps/control/main");
cj.manage().window().maximize();
cj.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
//enter userName
  cj.findElement(By.id("username")).sendKeys("demosalesmanager");
//enter password
  cj.findElement(By.id("password")).sendKeys("crmsfa");
//click login button
  cj.findElement(By.className("decorativeSubmit")).click();
//click crmsfa
  cj.findElement(By.linkText("CRM/SFA")).click();
//click on contact button
  cj.findElement(By.linkText("Contacts")).click();
//click create contact
  cj.findElement(By.linkText("Create Contact")).click();
//enter first Name
  cj.findElement(By.id("firstNameField")).sendKeys("sm");
//enter lastName
  cj.findElement(By.id("lastNameField")).sendKeys("cj");
//enter local(firstName)
  cj.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("jai");
//enter local(lastName) 
  cj.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("cj");
//enter department
  cj.findElement(By.id("createContactForm_departmentName")).sendKeys("Automation");
//enter description
  cj.findElement(By.id("createContactForm_description")).sendKeys("Hello");
//enter email Address
  cj.findElement(By.id("createContactForm_primaryEmail")).sendKeys("jaicj@gmail.com");
//select state/province
  WebElement dropdown1 =cj.findElement(By.name("generalStateProvinceGeoId"));
  Select dd1=new Select(dropdown1);
  dd1.selectByValue("NY");
//click on create contact
  cj.findElement(By.name("submitButton")).click();
//click edit button
  cj.findElement(By.linkText("Edit")).click();
//clear description
  cj.findElement(By.id("updateContactForm_description")).clear();
//Fill imp filed
  cj.findElement(By.name("description")).sendKeys("Hello  JAI");
  //click update button 
  cj.findElement(By.xpath("//input[@class='smallSubmit']")).click();
  //get title
  System.out.println(cj.getTitle());
  
	}

}
