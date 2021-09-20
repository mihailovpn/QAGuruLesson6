package com.mih.tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.selector.ByText;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.*;

public class SelenideTest {


    @Test
    void checkIssueOnGithub() {
        Configuration.startMaximized = true;
        open("https://github.com/");

        $(".header-search-input").setValue("eroshenkoam/allure-example").pressEnter();
        $(linkText("eroshenkoam/allure-example")).click();
        $(partialLinkText("Issues")).click();
        $(byText("#68")).should(visible);
    }
}
