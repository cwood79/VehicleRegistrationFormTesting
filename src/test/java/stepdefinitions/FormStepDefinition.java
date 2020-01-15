package stepdefinitions;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import com.capgemini.htmlform.HTMLForm;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class FormStepDefinition {
	WebDriver dr;
	HTMLForm form;
	
    @Given("^User is on Vehicle Registration Page$")
    public void user_is_on_form_page() throws Throwable {
    	System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
    	dr=new ChromeDriver();
    	form=new HTMLForm(dr);
        dr.get("file:///C:/Users/chrwood/Documents/workspace-sts-3.9.10.RELEASE/CarRegistrationAssessment/resource/VehicleRegistrationForm.html");
        Assert.assertEquals("Welcome to VehicleRegistration", dr.getTitle());
        
    }
    
    @When("^User selects Valid Title$")
    public void user_selects_valid_title() throws Throwable {
    	form.Title().selectByVisibleText("Mr.");
    }
    
    @And("^User enters Valid Owner Name$")
    public void user_enters_valid_owner_name() throws Throwable {
    	form.OwnerName().sendKeys("JohnSmith");
    	
    }
    
    @And("^User selects Valid Gender$")
    public void user_selects_valid_gender() throws Throwable {
    	form.Gender().click();
    }
    
    @And("^User enters Valid Address$")
    public void user_enters_valid_address() throws Throwable {
    	form.Address().sendKeys("123TestStreet");
    }
    
    @And("^User enters Valid City")
    public void user_enters_valid_city() throws Throwable {   	
    	form.City().sendKeys("Testville");
    }
    
    @And("^User enters Valid State$")
    public void user_enters_valid_state() throws Throwable {
    	form.State().sendKeys("TestState");
    }
    
    @And("^User selects Valid Country$")
    public void user_selects_valid_country() throws Throwable {
    	form.Country().selectByVisibleText("India");
    }
    
    @And("^User enters Valid Zipcode$")
    public void user_enters_valid_zipcode() throws Throwable {
    	form.Zipcode().sendKeys("123456");
    }
    
    @And("^User selects Valid Vehicle Type$")
    public void user_selects_valid_vehicle_type() throws Throwable {
    	form.VehicleType().click();
    }
    
    @And("^User selects Valid Fuel Type$")
    public void user_selects_valid_fuel_type() throws Throwable {
    	form.FuelType().click();
    }

    @And("^User selects Valid MFG$")
    public void user_selects_valid_mfg() throws Throwable {
    	form.MFG().selectByVisibleText("2015");
    }
    
    @And("^User clicks Submit Button$")
    public void user_clicks_submit() throws Throwable {
    	form.SubmitButton().click();
    }
    
    @Then("^User Successfully Registers Car$")
    public void user_successfully_registers_car() throws Throwable {
    	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "You are Succesfully registered your vehicle");
    	alert.accept();
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Title$")
    public void user_unsuccessfully_registers_car_with_invalid_title() throws Throwable {
    	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "Select title from the list");
    	alert.accept();
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Owner Name$")
    public void user_unsuccesffully_registers_car_with_invalid_owner_name() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "Owner Name should not be empty and must contain alphabets with in the range of 5 to 20");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Gender$")
    public void user_unsuccesffully_registers_car_with_invalid_gender() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "Please Select gender");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Address$")
    public void user_unsuccesffully_registers_car_with_invalid_address() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "address should not be empty and must be alphanumeric with in the range of 5 to 20");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid City$")
    public void user_unsuccesffully_registers_car_with_invalid_city() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "city should not be empty and must have alphabet characters only");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid State$")
    public void user_unsuccesffully_registers_car_with_invalid_state() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "State should not be empty and must have alphabet characters only");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Country$")
    public void user_unsuccesffully_registers_car_with_invalid_country() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "Select the country from the list");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Zipcode$")
    public void user_unsuccesffully_registers_car_with_invalid_zipcode() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "ZIP code should not be empty and must have 6 numeric characters only");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Vehicle Type$")
    public void user_unsuccesffully_registers_car_with_invalid_vehicletype() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "Please Select Vehicle type");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid Fuel Type$")
    public void user_unsuccesffully_registers_car_with_invalid_fueltype() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "Please Select fuel type");
    	alert.accept();
    	
    }
    
    @Then("^User Unsuccessfully Registers Car with Invalid MFG$")
    public void user_unsuccesffully_registers_car_with_invalid_mfg() throws Throwable {
     	Alert alert = dr.switchTo().alert();
    	assertEquals(alert.getText(), "Select mfg year from the list");
    	alert.accept();
    }
    
    @And("Browser window closes")
    public void browser_window_close() throws Throwable {
    	dr.close();
    }

}