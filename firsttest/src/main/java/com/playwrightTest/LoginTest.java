package com.playwrightTest;
import com.microsoft.playwright.*;
import com.playwrightTest.pages.LoginPage;
import com.playwrightTest.pages.AdminPage;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;


public class LoginTest {
    public static void main(String[] args) {
        String usn = "tomsmith";
        String pwd = "SuperSecretPassword!";

        try(Playwright playwright = Playwright.create()){
            Browser browser = playwright.chromium().launch();
            Page page = browser.newPage();
            page.navigate("https://the-internet.herokuapp.com/login");

            //TEST 1 - CONFIRM UI
            LoginPage onLoginPage = new LoginPage(page);
            onLoginPage.checkUI();

            //TEST 2 - BLANK SUBMISSION
            onLoginPage.submitLogin("", "");
            onLoginPage.confirmValidationOccurs();
            page.reload();

            //TEST 3 - INVALID SUBMISSION
            onLoginPage.submitLogin("foo", "bar");
            onLoginPage.confirmValidationOccurs();
            page.reload();


            //TEST 4 - VALID SUBMISSION
            onLoginPage.submitLogin(usn, pwd);
            assertThat(page).hasURL("https://the-internet.herokuapp.com/secure");

            AdminPage onAdminPage = new AdminPage(page);
            onAdminPage.checkUI();
            onAdminPage.logout();
            assertThat(page).hasURL("https://the-internet.herokuapp.com/login");
        }
    }
}
