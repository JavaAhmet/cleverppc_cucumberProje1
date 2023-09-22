package Runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeTest",
        features = {"src/test/java/FeatureFiles"},
        glue={"StepDefinitions"},
        dryRun = false// true olduğunda testi çalıştırmaz sadece feature lara
        // ait steplerin varlığını kontrol eder.
        // false olduğunda ise testi çalıştırır
      //  plugin= {"html:target/site/cucumber-pretty.html"}  // basit rapor -> cuma akşam yoruma alındı
)
public class TestRunner extends AbstractTestNGCucumberTests {
}
