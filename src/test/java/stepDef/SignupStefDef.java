package stepDef;

import helper.Utility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SignupPage;

import java.util.UUID;


public class SignupStefDef {
    SignupPage signupPage;
    Utility util = new Utility();

    public SignupStefDef() {
        this.signupPage = new SignupPage();
    }

    @Given("the user is on the home page")
    public void theUserIsOnTheHomePage() {
       util.goToHomepage();
    }

    @And("user enters username dynamic")
    public void userEntersUsernameDynamic() {
        String dynamicUsername = "User_" + UUID.randomUUID().toString().substring(0, 6);
        signupPage.signupUsername(dynamicUsername);
    }

    @And("user enters  password {string}")
    public void userEntersPassword(String password) {
        signupPage.signupPassword(password);
    }

    @And("user clicks the sign up button")
    public void userClicksTheSignUpButton() {
        signupPage.clickSignupLabel();
    }


    @When("user click the sign up button")
    public void userClickTheSignUpButton() {
        signupPage.clickBtnSignup();
    }


    @Then("user will receive a message popup {string}")
    public void userWillReceiveAMessagePopup(String messageSuccess) {
        signupPage.messageSuccessPopup(messageSuccess);
    }

    @Given("the is on the sign up page")
    public void theIsOnTheSignUpPage() {
        signupPage.clickSignupLabel();

    }

    @When("the user clicks the sign up button without entering username and password")
    public void theUserClicksTheSignUpButtonWithoutEnteringUsernameAndPassword() {
        signupPage.clickBtnSignup();

    }

    @Then("the user should see an error message {string}")
    public void theUserShouldSeeAnErrorMessage(String messageError) {
        signupPage.messageErrorPopup(messageError);
    }
}

