Feature: Shopping

  # Cenário comum para acessar o site e fazer login
  Background:
    Given I access the website "https://www.saucedemo.com/"
    When I enter the "standard_user" and "secret_sauce"
    And I click on the login button
    Then I should see the Products page

  Scenario Outline: View the list of products
    When I view the list of products
    Then I should see the list of products
    Examples:
      | username        | password       |
      | "standard_user" | "secret_sauce" |

  Scenario Outline: Add a product to the cart
    When I add the <product> to the cart
    Then The product should be added to the cart
    And The remove button should be displayed
    Examples:
      | username        | password       | product         |
      | "standard_user" | "secret_sauce" | "backpack"      |
      | "standard_user" | "secret_sauce" | "fleece-jacket" |

  Scenario Outline: Remove a product from the cart
    When I add the <product> to the cart
    And I remove the <product> from the cart
    Then The product should be removed from the cart
    Examples:
      | username        | password       | product         |
      | "standard_user" | "secret_sauce" | "backpack"      |
      | "standard_user" | "secret_sauce" | "fleece-jacket" |
