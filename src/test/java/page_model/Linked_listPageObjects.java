package page_model;

import org.openqa.selenium.By;

import constants.Constants;
import stepdefinitions.Common_Step_Def;
import utilities.Logger_Load;

public class Linked_listPageObjects {
	
	private static Linked_listPageObjects linked_listpageobjects;
	private Linked_listPageObjects() {};
	public static Linked_listPageObjects getInstance(){ 
		if(linked_listpageobjects==null) {
			linked_listpageobjects= new Linked_listPageObjects();	
		}
		return linked_listpageobjects;
	
	}

	By LinkedGetStrtButton = By.xpath("//a[@href='linked-list']");
	By signinLink = By.xpath("//a[text()='Sign in']"); 
	By usernameTextbox = By.xpath("//input[@name='username']");
	By passwordTextbox =By.xpath("//input[@name='password']");
	By loginbtn = By.xpath("//input[@value='Login']");
	By IntroductionLink = By.xpath("//a[text()='Introduction']");
	By EditorTxt =By.xpath("//form[@id='answer_form']/div/div/div/textarea");
	By TryHere = By.xpath("//a[@class='btn btn-info']");

	By Run = By.xpath("//button[text()='Run']");
	By CreatingList = By.xpath("//a[text()='Creating Linked LIst']");
	By TypesLinkedList = By.xpath("//a[text()='Types of Linked List']");
	By ImplementList = By.xpath("//a[text()='Implement Linked List in Python']");
	By Traversal = By.xpath("//a[text()='Traversal']");
	By Insertion =By.xpath("//a[text()='Insertion']");
	By Deletion = By.xpath("//a[text()='Deletion']");
	By PracticeQue = By.xpath("//a[text()='Practice Questions']");
	By signoutbtn = By.xpath("//a[text()='Sign out']");
	
	
	
		
	
	public void login()
	{
	Common_Step_Def.driver.get(Constants.LOGINPAGE);
	}
	
	public void login_credentials() {
		Common_Step_Def.driver.findElement(usernameTextbox).sendKeys(Constants.USERNAME);
	    Common_Step_Def.driver.findElement(passwordTextbox).sendKeys(Constants.PASSWORD);
	    
	}
	
	
	public void login_btn() {
		Common_Step_Def.driver.findElement(loginbtn).click();;
	}
	
	public void Linked_GetBtn() {
		Common_Step_Def.driver.findElement(LinkedGetStrtButton).click();
	}
	
	public void Introduction_Link() {
		Common_Step_Def.driver.findElement(IntroductionLink).click();
	}

	public void TryHereIn() {
		Common_Step_Def.driver.findElement(TryHere).click();
	}
		public void TextEditor_Intr() {
			
			Common_Step_Def.driver.findElement(EditorTxt).sendKeys(Constants.PYTHONV);
			
		}
		public void TextEditor_Intr1() {
			Common_Step_Def.driver.findElement(EditorTxt).sendKeys(Constants.PYTHONI);
			
		}
		public void Run_btn() {
			Common_Step_Def.driver.findElement(Run).click();
		}
		public void alert_text() {
			Common_Step_Def.driver.switchTo().alert().accept();

		}
		public void console_Output() {
			Logger_Load.info("able to see message in console box");
		}
		public void Creating_Linked() {
			Common_Step_Def.driver.findElement(CreatingList).click();
		}
		public void Types_Linked() {
			Common_Step_Def.driver.findElement(TypesLinkedList).click();
		}
		public void Implement_Linked() {
			Common_Step_Def.driver.findElement(ImplementList).click();
		}
		
		public void Traversal_Link() {
			Common_Step_Def.driver.findElement(Traversal).click();
		}
		public void Insertion_Link() {
			Common_Step_Def.driver.findElement(Insertion).click();
		}
		public void Deletion_Link() {
			Common_Step_Def.driver.findElement(Deletion).click();
		}
		public void Practice_Question() {
			Common_Step_Def.driver.findElement(PracticeQue).click();
			
		}
		public void SignOut_link() {
			Common_Step_Def.driver.findElement(signoutbtn).click();
		}
	}


