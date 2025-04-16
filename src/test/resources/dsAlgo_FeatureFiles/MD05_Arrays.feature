@ArrayScenario
Feature: The user can navigate to the array page in DsAlgo portal
@TC40
Scenario: Verify that user is able to navigate to "Arrays" data structure page
Given The user is in the Home page after Sign in
When The user clicks the ""Getting Started"" button in Array Panel OR The user select Array item from the drop down menu
Then The user be redirected to "Array" array Data Structure Page
@TC41
Scenario: Verify that user is able to navigate to "Arrays in Python" page
Given The user is in the "Array" array page after Sign in
When The user clicks "Arrays in Python" button
Then The user should be redirected to "Arrays in Python" array page
@TC42
Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays in Python" page
Given The user is on the "Arrays in Python" array page
When The user clicks "Try Here" button in Arrays in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test
@TC43
Scenario: Verify that user receives error when click on Run button without entering code for "Arrays in Python" page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should able to see an error message in alert window
@TC44
Scenario: Verify that user receives error for invalid python code for "Arrays in Python" page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window
@TC45
Scenario: Verify that user is able to see output for valid python code for "Arrays in Python" page
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console
@TC46
Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays in Python" page
Given The user is on the "Arrays in Python" array page
When The user clicks "Practice Questions" Practice Questions button 
Then The user should be redirected to "Practice" array page
@TC47
Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays in Python" page
Given The user is on the "Practice" array page
When The user clicks the "Search the array" link
Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
@TC48
Scenario: Verify that user receives error for invalid python code on running "Search the array" question
Given The user is on the practice question1 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC49
Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC50
Scenario: Verify that user is able to run valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC51
Scenario: Verify that user receives error on submitting valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button after enter the valid code
Then The user see success message "Submission successful"
@TC52
Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Arrays in Python" page
Given The user is on the "Practice" array page
When The user clicks the "Max Consecutive Ones" link
Then The user should be redirected to "Max Consecutive Ones Question" page contains a question,and try Editor with Run and Submit buttons
@TC53
Scenario: Verify that user receives error for invalid python code on running "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC54
Scenario: Verify that user receives error on submitting invalid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC55
Scenario: Verify that user is able to run valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC56
Scenario: Verify that user receives error on submitting valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button after enter the valid code
Then The user see success message "Submission successful"
@TC57
Scenario: Verify that user is able to navigate to "Find numbers with even number of digits" Page from Practice question page of "Arrays in Python" page
Given The user is on the "Practice" array page
When The user clicks the "Find numbers with even number of digits" link
Then The user should be redirected to "Find numbers with even number of digits Question" page contains a question,and try Editor with Run and Submit buttons
@TC58
Scenario: Verify that user receives error for invalid python code on running "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC59
Scenario: Verify that user receives error on submitting invalid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC60
Scenario: Verify that user is able to run valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC61
Scenario: Verify that user receives error on submitting valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button after enter the valid code
Then The user see success message "Submission successful"
@TC62
Scenario: Verify that user is able to navigate to "Square of a sorted array" Page from Practice question page of "Arrays in Python" page
Given The user is on the "Practice" array page
When The user clicks the "Square of a sorted array" link
Then The user should be redirected to "Square of a sorted array Question" page contains a question,and try Editor with Run and Submit buttons
@TC63
Scenario: Verify that user receives error for invalid python code on running "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC64
Scenario: Verify that user receives error on submitting invalid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button
Then The user see an error message "No Tests were collected" in console
@TC65
Scenario: Verify that user is able to run valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC66
Scenario: Verify that user receives error on submitting valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button after enter the valid code
Then The user see success message "Submission successful"  
@TC67
Scenario: Verify that user is able to navigate to "Arrays using list" page
Given The user in the "Array in python" page 
When The user clicks "Arrays using list" button
Then The user should be redirected to "Arrays using list" array page
@TC68
Scenario: Verify that user is able to navigate to "try Editor" page for "Arrays using list" page
Given The user is on the "Arrays using list" array page
When The user clicks "Try Here" button in Arrays in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test
@TC69
Scenario: Verify that user receives error when click on Run button without entering code for "Arrays using list" page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should able to see an error message in alert window
@TC70
Scenario: Verify that user receives error for invalid python code for "Arrays using list" page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window
@TC71
Scenario: Verify that user is able to see output for valid python code for "Arrays using list" page
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console
@TC72
Scenario: Verify that user is able to navigate to "Practice Questions" Page for "Arrays using list" page
Given The user in the "Arrays using list" page
When The user clicks "Practice Questions" button
Then The user should be redirected to "Practice" array page
@TC73
Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Arrays using list" page
Given The user is on the "Practice" array page
When The user clicks the "Search the array" link
Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
@TC74
Scenario: Verify that user receives error for invalid python code on running "Search the array" question
Given The user is on the practice question1 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC75
Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC76
Scenario: Verify that user is able to run valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC77
Scenario: Verify that user receives error on submitting valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button after enter the valid code
Then The user see success message "Submission successful"
@TC78
Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Arrays using list" page
Given The user is on the "Practice" array page
When The user clicks the "Max Consecutive Ones" link
Then The user should be redirected to "Max Consecutive Ones Question" page contains a question,and try Editor with Run and Submit buttons
@TC79
Scenario: Verify that user receives error for invalid python code on running "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC80
Scenario: Verify that user receives error on submitting invalid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button 
Then The user see an error message "Error occurred during submission"
@TC81
Scenario: Verify that user is able to run valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC82
Scenario: Verify that user receives error on submitting valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button after enter the valid code
Then The user see success message "Submission successful"
@TC83
Scenario: Verify that user is able to navigate to "Find numbers with even number of digits" Page from Practice question page of "Arrays using list" page
Given The user is on the "Practice" array page
When The user clicks the "Find numbers with even number of digits" link
Then The user should be redirected to "Find numbers with even number of digits Question" page contains a question,and try Editor with Run and Submit buttons
@TC84
Scenario: Verify that user receives error for invalid python code on running "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC85
Scenario: Verify that user receives error on submitting invalid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC86
Scenario: Verify that user is able to run valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC87
Scenario: Verify that user receives error on submitting valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button after enter the valid code
Then The user see success message "Submission successful"
@TC88
Scenario: Verify that user is able to navigate to "Square of a sorted array" Page from Practice question page of "Arrays using list" page
Given The user is on the "Practice" array page
When The user clicks the "Square of a sorted array" link
Then The user should be redirected to "Square of a sorted array Question" page contains a question,and try Editor with Run and Submit buttons
@TC89
Scenario: Verify that user receives error for invalid python code on running "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC90
Scenario: Verify that user receives error on submitting invalid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button
Then The user see an error message "No Tests were collected" in console
@TC91
Scenario: Verify that user is able to run valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC92
Scenario: Verify that user receives error on submitting valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button after enter the valid code 
Then The user see success message "Submission successful"
@TC93
Scenario: Verify that user is able to navigate to "Basic operations in lists" page
Given The user in the "Arrays using list" page 
When The user clicks "Basic operations in lists" button
Then The user should be redirected to "Basic operations in lists" array page
@TC94
Scenario: Verify that user is able to navigate to "try Editor" page for "Basic operation in lists" page
Given The user is on the "Basic operations in lists" array page
When The user clicks "Try Here" button in Arrays in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test
@TC95
Scenario: Verify that user receives error when click on Run button without entering code for "Basic operations in lists" page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should able to see an error message in alert window
@TC96
Scenario: Verify that user receives error for invalid python code for "Basic operations in lists" page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and click the Run button
Then The user should able to see an error message in alert window
@TC97
Scenario: Verify that user is able to see output for valid python code for "Basic operations in lists" page
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console
@TC98
Scenario: Verify that user is able to navigate to Practice Questions "Basic operations in lists"  page
Given The user in the "Basic operations in lists" page 
When The user clicks "Practice Questions" button
Then The user should be redirected to "Practice" array page
@TC99
Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Basic operations in lists"  page
Given The user is on the "Practice" array page
When The user clicks the "Search the array" link
Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
@TC100
Scenario: Verify that user receives error for invalid python code on running "Search the array" question
Given The user is on the practice question1 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC101
Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC102
Scenario: Verify that user is able to run valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC103
Scenario: Verify that user receives error on submitting valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button
Then The user see success message "Submission successful"
@TC104
Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Basic operations in lists" page
Given The user is on the "Practice" array page
When The user clicks the "Max Consecutive Ones" link
Then The user should be redirected to "Max Consecutive Ones Question" page contains a question,and try Editor with Run and Submit buttons
@TC105
Scenario: Verify that user receives error for invalid python code on running "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC106
Scenario: Verify that user is able to run valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC107
Scenario: Verify that user receives error on submitting valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button
Then The user see success message "Submission successful"
@TC108
Scenario: Verify that user receives error on submitting invalid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC109
Scenario: Verify that user is able to navigate to "Find numbers with even number of digits" Page from Practice question page of "Basic operations in lists" page
Given The user is on the "Practice" array page
When The user clicks the "Find numbers with even number of digits" link
Then The user should be redirected to "Find numbers with even number of digits Question" page contains a question,and try Editor with Run and Submit buttons
@TC110
Scenario: Verify that user receives error for invalid python code on running "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC111
Scenario: Verify that user receives error on submitting invalid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC112
Scenario: Verify that user is able to run valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC113
Scenario: Verify that user receives error on submitting valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button
Then The user see success message "Submission successful"
@TC114
Scenario: Verify that user is able to navigate to "Square of a sorted array" Page from Practice question page of "Basic operations in lists" page
Given The user is on the "Practice" array page
When The user clicks the "Square of a sorted array" link
Then The user should be redirected to "Square of a sorted array Question" page contains a question,and try Editor with Run and Submit buttons
@TC115
Scenario: Verify that user receives error for invalid python code on running "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC116
Scenario: Verify that user receives error on submitting invalid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button
Then The user see an error message "No Tests were Collected" in console
@TC117
Scenario: Verify that user is able to run valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output 
@TC118
Scenario: Verify that user receives error on submitting valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button
Then The user see success message "Submission successful"
@TC119
Scenario: Verify that user is able to navigate to "Applications of array" page
Given The user in the "Basic operations in lists" page 
When The user clicks "Applications of array" button
Then The user should be redirected to "Applications of array" array page
@TC120
Scenario: Verify that user is able to navigate to "try Editor" page for "Applications of array" page
Given The user is on the "Applications of array" array page
When The user clicks "Try Here" button in Arrays in Python page
Then The user should be redirected to a page having an try Editor with a Run button to test
@TC121
Scenario: Verify that user receives error when click on Run button without entering code for "Applications of array" page
Given The user is in the tryEditor page
When The user clicks the Run button without entering the code in the Editor
Then The user should able to see an error message in alert window
@TC122
Scenario: Verify that user receives error for invalid python code for "Applications of array" page
Given The user is in the tryEditor page
When The user write the invalid code in Editor and clicks the Run button
Then The user should able to see an error message in alert window
@TC123
Scenario: Verify that user is able to see output for valid python code for "Applications of array"  page
Given The user is in the tryEditor page
When The user write the valid code in Editor and click the Run Button
Then The user should able to see output in the console
@TC124
Scenario: Verify that user is able to navigate to Practice Questions "Applications of array"  page
Given The user in the "Applications of array" page
When The user clicks "Practice Questions" button
Then The user should be redirected to "Practice" array page
@TC125
Scenario: Verify that user is able to navigate to "Search the array" Page from Practice question page of "Applications of array"  page
Given The user is on the "Practice" array page
When The user clicks the "Search the array" link
Then The user should be redirected to "Question" page contains a question,and try Editor with Run and Submit buttons
@TC126
Scenario: Verify that user receives error for invalid python code on running "Search the array" question
Given The user is on the practice question1 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC127
Scenario: Verify that user receives error on submitting invalid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC128
Scenario: Verify that user is able to run valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC129
Scenario: Verify that user receives error on submitting valid python code for "Search the array" question
Given The user is on the practice question1 editor
When The user Click the Submit Button
Then The user see success message "Submission successful"
@TC130
Scenario: Verify that user is able to navigate to "Max Consecutive Ones" Page from Practice question page of "Applications of array" page
Given The user is on the "Practice" array page
When The user clicks the "Max Consecutive Ones" link
Then The user should be redirected to "Max Consecutive Ones Question" page contains a question,and try Editor with Run and Submit buttons
@TC131
Scenario: Verify that user receives error for invalid python code on running "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC132
Scenario: Verify that user receives error on submitting invalid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC133
Scenario: Verify that user is able to run valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC134
Scenario: Verify that user receives error on submitting valid python code for "Max Consecutive Ones" question
Given The user is on the practice question2 editor
When The user Click the Submit Button
Then The user see success message "Submission successful"
@TC135
Scenario: Verify that user is able to navigate to "Find numbers with even number of digits" Page from Practice question page of "Applications of array" page
Given The user is on the "Practice" array page
When The user clicks the "Find numbers with even number of digits" link
Then The user should be redirected to "Find numbers with even number of digits Question" page contains a question,and try Editor with Run and Submit buttons
@TC136
Scenario: Verify that user receives error for invalid python code on running "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC137
Scenario: Verify that user receives error on submitting invalid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button
Then The user see an error message "Error occurred during submission"
@TC138
Scenario: Verify that user is able to run valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC139
Scenario: Verify that user receives error on submitting valid python code for "Find numbers with even number of digits" question
Given The user is on the practice question3 editor
When The user Click the Submit Button
Then The user see success message "Submission successful"
@TC140
Scenario: Verify that user is able to navigate to "Square of a sorted array" Page from Practice question page of "Applications of array" page
Given The user is on the "Practice" array page
When The user clicks the "Square of a sorted array" link
Then The user should be redirected to "Square of a sorted array Question" page contains a question,and try Editor with Run and Submit buttons
@TC141
Scenario: Verify that user receives error for invalid python code on running "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the invalid code in qs and Click the Run Button
Then The user should able to see an error message in alert window
@TC142
Scenario: Verify that user receives error on submitting invalid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button
Then The user see an error message "No tests were Collected" in console
@TC143
Scenario: Verify that user is able to run valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user write the valid code in qs and Click the Run Button
Then The user should able to see output
@TC144
Scenario: Verify that user receives error on submitting valid python code for "Square of a sorted array" question
Given The user is on the practice question4 editor
When The user Click the Submit Button
Then The user see success message for "Submission successful"