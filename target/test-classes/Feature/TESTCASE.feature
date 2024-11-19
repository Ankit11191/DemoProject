@V1.1
Feature: User Registration
		verify user should register with different credencicals

Background: launch the application URL
    Given launch the amazon application 

	@Testcase001 @ValidScenario
  Scenario: User should login with valid credencials
    And go to registration page
    And fill all the valid registration details 
    When user register successfully
    Then I validate user login with new credencials 

	@Testcase002 @InValidScenario
  Scenario: User should login with invalid credencials
    And go to registration page
    And fill all the valid registration details 
    When user register successfully
    Then I validate user login with new credencials 

	@Testcase003 @InValidScenario @sanity
  Scenario: User should login with invalid credencials
    And go to registration page
    And fill all the valid registration details 
    When user register successfully
    Then I validate user login with new credencials
    And mark testcase as pass 

	@CheckLogin
  Scenario Outline: Title of your scenario outline
    Given go to login page
    When I provide username as "<UserName>"
    Then I provide password as "<Password>"
    And click on login button

    Examples: 
      | UserName  | Password 	| 
      | UN1 		|     pwd1 		| 
      | UN2 		|     pwd2 		|
      | UN3 		|     pwd3 		| 
      | UN4 		|     pwd4 		|
      | UN5 		|     pwd5 		| 
      | UN6 		|     pwd6 		|
      | UN7 		|     pwd7 		| 
      | UN8 		|     pwd8 		|
      