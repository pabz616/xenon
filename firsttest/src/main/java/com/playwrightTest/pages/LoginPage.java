package com.playwrightTest.pages;
import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.regex.Pattern;


public class LoginPage {
    private final Page page;
    private final Locator usernameInput;
    private final Locator passwordInput;
    private final Locator submitButton;
    private final Locator errorMsg;

    public LoginPage (Page page) {
        this.page = page;
        this.usernameInput = page.locator("#username");
        this.passwordInput = page.locator("#password");
        this.submitButton = page.locator("//button[contains(.,'Login')]");
        this.errorMsg = page.locator("#flash");
    }

    public void submitLogin (String username, String password) {
        usernameInput.fill(username);
        passwordInput.fill(password);
        submitButton.click();
    }

    public void checkUI() {
        assertThat(page).hasTitle(Pattern.compile("The Internet"));
        assertThat(usernameInput).isVisible();
        assertThat(usernameInput).isEditable();

        assertThat(passwordInput).isVisible();
        assertThat(passwordInput).isEditable();

        assertThat(submitButton).isVisible();
        assertThat(submitButton).isEnabled();
    }

    public void confirmValidationOccurs(){
        assertThat(errorMsg).isVisible();
        assertThat(errorMsg).containsText("Your username is invalid!");
    }
}
