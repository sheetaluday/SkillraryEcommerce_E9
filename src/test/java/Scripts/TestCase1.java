package Scripts;
import POM.SkillHomePage;
import org.testng.annotations.Test;
import POM.demoSkillraryPage;
import GenericLibrary.BaseClass;
import POM.TestingPage;

public class TestCase1 extends BaseClass{
@Test
public void tc1()
{
	SkillHomePage s=new SkillHomePage(driver);


  demoSkillraryPage dS=new demoSkillraryPage (driver);
  utilities.dropDown(dS.getSelectDd(), pdata.getPropertydata("coursedd"));
  TestingPage tP=new TestingPage(driver);
  
  utilities.Scrolling(driver,tP.getFbIcon());
  tP.fbIconWebElement();
}
}