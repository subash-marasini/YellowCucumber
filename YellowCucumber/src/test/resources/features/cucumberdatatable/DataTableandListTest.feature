Feature: Entering firstname and lastname

Scenario: Entering firstname and lastname
Given User is on the Facebook homepage "https://www.facebook.com/"
When User enters anyset from the following data
|FirstName	|LastName |
|Subash		|Marasini |
|Jack		|Daniels  |
|Tom		|Hanks    |
Then Close the browser

