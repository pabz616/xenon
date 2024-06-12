package com.playwrightTest.pages;
import com.microsoft.playwright.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.regex.Pattern;

public class AdminPage {
    private final Page page;
    private final Locator pageTitle;
    private final Locator successMsg;
    private final Locator subheader;
    private final Locator logoutButton;

    public AdminPage (Page page) {
        this.page = page;
        this.pageTitle = page.locator("//h2");
        this.successMsg = page.locator("//div[@id='flash']");
        this.subheader = page.locator("//h4[@class='subheader']");
        this.logoutButton = page.locator("//a[contains(.,'Logout')]");
    }

    public void checkUI() {
        assertThat(page).hasTitle(Pattern.compile("The Internet"));
        assertThat(pageTitle).isVisible();
        assertThat(pageTitle).containsText("Secure Area");

        assertThat(successMsg).isVisible();
        assertThat(successMsg).containsText("You logged into a secure area!");

        assertThat(subheader).isVisible();
        assertThat(subheader).containsText("Welcome to the Secure Area.");

        assertThat(logoutButton).isVisible();
        assertThat(logoutButton).isEnabled();
    }

    public void logout (){
        logoutButton.click();
    }

    
}


//flash