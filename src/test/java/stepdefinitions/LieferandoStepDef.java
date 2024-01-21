package stepdefinitions;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LieferandoPage;

import java.awt.*;
import java.awt.event.KeyEvent;

import static utilities.ReusableMethods.*;


public class LieferandoStepDef {

    LieferandoPage lieferandoPage = new LieferandoPage();


    @When("The User select the Location on the Select your Location Button")
    public void theUserSelectTheLocationOnTheSelectYourLocationButton() {
        clickJS(lieferandoPage.selectLocationBtn);
    }

    @And("The User enter the Location in the Search Input")
    public void theUserEnterTheLocationInTheSearchInput() throws AWTException {
        sendKeys(lieferandoPage.searchInput, "Berlin Zentrum");

        Robot robot=new Robot();
        robot.delay(2000);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);

    }

    @Then("The User select the first Restaurant")
    public void theUserSelectTheFirstRestaurant() {
        clickJS(lieferandoPage.theFirstRestaurant);
    }

    @And("The User select the plus Button for the first food")
    public void theUserSelectThePlusButtonForTheFirstFood() {
        clickJS(lieferandoPage.theFirstFood);
    }

    @Then("The User press on the price Button")
    public void theUserPressOnThePriceButton() {
        clickJS(lieferandoPage.priceBtn);
    }

    @And("The User go in to Basket")
    public void theUserGoInToBasket() {
        clickJS(lieferandoPage.basketBtn);
    }

    @Then("The User press on the checkout Button")
    public void theUserPressOnTheCheckoutButton() {
        clickJS(lieferandoPage.checkOutBtn);
    }

    @And("The User enter the delivery Address and Personal details")
    public void theUserEnterTheDeliveryAddressAndPersonalDetails() {
        sendKeys(lieferandoPage.streetAndHouseNumber,"Brückenstraße 17");
        sendKeys(lieferandoPage.postCode,"12439");
        sendKeys(lieferandoPage.city, "Berlin");
        sendKeys(lieferandoPage.firstAndLastName, "MusterFirstName MusterLastName");
        sendKeys(lieferandoPage.email, "musterEmail@gmail.com");
        sendKeys(lieferandoPage.phoneNumber,"0123456789");


    }

    @And("The User press on the pay with Button")
    public void theUserPressOnThePayWithButton() {
       clickJS(lieferandoPage.payWithBtn);
    }

    @Then("The User select Paypal as payment method")
    public void theUserSelectPaypalAsPaymentMethod() {
        clickJS(lieferandoPage.payPalBtn);
    }

    @Then("The User complete the Order")
    public void theUserCompleteTheOrder() {
        waitForVisibility(lieferandoPage.city, 3);
        scrollPage("down",1);
        clickJS(lieferandoPage.orderAndPayBtn);
    }
}
