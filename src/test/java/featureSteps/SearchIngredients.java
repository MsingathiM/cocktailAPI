package featureSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import static io.restassured.RestAssured.given;



public class SearchIngredients {

    public static String url = "https://www.thecocktaildb.com/api/json/v1/1/search.php?i=";
    public static String ingredientName = "vodka";


    @Given("^I open the cocktail endpoint$")
    public void iOpenTheCocktailEndpoint() {

        String endpoint = url;

    }

    @When("^I search for an ingredient by name I expect to return the ingredient:" +
            " ID,ingredient,description,type,alcohol,ABV$")
    public void iSearchForAnIngredientByNameIExpectToReturnTheIngredientIDIngredientDescriptionTypeAlcoholABV() {

        //parse ingredient name
        given()
                .when()
                .get(url + ingredientName)
                .then()
                .log()
                .body();
    }

    @Then("^I should validate the ingredient if it is alcoholic or non_alcoholic$")
    public void iShouldValidateTheIngredientIfItIsAlcoholicOrNon_alcoholic() {

        //validate alcohol content in ingredient
        Response response = RestAssured
                .get(url+ingredientName);
        if(response.path("ingredients.strAlcohol[0]") == null && response.path("ingredients.strABV[0]") == null){
            System.out.println("Ingredient is non-alcoholic");
        }else{
            System.out.println("Ingredient is alcoholic"+'\n'+"strAlcohol: " + response.path("ingredients.strAlcohol[0]").toString() +'\n'+
                    "strABV: " + response.path("ingredients.strABV[0]").toString());
        }

    }
}