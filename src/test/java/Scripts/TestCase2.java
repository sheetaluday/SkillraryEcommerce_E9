package Scripts;

import org.testng.annotations.Test;

import POM.DownloadInvoicePage;
import POM.SkillHomePage;
import POM.demoSkillraryPage;
import GenericLibrary.BaseClass;
import POM.demoSkillraryPage;

public class TestCase2 extends BaseClass{
	@Test
	public void TC2()
	{
		SkillHomePage s=new SkillHomePage(driver);
		s.gearsButton();
		s.skillrarydemoappWebElement();
		utilities.childBrowser(driver);
		demoSkillraryPage dS=new demoSkillraryPage(driver);
		dS.feedbackButton();
		DownloadInvoicePage dI=new DownloadInvoicePage(driver);
		dI.downloadInvoiceWebElement();
		
	}

}
