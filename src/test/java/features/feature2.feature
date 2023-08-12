Feature: Application Login

Scenario: Home page default
Given user in NetBanking page
When user_enters_credentials user id "test1" and password "1234"
And click on Submit
Then Homepage is displayed
And Cards are displayed is "true" and false 

Scenario: Home page default
Given user in NetBanking page
When user_enters_credentials user id "test2" and password "21234"
And click on Submit
Then Homepage is displayed
And Cards are displayed is "false" and true and test