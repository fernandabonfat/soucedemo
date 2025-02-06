Feature: Login

  # Cenário para acessar a página e testar login
  Background:
    Given I access the website "https://www.saucedemo.com/"

  Scenario Outline: Login with valid credentials
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the Products page
    Examples:
      | username        | password       |
      | "standard_user" | "secret_sauce" |

  Scenario Outline: Login with invalid credentials
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the error message "Epic sadface: Username and password do not match any user in this service"
    Examples:
      | username        | password        |
      | "standard_user" | "wrongPassword" |
      | "wrongUser"     | "secret_sauce"  |

  Scenario Outline: Login with empty fields
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the error message <error_message>
    Examples:
      | username | password       | error_message                                                        |
      | ""       | "secret_sauce" | "Epic sadface: Username is required"                                  |
      | "standard_user" | ""   | "Epic sadface: Password is required"                                  |

  Scenario Outline: Login with locked user
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the error message "Epic sadface: Sorry, this user has been locked out."
    Examples:
      | username          | password       |
      | "locked_out_user" | "secret_sauce" |
