package featureSteps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.nullValue;
import static org.hamcrest.Matchers.is;

public class CocktailByImage {

    public static String url = "https://www.thecocktaildb.com/images/ingredients/";
    public static String imageName = "vodka";

    @Given("^I get to the cocktail url endpoint$")
    public void iGetToTheCocktailUrlEndpoint() {
        String endpoint = url;
    }

    @When("^I parse the cocktail image name I expect to return the cocktail image$")
    public void iParseTheCocktailImageNameIExpectToReturnTheCocktailImage() {
        //valid alcohol name image search and size
        given()
                .when()
                .get(url + imageName +"-Small.png")
                .then()
                .assertThat()
                .statusCode(200);
    }

    @And("^I search for a cocktail invalid image name I expect to receive a valid error message$")
    public void iSearchForACocktailInvalidImageNameIExpectToReceiveAValidErrorMessage() {
        given()
                .when()
                .get(url + "granola-Small.png")
                .then()
                .assertThat()
                .statusCode(404);
    }
}
