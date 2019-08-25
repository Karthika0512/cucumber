Feature: Validate the demo page

  Scenario Outline: Validate registration details
    Given User is on demo page
    When User enters "<Firstname>","<lastname>","<Address>","<Email>","<Phone>","<Password>","<Confirm>" details and submit
    Then Verify success message

    Examples: 
      | Firstname | lastname | Address | Email            | Phone      | Password  | Confirm   |
      | Karthika  | R        | Chennai | Karthi@gmail.com | 8521364975 | Karthi@12 | Karthi@12 |
