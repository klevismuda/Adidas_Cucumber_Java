package com.demoblase.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = "html:target/adidas_report.html",
        features = "src/test/resources/features",
        glue = "com/demoblase/step_definitions",
        dryRun = false

)
public class CukesRunner {

}
