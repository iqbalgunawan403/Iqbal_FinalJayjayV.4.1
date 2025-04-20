package helper;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.JSONObject;

import static helper.Utility.generateRandomEmail;


public class Models {
    private static RequestSpecification request;

    private static void setUpHeaders() {
        request = RestAssured.given()
                .header("Content-Type", "application/json")
                .header("Accept", "application/json")
                .header("app-id", "63a804408eb0cb069b57e43a");
    }

    public static Response getUserById(String endpoint) {
        setUpHeaders();
        return request.when().get(endpoint);
    }

    public static Response postCreateUser(String endpoint) {
        String firstName = "Iqbal";
        String lastName = "Gunawan";
        String email = generateRandomEmail();
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);
        setUpHeaders();
        return request.body(payload.toString()).when().post(endpoint);
    }

    public static Response deleteUser(String endpoint, String user_id) {
        setUpHeaders();
        String finalEndpoint = endpoint + "/" + user_id;
        return request.when().delete(finalEndpoint);
    }

    public static Response deleteUser1(String endpoint, String user_id) {
        setUpHeaders();
        String finalEndpoint = endpoint + "/1" + user_id;
        return request.when().delete(finalEndpoint);
    }

    public static Response updateUser(String endpoint, String user_id) {
        setUpHeaders();
        String firstName = "Iqbal1";
        String lastName = "Gunawan";
        String email = "nodam_ujove75@testdata.com";
        JSONObject payload = new JSONObject();
        payload.put("firstName", firstName);
        payload.put("lastName", lastName);
        payload.put("email", email);
        String finalEndpoint = endpoint + "/" + user_id;
        return request.body(payload.toString()).when().put(finalEndpoint);
    }
}
