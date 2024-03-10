package br.com.pedrogallon;

import io.quarkus.test.junit.QuarkusTest;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.containsString;

@QuarkusTest
class TestTest {

    @Test
    void testTest(){
        given()
            .when().get("/test/1")
            .then()
            .statusCode(200)
            .body(containsString("coisa1"));
    }
}
