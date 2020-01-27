package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\TestAutomation\\chromedriver.exe");
		
		//String baseURL="http://output.jsbin.com/osebed/2";
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/write-xpath-table.html");
		
		
	String Text=driver.findElement(By.xpath("/html/body/center[1]/table/tbody/tr[1]/td[2]")).getText();
	System.out.println(Text);
		
	driver.close();
		

	}

}
