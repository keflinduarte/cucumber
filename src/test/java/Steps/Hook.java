package Steps;

import Base.BaseUtil;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Hook extends BaseUtil{

    private BaseUtil base;

    public Hook(BaseUtil base) {
        this.base = base;
    }

    @Before
    public void InitializeTest() {
        System.out.println("Opening the browser : Firefox");

        System.setProperty("webdriver.firefox.bin", "C:\\Users\\knro\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\knro\\workspace\\cucumber\\geckodriver-v0.20.0-win64\\geckodriver.exe");
        Driver = new FirefoxDriver();

        Driver.manage().window().maximize();
        Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");

    }

    @After
    public void TearDownTest(Scenario scenario) {

        if(scenario.isFailed()) {
            //Take screenshot
            System.out.println(scenario.getName());
        }
        System.out.println("Closing the browser : Firefox");
        Driver.quit();
    }
}
