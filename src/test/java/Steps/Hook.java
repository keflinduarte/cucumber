package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUtil{

    @Before
    public void beforeScenario(Scenario scenario) {
        System.out.println("--- Starting scenario " + scenario.getName() + " execution ---");
    }

    @After
    public void TearDownTest(Scenario scenario) {

        if(scenario.isFailed()) {
            //Take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : Firefox");
        //driver.quit();
    }
}
