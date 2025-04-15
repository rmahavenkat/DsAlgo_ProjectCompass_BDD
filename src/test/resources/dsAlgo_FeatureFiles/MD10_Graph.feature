@graphfeature
Feature: Testing whether the user is navigating to Graph Page and perform actions

  Background: The user sign in to dsAlgo Portal

  @TC232
  Scenario: Verify that user is able to navigate to "Graph" data structure page
    Given The user is in the Home page after Sign in
    When The user clicks the "Getting Started" button in Graph Panel or The user select Graph item from the drop down menu
    Then The user be directed to "Graph" Graph Data Structure Page

  @TC233
  Scenario: Verify that user is able to navigate to "Graph" page
    Given The user is in the "Graph" graph page in data Stucture page
    When The user clicks "graph" graph Link in graph data Structure page
    Then The user should be redirected to"Graph" Graph page

  @TC234
  Scenario: Verify that user is able to navigate to "try Editor" page for "Graph" page
    Given The user is in the "graph" graph page
    When The user clicks "Try Here" try here button in Graph page
    Then The user should be redirected to a page having an try Editor with a Run button to test in graph

  @TC235
  Scenario: Verify that user receives error when click on Run button without entering code for "Graph" page
    Given The user is in the tryEditor page
    When The user clicks the Run button without entering the code in the Editor
    Then The user should able to see an error message in alert window

  @TC236
  Scenario: Verify that user receives error for invalid python code for "Graph" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run button
    Then The user should able to see an error message in alert window

  @TC237
  Scenario: Verify that user is able to see output for valid python code for "Graph" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run button
    Then The user should able to see output in the console Graph

  @TC238
  Scenario: Verify that user able to navigate the practice question page
    Given The user is in the Graph  page
    When The user clicks the "Practice Questions" button in graph
    Then The user is in Practice Question page of graph

  @TC239
  Scenario: Verify that user is able to navigate to "Graph Representations" page
    Given The user is in the "graph" graph page in data Stucture page
    When The user clicks "Graph Representations" Graph Representations Link in graph data Structure page
    Then The user should be redirected to"Graph Representations"  Graph Representations page

  @TC240
  Scenario: Verify that user is able to navigate to "try Editor" page for "Graph" page
    Given The user is in the "Graph Representations" Graph Representations page
    When The user clicks "Try Here" try here button in Graph Representations page
    Then The user should be redirected to a page having an try Editor with a Run button to test

  @TC241
  Scenario: Verify that user receives error when click on Run button without entering code for "Graph Representations" page
    Given The user is in the tryEditor page
    When The user clicks the Run Button without entering the code in the Editor	 of Graph Representations
    Then The user should able to see an error message in alert window

  @TC242
  Scenario: Verify that user receives error for invalid python code for "Graph Representations" page
    Given The user is in the tryEditor page
    When The user write the invalid code in Editor and click the Run Button	of Graph Representations
    Then The user should able to see an error message in alert window

  @TC243
  Scenario: Verify that user is able to see output for valid python code for "Graph Representations" page
    Given The user is in the tryEditor page
    When The user write the valid code in Editor and click the Run Button
    Then The user should able to see output in the console of Graph Representations

  @TC244
  Scenario: Verify that user able to navigate the practice question page
    Given The user is in the Graph Representation page
    When The user clicks the "Practice Questions" practice Ques button	of Graph Representations
    Then The user is in Practice Question page of Graph Representations
