package Steps;

import Base.BaseUtil;
import Transformation.EmailTransform;
import Transformation.SalaryCountTransformer;
import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.Transform;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

import java.util.ArrayList;
import java.util.List;

public class LoginStep extends BaseUtil{

    private BaseUtil base;

    public LoginStep(BaseUtil base) {
        this.base = base;
    }

    @Then("^I should see the userform page$")

    public void iShouldSeeTheUserformPage() throws Throwable {

        System.out.println("I should see userform page");

    }

    @Given("^I navigate to the login page$")
    public void iNavigateToTheLoginPage() throws Throwable {

        System.out.println("Navigate Login Page");
        base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");

    }

    @And("^I click login button$")
    public void iClickLoginButton() throws Throwable {

        System.out.println("Click login button");

    }

    @And("^I enter the following for Login$")
    public void iEnterTheFollowingForLogin(DataTable table) throws Throwable {

        //List<List<String>> data = table.raw();

        /*System.out.println("The Value is : " + data.get(0).get(0).toString());
        System.out.println("The Value is : " + data.get(0).get(1).toString());*/

        //Create an ArrayList
        List<User> users = new ArrayList<User>();

        //Store all the users
        users = table.asList(User.class);

        for (User user : users) {
            System.out.println("The UserName is " + user.username);
            System.out.println("The Password is " + user.password);
        }
    }

    @And("^I enter ([^\"]*) and ([^\"]*)$")
    public void iEnterUsernameAndPassword(String userName, String passWord) throws Throwable {

        System.out.println("UserName is : " + userName);
        System.out.println("UserName is : " + passWord);
    }

    @And("^I enter the users email address as Email:([^\"]*)$")
    public void iEnterTheUsersEmailAddressAsEmailAdmin(@Transform(EmailTransform.class) String email) throws Throwable {

        System.out.println("The Email Address is " + email);
    }

    @And("^I verify the count of my salary digits for Rs (\\d+)$")
    public void iVerifyTheCountOfMySalaryDigitsForRs(@Transform(SalaryCountTransformer.class) int salary) throws Throwable {

        System.out.println("My Salary digits is : " + salary);
    }

    public class User {
        public String username;
        public String password;

        public User(String userName, String passWord) {
            username = userName;
            password = passWord;
        }
    }
}
