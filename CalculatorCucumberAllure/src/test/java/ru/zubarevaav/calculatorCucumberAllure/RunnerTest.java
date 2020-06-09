package ru.zubarevaav.calculatorCucumberAllure;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "ru.zubarevaav.calculatorCucumberAllure",
        tags = "@all"
)
public class RunnerTest {
}