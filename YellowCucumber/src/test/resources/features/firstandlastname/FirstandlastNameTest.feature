@Important
Feature: First and Last Name Validation

Background: Login page
Given User is on the Facebook homepage "https://www.facebook.com/"

@Smoke
Scenario: First Name Validation
When User enters First name "Subash"
Then First name is validated


@Regression
Scenario: Last Name Validation
When User enters Last name "Marasini"
Then Last name is validated


@Smoke @Regression
Scenario: First and Last Name
When User enters First name "Subash"
Then First name is validated
When User enters Last name "Marasini"
Then Last name is validated


