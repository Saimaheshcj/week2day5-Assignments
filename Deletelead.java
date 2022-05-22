package week2.Assignments.Leads;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Deletelead {

	public static void main(String[] args) throws InterruptedException {
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
		//click crm/sfa
		  cj.findElement(By.linkText("CRM/SFA")).click();
	    //click leads
		  cj.findElement(By.linkText("Leads")).click();
		//click Find Leads
		  cj.findElement(By.linkText("Find Leads")).click();
		//click on Phone
		  cj.findElement(By.linkText("Phone")).click();
		//enter area code
		  cj.findElement(By.name("phoneAreaCode")).sendKeys("044");
		//enter Phone Number
		  cj.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9059446517");
		  Thread.sleep(2000);
		//click Find Leads button
		  cj.findElement(By.xpath("//button[text()='Find Leads']")).click();
		  Thread.sleep(2000);
		//click first lead
		  cj.findElement(By.partialLinkText("11482")).click();
		//click delete
		  cj.findElement(By.partialLinkText("Delete")).click();
		  Thread.sleep(4000);
		//click find leads
		  cj.findElement(By.linkText("Find Leads")).click();
		//enter the lead id
		cj.findElement(By.name("id")).sendKeys("11480");
		//click find lead
		  cj.findElement(By.linkText("Find Leads")).click();
		  Thread.sleep(3000);
		//close tab  
		cj.close();  
		  		
	}

}
