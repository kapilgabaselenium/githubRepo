package pkg1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClassA {
	
	
	public static void main(String[] args) throws InterruptedException 
	{
	 String s1="my name is deepak";
	 String[] s2=s1.split(" ");
	 System.out.println("total words "+s2.length);
	 
	 for(int i=0;i<s2.length;i++)
	 {
		 System.out.println(s2[i]);
	 }
	}

}
