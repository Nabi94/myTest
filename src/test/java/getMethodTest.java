import BaseURI.myAPI;
import POJO.apiForMe;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class getMethodTest extends myAPI {


    @Test
    public void testGet(){
        myAPI.pathParams("pp1","posts","pp2",2);

        Response response = given().spec(myAPI)
                .when()
                .get("/{pp1}/{pp2}");

        apiForMe apiForMe = response.as(apiForMe.class);
        System.out.println(apiForMe.getBody());


    }
}
