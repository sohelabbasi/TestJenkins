package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.CommonMethods;

public class AddEmployeePage extends CommonMethods {

    @FindBy(id="firstName")
    public WebElement firstNameField;

    @FindBy(id="middleName")
    public WebElement middleNameField;

    @FindBy(id="lastName")
    public WebElement lastNameField;

    @FindBy(id="btnSave")
    public WebElement saveButton;

    @FindBy(id="photofile")
    public WebElement photoFileOption;

    @FindBy(id="chkLogin")
    public WebElement checkBox;

    @FindBy(id="user_name")
    public WebElement usernameOption;

    @FindBy(id="user_password")
    public WebElement passwordOption;

    @FindBy(id="re_password")
    public WebElement confirmPasswordOption;


    public AddEmployeePage(){
        PageFactory.initElements(driver, this);
    }

}
