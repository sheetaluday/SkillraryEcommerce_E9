package POM;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {
//Declaration
}
@FindBy(xpath= "(//button[@type='button'])[4]")
private WebElement plusIcon;

@FindBy(xpath="//button[text()=' Add to Cart']")
private WebElement addtocart;

//initialization
public AddToCartPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
	
}

//Utilization
public WebElement getPlusIcon()
{
return plusIcon;
}
