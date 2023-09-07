#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@smoke
Feature: Remember Me checkbox feature
Background: Loaded for each tags or scenarios 
Given: Home Url should be loaded "https://demo.applitools.com/"
Scenario: Checking login Functionality with remember me checkbox
When User click on remember me check box
Then Remember me check box should be checked in

@regression
Scenario: Checking login Functionality with remember me checkbox
When User click on remember me check box
Then Remember me check box should be checked in