Feature: System Admin Login 

Scenario Outline: Login with System Admin User ID 

	Given Open Salesforce Application 
	When Salesforce login page title should be "Login | Salesforce"
	Then populate Username and Password fields "<username>" and "<password>" 
	And user clicks on the login button 
	And Salesforce Home title shold be "Home | Salesforce"
	Then user will close the application 
	
	
	Examples: 
		| username                           | password          |
		| vedant.jagani@campingworld.com.test| Welcome2019*|