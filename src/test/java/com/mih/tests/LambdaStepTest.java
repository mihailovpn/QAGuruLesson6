package com.mih.tests;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class LambdaStepTest {
    public static final String  REPOSITORY = "eroshenkoam/allure-example";
    @Test
    void checkIssueOnGithub() {

        step("Открываем страницу github", () -> {
            Configuration.startMaximized = true;
            open("https://github.com/");
        });

        step("Находим репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").setValue(REPOSITORY).pressEnter();
        });
        step("Открываем репозиторий " + REPOSITORY, () -> $(linkText(REPOSITORY)).click());

        step("Нажимаем Issues", () -> $(partialLinkText("Issues")).click());

        step("Проверяем наличие #68", () -> {
            $(byText("#68")).should(visible);
        });
    }
}
