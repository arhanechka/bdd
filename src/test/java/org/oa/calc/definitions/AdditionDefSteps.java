package org.oa.calc.definitions;

import net.thucydides.core.annotations.Step;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;
import org.oa.calc.pages.AdditionPage;
import org.oa.calc.serenity.AdditionSerenity;
import net.thucydides.core.annotations.Step;

/**
 * Created by Anya on 03.09.2016.
 */
public class AdditionDefSteps {

    @Steps
    AdditionPage additionPage;
    @Steps
    AdditionSerenity additionSerenity;


    @Given ("Calculator page is opened")
    public void StartCalc(){
        additionSerenity.startCalc();
    }
    @When ("I add $a and $b")
    public void adding (String a, String b){
        additionPage.adding(a,b);    }

    @Then ("The result is $result")

    public void GetResult(String result){
      Assert.assertEquals(result,additionPage.getResult());
    }

}
