Feature: First name Validation

Scenario: First Name Validation
Given User is on the Facebook homepage "https://www.facebook.com/"
When User enters First name "Subash"
Then First name is validated
Then Close the browser

