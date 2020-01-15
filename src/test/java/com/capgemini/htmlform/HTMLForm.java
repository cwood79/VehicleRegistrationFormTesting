package com.capgemini.htmlform;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HTMLForm {
	WebDriver driver;
	public HTMLForm(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
  @FindBy(name="title")
  WebElement title;
  
  @FindBy(id="ownername")
  WebElement ownerName;
  
  @FindBy(xpath="/html/body/form/ul/li[6]/input")
  WebElement gender;
  
  @FindBy(name="address")
  WebElement address;
  
  @FindBy(name="city")
  WebElement city;
  
  @FindBy(name="state")
  WebElement state;
  
  @FindBy(name="country")
  WebElement country;
  
  @FindBy(name="zip")
  WebElement zipcode;
  
  @FindBy(xpath="/html/body/form/ul/li[19]/input")
  WebElement vehicleType;
  
  @FindBy(xpath="/html/body/form/ul/li[22]/input")
  WebElement fuelType;
  
  @FindBy(name="mfg")
  WebElement mfg;
  
  @FindBy(name="submit")
  WebElement submitButton;
  
  public Select Title() {
  	return new Select(title);
  }
  
  public WebElement OwnerName() {
	  return ownerName;
  }
  
  public WebElement Gender() {
	  return gender;
  }
  
  public WebElement Address() {
	  return address;
  }
  
  public WebElement City() {
	  return city;
  }
  
  public WebElement State() {
	  return state;
  }
  
  public Select Country() {
	  return new Select(country);
  }
  
  public WebElement Zipcode() {
	  return zipcode;
  }
  
  public WebElement VehicleType() {
	  return vehicleType;
  }
  
  public WebElement FuelType() {
	  return fuelType;
  }
  
  public Select MFG() {
	  return new Select(mfg);
  }
  
  public WebElement SubmitButton() {
	  return submitButton;
	  
  }
}
