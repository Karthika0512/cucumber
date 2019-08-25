package com.fb.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class LoginPageSteps {
	WebDriver d;
	@Given("User is on demo page")
	public void user_is_on_demo_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Uer\\eclipse-workspace---Karthi1234\\Cucumberrrrrr\\Driver\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("http://demo.automationtesting.in/Register.html");
	}

	@When("User enters {string},{string},{string},{string},{string},{string},{string} details and submit")
	public void user_enters_details_and_submit(String fname, String lname, String add, String email, String phone, String Password, String Confirm) {
	    WebElement a = d.findElement(By.xpath("//input[@placeholder='First Name']"));
	    a.sendKeys(fname);
	    WebElement b = d.findElement(By.xpath("//input[@placeholder='Last Name']"));
	    b.sendKeys(lname);
	    WebElement c = d.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	    c.sendKeys(add);
	    WebElement e = d.findElement(By.xpath("//input[@type='email']"));
	    e.sendKeys(email);
	    WebElement f = d.findElement(By.xpath("//input[@type='tel']"));
	    f.sendKeys(phone);
	    WebElement g = d.findElement(By.xpath("//input[@value='FeMale']"));
	    g.click();
	    WebElement h = d.findElement(By.xpath("//input[@value='Cricket']"));
	    h.click();
	    WebElement i = d.findElement(By.xpath("//div[@id='msdd']"));
	    i.click();
	    WebElement j = d.findElement(By.xpath("(//a[@class='ui-corner-all'])[1]"));
	    j.click();
	    WebElement k = d.findElement(By.xpath("//label[text()='Languages']"));
	    k.click();
	    WebElement l = d.findElement(By.xpath("(//select[@type='text'])[1]"));
	    Select s=new Select(l);
	    s.selectByVisibleText("C");
	    WebElement m = d.findElement(By.xpath("(//select[@type='text'])[2]"));
	    Select s1=new Select(m);
	    s1.selectByVisibleText("India");
	    WebElement n = d.findElement(By.xpath("//select[@id='country']"));
	    Select s2=new Select(n);
	    s2.selectByVisibleText("India");
	    WebElement o = d.findElement(By.xpath("(//select[@type='text'])[3]"));
	    Select s3=new Select(o);
	    s3.selectByVisibleText("1993");
	    WebElement p = d.findElement(By.xpath("(//select[@type='text'])[4]"));
	    Select s4=new Select(p);
	    s4.selectByVisibleText("December");
	    WebElement q = d.findElement(By.xpath("(//select[@type='text'])[5]"));
	    Select s5=new Select(q);
	    s5.selectByVisibleText("5");
	    WebElement r = d.findElement(By.xpath("//input[@id='firstpassword']"));
	    r.sendKeys(Password);
	    WebElement t = d.findElement(By.xpath("//input[@id='secondpassword']"));
	    t.sendKeys(Confirm);
	    WebElement u = d.findElement(By.xpath("//button[@id='submitbtn']"));
	    u.click();
	    d.findElement(By.xpath("//a[text()='WebTable']")).click();
	}

	@Then("Verify success message")
	public void verify_success_message() {
		String u = d.getCurrentUrl();
		boolean b = u.contains("WebTable");
		Assert.assertTrue(true);
		System.out.println(b);
	
		
	    
	}


	


}
