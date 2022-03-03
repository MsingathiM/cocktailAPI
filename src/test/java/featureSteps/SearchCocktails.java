package featureSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;

public class SearchCocktails {

    public static String url = "http://www.thecocktaildb.com/api/json/v1/1/search.php?s=";
    public static String cocktailName = "mARgArITA";

    @Given("^I navigate to the cocktail endpoint$")
    public void iNavigateToTheCocktailEndpoint() {

        String endpoint = url;
    }

    @When("^I parse the cocktail name I expect to return the cocktail parametres$")
    public void iParseTheCocktailNameIExpectToReturnTheCocktailParametres() {

        //initialise drinks array to null
        String [] drinks = null;

        Response response = RestAssured.get(url+ cocktailName.toLowerCase());

        if(response.path("drinks") != null ){

            System.out.println(given().when().get(url + cocktailName.toLowerCase()).then().log().body());

        }else{

            //evaluates to null
            System.out.println(drinks);
        }
    }
}
