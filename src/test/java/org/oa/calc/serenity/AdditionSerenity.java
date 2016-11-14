package org.oa.calc.serenity;

import net.thucydides.core.annotations.Step;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.oa.calc.pages.AdditionPage;

/**
 * Created by Anya on 03.09.2016.
 */
public class AdditionSerenity {

    @Step
    public void startCalc(){}

    @Step
    public void adding (String a, String b){}

    @Step
    public void getResult (String result){}
}