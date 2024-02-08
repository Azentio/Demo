Feature: To Test the amend cheque card status module
@ACSD_002
Scenario: checking if the system is changing the chequebook status from SUBMITTED to APPLY TO SUBMIT
Given navigate to CSM application and login with valid credentials
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And get the test data for test case ACSD_002
And change the product type to cheque book
And enter the branch code in amend cheque
And enter the currency code in amend cheque
And enter the GL code in amend cheque
And enter the CIF No in amend cheque
And click on ok button in amend cheque screen
And close the warningpopupin amend cheque screen
And enter the serial number in amend cheque
And enter the request no in amend cheque
And give the status in submitted
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
Then validate system through the validation for the amend cheque record
@ACSD_003
Scenario: checking if the system is changing the chequebook status from DESTROYED to APPROVED
Given navigate to CSM application and login with valid credentials
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And get the test data for test case ACSD_003
And change the product type to cheque book
And enter the branch code in amend cheque
And enter the currency code in amend cheque
And enter the GL code in amend cheque
And enter the CIF No in amend cheque
And enter the serial number in amend cheque
And enter the request no in amend cheque
#And give the status in destroyed
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And click on ok button after saving the amend cheque status record
And click on cheque request module
And click on cheque query module
And click on live search in cheque query
And enter the Gl number in cheque query live search
And enter the CIF number in cheque query live search
And select the records from live search
And enter the cheque request number in search grid
Then verify status of the cheque should changed destroyed to approved

@ACSD_004
Scenario: checking if the system is reversing the charges transaction if charges were applied at the destroy
Given navigate to CSM application and login with valid credentials
And click on cheque request module
And click on to be destroyed module
And get the test data for ACSD_004 test case
And search the cheque code for to be destroyed cheque code
And click on to destroy button
Then verify server got loaded for to be destroyed record
And click on destroy module
And search for destroy record cheque code
And select the destroy record
And click on destroy button
Then get the transaction number and click on alert ok button
And click on Transaction module
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the transaction number in transaction screen
And verify transaction status should be approved
And close the tranaction screen
And click on amend cheque card status module
And click on maintenance screen under cheque card status module
And change the product type to cheque book
And enter the branch code in amend cheque
And enter the currency code in amend cheque
And enter the GL code in amend cheque
And enter the CIF No in amend cheque
And enter the serial number in amend cheque
And enter the request no in amend cheque
And give the status in destroyed
And click on retrive in amend cheque
And select the retrived record from amend cheque
And click on update in amend cheque
And click on ok button in amend cheque update confirmation
And click on ok button after saving the amend cheque status record
And click on cheque book request maintenance screen
And click on search in cheque book request maintenance scren
And search the cheque code in cheque book request maintenance screen
Then verify system should show the status to approved for the cheque
And click on maintenance scree under transaction module
And click on search in transaction screen
And search the transaction number in transaction screen
Then verify system should reverse the transaction of the charged cheque
@ACSD_003_Prereq
Scenario: checking if the system is reversing the charges transaction if charges were applied at the destroy
Given navigate to CSM application and login with valid credentials
And click on cheque request module
And click on to be destroyed module
And get the test data for test case ACSD_003
And search the cheque code for to be destroyed cheque code
And click on to destroy button
Then verify server got loaded for to be destroyed record
And click on destroy module
And search for destroy record cheque code
And select the destroy record
And click on destroy button
Then verify server got loaded while we destroy the cheque in destroy stage
 



