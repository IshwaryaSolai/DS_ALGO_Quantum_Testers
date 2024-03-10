package page_model;

import org.openqa.selenium.By;

import constants.Constants;
import stepdefinitions.Common_Step_Def;

public class QueuePageObjects {

	private static QueuePageObjects queuePageObjects;

	private QueuePageObjects() {};

	public static QueuePageObjects getInstance() {

		if(queuePageObjects==null) {
			queuePageObjects= new QueuePageObjects();
		}
		return queuePageObjects;
	}

	By signinLink = By.xpath("//a[text()='Sign in']");
	By usernameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox =By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Login']");

	By getstarted_btn = By.xpath("//a[@href='queue']"); 
	By click_implementation = By.xpath("//a[text() = 'Implementation of Queue in Python']");
	By tryhere = By.xpath("//a[@class='btn btn-info']");
	By text_box = By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By Run = By.xpath("//button[text() = 'Run']");
	By output 			= By.xpath("//pre[@id='output']");
	By implementationcollection = By.xpath("//a[text() = 'Implementation using collections.deque']");
	By array= By.xpath("//a[text() = 'Implementation using array']");
	By Queue_operation= By.xpath("//a[text() = 'Queue Operations']");
	By practice_qa=By.xpath("//a[@class = \"list-group-item list-group-item-light text-info\"]");
	By empty_pp = By.xpath("//html[@lang = \"en\"]");
	By signoutbtn =By.xpath("//a[text()='Sign out']");


	public  void enterUsername () {

		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys(Constants.USERNAME);

	}

	public  void enterPassword () {
		Common_Step_Def.driver.findElement(passwordTextbox).sendKeys(Constants.PASSWORD);

	}

	public  void clickLogin() {
		Common_Step_Def.driver.findElement(loginbtn).click();
	}
	public void queueGetStart() {
		Common_Step_Def.driver.findElement(getstarted_btn).click();
	}
	public void clickImplementationLink() {
		Common_Step_Def.driver.findElement(click_implementation).click();
	}
	public void clickTryhere() {
		Common_Step_Def.driver.findElement(tryhere).click();
	}
	public void validCode(String code) throws InterruptedException {
		Common_Step_Def.driver.findElement(text_box).sendKeys(code);
	}
	public void runBtn() throws InterruptedException {
		Common_Step_Def.driver.findElement(Run).click();

	}
	public String getOutput() {
		return Common_Step_Def.driver.findElement(output).getText();
	}
	public void clickCollection() {
		Common_Step_Def.driver.findElement(implementationcollection).click();
	}
	public void clickArray() {
		Common_Step_Def.driver.findElement(array).click();
	}
	public void clickOperation() {
		Common_Step_Def.driver.findElement(Queue_operation).click();
	}
	public void invalidCode(String invalidCode) throws InterruptedException {

		Common_Step_Def.driver.findElement(text_box).sendKeys(invalidCode);
	}
	public void practiceQuestions() throws InterruptedException {

		Common_Step_Def.driver.findElement(practice_qa).click();
	}
	public  void clickSignout() {
		Common_Step_Def.driver.findElement(signoutbtn).click();
	}

}