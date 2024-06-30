Feature: Login Scenario For MarketPlace

  # Scenario: Check invalid Login functionality
  #   Given User visits the MarketPlace Portal
  #   When User enters User name as "mariegold@mailinator.com"
  #   Then User enters Password as "Gaian@123"
  #   And User clicks on Login
  #   Then User asserts invalid ToastMessage

  Scenario: verify Check Login Functionality
    Given User visits the MarketPlace Portal
    When User enters User name as "TestDemo15@mailinator.com"
    Then User enters Password as "Gaian@123"
    And User clicks on Login
    # Then User asserts Toast Message
    And User click on Profile Icon and click on logout Option
