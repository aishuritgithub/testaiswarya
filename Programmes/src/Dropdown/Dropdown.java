package Dropdown;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/newtours/");
			driver.manage().window().maximize();
			
			WebElement register = driver.findElement(By.linkText("REGISTER"));
			register.click();
			
			WebElement dropdown = driver.findElement(By.name("country"));
			Select select = new Select(dropdown);
			select.selectByVisibleText("INDIA");
			
			WebElement flight = driver.findElement(By.linkText("Flights"));
			flight.click();
			
			
			WebElement dropdown1 = driver.findElement(By.name("passCount"));
			Select pass = new Select(dropdown1);
			pass.selectByVisibleText("2");
			WebElement dropdown2 = driver.findElement(By.name("fromPort"));
			Select depart = new Select(dropdown2);
			depart.selectByVisibleText("London");
			WebElement dropdown3 = driver.findElement(By.name("fromMonth"));
			Select on = new Select(dropdown3);
			on.selectByVisibleText("October");
			WebElement dropdown4 = driver.findElement(By.name("fromDay"));
			Select o = new Select(dropdown4);
			o.selectByVisibleText("1");
			WebElement dropdown5 = driver.findElement(By.name("toPort"));
			Select arrive = new Select(dropdown5);
			arrive.selectByVisibleText("New York");
			WebElement dropdown6 = driver.findElement(By.name("toMonth"));
			Select ret = new Select(dropdown6);
			ret.selectByVisibleText("October");
			WebElement dropdown7 = driver.findElement(By.name("toDay"));
			Select rd= new Select(dropdown7);
			rd.selectByVisibleText("20");
			WebElement type = driver.findElement(By.name("tripType"));
		    type.click();
			WebElement service = driver.findElement(By.name("servClass"));
			service.click();
			
			WebElement dropdownair = driver.findElement(By.name("airline"));
			Select air = new Select(dropdownair);
			air.selectByVisibleText("Blue Skies Airlines");
			WebElement co= driver.findElement(By.name("findFlights"));
		   co.click();

			
			
			
			
			
			
			
			
	}

}
