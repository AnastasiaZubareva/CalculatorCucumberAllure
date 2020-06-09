package ru.zubarevaav.calculatorCucumberAllure.Steps;

import ru.zubarevaav.calculatorCucumberAllure.Classes.Calculator;
import cucumber.api.java.ru.*;
import org.hamcrest.Matchers;
import org.junit.Assert;

public class CalculatorRunSteps {
    private int total = 0;
    private Calculator calculator = new Calculator();

    @Когда("^я складываю (-?\\d+) и (-?\\d+)$")
    public void testAdd(int num1, int num2) throws Throwable {
        this.total = calculator.add(num1, num2);
    }

    @Тогда("^результат (-?\\d+)$")
    public void validateResult(int result) throws Throwable {
        Assert.assertThat(total, Matchers.equalTo(result));
    }
}
