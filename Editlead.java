package week2.Assignments.Leads;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Editlead {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
ChromeDriver cj=new ChromeDriver();
cj.manage().window().maximize();
   //launch the browser
        cj.get("http://leaftaps.com/opentaps/control/main");
   //enter the user name
        cj.findElement(By.id("username")).sendKeys("demosalesmanager");
   //click password
    	cj .findElement(By.id("password")).sendKeys("crmsfa");
   //click login
    	cj.findElement(By.className("decorativeSubmit")).click();
   //click crm/sfa
    	cj.findElement(By.linkText("CRM/SFA")).click();
   //click leads
    	cj.findElement(By.linkText("Leads")).click();
   //click find leads
     	cj.findElement(By.linkText("Find Leads")).click();	
   //enter first name
    	cj.findElement(By.xpath("//div[@id='x-form-el-ext-gen248']//input")).sendKeys("sai");
   //click find leads
    	cj.findElement(By.xpath("//button[text()='Find Leads']")).click();
    	Thread.sleep(3000);
   //click lead id
    	cj.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a[contains(text(),'11492')]")).click();
   //get title 
    	System.out.println(cj.getTitle());
   //click	edit
    	cj.findElement(By.linkText("Edit")).click();
   //clear company Name
        cj.findElement(By.id("updateLeadForm_companyName")).clear();
   //update company Name
        cj.findElement(By.id("updateLeadForm_companyName")).sendKeys("wipro");
   //click update
        cj.findElement(By.name("submitButton")).click();
   //verify the change of company name
        String text=cj.findElement(By.id("viewLead_companyName_sp")).getText();
        System.out.println(text);
        Thread.sleep(2000);
   //close tab
        cj.close();
	}

}
