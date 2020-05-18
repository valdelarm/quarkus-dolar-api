package br.com.martins.valdelar.resource;

import br.com.martins.valdelar.dto.CotacaoDto;
import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class CotacaoResourceTest {

   /* @Test
    public void testHelloEndpoint() {
        given()
          .when().get("/cotacao/{data}", "1111")
          .then()
             .statusCode(200)
             .body(is(any(CotacaoDto.class)));
    }*/

}