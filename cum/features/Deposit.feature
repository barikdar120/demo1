#Author: E
#Data:
#Review:
@deposit
Feature: Deposit

  Scenario Outline: To validate the deposit function
    Given I have an account with <init> Amount
    When I deposit <amount> in my account
    Then I verify the <balance> in my account

    Examples: 
      | init | amount | balance |  
      | 1000 |    500 |    1500 |  
      |  200 |    800 |    1000 | 