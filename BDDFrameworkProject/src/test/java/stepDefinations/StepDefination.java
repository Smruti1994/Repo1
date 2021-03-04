package stepDefinations;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class StepDefination {
	String sendermail = "dummymail1@gmail.com";
	String receivermail = "dummymail2@gmail.com";
	String senderpassword = "dummypassword1";
	String receiverpassword = "dummypassword2";
    @Given("^Login with Sender's mailid$")
    public void login_with_senders_mailid() throws Throwable {
    	//Login with sender's mail id.
    	System.out.println("Sender Log in to gmail");
    	UtilityMenthods.gmailLogin(sendermail, senderpassword); 
    	System.out.println("Logged in to gmail");
    }

    @When("^sends an email to receiver$")
    public void sends_an_email_to_receiver() throws Throwable {
        System.out.println("Drafts and Sends an mail to receiver");
    }

    @Then("^receiver receives the mail sent by the sender$")
    public void receiver_receives_the_mail_sent_by_the_sender() throws Throwable {
    	//Receiver login to his account
    	UtilityMenthods.gmailLogin(receivermail, receiverpassword); 
    	System.out.println("Receiver checks the mail received by the sender ");
    }

}