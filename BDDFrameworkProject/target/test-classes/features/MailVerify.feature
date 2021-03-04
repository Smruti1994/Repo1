Feature: Sending email

Scenario: Send an email from one mail'Id to another
Given Login with Sender's mailid
When sends an email to receiver
Then receiver receives the mail sent by the sender

 

