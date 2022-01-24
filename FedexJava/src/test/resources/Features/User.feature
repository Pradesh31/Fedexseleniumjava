Feature: Feature to test login

Scenario: Successfull login with valid credential

    Given user launch the chrome browser
    When user opens URL "https://www.fedex.com/en-gb/home.html"
    When user clicks on "ENGLISH" language
    When user accepted all Cookies in the home page
    Then page Title should be "Express delivery, Courier & Shipping services | FedEx United Kingdom"
    When user click the "closeicon" in Covid alert banner.
    When user clicks on "signup/login" icon.
    And user should be able to see "Log In" option in the menu.
    And user should be able to see "Create User ID" option in the menu.
    And user should be able to see "Open an Account" option in the menu.
    When user clicks on "Login"
    And user enters userid as "Pradesh25" and pwd as "India@2022"
    When user click Remember my user ID
    And user clicks on login
    And close browser
    