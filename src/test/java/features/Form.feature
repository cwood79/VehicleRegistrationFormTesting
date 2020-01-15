Feature: Car Registration Form
 
Scenario: Successful Submission of Form with Valid Credentials
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User enters Valid City
 And User enters Valid State
 And User selects Valid Country
 And User enters Valid Zipcode
 And User selects Valid Vehicle Type
 And User selects Valid Fuel Type
 And User selects Valid MFG
 And User clicks Submit Button
 Then User Successfully Registers Car 
 And Browser window closes
 
Scenario: Unsuccessful Submission of Form with Invalid Title
 Given User is on Vehicle Registration Page
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Title 
 And Browser window closes
 
Scenario: Unsuccessful Submission of Form with Invalid Owner Name
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Owner Name 
 And Browser window closes
 
Scenario: Unsuccessful Submission of Form with Invalid Gender
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Gender
 And Browser window closes
 
Scenario: Unsuccessful Submission of Form with Invalid Address
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Address
 And Browser window closes
 
Scenario: Unsuccessful Submission of Form with Invalid City
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid City
 And Browser window closes

Scenario: Unsuccessful Submission of Form with Invalid State
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User enters Valid City
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid State
 And Browser window closes

Scenario: Unsuccessful Submission of Form with Invalid Country
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User enters Valid City
 And User enters Valid State
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Country
 And Browser window closes

Scenario: Unsuccessful Submission of Form with Invalid Zipcode
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User enters Valid City
 And User enters Valid State
 And User selects Valid Country
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Zipcode
 And Browser window closes

Scenario: Unsuccessful Submission of Form with Invalid Vehicle Type
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User enters Valid City
 And User enters Valid State
 And User selects Valid Country
 And User enters Valid Zipcode
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Vehicle Type
 And Browser window closes
 
Scenario: Unsuccessful Submission of Form with Invalid Fuel Type
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User enters Valid City
 And User enters Valid State
 And User selects Valid Country
 And User enters Valid Zipcode
 And User selects Valid Vehicle Type
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid Fuel Type
 And Browser window closes

Scenario: Unsuccessful Submission of Form with Invalid MFG
 Given User is on Vehicle Registration Page
 When User selects Valid Title
 And User enters Valid Owner Name
 And User selects Valid Gender
 And User enters Valid Address
 And User enters Valid City
 And User enters Valid State
 And User selects Valid Country
 And User enters Valid Zipcode
 And User selects Valid Vehicle Type
 And User selects Valid Fuel Type 
 And User clicks Submit Button
 Then User Unsuccessfully Registers Car with Invalid MFG
 And Browser window closes