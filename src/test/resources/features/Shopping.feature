Feature: Shopping

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