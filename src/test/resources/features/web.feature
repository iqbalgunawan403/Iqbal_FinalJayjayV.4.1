Feature:Test Automation WEB On demoblaze.com

  @web
  Scenario: Sign up with new username and password
    Given the user is on the home page
    And user clicks the sign up button
    And user enters username dynamic
    And  user enters  password "Pass_123456"
    When user click the sign up button
    Then user will receive a message popup "Sign up successful."

  @web
  Scenario:Sign up with missing required fields
    Given the user is on the home page
    Then the is on the sign up page
    When the user clicks the sign up button without entering username and password
    Then the user should see an error message "Please fill out Username and Password."

  @web
  Scenario: Login with a invalid registered account
    Given the user is on the home page
    And user clicks on the login menu in the navbar
    And user enters username "iqbal gunawan" on login page
    And  user enters password "manado123" on login page
    When user click the login button
    Then user will receive a message popup "User does not exist."


  @web
  Scenario: Login with a valid registered account
    Given the user is on the home page
    And user clicks on the login menu in the navbar
    And user enters username "iqbalgunawan" on login page
    And  user enters password "1234" on login page
    When user click the login button
    Then the user should see a welcome message "Welcome iqbalgunawan"

  @web
  Scenario: user successfully checkout item
    Given the user is on the home page
    Then user select product "Samsung galaxy s6"
    Then user clicks add to cart button
    Then user accepts product added popup
    When user clicks label cart
    When user click Place order button
    Then user will be directed to fill out the following data form
      | Name    | Iqbal Gunawan    |
      | Country | Indonesia        |
      | City    | Jakarta          |
      | Card    | 123456789        |
      | Month   | 05               |
      | Year    | 2025             |
    Then user click Purchase button
    Then user should see success message "Thank you for your purchase!"

  @web
  Scenario: Logout user
    Given the users is logged in
    When the user clicks the log out button in the navbar
    Then the user should be redirected to home page
