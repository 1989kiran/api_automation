import io.restassured.RestAssured;
import io.restassured.response.ResponseBodyExtractionOptions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static io.restassured.RestAssured.given;

public class SampleTest {

    @Test
    public void shouldReturnIndianLanguage(){
        RestAssured.baseURI = "https://countries.trevorblades.com";
        ResponseBodyExtractionOptions responseBody = given()
                .body("{\"query\":\"{\\n  continents {\\n    countries {\\n      emoji\\n    }\\n  }\\n}\"}")
                .contentType("application/json")
                .when()
                .post("/graphql");

        System.out.println( "*****");
        System.out.println( responseBody.asString());

//        Assertions.assertEquals(responseBody.jsonPath().getString("data.countries[0].languages[0].name"), "Hindi");
    }
}

