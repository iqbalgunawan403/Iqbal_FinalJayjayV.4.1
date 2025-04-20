package stepDef;

import helper.Utility;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;
import pages.LogoutPage;

public class LogoutStefDef {
    LoginPage loginPage = new LoginPage();
    LogoutPage logoutPage = new LogoutPage();
    Utility util = new Utility();

    public void loggedInUser(String username, String password) {
        loginPage.clickLoginLabel();
        loginPage.loginUsername(username);
        loginPage.loginPassword(password);
        loginPage.clickBtnLogin();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException _) {
        }
    }

    @Given("the users is logged in")
    public void theUsersIsLoggedIn() {
       util.goToHomepage();
      loggedInUser("iqbalgunawan", "1234");
    }

    @When("the user clicks the log out button in the navbar")
    public void theUserClicksTheLogOutButtonInTheNavbar() {
        logoutPage.clickLogoutButton();

    }

    @Then("the user should be redirected to home page")
    public void theUserShouldBeRedirectedToHomePage() {
       util.goToHomepage();
    }
}
