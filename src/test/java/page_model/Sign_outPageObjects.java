package page_model;

import org.openqa.selenium.By;

import stepdefinitions.Common_Step_Def;

public class Sign_outPageObjects {
	
	private static Sign_outPageObjects signoutPageObjects;

	private Sign_outPageObjects() {};

	public static Sign_outPageObjects getInstance() {

		if(signoutPageObjects==null) {
			signoutPageObjects= new Sign_outPageObjects();
		}
		return signoutPageObjects;
	}

	By signoutBtn = By.xpath("//a[contains(text(),'Sign out')]");
	
	public void clickSignoutBtn () {
		Common_Step_Def.driver.findElement(signoutBtn).click();;
	}
	
	
}