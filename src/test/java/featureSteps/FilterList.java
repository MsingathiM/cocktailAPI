package featureSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.Random;

import static io.restassured.RestAssured.given;

public class FilterList {

    public static String url = "https://www.thecocktaildb.com/api/json/v1/1/list.php?";

    @Given("^I navigate to the filter list url$")
    public void iNavigateToTheFilterListUrl() {
        String endpoint = url;
    }


    @When("^I parse the filter key list value from provided options " +
            "I should return list of categories based on key value parsed$")
    public void iParseTheFilterKeyListValueFromProvidedOptionsIShouldReturnListOfCategoriesBasedOnKeyValueParsed() {
        String[] key = {"c", "g", "i", "a"};

        Random ran = new Random();
        String key_selector = key[ran.nextInt(key.length)];

        System.out.println(key_selector);
        //parse filter key from options list search
        given()
                .when()
                .get(url + key_selector + "=list")
                .then()
                .log()
                .body();
    }
}
