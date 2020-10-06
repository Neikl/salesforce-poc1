package pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.provar.core.testapi.annotations.*;

@Page( title="pageobject1"                                
     , summary=""
     , relativeUrl=""
     , connection="SalesTest"
     )             
public class pageobject1 {

	@LinkType()
	@FindBy(linkText = "Leads")
	public WebElement leads;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail;
	@LinkType()
	@FindBy(linkText = "VDres Ltd-")
	public WebElement vDresLtd;
	@ButtonType()
	@FindByLabel(label = "Edit Paycheck stubs from last 30 days.")
	public WebElement editPaycheckStubsFromLast30Days;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity1;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail1;
	@LinkType()
	@FindBy(linkText = "VDACT-")
	public WebElement vDACT;
	@TextType()
	@FindBy(xpath = "//button[@title='Save']")
	public WebElement Save;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity11;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity2;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement Activity;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail11;
	@ButtonType()
	@FindByLabel(label = "Edit CC Score")
	public WebElement CC_Score__c;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity21;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail2;
	@LinkType()
	@FindBy(linkText = "MarTech-")
	public WebElement marTech;
	@ButtonType()
	@FindByLabel(label = "Edit Paycheck stubs from last 30 days.")
	public WebElement editPaycheckStubsFromLast30Days1;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputNumber[@label= 'Quantity']")
	public WebElement SLA__Bronze__Locked_Product__Item_1;
	@TextType()
	@AuraBy(componentXPath = "//force:modal//ui:inputNumber[@label= 'Quantity']")
	public WebElement SLA__Bronze__Locked_Product__Item_11;
	@TextType()
	@FindBy(xpath = "//input[@id='10829:0']")
	public WebElement SLA__Bronze__Locked_Product__Item_12;
	@LinkType()
	@FindBy(xpath = "//li[@title='Activity']")
	public WebElement activity22;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity3;
	@TextType()
	@FindBy(id = "19584:0")
	public WebElement SLA__Bronze__Locked_Product__Item_13;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity4;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity5;
	@LinkType()
	@FindBy(linkText = "Activity")
	public WebElement activity51;
	@LinkType()
	@FindBy(id = "activityTab__item")
	public WebElement activity511;
	@LinkType()
	@FindBy(xpath = "//forcegenerated-flexipage_opportunity_rec_simple_opportunity__view_js//a[@id='activityTab__item']")
	public WebElement activity6;
	@LinkType()
	@FindBy(linkText = "Email")
	public WebElement ClickEmail21;
	@LinkType()
	@FindBy(linkText = "Proposal/Price Quote")
	public WebElement proposalPriceQuote;
	@LinkType()
	@FindBy(linkText = "New")
	public WebElement new_;
	@ButtonType()
	@FindByLabel(label = "View profile")
	public WebElement viewProfile;
	@LinkType()
	@AuraBy(componentXPath = "//ui:outputURL[@value= '{!v.fullAlohaUrl}']")
	public WebElement switchToSalesforceClassic;
	@ButtonType()
	@FindByLabel(label = "New")
	public WebElement new_1;
	@ButtonType()
	@FindBy(xpath = "//input[@name='new']")
	public WebElement new_11;
	@TextType()
	@FindByLabel(label = "First Name")
	public WebElement firstName;
	@TextType()
	@FindByLabel(label = "Last Name")
	public WebElement lastName;
	@TextType()
	@FindByLabel(label = "Company")
	public WebElement company;
	@TextType()
	@FindByLabel(label = "DOB")
	public WebElement dOB;
	@TextType()
	@FindByLabel(label = "SSN")
	public WebElement sSN;
	@ChoiceListType()
	@FindByLabel(label = "Loan Type")
	public WebElement loanType;
	@ChoiceListType()
	@FindByLabel(label = "Property Type")
	public WebElement propertyType;
	@TextType()
	@FindByLabel(label = "Loan Amount")
	public WebElement loanAmount;
	@TextType()
	@FindByLabel(label = "Mortgage asset value")
	public WebElement mortgageAssetValue;
	@TextType()
	@FindByLabel(label = "Income per Annum")
	public WebElement incomePerAnnum;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save;
	@ButtonType()
	@FindByLabel(label = "Save")
	public WebElement save1;
	@ButtonType()
	@FindBy(xpath = "//td[@id='bottomButtonRow']/input[@name='save']")
	public WebElement save11;
			
}
