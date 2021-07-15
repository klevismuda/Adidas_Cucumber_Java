package com.demobase.step_definitions;

import com.demobase.utilities.ConfigurationReader;
import com.demobase.utilities.Driver;
import io.cucumber.java.en.Given;

public class purchaseStepDefs {
    @Given("User is on the Home Page")
    public void user_is_on_the_home_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

}
