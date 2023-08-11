package week4day4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class LoginLeaf {
	public ChromeDriver driver;
	public String filename;
	@BeforeMethod
	@Parameters({"url","uname","password"})
	
	public void login(String url,String uname,String password)
	{
		driver=new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys(uname);;
		driver.findElement(By.id("password")).sendKeys(password);
	}
	@DataProvider
	public String[][] sendData() throws IOException {
		ReadExcel re=new ReadExcel();
		String[][] data=re.ReadData(filename);
		return data;
	}
	@AfterMethod
	public void close()
	{
		driver.quit();
	}
	
}
