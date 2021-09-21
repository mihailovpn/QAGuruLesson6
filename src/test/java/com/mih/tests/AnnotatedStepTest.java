package com.mih.tests;

import org.junit.jupiter.api.Test;


public class AnnotatedStepTest {
    public static final String  PAGE = "Issue";
    public static final String  REPOSITORY = "eroshenkoam/allure-example";
    public static final String  MENUNAME = "Issue";


    @Test
    void checkIssueOnGithub() {

        WebSteps steps = new WebSteps();

        steps.openMainPage(PAGE);
        steps.searchForRepository(REPOSITORY);
        steps.goToRepository(REPOSITORY);
        steps.shouldHaveMenu(MENUNAME);
    }
}
