package week2.Assignments.Leads;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Duplicatelead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver cj =new ChromeDriver();
		cj.manage().window().maximize();
		cj.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		cj.get("http://leaftaps.com/opentaps/control/main");
	//enter user name
		cj.findElement(By.id("username")).sendKeys("demosalesmanager");
    //enter password
		cj .findElement(By.id("password")).sendKeys("crmsfa");
	//click login
		cj.findElement(By.className("decorativeSubmit")).click();
	//click crm/sfa
	    cj.findElement(By.linkText("CRM/SFA")).click();
	//click leads    
		cj.findElement(By.linkText("Leads")).click();
	//click find leads    
		cj.findElement(By.linkText("Find Leads")).click();
	//click email    
		cj.findElement(By.linkText("Email")).click();
	//enter email id
		cj.findElement(By.name("emailAddress")).sendKeys("mahesh123@gmail.com");
	//click find leads
		cj.findElement(By.linkText("Find Leads")).click();
		Thread.sleep(4000);
	//click lead id
		cj.findElement(By.partialLinkText("10019")).click();
		Thread.sleep(4000);
	//click duplicate lead
		cj.findElement(By.linkText("Duplicate Lead")).click();
	//get title
		cj.getTitle();
	//click lead
		cj.findElement(By.linkText("Create Lead")).click();
	//close the browser
		cj.close();
	}
}
