package com.mycompany.testing;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"featureFiles"}
		,glue={"com.mycompany.stepdefinitions"}
		)
public class TestRunner extends AbstractTestNGCucumberTests {
	
	/*
	 * private TestNGCucumberRunner testNGCucumberRunner;
	 * 
	 * @BeforeClass(alwaysRun = true) public void setUpClass() throws Exception {
	 * testNGCucumberRunner = new TestNGCucumberRunner(this.getClass()); }
	 * 
	 * @Test(groups = "cucumber scenarios", description = "Runs Cucumber Scenarios",
	 * dataProvider = "scenarios") public void scenario(PickleWrapper pickleEvent,
	 * CucumberFeatureWrapper cucumberFeature) throws Throwable{
	 * testNGCucumberRunner.runScenario(pickleEvent.getPickle()); }
	 * 
	 * @DataProvider public Object[][] scenarios() { return
	 * testNGCucumberRunner.provideScenarios(); }
	 * 
	 * @AfterClass(alwaysRun = true) public void tearDownClass() {
	 * testNGCucumberRunner.finish(); }
	 */
}
