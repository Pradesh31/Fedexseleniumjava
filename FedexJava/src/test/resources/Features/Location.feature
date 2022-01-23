Feature: Feature to test location and language switcher

  Scenario: validate location and language switcher
    Given user launch the chrome browser
    When user opens URL "https://www.fedex.com/en-gb/home.html"
    And user should be able to see "NEDERLANDS" Language
    And user should be able to see "FRANCAIS" Language
    And user should be able to see "ENGLISH"  language
    When user clicks on "ENGLISH" language
    When user accepted all Cookies in the home page
    Then page Title should be "Express delivery, Courier & Shipping services | FedEx United Kingdom"




    
    
    

    