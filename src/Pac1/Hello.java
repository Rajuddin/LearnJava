package Pac1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.FluentWait;

import com.sun.jna.Function;
import com.thoughtworks.selenium.Wait;

public class Hello {
	
	// Global Variable.
	//Data Type
	static int i = 10;
	static String myString = "Fahad Learnning Java with Mukesh";

	public static void main(String[] args) {

		WebDriver driver = new FirefoxDriver();
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
							   .withTimeout(30, TimeUnit.SECONDS)
							   .pollingEvery(5, TimeUnit.SECONDS)
							   .ignoring(NoSuchElementException.class);
		WebElement el = wait.until(new Function<WebDriver, WeElement>()
				{
			
				}
		int p = 20;
		System.out.println("p = " + p + "********"+ myString);
		
	}
	
	

}
