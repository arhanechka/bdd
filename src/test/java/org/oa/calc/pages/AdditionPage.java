package org.oa.calc.pages;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Олег on 03.09.2016.
 */
@DefaultUrl("http://manzhos.me/rest/calc.php")
public class AdditionPage extends PageObject{

    @FindBy (name="a")
    private WebElement fieldA;

    @FindBy (name="b")
    private WebElement fieldB;

    @FindBy (xpath="//input[@type='Submit']")
    private WebElement calculate;

    @FindBy (id="result")
    private WebElement result;

    public AdditionPage adding (String a, String b) {
        fieldA.clear();
        fieldA.sendKeys(a);
        fieldB.clear();
        fieldB.sendKeys(b);
        calculate.click();
        return this;
    }

    public String getResult(){
        return result.getText();
    }

    public AdditionPage startCalc(){
        open();
        return this;
    }
}