package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import wdMethods.ProjectMethods;

public class ViewLead extends ProjectMethods{
	public ViewLead()
	{
		PageFactory.initElements(driver,this);
	}
	@FindBy(how=How.XPATH,using="//span[@class='requiredField'][1]")
	private String eleVerifyLead;
	
	public ViewLead VerifyLead()
	{
		verifyTitle(eleVerifyLead);
		return this;
	}


}

