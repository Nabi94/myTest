package BaseURI;
import io.qameta.allure.*;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.Test;

public class myAPI {

    public RequestSpecification myAPI;
    @Epic("User Login")
    @Feature("Valid login")
    @Story("User logs in with correct credentials")
    @Severity(SeverityLevel.CRITICAL)
    @Test
    @Description("Valid login test with correct username and password")

    @Before
    public void setUP(){
        myAPI = new RequestSpecBuilder()
                .setBaseUri("http://localhost:5000/")
                .build();
    }
}
