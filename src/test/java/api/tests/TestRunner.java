package api.tests;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;

import static io.cucumber.junit.platform.engine.Constants.*;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features") // <== lokasi folder .feature kamu
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "tests.steps")
@ConfigurationParameter(
        key = PLUGIN_PROPERTY_NAME,
        value = "pretty, html:reports/api-report.html, json:reports/api-report.json"
)
public class TestRunner {
}
