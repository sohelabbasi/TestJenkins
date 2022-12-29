package steps;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;

import java.util.ArrayList;
import java.util.List;

public class DashboardSteps extends CommonMethods {

    @Then("user verify all the dashboard tabs")
    public void user_verify_all_the_dashboard_tabs(io.cucumber.datatable.DataTable dataTable) {
       List<String> expectedTabs = dataTable.asList();
       List<String> actualTabs = new ArrayList<>();

        for (WebElement ele: dashboard.dashboardTabs
             ) {
            actualTabs.add(ele.getText());
        }
        System.out.println(expectedTabs);
        System.out.println(actualTabs);

        Assert.assertTrue(expectedTabs.equals(actualTabs));
        }
}
