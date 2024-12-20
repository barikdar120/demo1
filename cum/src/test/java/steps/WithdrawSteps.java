package steps;

import org.junit.Assert;

import cum.cum.Bank;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class WithdrawSteps {
  Bank bk;
	@Given("I have account with {int} amount")
	public void i_have_account_with_amount(Integer init) {
	    bk = new Bank(init);
	}

	@When("I withdraw the {int} from my account")
	public void i_withdraw_the_from_my_account(Integer amount) {
		bk.withdraw(amount);
	    
	}

	@Then("I verify the {int} left in my account")
	public void i_verify_the_left_in_my_account(Integer expBalance) {
	   Integer actualBalance = new Integer(bk.getBlance());
	  Assert.assertEquals(expBalance, actualBalance);
	   
	}


	
}
