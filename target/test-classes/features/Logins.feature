Feature: Login page automation of saucedemo application

@positivelogins
Scenario Outline: Check login is successful with valid credentails
Given User is on login page
When User enters valid "<username>" and "<password>"
And Clicks on login button
And Close the browser

Examples:
|username       | password   |
|standard_user  |secret_sauce|
|locked_out_user|secret_sauce|
|problem_user   |secret_sauce|
|visula_user    |secret_sauce|




