package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SignInPage {
    private SelenideElement loginInput = $(By.cssSelector("#email"));
    private SelenideElement passwordInput = $(By.cssSelector("#password"));
    private SelenideElement firstNameInput = $(By.cssSelector("#firstName"));
    private SelenideElement lastNameInput = $(By.cssSelector("#lastName"));
    private SelenideElement firstNameInput2 = $(By.cssSelector("#form_firstName"));
    private SelenideElement lastNameInput2 = $(By.cssSelector("#form_lastName"));


    public void inputLogin(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

    public void inputEmail(String text) { this.loginInput.val(text); }

    public void inputFirstName(String text) { this.firstNameInput.val(text); }

    public void inputLastName(String text) { this.lastNameInput.val(text); }

    public String getFirstName(){
       return firstNameInput2.getValue();
    }

    public String getLastName(){
       return lastNameInput2.getValue();
    }
}
