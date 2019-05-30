@tag
Feature: Register Tiki Account

  #Background:
  @tag1
  Scenario Outline: Register account with email successfully
    Given Go to Tikivn site
    When Click on Signup button
    And Input Fullname "<fullname>"
    And Input Phonenumber "<phonenumber>"
    And Input AuthenCode "<code>"
    And Input Email "<email>"
    And Input Password "<password>"
    And Select Gender
    And Select DOB
    Then Click on Register button to complete
    And Assert Register success message "<massage>"

    Examples: 
      | fullname  | phonenumber | code   | email             | password     | message                      |
      | TT Phuong |  0123987373 | 123456 | test001@gmail.com | abc123456789 | Đăng ký tài khoản thành công |
