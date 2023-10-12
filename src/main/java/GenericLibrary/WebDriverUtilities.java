package GenericLibrary;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities {
//1.Handle Drop down
	public void dropDown(WebElement ele,String text)
	{
		Select s=new Select(ele);
		s.selectByVisibleText(text);
	}
	
	//2.Handling mouse over
	public void mouseOvering(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.moveToElement(ele).perform();
	}
	
	//3.Handling right click
	public void rightClick(WebDriver driver,WebElement ele)
	{
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
	}
	
	//4.Handling double click
	public void doubleClicking(WebDriver driver, WebElement ele)
	{
		Actions a=new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//5.Handling DragandDrop
		public void dragAndDrop(WebDriver driver, WebElement ele1,WebElement ele2)
		{
			Actions a=new Actions(driver);
			a.dragAndDrop(ele1,ele2).perform();
		}
		//6.Handling Frame
		public void frames(WebDriver driver,String value)
		{
			driver.switchTo().frame(value);
		}
		//7.Handling Default content
				public void frames(WebDriver driver)
				{
					driver.switchTo().defaultContent();
				}
				//8.Handling Scrolling
				public void Scrolling (WebDriver driver,int x,int y)
				{
					JavascriptExecutor js= (JavascriptExecutor) driver;
					js.executeScript("window.scrollBy("+x+","+y+")");
				}
		      //9.Handling Scrolling
				public void Scrolling (WebDriver driver, WebElement ele)
				{
				JavascriptExecutor js= (JavascriptExecutor) driver;
				js.executeScript("arguments[0].scrollIntoView();",ele);
				}
				//10.Handling pop up
				public void popup(WebDriver driver)
				{
					driver.switchTo().alert().accept();
				}
				//11.Handling ChildBrowser
				public void childBrowser(WebDriver driver) 
				{ 
					Set<String> child = driver.getWindowHandles();
				for (String b : child)
				{ driver.switchTo().window(b); } 
				}
}
