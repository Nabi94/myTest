import BaseURI.myAPI;
import POJO.apiForMe;
import io.restassured.mapper.ObjectMapper;
import io.restassured.response.Response;
import io.qameta.allure.*;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class PostMethod extends myAPI {

    @Test
    public void PostMethod(){

        myAPI.pathParams("pp1", "posts");
        apiForMe apiForMe= new apiForMe();
        apiForMe.setId(1);
        apiForMe.setBody("Salam23213213421");
        apiForMe.setTitle("necesen???");
        apiForMe.setUserId(5);

        Response response = given()
                .spec(myAPI)
                .when()
                .contentType("application/json")
                .body(apiForMe)
                .post("/{pp1}");

        System.out.println(response.getBody().asString());


    }
}
