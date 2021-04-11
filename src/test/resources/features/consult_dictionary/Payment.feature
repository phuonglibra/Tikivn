@tag
Feature: Payment demo

  #Background:
  @tag1
  Scenario Outline: Searching a product and perform payment by cash
    Given Login Tiki site with username "<email>" and password "<password>"
    When Looking for any product "<keyword>" then perform payment these products

    Examples: 
      | email                | password     | keyword |
      | tester6103@gmail.com | cogaitheky21 | loa     |

      