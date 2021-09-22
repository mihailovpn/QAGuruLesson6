package com.mih.tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@Feature("Menu")
@Owner("Mikhailov")
public class AnnotatedStepTest {
    public static final String  PAGE = "https://github.com/";
    public static final String  REPOSITORY = "eroshenkoam/allure-example";
    public static final String  MENUNAME = "Issue";


    @Test
    @DisplayName("Проверка меню")
    @Severity(SeverityLevel.MINOR)
    void checkIssueOnGithub() {

        WebSteps steps = new WebSteps();

        steps.openMainPage(PAGE);
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.shouldHaveMenu(MENUNAME);
    }
}
