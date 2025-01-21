Feature: Login

  Scenario Outline: Login with valid credentials
    Given I access the website "https://www.saucedemo.com/"
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the Products page
    Examples:
      | username        | password       |
      | "standard_user" | "secret_sauce" |


  Scenario Outline: Login with invalid credentials
    Given I access the website "https://www.saucedemo.com/"
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the error message "Epic sadface: Username and password do not match any user in this service"
    Examples:
      | username        | password        |
      | "standard_user" | "wrongPassword" |
      | "wrongUser"     | "secret_sauce"  |


  Scenario Outline: Login with empty username field
    Given I access the website "https://www.saucedemo.com/"
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the error message "Epic sadface: Username is required"
    Examples:
      | username | password       |
      | ""       | "secret_sauce" |


  Scenario Outline: Login with empty password field
    Given I access the website "https://www.saucedemo.com/"
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the error message "Epic sadface: Password is required"
    Examples:
      | username        | password |
      | "standard_user" | ""       |

  Scenario Outline: Login with locked user
    Given I access the website "https://www.saucedemo.com/"
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the error message "Epic sadface: Sorry, this user has been locked out."
    Examples:
      | username          | password       |
      | "locked_out_user" | "secret_sauce" |


  Scenario Outline: Add a product to the cart
    Given I access the website "https://www.saucedemo.com/"
    When I enter the <username> and <password>
    And I click on the login button
    Then I should see the Products page
    And I add the product to the cart
    Then The product should be added to the cart
    Examples:
      | username        | password       |
      | "standard_user" | "secret_sauce" |