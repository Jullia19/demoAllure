package steps;

import io.cucumber.java.en.Then;
import pages.HomePage;

public class HomePageDef {

    HomePage homePage = new HomePage();

    @Then("Click avatar button")
    public void  clickAvatarButton(){
        homePage.avatarButton.click();
    }

    @Then("Click settings button")
    public void clickSettingsButton(){
        homePage.settingsButton.click();
    }
}
