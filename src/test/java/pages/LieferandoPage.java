package pages;

import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class LieferandoPage {

    public LieferandoPage() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getDriver()), this);
    }

    @AndroidFindBy(id = "com.yopeso.lieferando:id/emptyStateButton")
    public WebElement selectLocationBtn;
    @AndroidFindBy(id = "com.yopeso.lieferando:id/searchInput")
    public WebElement searchInput;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/restaurantCardHeaderImage\").instance(0)")
    public WebElement theFirstRestaurant;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/addProductButton\").instance(0)")
    public WebElement theFirstFood;
    @AndroidFindBy(id = "com.yopeso.lieferando:id/productDetailsAddToBasketButton")
    public WebElement priceBtn;
    @AndroidFindBy(id = "com.yopeso.lieferando:id/menuBasketBackground")
    public WebElement basketBtn;
    @AndroidFindBy(id = "com.yopeso.lieferando:id/basketCta")
    public WebElement checkOutBtn;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/internalEditText\").instance(0)")
    public WebElement streetAndHouseNumber;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/internalEditText\").instance(1)")
    public WebElement postCode;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/internalEditText\").instance(2)")
    public WebElement city;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/internalEditText\").instance(6)")
    public WebElement firstAndLastName;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/internalEditText\").instance(7)")
    public WebElement email;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/internalEditText\").instance(8)")
    public WebElement phoneNumber;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/checkoutCardCaret\").instance(1)")
    public WebElement payWithBtn;
    @AndroidFindBy(uiAutomator = "text(\"PayPal\")")
    public WebElement payPalBtn;
    @AndroidFindBy(uiAutomator = "resourceId(\"com.yopeso.lieferando:id/enabledCta\")")
    public WebElement orderAndPayBtn;




























}
