Feature: Checking the functionality of Amend Cheque Book feature
@ACSD_001
Scenario: Checking if the system is changing the chequebook status from submitted to apply to submit
Given User Launch CSM Core Application
And User Click Amend Cheque book Menu
And User Click Maintanence sub menu
And User_482 update test data set id for ACSD_001 
And User Select the Product type
And User Enter the Request Number in Amend Cheque Maintanence screen
And User Click Retrieve button
And User Click the Checkbox for retrieved record
And User click the Update button
And User Confirm Save Record
And User Success Ok pop up message
And User Click Chequebook Request Menu
And User Click Maintanence sub menu in chequebook request
And User_482 click search icon in MaintenanceScreen under chequebook request
And User_482 Search chequebook code in MaintenanceScreen under chequebook request
And User_482 Validate the chequebook status changed from submitted to apply to submit


@ACSD_001_PostReq
Scenario: checking if the user is able to submit a chequebook - short process
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User click Submit Sub Menu
And User_482 update test data set id for ACSD_001 
And User_482 Search Cheque Book Code in Submit Screen
And User_482 Select Cheque Book Code in Submit Screen
And User Click Submit button 
And User_482 Click Ok button in Warning pop up Message in Submit screen
And User_482 click ok button for no signatures and no finger print pop up warning Message
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User_482 Search Submitted chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Submitted chequebook record in Cheque book Request Maintenance Screen

@ACSD_005
Scenario: checking if the system is changing the chequebook status from "cancelled" to its old status "approved"
Given User Launch CSM Core Application
And User Click Amend Cheque book Menu
And User Click Maintanence sub menu
And User_482 update test data set id for ACSD_005
And User Select the Product type
And User Enter the Request Number in Amend Cheque Maintanence screen
And User_482 select Chequebookstatus in Amend Cheque Maintanence screen
And User Click Retrieve button
And User Click the Checkbox for retrieved record
And User click the Update button
And User Confirm Save Record
And User Success Ok pop up message
And User Click Chequebook Request Menu
And User Click Maintanence sub menu in chequebook request
And User_482 click search icon in MaintenanceScreen under chequebook request
And User_482 Search chequebook code in MaintenanceScreen under chequebook request
And User_482 Validate the chequebook status changed from cancelled to apply to approved

#pass
@ACSD_005_postReq
Scenario: checking if the user is able to cancel a chequebook without a reason - short process 
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Cancel Sub Menu
And User_482 update test data set id for ACSD_005
And User_482 Search Cheque Book Code in To Cancel Screen
And User_482 Select Cheque Book Code in To Cancel Screen
And User Click To Cancel button	in To Cancel Screen
And User Click Approve Cancel Sub Menu
And User_482 Search Cheque Book Code in Approve Cancel Screen
And User_482 Select Cheque Book Code in Approve Cancel Screen
And User Click Cancel button in Approve Cancel Screen
#And User Click Ok button in Warning pop up Message in Approve Cancel Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User_482 Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen

@ACSD_006
Scenario: checking if the system is changing the chequebook status from "cancelled" to its old status "send to provider"
Given User Launch CSM Core Application
And User Click Amend Cheque book Menu
And User Click Maintanence sub menu
And User_482 update test data set id for ACSD_006
And User Select the Product type
And User Enter the Request Number in Amend Cheque Maintanence screen
And User_482 select Chequebookstatus in Amend Cheque Maintanence screen
And User Click Retrieve button
And User Click the Checkbox for retrieved record
And User click the Update button
And User Confirm Save Record
And User Success Ok pop up message
And User Click Chequebook Request Menu
And User Click Maintanence sub menu in chequebook request
And User_482 click search icon in MaintenanceScreen under chequebook request
And User_482 Search chequebook code in MaintenanceScreen under chequebook request
And User_482 Validate the chequebook status changed from cancelled to send to provider

#pass
@ACSD_006_postReq
Scenario: checking if the user is able to cancel a chequebook without a reason - short process 
Given User Launch CSM Core Application
And User Click Chequebook Request Menu
And User Click To Cancel Sub Menu
And User_482 update test data set id for ACSD_006
And User_482 Search Cheque Book Code in To Cancel Screen
And User_482 Select Cheque Book Code in To Cancel Screen
And User Click To Cancel button	in To Cancel Screen
And User Click Approve Cancel Sub Menu
And User_482 Search Cheque Book Code in Approve Cancel Screen
And User_482 Select Cheque Book Code in Approve Cancel Screen
And User Click Cancel button in Approve Cancel Screen
#And User Click Ok button in Warning pop up Message in Approve Cancel Screen
And User Click Maintanence sub menu in chequebook request
And User Click Search button in chequebook request Maintenance Screen
And User_482 Search Cancelled chequebook code in Cheque book Request Maintenance Screen
Then User Validate the Cancelled chequebook record in Cheque book Request Maintenance Screen
