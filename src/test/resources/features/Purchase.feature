Feature: Adidas Order Placement Functionalities
  Agile Story: As a user, I should be able to place order from the Website

  Scenario: Placing a successful order
    Given User is on the Home Page
    When User add "Sony vaio i5" from "Laptops"
    And User add "Dell i7 8gb" from "Laptops"
    And User removes "Dell i7 8gb" from cart
    And User places order and captures and logs purchase ID and Amount
    Then User verifies purchase amount equals expected