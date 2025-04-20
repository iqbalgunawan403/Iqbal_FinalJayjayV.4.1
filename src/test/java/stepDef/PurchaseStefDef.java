package stepDef;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.PurchasePage;

import java.util.Map;

public class PurchaseStefDef {
    PurchasePage purchasePage;


    public PurchaseStefDef() {
        this.purchasePage = new PurchasePage();
    }

    @Then("the user will be directed to fill in the data form")
    public void theUserWillBeDirectedToFillInTheDataForm() {
        purchasePage.assertForm();
    }

    @Then("user will be directed to fill out the following data form")
    public void userWillBeDirectedToFillOutTheFollowingDataForm(DataTable dataTable) {
        Map<String, String> formData = dataTable.asMap(String.class, String.class);
        purchasePage.fillOrderForm(
                formData.get("Name"),
                formData.get("Country"),
                formData.get("City"),
                formData.get("Card"),
                formData.get("Month"),
                formData.get("Year")
        );
    }

    @Then("user click Purchase button")
    public void userClickPurchaseButton() {
        purchasePage.clickButtonPurchase();
    }

    @Then("user should see success message {string}")
    public void userShouldSeeSuccessMessage(String expectedMessage) {
        Assert.assertEquals(expectedMessage, purchasePage.getSuccessMessage());
    }
}
