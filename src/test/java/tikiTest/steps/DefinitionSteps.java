package tikiTest.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import tikiTest.steps.serenity.TikiSteps;

public class DefinitionSteps {

    @Steps
    TikiSteps tikivnstep;

    @Given("^Login Tiki site with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void login_Tiki_site_with_username_and_password(String user, String pwd) throws Throwable {
        tikivnstep.LoginPage(user,pwd);
        
    }
    
    @When("^Looking for any product \"([^\"]*)\" then perform payment these products$")
    public void looking_for_any_product_then_perform_payment_these_products(String keyword) throws Throwable {
       tikivnstep.LookingProductByKeyword(keyword);
       tikivnstep.PaymentProduct();
       
    }
    @When("^Test$")
    public void test() throws Exception {

    }

}
