package org.practice.cucumber.step_definitions;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.practice.cucumber.utils.BaseUtil;

public class Hooks extends BaseUtil{

    private BaseUtil base;

    public Hooks(BaseUtil util){
        base = util;
    }

    @Before
    public void beforeTest(){
        base.stepInfo = "Some kind of dependency injection";
        System.out.println("\n=== This happens before every test\n");
    }

    @After
    public void afterTest(Scenario scenario){
        System.out.println("=== Scenario status is " + scenario.getStatus() + "\n");
    }
}
