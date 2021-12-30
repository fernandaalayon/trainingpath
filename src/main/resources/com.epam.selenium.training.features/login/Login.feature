Feature: Login

  Background:
    Given the user is in the main page
    When the user presses the action link My Account
    Then the user should see the login form

    Scenario Outline: L-001 Success Login
      When the user intputs the login data <validUser>
      And the user presses the Login button
      Then the user should see their home view
      Examples:
        | validUser |  |
        | user1     |  |

#    Scenario Outline: L-002 Failed login
#      When the user inputs this credentials "<userName>" <userPwd>
#      And the user presses the Login button
#      Then the user should see this message
#      """
#      Invalid credentials. Please try again
#      """
#      Examples:
#        | userName | userPwd |
#        | tecBox   | textbox |
#        | textbox  | tectbox |
#        | tectBox  | tectbox |
#        | textbox  |         |
#        |          | textbox |
#        |          |         |
#        | Textbox  | textbox |
#        | textbox  | Textbox |
#
#  Scenario: L-003 Login-Password should be masked
#        When the user inputs "textbox" in password field
#        Then the user should see the masked password
#
#    Scenario: L-004 Logout Validation
#      When the user login in the session
#      And the user presses the Signout button
#      And the user presses Back browser button
#      Then the user should see the login form
#


