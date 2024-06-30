Feature: Map Page Scenario For MarketPlace
    Scenario: Check the Home Page Functionality
        Given User visits the MarketPlace Portal
        When User enters User name as "mobius@gaiansolutions.com"
        Then User enters Password as "Gaian@123"
        And User clicks on Login
        Then User asserts Toast Message
        And User clicks on the Interactive map dashboard
        Then User click on skip button
        # And User click on Profile Icon and click on logout Option
        And User select distance from canvas
        # Then User search Pleace as "hotels in us"
        # Then User click on Planning tool
        # And User click on Profile Icon and click on logout Option
