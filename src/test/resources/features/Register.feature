
Feature: User regsitration

@registration 
Scenario: Register with mandatory fields
#Given User navigate to  Register account page
#When User enters below details into the fields
#|firstname        |Santosh|
#|lastname         |Kamamth|
#|Emailaddress     |santu04@gmail.com|
#|telephone        |1234567890|
#|password         |1233|
#|confirmpassword  |1233|
#And Select Yes for NewsLetter
#And Selects Privacy policy field
#And Clicks on continue button
#Then Account should get successfully created


Scenario: Register with mandatory fields
Given User navigate to  Register account page
When User enters below details into the fields
|firstname        |Santosh|
|lastname         |Kamamth|
|Emailaddress     |santu04@gmail.com|
|telephone        |1234567890|
|password         |1233|
|confirmpassword  |1233|
 And Select Yes for NewsLetter
And Selects Privacy policy field
And Clicks on continue button
Then Account should get successfully created
