package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="MyPageObject"                                
     , summary=""
     , relativeUrl=""
     , connection="WebtoCase"
     )             
public class MyPageObject {

	@TextType()
	@FindByLabel(label = "Contact Name")
	public WebElement contactName;
	@TextType()
	@FindByLabel(label = "Email")
	public WebElement email;
	@TextType()
	@FindByLabel(label = "Phone")
	public WebElement phone;
	@TextType()
	@FindByLabel(label = "Subject")
	public WebElement subject;
	@ButtonType()
	@FindByLabel(label = "Submit")
	public WebElement submit;
	@LinkType()
	@FindBy(linkText = "Home")
	public WebElement home;
	@ButtonType()
	@AuraBy(componentXPath = "//lightning:buttonMenu[@aura:id= 'visPopupMenu']")
	public WebElement displayAsTable;
	@LinkType()
	@AuraBy(componentXPath = "//lightning:menuItem[@value= '{!display.name}' and @label='Kanban']")
	public WebElement kanban;
	@LinkType()
	@FindBy(linkText = "Chapter1")
	public WebElement chapter1;
	@TextType()
	@FindBy(xpath = "//div[@id='divontheleft']")
	public WebElement Assert;
	@BooleanType()
	@FindBy(id = "radiobutton")
	public WebElement Radio;
	@TextType()
	@FindBy(xpath = "//td/label[normalize-space(.)='One Way']")
	public WebElement One_way;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='ctl00_mainContent_ddl_originStation1']")
	public WebElement Dep_City;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='ctl00_mainContent_ddl_destinationStation1']")
	public WebElement Dep_Date;
	@ButtonType()
	@FindBy(xpath = "//div[@id='flightSearchContainer']/div/button[contains(@class,'ui-datepicker-trigger')]")
	public WebElement Date_picker;
	@LinkType()
	@FindBy(linkText = "30")
	public WebElement _30;
	@TextType()
	@FindBy(xpath = "//div[normalize-space(.)='1 Adult']")
	public WebElement PAX;
	@ChoiceListType()
	@FindBy(xpath = "//select[@id='ctl00_mainContent_DropDownListCurrency']")
	public WebElement Currency;
	@ButtonType()
	@FindBy(xpath = "//input[@id='ctl00_mainContent_btn_FindFlights']")
	public WebElement Search;
	@TextType()
	@FindBy(xpath = "//div[@id='flightSearchContainer']/div/div/label[normalize-space(.)='Depart date']")
	public WebElement Depart_Date;
	@LinkType()
	@FindBy(linkText = "Ahmedabad (AMD)")
	public WebElement ahmedabadAMD;
	@LinkType()
	@FindBy(linkText = "Ahmedabad (AMD)")
	public WebElement ahmedabadAMD1;
	@LinkType()
	@FindBy(linkText = "Ahmedabad (AMD)")
	public WebElement ahmedabadAMD2;
	@TextType()
	@FindBy(xpath = "//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")
	public WebElement From;
	@TextType()
	@FindBy(id = "ctl00_mainContent_ddl_destinationStation1_CTXT")
	public WebElement TO;
	@TextType()
	@FindBy(xpath = "//div[@id='ui-datepicker-div']/div/div")
	public WebElement Date;
	@LinkType()
	@FindBy(linkText = "11")
	public WebElement _11;
	@BooleanType()
	@FindByLabel(label = "Family and Friends")
	public WebElement familyAndFriends;
	@LinkType()
	@FindBy(linkText = "Ahmedabad (AMD)")
	public WebElement ahmedabadAMD3;
	@TextType()
	@FindBy(id = "ctl00_mainContent_view_date1")
	public WebElement Date1;
	@TextType()
	@JavascriptBy(jspath = "return document.querySelector('td.fareCol1.col-active.SelectedFareTD > p > label > span.flightfare')")
	public WebElement Price;
	@TextType()
	@FindBy(xpath = "//div[@id='continue-to-contact-page']//span")
	public WebElement Continue;
	@ButtonType()
	@FindBy(xpath = "//div[@id='continue-to-contact-page' and normalize-space(.)='Continue']")
	public WebElement Continue1;
	@ChoiceListType()
	@FindByLabel(label = "Title")
	public WebElement title;
	@TextType()
	@FindByLabel(label = "First name")
	public WebElement firstName;
	@TextType()
	@FindByLabel(label = "Last name")
	public WebElement lastName;
	@TextType()
	@FindByLabel(label = "Preferred Mobile No.")
	public WebElement preferredMobileNo;
	@TextType()
	@FindByLabel(label = "Email address")
	public WebElement emailAddress;
	@TextType()
	@FindBy(xpath = "//div[@id='continue-to-addons-page']/span[normalize-space(.)='Continue' and contains(@class,'button-continue-text')]")
	public WebElement COnt;
			
}
