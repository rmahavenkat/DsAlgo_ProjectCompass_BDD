@HomeScenario
Feature:  TC01 - TC16 - Verify user access to the dsAlgo portal
@TC01
Scenario: Verify that user is able to open the dsAlgo Portal
Given The user has browser open
When The user enter correct dsAlgo portal URL
Then The user should be able to land on dsAlgo portal with Get Started button
@TC02
Scenario: Verify the Home page for an user without Sign in
Given The user is on the DS Algo Portal
When The user clicks the "Get Started" button
Then The user should be navigated to the Data Structure Introduction page, which displays the "Register" and "Sign in" links.
@TC03
Scenario: Verify that user is able to view options for "Data Structures" dropdown on home page without Sign in
Given The user is on the Home page
When The user clicks the Data Structures dropdown 
Then The user should able to see 6 options "Arrays,Linked List,Stack,Queue,Tree,Graph" in dropdown menu
@TC04
Scenario: Verify that user able to see warning message while selecting "Arrays" from the drop down without Sign in.
Given The user is on the Home page
When The user selects "Arrays" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in"
@TC05
Scenario: Verify that user able to see warning message while selecting "Linked List" from the drop down without Sign in.
Given The user is on the Home page
When The user selects "Linked List" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in"
@TC06
Scenario: Verify that user able to see warning message while selecting "Stack" from the drop down without Sign in.
Given The user is on the Home page
When The user selects "Stack" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in"
@TC07
Scenario: Verify that user able to see warning message while selecting "Queue" from the drop down without Sign in.
Given The user is on the Home page
When The user selects "Queue" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in"
@TC08
Scenario: Verify that user able to see warning message while selecting "Tree" from the drop down without Sign in.
Given The user is on the Home page
When The user selects "Tree" from the drop down without Sign in.
Then The user should able to see an warning message "You are not logged in"
@TC09
Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Data Structures-Introduction" on the home page without Sign in
Given The user is on the Home page
When The user clicks "Get Started" buttons of "Data Structures-Introduction" on the homepage without Sign in
Then  The user should able to see an warning message "You are not logged in"
@TC10
Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Array" on the home page without Sign in
Given The user is on the Home page
When The user clicks "Get Started" buttons of "Array" on the homepage without Sign in
Then The user should able to see an warning message "You are not logged in"
@TC11
Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Linked List" on the home page without Sign in
Given The user is on the Home page
When The user clicks "Get Started" buttons of "Linked List" on the homepage without Sign in
Then The user should able to see an warning message "You are not logged in"
@TC12
Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Stack" on the home page without Sign in
Given The user is on the Home page
When The user clicks "Get Started" buttons of "Stack" on the homepage without Sign in
Then The user should able to see an warning message "You are not logged in"
@TC13
Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Queue" on the home page without Sign in
Given The user is on the Home page
When The user clicks "Get Started" buttons of "Queue" on the homepage without Sign in
Then The user should able to see an warning message "You are not logged in"
@TC14
Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Tree" on the home page without Sign in
Given The user is on the Home page
When The user clicks "Get Started" buttons of "Tree" on the homepage without Sign in
Then The user should able to see an warning message "You are not logged in"
@TC15
Scenario: Verify that user able to see warning message on clicking "Get Started" buttons of "Graph" on the home page without Sign in
Given The user is on the Home page
When The user clicks "Get Started" buttons of "Graph" on the homepage without Sign in
Then The user should able to see an warning message "You are not logged in"
