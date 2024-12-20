#Author: Erick
#Datr:
#Revie:1.1
@withdraw
Feature: Withdraw
  
  Scenario Outline: To validate the withdraw function
    Given I have account with <init> amount
    When I withdraw the <amount> from my account
    Then I verify the <balance> left in my account

    Examples: 
      | init | amount | balance |
      | 1500 |    500 |    1000 |
      | 2500 |    700 |    1800 |
