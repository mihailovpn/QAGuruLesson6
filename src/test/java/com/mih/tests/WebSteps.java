package com.mih.tests;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;

public class WebSteps {
    @Step ("Открываем страницу {page}")
    public void openMainPage(String page) {
        Configuration.startMaximized = true;
        open(page);
    }
    @Step("Находим репозиторий {repository}")
    public void searchForRepository(String repository) {
        $(".header-search-input").setValue(repository).pressEnter();
    }
    @Step("Открываем репозиторий {repository}")
    public void goToRepository(String repository) {
        $(linkText(repository)).click();
    }
    @Step("Проверяем название {menuName}")
    public void shouldHaveMenu(String menuName) {
        $(byText(menuName)).should(visible);
    }
}

