Feature: User Login
Registered user should be able to login to access details

Background:
Given User open the Application url


#Scenario: Login with valid credentials
#When User enters email address "santugk04@gmail.com"
#And Enters valid password "12345"
#And Clicks on Login button
#Then User should login successfully 

@login 
Scenario Outline: Login with valid credentials
When User enters email address <email>
And Enters valid password <password>
And Clicks on Login button
Then User should login successfully 
Examples:
|email                  |password|
|santugk04@gmail.com    |12345   |
|santugk004@gmail.com   |12345   |
|santugk0004@gmail.com  |12345   |




@invalidcredentials @smoke
Scenario: Login with invalid credentials
When User enters invalid email address "santugk004@gmail.com"
And Enters invalid password "1234556"
And Clicks on Login button
Then User should get prompt warning message
