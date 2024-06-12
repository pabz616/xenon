package com.playwrightTest;

import com.microsoft.playwright.*;

public class FirstPlaywrightTest {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch();
            //SAFARI Browser browser = playwright.webkit().launch();
            Page page = browser.newPage();
            
            page.navigate("http://playwright.dev");
            browser.close();
        }
    }
}