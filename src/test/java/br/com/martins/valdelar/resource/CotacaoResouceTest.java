package br.com.martins.valdelar.resource;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CotacaoResouceTest {

    @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/cotacao/{data}")
          .then()
             .statusCode(200)
             .body(is("hello"));
    }

}