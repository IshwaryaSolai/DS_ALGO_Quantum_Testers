package page_model;

import org.openqa.selenium.By;

import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class GraphPageObjects {
	
	private static GraphPageObjects graphPageObjects;

	private GraphPageObjects() {};

	public static GraphPageObjects getInstance() {

		if(graphPageObjects==null) {
			graphPageObjects= new GraphPageObjects();
		}
		return graphPageObjects;
}
	
	By signinLink = By.xpath("//a[text()='Sign in']");
	By usernameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox =By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Login']");
	
	
	
	By Getstarted_btn = By.xpath("//a[@href='graph']");
	By Graphlink = By.xpath("//a[@href = 'graph']");
	By try_here = By.xpath("//a[@class='btn btn-info']");
	By textbox = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By run = By.xpath("//button[text() = 'Run']");
	By output 			= By.xpath("//pre[@id='output']");
	By graphrepresentation = By.xpath("//a[text() = 'Graph Representations']");
	By practice_qp = By.xpath("//a[@class = 'list-group-item list-group-item-light text-info']");
	By empty_pp = By.xpath("//html[@lang = 'en']");
	By signoutbtn = By.xpath("//a[text()='Sign out']");
	
	public  void enterUsername () {
		
		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys(Constants.USERNAME);

	}
	
	public  void enterPassword () {
		Common_Step_Def.driver.findElement(passwordTextbox).sendKeys(Constants.PASSWORD);

	}
	
	public  void clickLogin() {
		Common_Step_Def.driver.findElement(loginbtn).click();
	}
	public void graphGetStart() {
		Common_Step_Def.driver.findElement(Getstarted_btn).click();
	}
	public void clickGraphLink() {
		Common_Step_Def.driver.findElement(Graphlink).click();
	}
	public void clickTryhere() {
		Common_Step_Def.driver.findElement(try_here).click();
	}
	public void validCode(String code) throws InterruptedException {
		Common_Step_Def.driver.findElement(textbox).sendKeys(code);
	}
	public void runBtn() throws InterruptedException {
		Common_Step_Def.driver.findElement(run).click();

	}
	public String getOutput() {
		return Common_Step_Def.driver.findElement(output).getText();
	}
	public void clickGraphRepresentation() {
		Common_Step_Def.driver.findElement(graphrepresentation).click();
	}
	public void invalidCode(String invalidCode) throws InterruptedException {

		Common_Step_Def.driver.findElement(textbox).sendKeys(invalidCode);
	}
	public void practiceQuestions() throws InterruptedException {

		Common_Step_Def.driver.findElement(practice_qp).click();
	}
	public  void clickSignout() {
		Common_Step_Def.driver.findElement(signoutbtn).click();
	}

}