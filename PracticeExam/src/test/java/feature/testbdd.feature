Feature: As a user I want to click the button and change the background color
Scenario: A user click a setSkyBlue botton and the background should change to skyblue
	Given Set background button available
	When The user click the blue button 			
	Then The background change
	
Scenario: A user click a setWhiteBackground botton and the background should change to white
	Given Set background button available
	When The user click the white button 			
	Then The background change