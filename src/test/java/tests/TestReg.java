package tests;

import io.restassured.response.Response;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static utils.Steps.*;


public class TestReg {

    @BeforeSuite
    public void setup() {
        baseURI = "https://reqres.in/api";
    }

    @Test
    public void testListUsers() {

        String url = "/users?page=2";
        Response response = GET(url);

        isStatusCodeValid(response, 200);
        //   response.then().assertThat().statusCode(200);
//        given()
//                .when()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .assertThat()
//                .statusCode(200);
    }

    @Test
    public void testingSingleUser() {
        String url = "/users/2";
        Response response = get(url);
        response.then().assertThat().statusCode(200);
    }

    @Test
    public void testCreate() {
        String url = "/users";
        String contentType = "application/json";
        String body = "{\n" +
                      "    \"name\": \"morpheus\",\n" +
                      "    \"job\": \"leader\"\n" +
                      "}";
        Response response = POST(body, url, contentType);
        isStatusCodeValid(response, 201);
        isBodyContainsValue(response,"name","morpheus");

    }

    @Test
    public static void testUpdate() {
        String url = "/users/2";
        String contentType = "application/json";
        String body = "{\n" +
                      "         \"name\": \"morpheus\",\n" +
                      "                \"job\": \"zion resident\"\n" +
                      "        }";
        Response responsePut = PUT(body, url, contentType);
        isStatusCodeValid(responsePut, 200);
        isBodyContainsValue(responsePut,"job","zion resident");
    }

    @Test
    public static void testPatch() {
        String urlPatch = "/users/2";
        String contentType = "application/json";
        String body = "{\n" +
                      "         \"name\": \"morpheus\",\n" +
                      "                \"job\": \"zion resident\"\n" +
                      "        }";
        Response responsePut = PATCH(body,urlPatch, contentType);
        isStatusCodeValid(responsePut, 200);
        isBodyContainsValue(responsePut,"job","zion resident");
    }
@Test
    public static void testDelete() {
    String urlDelete = " /users/2";
    String contentType = "application/json";
    Response responseDelete = DELETE(urlDelete, contentType);
    isStatusCodeValid(responseDelete, 204);
}
}








