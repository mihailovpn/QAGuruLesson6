package com.mih.tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class SelenideTest {
    @Test
    void checkIssue() {
        $("").should(text("Issue"));
    }
}
