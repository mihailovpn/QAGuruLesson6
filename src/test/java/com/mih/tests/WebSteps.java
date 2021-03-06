package com.mih.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.Selenide;
import io.qameta.allure.Attachment;
import io.qameta.allure.Step;
import org.openqa.selenium.OutputType;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byPartialLinkText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {
    @Step ("Open page {page}")
    public void openMainPage(String page) {
        Configuration.startMaximized = true;
        open(page);
    }
    @Step("Find repository {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").setValue(repository).pressEnter();
        takeScreenshot();
    }
    @Step("Open repository {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
        takeScreenshot();
    }
    @Step("Check menu {menuName}")
    public void shouldHaveMenu(String menuName) {
        $(byPartialLinkText(menuName)).should(visible);
        takeScreenshot();
    }

    @Attachment(value = "Скриншот", type = "image/png")
    public byte[] takeScreenshot() {
        return Selenide.screenshot(OutputType.BYTES);
    }

}



