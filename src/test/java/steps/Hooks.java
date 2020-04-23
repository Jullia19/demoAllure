package steps;

import io.cucumber.java.Before;
import pages.BasicPage;

import static com.codeborne.selenide.Selenide.*;

public class Hooks {

    BasicPage basicPage = new BasicPage();

    @Before
    public void openUrl() {
        open("https://grinfer.com/home");
        closeCookiesPopup();
    }

    public void closeCookiesPopup(){
        if(basicPage.checkTextExist("This website uses cookie")){
            basicPage.clickButtonSpan("I agree");
        }

    }
}
