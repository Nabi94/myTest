package BaseURI;
import io.qameta.allure.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;

public class myAPI {

    public RequestSpecification myAPI;

    @Before
    public void setUP(){
        myAPI = new RequestSpecBuilder()
                .setBaseUri("http://localhost:5000/")
                .build();
    }
}
