package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
//import models.api.User;
import org.apache.commons.lang3.RandomStringUtils;
import org.junit.Assert;
import pages.SignInPage;
//import impl.AuthServiceImpl;
//import services.AuthService;

import static appContext.RunContext.get;
import static appContext.RunContext.put;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();
    //AuthService authService = new AuthServiceImpl();

    @Then("Input login")
    public void inputLogin() {
        signInPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @Then("Input password")
    public void inputPassword() {
        signInPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Input email")
    public void inputEmail(){
        String email ="Auto_" + RandomStringUtils.randomAlphabetic(5) + "@mail.com";
        signInPage.inputEmail(email);
        put("email", email);
    }

    @Then("Input First Name")
    public void inputFirstName(){
        String firstName = UserConfig.USER_FIRST_NAME;
       signInPage.inputFirstName(firstName);
       put("firstName", firstName);
    }
    @Then("Input Last Name")
    public void inputLastName(){
        String lastName = UserConfig.USER_LAST_NAME;
        signInPage.inputLastName(lastName);
        put("lastName", lastName);
    }

    @Then("Check First Name")
    public void checkFirstName(){
        String expectValue = get("firstName",String.class);
        String actualValue = signInPage.getFirstName();
        Assert.assertEquals(expectValue,actualValue);
    }

    @Then("Check Last Name")
    public void checkLastName(){
        String expectValue = get("lastName",String.class);
        String actualValue = signInPage.getLastName();
        Assert.assertEquals(expectValue,actualValue);
    }

    /*@Then("Create User by API")
    public void createUserByAPI() {
        User newUser = User.builder()
                .email("auto_" + RandomStringUtils.randomAlphabetic(5) + "@.mail.com")
                .firstName("TestFirstName")
                .lastName("TestLastName")
                .password(UserConfig.USER_PASSWORD)
                .rememberMe(true)
                .build();
        put("user", newUser);

        User createdUser = authService.createUser(newUser);
        Assert.assertNotNull(createdUser);
        Assert.assertEquals(newUser.getEmail().toLowerCase(), createdUser.getEmail().toLowerCase());
        Assert.assertNotNull(createdUser.getId());
    }

    @Then("Login user by API")
    public void loginUserByAPI() {
        User user = get("user", User.class);
        User userLogged = authService.login(user);
        Assert.assertNotNull(userLogged);
    }*/
}
