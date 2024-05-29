package utils;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;
import static org.testng.AssertJUnit.assertEquals;

public class Steps {

    @Step
    public static Response GET(String endpoint) {
        Allure.addAttachment("URL", baseURI + endpoint);
        Response response = get(endpoint);
        Allure.addAttachment("Response Body", response.body().prettyPrint());
        Allure.addAttachment("Status code", String.valueOf(response.statusCode()));
        return response;
    }

    @Step
    public static void isStatusCodeValid(Response response, int expectedStatusCode) {
        response.then().assertThat().statusCode(expectedStatusCode);
    }

    @Step
    public static Response POST(String body, String endpoint, String contentType) {
        Allure.addAttachment("URL", baseURI + endpoint);
        Allure.addAttachment("ContentType", contentType);
        Allure.addAttachment("Request Body", body);
        Response response = given().contentType(contentType).body(body).post(endpoint);
        Allure.addAttachment("Status Code", String.valueOf(response.statusCode()));
        Allure.addAttachment("Response Body", response.body().prettyPrint());
        return response;
    }

    @Step
    public static Response PUT(String body, String endpoint, String contentType) {
        Allure.addAttachment("URL", baseURI + endpoint);
        Allure.addAttachment("ContentType", contentType);
        Allure.addAttachment("Request Body", body);
        Response response = given().contentType(contentType).body(body).put(endpoint);
        Allure.addAttachment("Status Code", String.valueOf(response.statusCode()));
        Allure.addAttachment("Response Body", response.body().prettyPrint());
        return response;
    }

    @Step
    public static void isBodyContainsValue(Response response, String key, String expectedResult) {
        response.then().assertThat().body(key, equalTo(expectedResult));


    }


    @Step
    public static Response PATCH(String body, String endpoint, String contentType) {
        Allure.addAttachment("URL", baseURI + endpoint);
        Allure.addAttachment("ContentType", contentType);
        Allure.addAttachment("Request Body", body);
        Response response = given().contentType(contentType).body(body).patch(endpoint);
        Allure.addAttachment("Status Code", String.valueOf(response.statusCode()));
        Allure.addAttachment("Response Body", response.body().prettyPrint());
        return response;
    }

    @Step
    public static Response DELETE( String endpoint, String contentType) {
        Allure.addAttachment("URL", baseURI + endpoint);
        Allure.addAttachment("ContentType", contentType);
        Response response = given().contentType(contentType).delete(endpoint);
        Allure.addAttachment("Status Code", String.valueOf(response.statusCode()));
        Allure.addAttachment("Response Body", response.body().prettyPrint());
        return response;

    }

}
