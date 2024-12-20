package steps;

import org.junit.Assert;

import cum.cum.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class DepositSteps {
	
	Bank bk;
	@Given("I have an account with {int} Amount")
	public void i_have_an_account_with_amount(Integer init) {
	     bk=new Bank(init);
	}

	@When("I deposit {int} in my account")
	public void i_deposit_in_my_account(Integer amount) {
	    bk.deposit(amount);
	}

	@Then("I verify the {int} in my account")
	public void i_verify_the_in_my_account(Integer expBalance) {
	    Integer actualBalance = new Integer(bk.getBlance());
	  
		Assert.assertEquals(expBalance,actualBalance);
	    
	}

	

	

}
