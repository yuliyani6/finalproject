package api.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/api",  // Lokasi file .feature
        glue = "api.steps",                   // Lokasi step definitions
        plugin = {
                "pretty",
                "html:target/api/cucumber-report.html",
                "json:target/api/cucumber-report.json"
        },
        monochrome = true,
        tags = "@api"
)
public class TestRunner {
}